package assertionHard;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class equals {

	@Test
	public void TC1() {
		String exp="AAA";
		String act="AAA";
		
		assertEquals(exp, act);
	}
}
