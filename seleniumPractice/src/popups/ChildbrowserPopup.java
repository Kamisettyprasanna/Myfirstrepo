package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.grid.web.servlet.handler.WebDriverRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;

public class ChildbrowserPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./prasanna/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newWindowsBtn")).click();
		
		Set<String>allwindowId=driver.getWindowHandles();
		String parentId=driver.getWindowHandle();
		String expectedTitle="Basic Controls";
		for(String id:allwindowId) {
			driver.switchTo().window(id);
			if(driver.getTitle().contains(expectedTitle)) {
			break;
			
		}
		

	}

}
}
