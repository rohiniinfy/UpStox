package actitimeTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Test {

	Sheet sh;
	WebDriver d;
	LoginPage lp;
	HomePage hp;
	@BeforeClass
	public void OpenBrowser() throws Throwable {
		
		FileInputStream fis=new FileInputStream("C:\\\\Users\\\\admin\\\\Desktop\\\\chiku\\\\vvv.xlsx");
		 sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\admin\\\\\\\\Downloads\\\\\\\\chromedriver_win32 (1)\\\\\\\\chromedriver.exe");
		 d=new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lp=new LoginPage(d);
		hp=new HomePage(d);
	}	
		@BeforeMethod
		public void OpenApp() {
			String username = sh.getRow(0).getCell(0).getStringCellValue();
			lp.EnterUname(username);
			String password = sh.getRow(0).getCell(1).getStringCellValue();
			lp.EnterPass(password);
			lp.clockLoginBtn();
			
			
		}
		@org.testng.annotations.Test
		public void veifytext() {
			String exp=sh.getRow(0).getCell(2).getStringCellValue();
			String Act=hp.verifyText();
			
			Assert.assertEquals(exp, Act,"Failed...Text Are Different");
		}
		@BeforeMethod
		public void closeApp() {
//			d.close();
		}
		@BeforeClass
		public void closeBrowser() {
			Reporter.log("TC pass");
		}
		
	}

