package Assignment;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpicejetXpath {
	static WebDriver drivers ;
	public static void main(String[] args) throws InterruptedException 
	 {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--disable-notifications");
		drivers=new ChromeDriver(co);
		drivers.manage().window().maximize();
		drivers.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		drivers.get("https://www.spicejet.com/");

	}

}
