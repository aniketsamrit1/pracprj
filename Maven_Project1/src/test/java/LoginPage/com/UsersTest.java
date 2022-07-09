package LoginPage.com;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import LoginPages.com.Dashboardpage;
import LoginPages.com.LoginPage;
import LoginPages.com.UsersPages;

public class UsersTest {
	

	WebDriver driver = null;
	LoginPage lp=null;
	UsersPages up=null;
	@Test(priority=1)
	public void test01() {
		System.setProperty("wbedriver.chrome.driver", "chromedriver.driver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Seleniuom%20software/Offline%20Website/index.html");
         lp=new LoginPage(driver);
//		LoginPage lp = new LoginPage(driver);
		 lp.log("kiran@gmail.com", "123456");
		up = lp.getuser();
		

		 Assert.assertEquals(driver.getTitle(), "JavaByKiran | Add User");
			System.out.println(driver.getTitle());
	
//			Assert.assertTrue(up.verifyusers());
//			System.out.println(up.verifyusers());

	}

}


