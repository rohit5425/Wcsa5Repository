package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	// to store generic reusable methods
	// all the methods are non static 


	// it is use to read the data from excel sheet
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);// provide the path of file
		Workbook wb = WorkbookFactory.create(fis); // make the file for ready to read
		Sheet sheet = wb.getSheet(sheetName);// get into the sheet
		Row row = sheet.getRow(rowCount); // get into the desired row
		Cell cell = row.getCell(cellCount);//get into the desired cell/column
		String data = cell.getStringCellValue();
		return data ;
	}
	//To get the count of Last row
	public int getLastRowCount (String excelPath,String sheetName) throws EncryptedDocumentException, IOException 

	{
		FileInputStream fis =new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;
	}

	// To write data in Excel File
	public void writeDataInExcel(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws IOException
	{
		FileInputStream fis= new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis); //make the file for ready to read
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data); // pass the string arguments as data

		// to write data in excel 
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);

	}
}



