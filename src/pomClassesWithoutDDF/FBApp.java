package pomClassesWithoutDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBApp {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	
	d.manage().window().maximize();
	d.get("https://www.facebook.com/");
	
	FBLoginPage flp=new FBLoginPage(d);
    
	flp.EnterUserName();
	flp.EnterPassword();
	flp.ClickLogin();
}
}
