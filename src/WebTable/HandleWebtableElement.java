package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebtableElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("file:///C:/Users/admin/Downloads/WebTable%20by%20ANKUSH%20(1).html");
		
		String text = d.findElement(By.xpath("//table[@id='2244']//th[2]")).getText();
		System.out.println(text);
		
		String tableData = d.findElement(By.xpath("//table[@id='2244']/descendant::td[5]")).getText();
		System.out.println(tableData);
		
		String wholerow = d.findElement(By.xpath("//table[@id='2244']//tr[4]")).getText();
		System.out.println(wholerow);
		
		
	}
}
