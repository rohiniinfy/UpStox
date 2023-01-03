package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Methods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
		String url=d.getCurrentUrl();
		
		System.out.println(url);
		
		String pagesource=d.getPageSource();
		
		System.out.println(pagesource);
		
		String title=d.getTitle();
		
		System.out.println(title);
	}
}
