package TestNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationCountDemo {

	@Test(invocationCount = 10)
	public void TC1() {
		Reporter.log("running tc1",true);
	}
	
	@Test
	public  void TC2() {
		Reporter.log("running TC2",true);
	}
}
