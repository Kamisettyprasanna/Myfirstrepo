package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptpopupalert {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./prasanna/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://demowebshop.tricentis.com/");
	       driver.findElement(By.xpath("////input@[value='class=\"search-box-text ui-autocomplete-input']]")).click() ;
	       Alert alert=driver.switchTo().alert();
	      System.out.println(alert.getText());


	}

}
