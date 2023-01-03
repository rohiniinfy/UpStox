package pomClassesWithoutDDF;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeApp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://demo.actitime.com/login.do");
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		ActitimeLoginPage alp=new ActitimeLoginPage(d);
		alp.enterUN();
		alp.enterPassword();
		alp.clickLogin();
		
		ActitimeHomePage ahp=new ActitimeHomePage(d);
		ahp.verifytext();
		
	}
}
