package PopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUps {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
			ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		c.addArguments("start-maximized");
		
		WebDriver d=new ChromeDriver();
		Thread.sleep(4000);
		
		d.get("https://www.hdfc.com/");
		
	}
}
