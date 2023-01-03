package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUps {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://demo.guru99.com/test/delete_customer.php");
		
		d.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345",Keys.ENTER);
		
		Alert alt=d.switchTo().alert();
		
		alt.accept();
	
		//alt.dismiss();
		System.out.println(alt.getText());
	}
}
