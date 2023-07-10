package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay4 {
	
	// upcast into RemoteWebDriver class
	
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	RemoteWebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.selenium.dev/");
	
	
	File sorce = driver.getScreenshotAs(OutputType.FILE);
	
	File dest = new File("./ScreenShot/selenium.jpg");
	Files.copy(sorce, dest);
	
	
}
}
