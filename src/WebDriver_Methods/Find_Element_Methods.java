package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Element_Methods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
		//d.findElements(By.xpath("//input[@id='email'],//input[@id='pass'],//button[@id='u_0_9_qd']")).addAll(0, "765412544",1,"futureconfuse");
	}
}
