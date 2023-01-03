package buyMobile;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("https://www.amazon.in/");
		
		d.manage().window().maximize();
		
		String mainPage = d.getWindowHandle();

		d.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Dell Laptops",Keys.ENTER);
		
		d.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
		
		Set<String> ids = d.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<String>(ids);
		
		for(String str : al) {
			if(!mainPage.equalsIgnoreCase(str)) {
				d.switchTo().window(str);
				d.findElement(By.xpath("//input[@id='buy-now-button']")).click();
			}
		}

		
		
		
	}
}
