package LoginPages.com;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpretorsPage {

	@FindBy(xpath="//h1")
	WebElement Opretor;
	@FindBy(xpath="//tbody")
	List<WebElement> listOpretor;
	
	public OpretorsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
		Opretor.click();
	
		
	}
	public boolean verifyOpretors(){
		boolean flag=false;
		for (WebElement opretors : listOpretor){
			flag =opretors.isDisplayed();
		}	
		return flag;
	}


}
