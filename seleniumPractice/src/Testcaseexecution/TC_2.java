package Testcaseexecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_2 {
		public void  throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./prasanna/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.ajio.com/");
			Thread.sleep(2000);
			driver.quit();

		
	

	}

}
