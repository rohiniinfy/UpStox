package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SelectedPartScreenShot {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		
		WebElement we = d.findElement(By.xpath("//img[@class='lnXdpd']"));
		File sc=we.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\admin\\Desktop\\chiku\\logo.jpg");
		Files.copy(sc, dest);
		
	}
}
