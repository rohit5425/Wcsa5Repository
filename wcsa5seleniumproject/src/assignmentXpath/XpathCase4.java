package assignmentXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.spotify.com/en/login?continue=https");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@type,'te')]")).sendKeys("rohitchavanrkc@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("rohit123");
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//button[contains(@id,'bu')]")).click();
	}

}
