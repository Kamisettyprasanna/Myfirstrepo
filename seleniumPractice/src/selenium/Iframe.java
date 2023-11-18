package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Iframe {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		
		 WebElement frame =  driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']"));
		 driver.switchTo().frame(frame);
		
		
		driver.switchTo().frame((WebElement) By.id("webklipper-publisher-widget-container-notification-close-div"));
		
	}


		// TODO Auto-generated method stub

	}


