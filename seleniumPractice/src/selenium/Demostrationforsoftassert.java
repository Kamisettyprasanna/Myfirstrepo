package selenium;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demostrationforsoftassert {
	@Test
	public void demo() {
		String expectedtitleString="sam";
		String actualitleString= "sam";
		SoftAssert softAssert= new SoftAssert();
		softAssert.assertEquals(actualitleString, expectedtitleString);
		System.out.println("done");
		softAssert.assertAll();
	}

}
