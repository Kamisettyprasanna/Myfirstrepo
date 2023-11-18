package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedoption {
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
	        select.deselectByIndex(0);
	              // System.out.println(select.getFirstSelectedOption().getText());
	               // List<WebElement> allselectedoptions= select.getAllSelectedOptions();
	        List<WebElement> alloptions= select.getOptions();
	             // for(WebElement option:allselectedoptions) {
	    	     //System.out.println(option.getText());
	        for(int i=0;i<alloptions.size();i++) {
	    	  //option.click();
	         select.selectByIndex(i);
	    	  //select.selectByIndex(0);
	      }
		}
}