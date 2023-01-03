package PopUps;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUps {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.google.com/");
		
		d.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobile",Keys.ENTER);
		d.findElement(By.xpath("//span[@class='pymv4e']")).click();
		
		Set<String> ids=d.getWindowHandles();
		ArrayList al=new ArrayList<>(ids);
		
		System.out.println(al.get(0));//Main Window ID
		
		System.out.println(al.get(1));//Child Window ID
		
		
	}
}
