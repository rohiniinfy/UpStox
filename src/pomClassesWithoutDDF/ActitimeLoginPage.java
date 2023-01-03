package pomClassesWithoutDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage {

	@FindBy(xpath="//input[@id='username']") private WebElement UN;
	@FindBy(xpath="//input[@name='pwd']") private WebElement pwd;
	@FindBy(xpath="//div[text()='Login ']") private WebElement login;
	
	public ActitimeLoginPage(WebDriver d) {
		PageFactory.initElements(d, this);
		
	}
	public void enterUN() {
		UN.sendKeys("admin");
	}
	public void enterPassword() {
		pwd.sendKeys("manager");
	}
	public void  clickLogin() {
		login.click();
	}
	
}
