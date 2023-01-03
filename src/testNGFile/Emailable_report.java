package testNGFile;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable_report {

	@Test
	public void TC1() {
		Reporter.log("I am running from test case1", true);
	}
	
	@Test
	public void TC2() {
		Reporter.log("I am running from test case2", true);
	}
}
