package assertionHard;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class trueAndfalse {

	@Test
	public void TC4() {
		Reporter.log("running TC",true);
		boolean act=true;
		assertTrue(act);
		
		assertFalse(act);
	}
}
