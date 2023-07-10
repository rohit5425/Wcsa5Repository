package popupsHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Confirmationpopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:/Desktop/confirmation.html");
		
		driver.findElement(By.tagName("input")).click();
		Thread.sleep(2000);
		
		Alert al = driver.switchTo().alert();
		//al.accept(); // accept the popup
		//al.dismiss(); // dismiss the confirmation popup
		System.out.println(al.getText()); // to get the text of confirmation popups
		al.accept();
		
		
	}

}
