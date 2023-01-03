package DynamicElement;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.flipkart.com/");
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		d.findElement(By.xpath("//input[@name='q']")).sendKeys("Iphone Mobiles",Keys.ENTER);
		
		String price = d.findElement(By.xpath("(//div[@class='col col-5-12 nlI3QM'])[1]/descendant::div[3]")).getText();
		
		System.out.println("Iphone 11 price is:"+price);
		
		String review=d.findElement(By.xpath("(//div[@class='col col-7-12'])[1]/descendant::div[2]")).getText();
		System.out.println(review);
		
		String exchange = d.findElement(By.xpath("(//div[@class='col col-5-12 nlI3QM'])[1]/descendant::div[10]")).getText();
		System.out.println(exchange);
		
		
		
	}
}
