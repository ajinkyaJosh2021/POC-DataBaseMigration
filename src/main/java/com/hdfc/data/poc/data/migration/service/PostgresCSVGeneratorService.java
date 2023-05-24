package com.hdfc.data.poc.data.migration.service;

import com.hdfc.data.poc.data.migration.postgres.repository.GenericPostgresRepository;
import com.hdfc.data.poc.data.migration.postgres.repository.PostgresApplicationGenParamRepository;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

@Service
@RequiredArgsConstructor
public class PostgresCSVGeneratorService {
    private final PostgresApplicationGenParamRepository postgresApplicationGenParamRepository;

    @Autowired
    @Qualifier(value = "threadPool")
    private ThreadPoolExecutor threadPoolExecutor;

    private static final String fileName = "C:\\Users\\Lenovo\\Desktop\\files_for_db\\postgres\\";


    public Class[] getClasses(String pkgName) {
        List<Class> classes = new ArrayList<>();
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            String path = pkgName.replace(".", "\\");
            Enumeration<URL> enumeration = classLoader.getResources(path);
            List<File> dirs = new ArrayList<>();

            while (enumeration.hasMoreElements()) {
                URL resource = enumeration.nextElement();
                dirs.add(new File(resource.toURI()));
            }
            for (File file : dirs) {
                classes.addAll(findClass(file, pkgName));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return classes.toArray(new Class[classes.size()]);
    }

    public List<Class> findClass(File directory, String pkgName) throws ClassNotFoundException {
        List<Class> classes = new ArrayList<>();
        if (!directory.exists())
            return classes;

        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.getName().endsWith(".class")) {
                classes.add(Class.forName(pkgName + "." + file.getName().substring(0, file.getName().length() - 6)));
            }
        }
        return classes;
    }

    public void writePostgresDataToCSVFile(String classPath) {
        try {
            Class[] classes = getClasses(classPath);

            for (Class cls : classes) {
                threadPoolExecutor.execute(new ReadDataAsync(cls));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    class ReadDataAsync implements Runnable {

        Class cls;

        public ReadDataAsync(Class cls) {
            this.cls = cls;
        }

        @Override
        public void run() {
            try {
                if (cls.getAnnotation(Entity.class) != null) {
                    List data = GenericPostgresRepository.fetchData(cls.getSimpleName());
                    Field[] fields = cls.getDeclaredFields();
                    Field[] subFields = new Field[0];
                    boolean containsEmbeddedId = false;
                    for (Field field : fields) {
                        if (field.getAnnotation(EmbeddedId.class) != null) {
                            containsEmbeddedId = true;
                            subFields = field.getClass().getDeclaredFields();
                            break;
                        }
                    }
                    if (containsEmbeddedId) {

                        String[] header = new String[fields.length + subFields.length];
                        int counter = 0;
                        for (Field field : fields) {
                            try {
                                if (field.getAnnotation(EmbeddedId.class) != null) {
                                    for (Field subField : subFields) {
                                        header[counter++] = subField.getName();
                                    }
                                } else
                                    header[counter++] = field.getName();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        CSVWriter csvWriter = new CSVWriter(new FileWriter(fileName.concat(cls.getSimpleName().concat(".csv"))));

                        csvWriter.writeNext(header);


                        for (int i = 0; i < data.size(); i++) {
                            String[] lines = new String[fields.length + subFields.length];
                            int fieldCounter = 0;
                            for (int j = 0; j < fields.length; j++) {
                                try {
                                    fields[j].setAccessible(true);
                                    if (fields[j].getAnnotation(EmbeddedId.class) != null) {
                                        Object subData = fields[j].get(data.get(i));
                                        for (Field subField : subFields) {
                                            subField.setAccessible(true);
                                            lines[fieldCounter++] = subField.get(subData) == null ? "" : subField.get(subData).toString();
                                        }
                                    } else {

                                        lines[fieldCounter++] = fields[j].get(data.get(i)) == null ? "" : fields[j].get(data.get(i)).toString();
                                    }

                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            csvWriter.writeNext(lines);
                        }
                        csvWriter.close();
                    } else {
                        Writer writer = null;
                        try {
                            writer = new FileWriter(fileName.concat(cls.getSimpleName().concat(".csv")));
                            StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
                            beanToCsv.write(data);
                            writer.close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        } catch (CsvRequiredFieldEmptyException e) {
                            throw new RuntimeException(e);
                        } catch (CsvDataTypeMismatchException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

}


