package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://desktop-2f4d9pg/login.do");
		Flib flib = new Flib();
		driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/Actitime.xlsx", "validcreds", 1, 0));
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/Actitime.xlsx", "validcreds", 1, 1));
		driver.findElement(By.id("loginButton")).click();

		Thread.sleep(3000);
		driver.close();


	}
}