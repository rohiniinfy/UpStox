package actitimeTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//input[@id='username']") private WebElement UN;
	@FindBy(xpath="//input[@name='pwd']") private WebElement PWD;
	@FindBy(xpath="//div[text()='Login ']") private WebElement clickbtn;
	
	
	public LoginPage(WebDriver d) {
		PageFactory.initElements(d,this);

	}

	public void EnterUname(String uname) {
		UN.sendKeys(uname);
	}
	public void EnterPass(String pass) {
		PWD.sendKeys(pass);
	}
	public void clockLoginBtn() {
		clickbtn.click();
	}
	
	
}
