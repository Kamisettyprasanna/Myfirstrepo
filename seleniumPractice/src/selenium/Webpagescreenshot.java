package selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Webpagescreenshot {
	public static  void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./prasanna/chromedriver.exe");
       WebDriver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlywait(10, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		Takesscreenshot1 ts=(Takesscreenshot1) driver;
		Thread.sleep(2000);
		Object outputtype;
		File photo = ts.getscreenshotAs(outputtype.file);
		File file= new File("./prasanna/instal.png");
		photo.renameTo(file);
	
}
}