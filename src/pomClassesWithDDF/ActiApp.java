package pomClassesWithDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiApp {
	public static void main(String[] args) throws Throwable {
		

	FileInputStream fis=new FileInputStream("C:\\Users\\admin\\Desktop\\chiku\\vvv.xlsx");
	Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	
	d.manage().window().maximize();
	d.get("https://demo.actitime.com/login.do");
	
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	ActiLoginPage alp=new ActiLoginPage(d);
	String username = sh.getRow(0).getCell(0).getStringCellValue();
	alp.enterusername(username);
	
	String pass = sh.getRow(0).getCell(1).getStringCellValue();
	alp.EnterPass(pass);
	
    alp.ClickLogin();
    
    ActiHomePage ahp=new ActiHomePage(d);
    String actT = sh.getRow(0).getCell(2).getStringCellValue();
    ahp.validateText(actT);
	
	
	
	
}
}