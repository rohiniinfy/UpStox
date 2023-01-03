package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithDDF {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\admin\\Desktop\\chiku\\data.xlsx");
		
		Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://demo.actitime.com/login.do");
		
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		d.findElement(By.xpath("//input[@id='username']")).sendKeys(UN);
		
		String pwd = sh.getRow(0).getCell(1).getStringCellValue();
		d.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
		
		d.findElement(By.xpath("//div[text()='Login ']")).click();

		Thread.sleep(5000);
		
		String actT = d.getTitle();
		
		System.out.println(actT);
		
		String expT = "actiTIME - Enter Time-Track";
		
		if(actT.equals(expT)) {
			System.out.println("Title are same TC is pass");
		}
		else {
			System.out.println("Title are different TC is fail");
		}

		
	}
}
