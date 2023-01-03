package assertionHard;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class NotEquals {

	@Test
	public void TC1() {
		String exp="AAA";
		String act="BBB";
		
		assertNotEquals(exp, act);
	}
}
