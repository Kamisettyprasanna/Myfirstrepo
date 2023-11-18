package Mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demostrationofdoubleclickmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./prasanna/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/button/buttonDoubleClick");
		WebElement element=driver.findElement(By.xpath("//p[contains(text(),'1. Are you satisfied with the registration process?')]/..//button[contains(text(),'Yes')]"));
	    Actions actions=new Actions(driver);
	    //actions.moveToElement(element).doubleClick().perform();
	    actions.doubleClick(element).perform();
	}

}
