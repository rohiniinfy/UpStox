package multibrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multi {

	WebDriver d=null;
	@Parameters("browsername")
	
	@BeforeTest
	public void openBrowser(String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32.zip\\chromedriver.exe");
			 d=new ChromeDriver();
			 
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
			d=new FirefoxDriver();
		}
		d.get("https://www.facebook.com/");
	}	
		@Test
		public void verify() {
			Reporter.log("Login Successfull",true);
		}
		@AfterTest
		public void BrowserClose() {
			d.quit();
		}
	}
	
	

