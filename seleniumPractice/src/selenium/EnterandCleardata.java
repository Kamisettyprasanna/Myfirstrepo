package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterandCleardata {

 
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./prasanna/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("");
	   JavascriptExecutor JS=(Javascriptexecutor)Driver;
	   String data="seleniumclass830";
	   webelement searchstore=driver.fndElement(By.id("small-searchterms");
	   webele searchbutton=driver.findElement(Byte.xpath);
	   
			   
		// TODO Auto-generated method stub

	}

}
