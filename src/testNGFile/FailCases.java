package testNGFile;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.Assert;


public class FailCases {

	@Test
	public void m1() {
		Reporter.log("TC1", true);
	}
	
	@Test
	public void m2() {
		Reporter.log("TC2", true);
	}
	
	@Test
	public void m3() {
		Reporter.log("TC3", true);
		Assert.fail();
	}
}
