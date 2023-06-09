package com.hdfc.data.poc.data.migration.service;


import com.hdfc.data.poc.data.migration.postgres.repository.GenericPostgresRepository;
import com.opencsv.CSVReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import javax.persistence.Column;
import javax.persistence.Table;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class InsertInEntityFromCSV {
    @Autowired
    GenericPostgresRepository genericPostgresRepository;
    @Autowired
    @Qualifier(value = "threadPool")
    ThreadPoolExecutor threadPoolExecutor;

    public void insertIntoEntityFromCSV(){
        File directory = new File("C:\\Users\\Lenovo\\Desktop\\files_for_db\\test");
        if(directory.isDirectory()){
            File[] files = directory.listFiles();
            for(File file : files){
                threadPoolExecutor.execute(new ExecuteInsertOperation(file,genericPostgresRepository));
            }
        }
    }
}

class ExecuteInsertOperation implements Runnable{
    private File file;
    Logger log = LoggerFactory.getLogger(InsertInEntityFromCSV.class);
    private GenericPostgresRepository genericPostgresRepository;

    public ExecuteInsertOperation(File file,GenericPostgresRepository genericPostgresRepository){
        this.file = file;
        this.genericPostgresRepository = genericPostgresRepository;
    }

    @Override
    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            CSVReader csvReader = new CSVReader(bufferedReader);
            Class cls =  Class.forName("com.hdfc.data.poc.data.migration.postgres.entity."+file.getName().replace(".csv",""));

            String headerLine =  bufferedReader.readLine();
            if(headerLine==null)
                return;
            Stream<String> stream  =      headerLine.lines();
            String header =  stream.findFirst().map(str -> str.replace("\"","")).get();

            List<Field> headers= new ArrayList<>();
            Field[] fieldArr = cls.getDeclaredFields();
            for(String str : header.split(",")){
                Field field =  searchField(fieldArr,str.toLowerCase());
                if(field == null)
                    throw new NoSuchMethodException("No Such field " + str);
                headers.add(field);
            }

            Table table = (Table) cls.getDeclaredAnnotation(Table.class);

            StringBuilder  query = new StringBuilder("Insert into hdfc.").append(table.name()).append("(");

            query.append( headers.stream().map(field -> {
                Column column =  field.getAnnotation(Column.class);
                return column!=null ? column.name().isEmpty() ? field.getName() : column.name() : field.getName();
            }).collect(Collectors.joining(","))).append(") values ");

            String[] arr =  csvReader.readNext();
            if(arr==null)
                return;
            while(arr != null){
                query.append("(");
                for(int i = 0;i< headers.size();i++){
                    try {
                        Class dataType = Class.forName( headers.get(i).getType().getTypeName());

                        if(dataType.getTypeName().equals(Timestamp.class.getTypeName()) )
                        {
                            if(arr[i].isEmpty())
                                query.append("NULL");
                            else
                                query.append("'").append(arr[i]).append("'");
                        }
                        else if(dataType.getTypeName().equals(String.class.getTypeName())
                                ||dataType.getTypeName().equals(Character.class.getTypeName()))
                        {
                            query.append("'").append(arr[i]).append("'");
                        }
                        else{
                            Constructor constructor =  dataType.getDeclaredConstructor(String.class);
                            constructor.setAccessible(true);
                            query.append(constructor.newInstance(arr[i]));
                        }
                        query.append(",");

                    } catch (ClassNotFoundException | NoSuchMethodException e) {
                        log.error("In Classnotfound exception and NoSuchMethodException  ",e);
                    } catch (InvocationTargetException e) {
                        log.error("In  InvocationTargetException  ",e);
                    } catch (InstantiationException e) {
                        log.error("In  InstantiationException  ",e);
                    } catch (IllegalAccessException e) {
                        log.error("In  IllegalAccessException  ",e);
                    }
                }
                query.replace(query.length()-1,query.length(),"");
                query.append("),");
                arr =  csvReader.readNext();
            }
            log.info("Query to be executed {}",query.toString());
            int rowsInserted  = genericPostgresRepository.insertRecords(query.replace(query.length()-1,query.length(),"").toString());
            log.info("*************************Number of rows inserted into table "+table.name()+"******************************* " + rowsInserted);
        } catch (Exception e) {
            log.error("Exception : " + e);
        }
    }
    private Field searchField(Field[] fields , String fieldName){
        for(Field field : fields){
            if(field.getName().toLowerCase().equals(fieldName))
                return field;
        }
        return null;
    }
}