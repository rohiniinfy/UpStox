package pomClassesWithoutDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPage {

	@FindBy(id="email") private WebElement UN;
	@FindBy(id="pass") private WebElement pwd;
	@FindBy(name="login") private WebElement lgn;
	
	public FBLoginPage(WebDriver d) {
		PageFactory.initElements(d, this);
		
	}
	
	public void EnterUserName() {
		UN.sendKeys("9765412544");
	}
	public void EnterPassword() {
		pwd.sendKeys("futureconfuse");
	}
	public void ClickLogin() {
		lgn.click();	
	}
	
}
