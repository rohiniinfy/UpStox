package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver d=new ChromeDriver();
		
		d.get("https://www.google.com/");
		
		d.findElement(By.tagName("input")).sendKeys("Automation",Keys.ENTER);
	}
}
