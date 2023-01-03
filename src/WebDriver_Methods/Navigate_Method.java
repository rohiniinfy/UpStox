package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Method {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver d=new ChromeDriver();
		
		d.get("https://www.google.com/");
		
		Thread.sleep(3000);
		d.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		d.navigate().back();
		
		Thread.sleep(3000);
		
	d.navigate().forward();
		
		Thread.sleep(3000);
		
		d.navigate().refresh();
	}
}
