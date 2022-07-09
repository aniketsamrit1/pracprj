package LoginPages.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver=null;
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button")
	WebElement loginbutton;
	
	@FindBy(xpath="//h1")
	WebElement Opretor;
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void log(String uname, String pass){
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginbutton.click();
		Opretor.click();
	}
	public Dashboardpage getDashboard(){
		username.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		loginbutton.click();
		
		return new Dashboardpage(driver);
	}
	public UsersPages getuser() {
		
		return new UsersPages(driver);
		
	}
	public OpretorsPage getopretor(){
		
		return new OpretorsPage(driver);
	}
	
	}
	
	


