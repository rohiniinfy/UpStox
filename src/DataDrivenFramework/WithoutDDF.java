package DataDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutDDF {
	public static void main(String[] args) throws Throwable {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	
	d.manage().window().maximize();
	d.get("https://demo.actitime.com/login.do");
	
	d.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin");
	d.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	d.findElement(By.xpath("//div[text()='Login ']")).click();
	
	Thread.sleep(5000);
	
	String actT = d.getTitle();
	
	System.out.println(actT);
	
	String expT = "actiTIME - Enter Time-Track";
	
	if(actT.equals(expT)) {
		System.out.println("Title are same TC is pass");
	}
	else {
		System.out.println("Title are different TC is fail");
	}
}
}