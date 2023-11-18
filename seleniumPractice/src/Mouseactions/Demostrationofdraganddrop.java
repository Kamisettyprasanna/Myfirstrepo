package Mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demostrationofdraganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./prasanna/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoapps.qspiders.com/dragDrop");
       WebElement srcElement=driver.findElement(By.xpath("//div[contains(text(),'Apple')]"));
      WebElement destination = driver.findElement(By.xpath("(//div[contains(@class,'h-8')])[1]"));
      Actions actions =new Actions(driver);
      //actions.dragAndDrop(srcElement, destination).perform();
	     actions.clickAndHold(srcElement).release(destination).perform();
		
	}

}
