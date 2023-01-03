package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class FullWebPageScreenShot {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)d;
		
		File sc=ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\admin\\Desktop\\chiku\\amazon.jpg");
		Files.copy(sc, dest);
		

	}

}
