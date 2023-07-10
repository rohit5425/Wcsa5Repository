package frame;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {

		public static void main(String[] args) throws InterruptedException, AWTException {
			 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				driver.get("https://www.bluestone.com/");
				Thread.sleep(2000);
				//Actions act = new Actions(driver);
				driver.findElement(By.id("denyBtn")).click();
				Thread.sleep(2000);
				
				driver.switchTo().frame("fc_widget");
				
			driver.findElement(By.id("chat-icon")).click();
				
//				 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//				 wait.until(ExpectedConditions.elementToBeClickable(By.id("chat-icon"))).click();
//				
				
	}

}
