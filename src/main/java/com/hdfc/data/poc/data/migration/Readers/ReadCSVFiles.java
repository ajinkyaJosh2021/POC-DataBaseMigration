package com.hdfc.data.poc.data.migration.Readers;

import com.hdfc.data.poc.data.migration.DTO.ErrorDTO;
import com.hdfc.data.poc.data.migration.DTO.ReportReponseDTO;
import com.opencsv.bean.CsvToBeanBuilder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

@Service
public class ReadCSVFiles {

    ReentrantLock reentrantLock = new ReentrantLock();

    private static final String entitypkgName = "com.hdfc.data.poc.data.migration.entity.";

    @Autowired
    @Qualifier("threadPool")
    private ThreadPoolExecutor threadPoolExecutor;

    public void compareCSVS() {

        File oracleDirectory = new File("C:\\Users\\Lenovo\\Desktop\\files_for_db\\oracle");
        File postgresDirectory = new File("C:\\Users\\Lenovo\\Desktop\\files_for_db\\postgres");

        File[] oracleFiles = oracleDirectory.listFiles();
        File[] postgresFiles = postgresDirectory.listFiles();

        HashMap<String, File> oracleFileMap = Arrays.stream(oracleFiles).collect(Collectors.toMap(File::getName, file -> file,(file, file2) -> file, HashMap::new));
        HashMap<String, File> postGresFileMap = Arrays.stream(postgresFiles).collect(Collectors.toMap(File::getName, file -> file,(file1,file2) -> file1,HashMap::new));
        try {
            for (Map.Entry<String, File> entry : postGresFileMap.entrySet()) {

                if (oracleFileMap.containsKey(entry.getKey())) {
                    threadPoolExecutor.execute(new CompareAsync(oracleFileMap.get(entry.getKey()),entry.getValue(),entry.getKey()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<ErrorDTO> compare(Class cls,Object oracleObj,Object postgresObj) {
        List<ErrorDTO> response = new ArrayList<>();
        Field[] fields = cls.getDeclaredFields();

        for (Field field : fields) {
            try {
                field.setAccessible(true);
                ErrorDTO errorDTO = new ErrorDTO();

                String line6 = (String)( field.get(postgresObj) != null ? field.get(postgresObj).toString():null);
                String line5 = (String)(field.get(oracleObj)!= null ? field.get(oracleObj).toString():null);

                errorDTO.setLineFiveValue(line5);
                errorDTO.setLineSixValue(line6);
                errorDTO.setColumnName(field.getName());

                if (line6 == null && line5 != null) {
                    errorDTO.setErrorDescription(new String("Line 6 " + field.getName() + " column is empty"));
                    response.add(errorDTO);
                    continue;
                }
                if (line5 == null && line6 != null) {
                    errorDTO.setErrorDescription(new String("Line 5 " + field.getName() + " column is empty"));
                    response.add(errorDTO);
                    continue;
                }
                if (line5 == null && line6 == null)
                    continue;

                if (!line5.equals(line6)) {
                    errorDTO.setErrorDescription(new String("Line 5 " + field.getName() + " column is not matching with line 6"));
                    response.add(errorDTO);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return response;
    }


    public List readCSV(File file, Class cls) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            return new CsvToBeanBuilder(new InputStreamReader(fileInputStream)).withType(cls).build().parse();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    org.apache.poi.xssf.usermodel.XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
    org.apache.poi.xssf.usermodel.XSSFSheet sheet;

    public void writeHeaders(String sheetName) {
        sheet = xssfWorkbook.createSheet(sheetName);
        Row row = sheet.createRow(0);

        org.apache.poi.ss.usermodel.CellStyle cellStyle = xssfWorkbook.createCellStyle();
        org.apache.poi.xssf.usermodel.XSSFFont font = xssfWorkbook.createFont();
        font.setBold(true);
        font.setFontHeight(20);
        cellStyle.setFont(font);
        createCell(row, 0, "Row Number", cellStyle);
        createCell(row, 1, "Column Name", cellStyle);
        createCell(row, 2, "Line 5 Value", cellStyle);
        createCell(row, 3, "Line 6 Value", cellStyle);
        createCell(row, 4, "Error Description", cellStyle);
    }

    public Cell createCell(Row row, int columnCount, Object value, CellStyle cellStyle) {
        sheet.autoSizeColumn(columnCount);
        Cell cell = row.createCell(columnCount);
        cell.setCellValue((String) value);
        return cell;
    }

    public void writeDataLines(ReportReponseDTO reportReponseDTO) {
        org.apache.poi.xssf.usermodel.XSSFCellStyle style = xssfWorkbook.createCellStyle();
        XSSFFont font = xssfWorkbook.createFont();
        font.setFontHeight(14);
        style.setFont(font);

        int rowCount = 1;
        int columnCount = 0;
        org.apache.poi.ss.usermodel.CellStyle cellStyle = xssfWorkbook.createCellStyle();
        font.setBold(true);
        font.setFontHeight(20);
        cellStyle.setFont(font);

        StringBuilder builder = new StringBuilder();
        String spaces = "           ";
        int count = 0;
        style.setWrapText(true);
        for (Map.Entry<Integer, List<ErrorDTO>> entry : reportReponseDTO.getDataIssues().entrySet()) {
            for (ErrorDTO error : entry.getValue()) {
                Row row2 = sheet.createRow(rowCount++);
                count = 0;
                createCell(row2, count++, entry.getKey().toString(), cellStyle);
                createCell(row2, count++, error.getColumnName(), cellStyle);
                createCell(row2, count++, error.getLineFiveValue(), cellStyle);
                createCell(row2, count++, error.getLineSixValue(), cellStyle);
                createCell(row2, count++, error.getErrorDescription(), cellStyle);
            }
        }
    }

    public void generateExcels(ReportReponseDTO reportReponseDTO) {
        try {
            if(reentrantLock.tryLock()){
                String fileName = "C:\\Users\\Lenovo\\Desktop\\compare.xls";
                FileOutputStream fileOutputStream = new FileOutputStream(fileName);
                writeHeaders(reportReponseDTO.getTableName());
                writeDataLines(reportReponseDTO);
                xssfWorkbook.write(fileOutputStream);
                fileOutputStream.close();
                reentrantLock.unlock();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class CompareAsync implements Runnable{

        private File oracleFile;
        private File postgresFile;
        private String fileName;

        public CompareAsync(File oracleFile,File postgresFile,String fileName){
            this.oracleFile = oracleFile;
            this.postgresFile = postgresFile;
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try{
                File oracleFile = this.oracleFile;
                File postgresFile = this.postgresFile;
                Class cls =  Class.forName(entitypkgName + this.fileName.substring(0,fileName.length()-4));
                List oracleRecords = readCSV(oracleFile,cls );
                List postgresRecords = readCSV(postgresFile,cls);

                ReportReponseDTO reportReponseDTO = new ReportReponseDTO();

                reportReponseDTO.setLineFiveRowCount(String.valueOf(oracleRecords.size()));
                reportReponseDTO.setLineSixRowCount(String.valueOf(postgresRecords.size()));

                int size = oracleRecords.size() < postgresRecords.size() ? oracleRecords.size() : postgresRecords.size();

                Map<Integer, List<ErrorDTO>> issues = new HashMap<>();
                for (int i = 0; i < size; i++) {
                    List<ErrorDTO> dataIssues = compare(cls,oracleRecords.get(i),postgresRecords.get(i));
                    if (!CollectionUtils.isEmpty(dataIssues)) {
                        Integer rowCount = i + 1;
                        issues.put(rowCount, dataIssues);
                    }
                }
                reportReponseDTO.setDataIssues(issues);
                reportReponseDTO.setTableName(cls.getSimpleName());
                generateExcels(reportReponseDTO);
            }catch (Exception ex){
                ex.printStackTrace();
            }

        }
    }


}
