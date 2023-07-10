package robotAActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Selenium {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
		Robot robot=new Robot();
		Actions act = new Actions(driver);
		
		WebElement download = driver.findElement(By.xpath("//span[text()='Downloads']")); // for download button
		
		act.contextClick(download).perform(); // for Right click 
		
		
		
		
		
		for (int i=0;i<6 ;i++)
		{
			//--------page down----------------
			Thread.sleep(2000);                //----------wait for 2 sec-----------
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			
		}
		Thread.sleep(2000);
		//---------page down up to inspect button then click on Enter button -----------
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
}
}
