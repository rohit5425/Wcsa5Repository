package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWay3 {

	// by creating the obj of browser specific classes 

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		cdriver.get("https://www.instagram.com/");

		File source = cdriver.getScreenshotAs(OutputType.FILE);

		File dest = new File("./ScreenShot/instagram.jpg");

		Files.copy(source, dest);



	}

}
