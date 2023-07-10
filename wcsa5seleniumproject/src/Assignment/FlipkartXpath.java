package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartXpath {
	public static void main(String[] args) throws InterruptedException {
	
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

			WebDriver driver =new ChromeDriver();

			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("shoes",Keys.ENTER);
	}

}
