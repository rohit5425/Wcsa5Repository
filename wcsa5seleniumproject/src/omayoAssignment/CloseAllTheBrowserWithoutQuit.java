package omayoAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllTheBrowserWithoutQuit {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		// launch the child window
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		
//		if (driver.findElement(By.partialLinkText("Open a popup window")).isDisplayed());
//		{
//			Thread.sleep(2000);
//			
//			driver.close();
//		}
		
	}

}
