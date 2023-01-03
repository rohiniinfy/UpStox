package assertionSoft;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertDemo {

	@Test
	public void TC() {
		String s1="Hi";
		String s2="Bye";
		
		SoftAssert s=new SoftAssert();
		
		s.assertEquals(s1, s2);
		
		System.out.println("Hii, I am After failing 1st verification");
		s.assertAll();
	}
	
	@Test
	public void TC1() {
		Reporter.log("running TC1",true);
	}
}
