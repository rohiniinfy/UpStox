package pomClassesWithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiLoginPage {

	@FindBy(xpath="//input[@id='username']") private WebElement UN;
	@FindBy(xpath="//input[@name='pwd']") private WebElement PWD;
	@FindBy(xpath="//div[text()='Login ']") private WebElement loginBtn;
	
	

	
	public ActiLoginPage(WebDriver d) {
		PageFactory.initElements(d,this);
	}
	public void enterusername(String username) {
		UN.sendKeys(username);
	}
	public void EnterPass(String pass) {
		PWD.sendKeys(pass);
	}
	public void ClickLogin() {
		loginBtn.click();
	}
}
