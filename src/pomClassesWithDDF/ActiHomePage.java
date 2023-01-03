package pomClassesWithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiHomePage {

	@FindBy(xpath="//td[text()='Enter Time-Track']")private WebElement text;
	
	
	
	public ActiHomePage(WebDriver d) {
		PageFactory.initElements(d,this);
	}



	public void validateText(String actT) {
		
		String expT = "Enter Time-Track";
		actT=text.getText();
		
		if(actT.equalsIgnoreCase(expT)) {
			System.out.println("TC is Pass");
		}
		else {
			System.out.println("TC is Fail");
		}
	}
}
