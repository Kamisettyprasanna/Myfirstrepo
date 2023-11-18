package newtestng;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Configurationannotaions {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("from beforesuit");
	}
		@BeforeTest
		public void beforesuit()  {
			System.out.println("from beforesuit");
		}
		@BeforeClass
		public void beforeclass() {
			System.out.println("from beforeclass");
		}
		@BeforeMethod 
		public void beforemethod() {
		System.out.println("from beforemethod");
		}
		@AfterSuite
		public void aftersuit() {
			System.out.println("from aftermethod");
		}
		@AfterTest
		public void aftertest() {
			System.out.println("from aftertest");
		}
		@AfterClass
		public void afterclass() {
			System.out.println("from afterclass");
		}
		@AfterMethod
		public void aftermethod() {
			System.out.println("from aftermethod");
		}
		@Test
		public void method() {
			System.out.println("from method");
		}
		@Test
		public void method1() {
			System.out.println("from method1");
		}
			
		
			
		}
		
		
	
			
		
			
		
		
		
	

		
	

