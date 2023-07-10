package methodsOfwebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drievr","./drievrs/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println(driver.findElement(By.xpath("//p[contains(@class,'oxd-text oxd-text--p orangehrm-login-forgot-header')]")).getAttribute("class"));
	}

}
