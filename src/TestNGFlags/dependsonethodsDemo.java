package TestNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsonethodsDemo {

	@Test
	public void login() {
		Reporter.log("running login TC",true);
	}
	
	@Test(dependsOnMethods= {login})
	public void logout() {
		Reporter.log("running logout TC",true);
	}
}
