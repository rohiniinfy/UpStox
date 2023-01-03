package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonScrollDown {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		JavascriptExecutor jse=(JavascriptExecutor)d;
		//jse.executeScript(Window.scrollBy(2000,1000));

		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
	}
}
