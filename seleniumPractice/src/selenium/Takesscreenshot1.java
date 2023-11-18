package selenium;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takesscreenshot1 {



	public static void main(String[] args)throws IOException {
		System.setProperty("webdriver.chrome.driver","./Selenium/chromedriver.exe");
		WebDriver=new ChromeDriver();
		driver.manage().window().maximize();
		d.get("htttp://www.facebook.com/login/");
		Takesscreenshot1 ts=(Takesscreenshot1)Driver;
		File tempfile =ts.getScreenshortsAs(Output.FILE);
		String presentdateANDTime= LocalDateTime.now().toString().replace(':','-');
		FileHandler.(tempfile,new File("./prasanna/facebook"+presentdateANDTime+".jpg");
		
		
		// TODO Auto-generated method stub

	}

}
