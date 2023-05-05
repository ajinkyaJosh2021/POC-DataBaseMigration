package com.hdfc.data.poc.data.migration.Readers;

import com.hdfc.data.poc.data.migration.DTO.ReportReponseDTO;
import com.hdfc.data.poc.data.migration.entity.ApplicationGenParam;
import com.opencsv.bean.CsvToBeanBuilder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReadCSVFiles {

    public void compareCSVS() {
        List<ApplicationGenParam> oracleRecords = readCSV("C:\\Users\\Lenovo\\Desktop\\application_gen_param_202305041426_oracle.csv");
        List<ApplicationGenParam> postgresRecords = readCSV("C:\\Users\\Lenovo\\Desktop\\application_gen_param_202305041425_postgres.csv");

        ReportReponseDTO reportReponseDTO = new ReportReponseDTO();

        reportReponseDTO.setLineFiveRowCount(String.valueOf(oracleRecords.size()));
        reportReponseDTO.setLineSixRowCount(String.valueOf(postgresRecords.size()));

        int size = oracleRecords.size() < postgresRecords.size() ? oracleRecords.size() : postgresRecords.size();

        Map<String, List<String>> issues = new HashMap<>();
        for (int i = 0; i < size; i++) {
            List<String> dataIssues = oracleRecords.get(i).compareTo(postgresRecords.get(i));
            if (!CollectionUtils.isEmpty(dataIssues)) {
                int rowCount = i + 1;
                issues.put(new String("Row " + rowCount + " has issues"), dataIssues);
            }
        }
        reportReponseDTO.setDataIssues(issues);
        reportReponseDTO.setTableName("Application gen param");
        generateExcels(reportReponseDTO);
    }

    public List<ApplicationGenParam> readCSV(String fileName) {
        try {
            FileInputStream file = new FileInputStream(fileName);
            return new CsvToBeanBuilder<ApplicationGenParam>(new InputStreamReader(file)).withType(ApplicationGenParam.class).build().parse();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    org.apache.poi.xssf.usermodel.XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
    org.apache.poi.xssf.usermodel.XSSFSheet sheet;

    public void writeHeaders() {
        sheet = xssfWorkbook.createSheet();
        Row row = sheet.createRow(0);

        org.apache.poi.ss.usermodel.CellStyle cellStyle = xssfWorkbook.createCellStyle();
        org.apache.poi.xssf.usermodel.XSSFFont font = xssfWorkbook.createFont();
        font.setBold(true);
        font.setFontHeight(20);
        cellStyle.setFont(font);
        createCell(row, 0, "Table Name", cellStyle);
        createCell(row, 1, "Line 5 count", cellStyle);
        createCell(row, 2, "Line 6 count", cellStyle);
        createCell(row, 3, "Data Issues", cellStyle);

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
        Row row = sheet.createRow(rowCount);
        int columnCount = 0;
        createCell(row, columnCount++, reportReponseDTO.getTableName(), style);
        createCell(row, columnCount++, reportReponseDTO.getLineFiveRowCount(), style);
        createCell(row, columnCount++, reportReponseDTO.getLineSixRowCount(), style);
        StringBuilder builder = new StringBuilder();
        String spaces = "           ";
        int count = 1;
        style.setWrapText(true);
        for (Map.Entry<String, List<String>> entry : reportReponseDTO.getDataIssues().entrySet()) {
            builder.append(entry.getKey()).append(" : ");
            for (String errorString : entry.getValue()) {
                builder.append(count++).append(")").append(errorString).append("\\n");
            }
        }
        createCell(row, columnCount++, builder.toString(), style);


    }

    public void generateExcels(ReportReponseDTO reportReponseDTO) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\test3.xls");
            writeHeaders();
            writeDataLines(reportReponseDTO);
            xssfWorkbook.write(fileOutputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
