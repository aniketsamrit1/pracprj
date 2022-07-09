package LoginPage.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import LoginPages.com.Dashboardpage;
import LoginPages.com.LoginPage;
import LoginPages.com.UsersPages;

public class LoginPageTest {

	WebDriver driver = null;
	LoginPage lp=null;
	
	@Test(priority=1)
	public void test01() {
		System.setProperty("wbedriver.chrome.driver", "chromedriver.driver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Seleniuom%20software/Offline%20Website/index.html");
         lp=new LoginPage(driver); //LoginPage lp = new LoginPage(driver);
		
		lp.log("kiran@gmail.com", "123456");
		 Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
         System.out.println(driver.getTitle());
}}
