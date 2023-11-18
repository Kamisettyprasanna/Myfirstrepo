package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./prasanna/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	 driver.get("https://kitchen.applitools.com/ingredients/file-picker");
	 driver.findElement(By.id("photo-upload")).sendKeys("C:\\Users\\kamis\\Pictures\\flowers-276014_960_720 (1).webp");

	}

}
