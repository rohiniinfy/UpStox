package Multiple_Elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Elements {

	public static void main(String[] args){
		int count=0;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("https://www.flipkart.com/");
		
		d.findElement(By.xpath("//button[text()='✕']")).click();
		
		List<WebElement> elements=d.findElements(By.xpath("//div"));
		
		for(WebElement i:elements) {
			System.out.println(i.getText());
			count++;
		}
		System.out.println(count);
		
	}
}
