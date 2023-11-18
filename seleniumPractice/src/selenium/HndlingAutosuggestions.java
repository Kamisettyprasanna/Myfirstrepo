package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HndlingAutosuggestions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./prasanna/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		//driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys("Hyderbad");
		//List<WebElement> allsuggestions= driver.findElements(By.xpath("//span[contains(text)]='selenium'"));
		List<WebElement> allsuggestions= driver.findElements(By.xpath("//span[contains(text)]='Hyderbad'"));
		for(WebElement suggestion:allsuggestions) {
		System.out.println(suggestion.getText());
		}
		
		// TODO Auto-generated method stub

	}

}
