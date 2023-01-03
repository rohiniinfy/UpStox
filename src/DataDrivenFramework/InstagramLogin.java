package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.junit.Assert;

import dev.failsafe.internal.util.Assert;

public class InstagramLogin {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();

		d.get("https://www.google.com/");
		d.navigate().to("https://www.instagram.com/accounts/login/");
		
	FileInputStream fis=new FileInputStream("C:\\Users\\admin\\Desktop\\chiku\\insta.xlsx");
	
	Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
	
	String UN = sh.getRow(0).getCell(0).getStringCellValue();
	d.findElement(By.xpath("//input[@name='username']")).sendKeys(UN);
	
	String pass = sh.getRow(0).getCell(1).getStringCellValue();
	d.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
	
	d.findElement(By.xpath("//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    '][1]")).click();
	
	Thread.sleep(8000);
	String actT = d.getTitle();
	System.out.println(actT);
	String extT="Instagram";
	
	if(actT.equals(extT)) {
		System.out.println("Title same TC pass");
	}
	else {
		System.out.println("Title different TC fail");
	}
	
	}
}
