package DynamicElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorldoMeter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.worldometers.info/coronavirus/country/uk");
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String covidCases = d.findElement(By.xpath("(//div[@class='maincounter-number'])[1]")).getText();
		System.out.println("Total Covid Cases are: "+covidCases);
		
		String recoveredCases = d.findElement(By.xpath("(//div[@class='maincounter-number'])[3]")).getText();
		System.out.println("Total recovered cases are: "+recoveredCases);
		
		String deathCases = d.findElement(By.xpath("(//div[@class='maincounter-number'])[2]")).getText();
		System.out.println("Total death cases are: "+deathCases);
		
		
	}
}
