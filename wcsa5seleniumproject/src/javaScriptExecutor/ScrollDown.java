package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
public static void main(String[] args) throws InterruptedException {
	
	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();
	 
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
		
		// to perform Scrolling operation 
	       JavascriptExecutor jse =( JavascriptExecutor)driver;
	       // to perform Scroll Up
	       Thread.sleep(3000);
	       jse.executeScript("window.scrollBy(0,1000)");
	       // to perform Scroll Down
	       Thread.sleep(3000);
	       jse.executeScript("window.scrollBy(0,-1000)");
	       
	       
		
		
}
}
