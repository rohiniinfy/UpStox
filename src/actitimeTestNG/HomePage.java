
package actitimeTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//td[text()='Enter Time-Track']") private WebElement text;
	
	public HomePage(WebDriver d) {
		PageFactory.initElements(d,this);
	}
	
	public String verifyText() {
		String ActText = text.getText();
		return ActText;
		
	}
}
