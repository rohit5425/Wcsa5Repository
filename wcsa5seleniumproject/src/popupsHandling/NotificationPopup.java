package popupsHandling;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopup {
	static WebDriver drivers ;
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the browser value");
	String browservalue =sc.next();
	if(browservalue.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--disable-notifications");
		drivers=new ChromeDriver(co);
		drivers.manage().window().maximize();
		drivers.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		drivers.get("https://www.easemytrip.com/");
		
	}
	else if (browservalue.equalsIgnoreCase("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	
	FirefoxOptions fo =new FirefoxOptions();
	fo.addArguments("--disable-notifications");
	drivers=new FirefoxDriver(fo);
	drivers.manage().window().maximize();
	drivers.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	drivers.get("https://www.easemytrip.com/");
	
	}
	else if(browservalue.equalsIgnoreCase("Edge"))
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		EdgeOptions eo =new EdgeOptions();
		eo.addArguments("--disable-notifications");
		drivers=new EdgeDriver(eo);
		drivers.manage().window().maximize();
		drivers.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		drivers.get("https://www.easemytrip.com/");
		
	}
	else 
		System.out.println("Enter valid Browser name");
	}

}
