package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Iframe {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver d=new ChromeDriver();
		
		d.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
	WebElement element = d.findElement(By.xpath("//div[@class='hXhhq']"));
	d.switchTo().frame(element);

	
	
		
		System.out.println(element);
	}
}
