package LoginPages.com;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPages {
	@FindBy(xpath="//span[text()='Users']")
	WebElement user;
	@FindBy(xpath="//button[text()='Add User']")
	WebElement addUser;

	@FindBy(xpath="//td[2]")
	List <WebElement> user2;
	
	
	public UsersPages(WebDriver driver){
		PageFactory.initElements(driver, this);
		
		user.click();
		addUser.click();
	}
	public boolean verifyusers(){
		boolean flag=false;
		for (WebElement users : user2){
			flag =users.isDisplayed();
			
		}return flag;
	}
	
}



