package selenium;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Demostrationforhardassert {
	@Test

	public static void main(String[] args) {
	String expectedtitleString="demo";
	String actualtitleString="sam";
	assertEquals(actualtitleString ,expectedtitleString);

	}

}
