package methodsOfwebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {
	public static void main(String[] args) {
		//it is used to send inputs to text box and active element 
		System.setProperty("webdriver.chrome.drievr","./drievrs/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// by creating a method and accessing by using its reference variable
		WebElement usrTb = driver.findElement(By.name("username"));
		usrTb.sendKeys("Admin");
		
		//driver.findElement(By.name("username")).sendKeys("Admin");
	}

}
