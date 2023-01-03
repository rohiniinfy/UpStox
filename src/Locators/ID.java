package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver wd=new ChromeDriver();
		
		wd.get("https://www.facebook.com/");
		
		wd.findElement(By.id("email")).sendKeys("9765412544");
	}
}
