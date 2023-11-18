package Testcaseexecution;

import org.junit.Test;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class CrossBrowserExecution { 
	@Test
	@Parameters("browser")
	public void cbt(String browser) {
		if(browser.equals("chrome")) {
			System.out.println("chrome browser is launched");
			
		}
		
	}

}
