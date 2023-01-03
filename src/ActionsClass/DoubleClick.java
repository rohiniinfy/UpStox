package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.google.com/");
		
		Actions act=new Actions(d);
		
		WebElement tgt = d.findElement(By.xpath("//a[@class='gb_1 gb_2 gb_8d gb_8c']"));
		act.moveToElement(tgt).doubleClick().perform();
	}
}
