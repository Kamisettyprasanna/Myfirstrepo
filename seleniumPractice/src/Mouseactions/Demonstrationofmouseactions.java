package Mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demonstrationofmouseactions {

		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "./prasanna/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.myntra.com");
		    Actions actions = new Actions(driver);
		    WebElement element=driver.findElement(By.linkText("MEN"));
			  actions.moveToElement(element).perform();
		// TODO Auto-generated method stub

	}

}
