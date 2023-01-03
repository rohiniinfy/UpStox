package KeyClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLoginByKeyClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
		d.findElement(By.xpath("//input[@id='email']")).sendKeys("9765412544",Keys.TAB,"futureconfuse",Keys.ENTER);
	}
}
