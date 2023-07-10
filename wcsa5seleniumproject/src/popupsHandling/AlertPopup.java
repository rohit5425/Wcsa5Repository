package popupsHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPopup {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:/Desktop/alert1.html");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		//Robot rbt = new Robot();
//		rbt.keyPress(KeyEvent.VK_ENTER);
//		rbt.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(4000);
//		rbt.keyPress(KeyEvent.VK_ENTER);
//		rbt.keyRelease(KeyEvent.VK_ENTER);
		
		Alert al = driver.switchTo().alert();
		al.accept(); // accept the popup
		//al.dismiss(); //dismiss the popup
		System.out.println(al.getText()); // to get the text of confirmation popups
		al.accept();
	}

}
