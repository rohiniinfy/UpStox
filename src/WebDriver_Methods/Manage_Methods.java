package WebDriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Methods {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
		d.manage().window().maximize();
		
		Thread.sleep(3000);
		
		d.manage().window().minimize();
		
		Dimension dim=new Dimension(300,500);
		d.manage().window().setSize(dim);
		
		Thread.sleep(3000);
		
		Point p=new Point(500,500);
		d.manage().window().setPosition(p);
		
	}
}
