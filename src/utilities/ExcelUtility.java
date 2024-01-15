package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell celldata;
	
	public XSSFSheet SetWorkbook() throws FileNotFoundException {
		
		FileInputStream fs = new FileInputStream("C:\\Users\\attar\\eclipse-workspace\\SwagLab_Project\\src\\testData\\SwagLabData.xlsx");
		workbook = new XSSFWorkbook();
		
		sheet = workbook.getSheet("Sheet1");
		return sheet;		
	}
	
	public XSSFCell GetData(int rownum, int column) throws FileNotFoundException {
		
		sheet = SetWorkbook();
		celldata = sheet.getRow(rownum).getCell(column);
		
		return celldata;
	}

}
