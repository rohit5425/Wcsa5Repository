package methodsOfwebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.drievr","./drievrs/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.selenium.dev/");
	
	
	
	
	
	System.out.println(driver.findElement(By.xpath("//h2[@class='selenium']")).getLocation().getX()+ driver.findElement(By.xpath("//h2[@class='selenium']")).getLocation().getY());
	
}
}
