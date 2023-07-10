package frame;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone_3 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://www.bluestone.com/");
			Thread.sleep(2000);
			//Actions act = new Actions(driver);
			driver.findElement(By.id("denyBtn")).click();
		
			WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
			Thread.sleep(2000);
			driver.switchTo().frame(frameElement);
			
		driver.findElement(By.id("chat-icon")).click();
	}
}
