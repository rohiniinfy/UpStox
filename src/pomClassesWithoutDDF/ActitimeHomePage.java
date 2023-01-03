package pomClassesWithoutDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage {

	@FindBy(xpath="//td[text()='Enter Time-Track']") private WebElement text;
	
	public ActitimeHomePage(WebDriver d) {
		PageFactory.initElements(d,this);
	}
	
	public void verifytext() {
		String expT = "Enter Time-Track";
		String actT = text.getText();
		
		if(expT.equals(actT)) {
			System.out.println("TC pass");
		}
		else {
			System.out.println("TC is Fail");
		}
	}
}
