package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Iterator;

import org.apache.poi.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import com.beust.jcommander.converters.BigDecimalConverter;

public class TestData {
	XSSFWorkbook wb;
	XSSFSheet sheet1;

	public TestData(String exceldata) {
		try {
			File src = new File(exceldata);
			// String excelFilePath =
			// "C:/Users/amit.sharma/workspace/cf/TestData.xlsx";

			FileInputStream filename = new FileInputStream(src);

			wb = new XSSFWorkbook(filename);
			// sheet1 = wb.getSheetAt(0);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public String getData(int sheetNumber, int row, int column) {
		sheet1 = wb.getSheetAt(sheetNumber);
		//String data = (sheet1.getRow(row).getCell(column).getStringCellValue());
		DataFormatter formatter = new DataFormatter();
		String data = formatter.formatCellValue(sheet1.getRow(row).getCell(column));

		return data;
	}

	public int getRowCount(int sheetIndex) {
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row + 1;
		return row;
	}
}
