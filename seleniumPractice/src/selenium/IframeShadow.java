package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeShadow {


		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://www.hyrtutorials.com/");
			Select seldropdown = new Select(driver.findElement(By.linkText("Selenium Practice")));
			seldropdown.selectByVisibleText("Frames Practice");
			
			driver.switchTo().frame("frm3");
			 jsExecutor=(JavascriptExecutor) driver;
			
			jsExecutor.executeScript("scrollby(0,documnet.body.scroll height)");
		
		// TODO Auto-generated method stub

	}

}
