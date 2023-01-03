package assertionHard;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Fail {

	@Test
	public void TC1() {
		Reporter.log("running TC1",true);
		Assert.fail();
	}
		@Test
		public void TC2() {
			Reporter.log("running TC2",true);
			
		}
		
	}

