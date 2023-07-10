package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();




		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[contains(@type,'sub')]")).click();

	}
}
