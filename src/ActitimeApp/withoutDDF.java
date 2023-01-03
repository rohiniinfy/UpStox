package ActitimeApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class withoutDDF {

	 public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver d=new ChromeDriver();
		 
		 d.manage().window().maximize();
		 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 d.get("https://demo.actitime.com/login.do");
		 
		 d.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		 d.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		 d.findElement(By.xpath("//div[text()='Login ']")).click();
		  String expT = "Enter Time-Track";
		  String actT = d.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
		  System.out.println(actT);
		  
		  Assert.assertEquals(actT, expT);
	}
}
