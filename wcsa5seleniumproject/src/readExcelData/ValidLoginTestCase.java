package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.drievr","./drievrs/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-2f4d9pg/login.do");

		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");


		Workbook wb = WorkbookFactory.create(fis); // make the file ready to 
		Sheet sheet = wb.getSheet("Validcreds"); // get into the sheet 
		Row row = sheet.getRow(1);// get into the desired row
		Cell cell = row.getCell(0); // get into the desired cell/column 
		String validUsername = cell.getStringCellValue();

		FileInputStream fis2 = new FileInputStream("./data/TestData.xlsx");


		Workbook wb2 = WorkbookFactory.create(fis2); // make the file ready to 
		Sheet sheet2 = wb2.getSheet("Validcreds"); // get into the sheet 
		Row row2 = sheet2.getRow(1);// get into the desired row
		Cell cell2 = row2.getCell(1); // get into the desired cell/column 
		String validUsername2 = cell2.getStringCellValue();


	}
}