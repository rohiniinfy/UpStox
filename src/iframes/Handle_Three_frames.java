package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Three_frames {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		
		d.manage().window().maximize();
		
		d.switchTo().frame(0);
		
		Thread.sleep(3000);
		String text1=d.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
		System.out.println(text1);
		
		d.switchTo().defaultContent();
		
		d.switchTo().frame(1);//frame By index of we can take ID as in index
		
		String text2 = d.findElement(By.xpath("//a[text()='ActualMain']")).getText();
		
		System.out.println(text2);
		
		d.switchTo().defaultContent();
		d.switchTo().frame("classFrame");//frame by name
		String text3=d.findElement(By.xpath("//a[text()='Capabilities']")).getText();
		System.out.println(text3);
		
		d.switchTo().defaultContent();
		
		WebElement element=d.findElement(By.xpath("//iframe[@name='packageListFrame']"));
		d.switchTo().frame(element);//frame by element
		
		String text4=d.findElement(By.xpath("//a[text()='org.openqa.selenium.chromium']")).getText();
		
		System.out.println(text4);
		
	}
}
