package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement element1 = d.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement element2 = d.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act=new Actions(d);
		
		act.dragAndDrop(element1, element2).perform();
	}
}
