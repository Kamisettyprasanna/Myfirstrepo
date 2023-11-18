package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SearchandClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.tripodeal.com/flight-deal?utm_source=bing&msclkid=50ee1887873111c7cc367da0ecdfb3af");
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("destination")).sendKeys("banglore");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("goa")).click();
		
	}
}



	


