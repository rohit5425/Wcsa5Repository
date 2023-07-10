package frame;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFrame {
	
		public static void main(String[] args) throws InterruptedException, AWTException {
			 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				driver.get("https://www.google.com/");
	}

}