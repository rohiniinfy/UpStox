package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Iframe {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		d.manage().window().maximize();
		
		d.switchTo().frame(1);
		
		Thread.sleep(4000);
		String text=d.findElement(By.xpath("(//iframe)[2]")).getText();
		
		System.out.println(text);
		
	}
}
