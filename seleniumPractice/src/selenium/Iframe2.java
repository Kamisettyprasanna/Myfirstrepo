package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframe2 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
			WebDriver driver=new chromedriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.tripodeal.com/flight");
			driver.switchTo().frame("tpcwl-iframe");
			WebDriverWait wait=new WebDriverWait(driver, 100);
			Wait.(ExpectedCondition.visibilityofelementlocated(By.);
			
					
	
		// TODO Auto-generated method stub

	}

}
