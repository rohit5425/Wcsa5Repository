package methodsOfwebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.drievr","./drievrs/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("http://desktop-2f4d9pg/login.do");
	System.out.println(driver.findElement(By.id("loginbutton")).getText());
}
}