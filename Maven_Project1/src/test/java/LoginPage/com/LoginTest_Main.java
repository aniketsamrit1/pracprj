package LoginPage.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import LoginPages.com.Dashboardpage;

import LoginPages.com.LoginPage;
import LoginPages.com.UsersPages;

public class LoginTest_Main {
	WebDriver driver = null;
	LoginPage lp=null;
	Dashboardpage dp = null;
	UsersPages up = null;

	@Test(priority=1)
	public void test01() {
		System.setProperty("wbedriver.chrome.driver", "chromedriver.driver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Seleniuom%20software/Offline%20Website/index.html");
         lp=new LoginPage(driver);
//		LoginPage lp = new LoginPage(driver);
		// dp.log("kiran@gmail.com", "123456");
		dp = lp.getDashboard();
		

		 Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
			up = lp.getuser();
			Assert.assertEquals(driver.getTitle(), "JavaByKiran | User");
			System.out.println(driver.getTitle());
		
	}

	@Test(priority=02)
	public void dashboardtest02() {
//
//		Assert.assertTrue(dp.verifyCources());
//		System.out.println(dp.verifyCources());

	}

	@Test(priority=03)
	public void usertest03() {
	
		Assert.assertTrue(up.verifyusers());
		System.out.println(up.verifyusers());
	}
}
