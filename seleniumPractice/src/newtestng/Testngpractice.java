package newtestng;

import org.testng.annotations.Test;

public class Testngpractice {
	@Test(priority = 3)
	public void login() {
	System.out.println("I'm from login");
}
	@Test(priority =2 )
public void home() {
System.out.println("I'm from home");
}
	@Test(priority = -9)
public void logout() {
System.out.println("I'm from logout");
}
	
	
}
