package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notificationpopup {

		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "./prasanna/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--diable-notifications");
		//to handle notification popup
		option.addArguments("--incognito");
		//to open browser in maximized mode
		option.addArguments("start-maximized");
		//to open browser in headless mode
		option.addArguments("--headless");
		
		WebDriver driver1= new ChromeDriver(option);
		System.out.println("browser is launched");
		
		driver1.get("https://www.ajio.com/");
		System.out.println("browser is navigated to ajio");
		
		}
		
		
		
		
		
		
		
		
		
		
		
}
		

