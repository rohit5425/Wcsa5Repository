package frame;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone4 {
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
			
		WebElement chatbox = driver.findElement(By.id("chat-icon"));
		chatbox.click();
		
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("chat-fc-name")).sendKeys("Rohit");
		driver.findElement(By.id("chat-fc-email")).sendKeys("rohitchavan@gmail.com");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("8459662356");
		
		
		
}
}