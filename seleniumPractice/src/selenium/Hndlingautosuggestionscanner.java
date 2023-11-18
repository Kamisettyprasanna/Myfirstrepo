package selenium;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.xml.crypto.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hndlingautosuggestionscanner {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./prasanna/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.google.co.in/");
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter the search keyword");
			String data =scanner.next();
			driver.findElement(By.name("q")).sendKeys(data);
			List<WebElement> allsuggestions= driver.findElements(By.xpath("//span[contains(text(),'"+data+"')]"));
			for(WebElement suggestion:allsuggestions) {
				System.out.println(suggestion.getText());
			} 
		
           driver.quit();
	}

}
