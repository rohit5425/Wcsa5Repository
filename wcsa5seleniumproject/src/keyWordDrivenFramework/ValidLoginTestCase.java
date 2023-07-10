package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		bt.openBrowser();

		Flib flib = new Flib();


		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROP_PATH,"Username"));
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROP_PATH,"Password"));
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();

		Thread.sleep(4000);
		bt.closeBrowser();




	}
}
