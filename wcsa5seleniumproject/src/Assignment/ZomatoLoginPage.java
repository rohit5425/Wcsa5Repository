package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.zomato.com/");
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(2000);

		// to send the input for full name TextBox
		
		driver.findElement(By.cssSelector("input[class='sc-1yzxt5f-9 dFkpnp']")).sendKeys("Rohit");
		Thread.sleep(2000);
		
		// to send the input for email TextBox
		driver.findElement(By.cssSelector("input[class='sc-1yzxt5f-9 bbrwhB']")).sendKeys("rohit@123");
	}

}
