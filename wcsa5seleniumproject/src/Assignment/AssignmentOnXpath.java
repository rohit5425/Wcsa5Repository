package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnXpath { 

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

			WebDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.hotstar.com/in/mypage#mp-login");
			Thread.sleep(2000);
			
		
			driver.findElement(By.xpath("//input[@id='7']")).sendKeys("8459250087");
			
			
			driver.findElement(By.xpath("span[text()='Get OTP']")).click();
			
			
	}

}
