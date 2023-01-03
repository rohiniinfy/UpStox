package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleScrollDown {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		
		d.manage().window().maximize();
		
		JavascriptExecutor jse=(JavascriptExecutor)d;//Typecast
		Thread.sleep(3000);
		//Scroll Down
		jse.executeScript("window.scrollBy(0,2002);");
		Thread.sleep(4000);
		//Scroll Up
		jse.executeScript("window.scrollBy(0,2002);");
		
		
		
		
		
	}
}
