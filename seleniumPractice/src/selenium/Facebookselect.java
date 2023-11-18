package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookselect {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./prasanna/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/reg/");
		WebElement dropdown =  driver.findElement(By.id("day"));
		Select select = new Select(dropdown);
		WebElement dropdown1 =  driver.findElement(By.id("month"));
		Select select1 = new Select(dropdown1);
		WebElement dropdown2 =  driver.findElement(By.id("year"));
		Select select2 = new Select(dropdown2);
		
		select.selectByValue("28");
		Thread.sleep(2000);
	 select1.selectByValue("1");
	    Thread.sleep(1000);
		select2.selectByValue("2021");
		
        //select.deselectByIndex(0);
	
	}

}
