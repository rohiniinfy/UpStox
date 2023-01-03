package testNGFile;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeClass
	public void openBrowser() {
		Reporter.log("Open the Browser", true);
	}
	
	@BeforeMethod
	public void loginToApp() {
		Reporter.log("Login to App", true);
	}
	@Test
	public void verifyuserid() {
		Reporter.log("running  verify user if TC", true);
	}
	
	@AfterMethod
	public void logoutToApp() {
		Reporter.log("logout from App", true);
	}
	@AfterClass
	public void closeBrower() {
		Reporter.log("Browser closed", true);
	}
}
