package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoStrationofselectclass {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", "./prasanna/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/kamis/Documents/akhi.html");
		WebElement dropdown =  driver.findElement(By.id("multiple"));
		Select select = new Select(dropdown);
		select.selectByValue("3");
		Thread.sleep(2000);
		select.selectByVisibleText("sql");
		Thread.sleep(2000);
		//select .deselectByIndex(0);
		//Thread.sleep(2000);
		//select.deselectByIndex(3);
		//Thread.sleep(2000);
		//select.deselectByValue("1");
	//	Thread.sleep(2000);
		select.deselectAll();
		
		
		
		
		
		

	}

}
