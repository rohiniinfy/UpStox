package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDOB {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.google.com/");
		
		d.findElement(By.xpath("//input[@name='q']")).sendKeys("facebook",Keys.ENTER);
		
		d.findElement(By.xpath("//cite[text()='https://www.facebook.com']")).click();
		
		d.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		Thread.sleep(4000);
		WebElement day = d.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(day);
		s.selectByIndex(11);
		
		Thread.sleep(4000);
		WebElement month = d.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		s1.selectByValue("11");
		
		Thread.sleep(4000);
		WebElement year = d.findElement(By.xpath("//select[@id='year']"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1994");
		
		System.out.println("Script Executed Successfully!!!");
		System.out.println("HII");
		
		
	}
}
