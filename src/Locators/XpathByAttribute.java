package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
		d.findElement(By.xpath("//input[@id='email']")).sendKeys("9765412544");
		
		d.findElement(By.xpath("//input[@id='pass']")).sendKeys("futureconfuse");
		Thread.sleep(4000);
		
		d.findElement(By.xpath("//button[@name='login']")).click();
	}
}
