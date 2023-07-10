package qsp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchChromeBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		
		// relative path of driver executable file 
       System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	// upcast into webdriver interface
		WebDriver driver =new ChromeDriver(); 
		
		// provide the Delay of 2 sec
		Thread.sleep(2000);
		
		// To close Browser
		driver.close();
		
	}
}
	

