package TestNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeoutsDemo {

	@Test
	public void TC1() {
		Reporter.log("running TC1",true);
	}
	
	@Test
	public void TC2() {
		Reporter.log("running TC2",true);
	}
	
	@Test(timeOut =3000)
	public void TC3() {
		Reporter.log("running TC3",true);
}
}
