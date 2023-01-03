package ActitimeApp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class withDDF {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\admin\\Desktop\\chiku\\vvv.xlsx");
		
		Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver d=new ChromeDriver();
		 
		 d.manage().window().maximize();
		 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 d.get("https://demo.actitime.com/login.do");
		 
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		d.findElement(By.xpath("//input[@id='username']")).sendKeys(UN);
		
		String PWD = sh.getRow(0).getCell(1).getStringCellValue();
		d.findElement(By.xpath("//input[@name='pwd']")).sendKeys(PWD);
		
		d.findElement(By.xpath("//div[text()='Login ']")).click();
		
		String expT = sh.getRow(0).getCell(2).getStringCellValue();
		
		String actT = d.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
		
		System.out.println(actT);
		
		Assert.assertEquals(actT, expT);
		
		
		
	}
}
