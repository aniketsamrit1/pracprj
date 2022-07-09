package LoginPage.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LoginPages.com.Dashboardpage;
import LoginPages.com.LoginPage;
import LoginPages.com.UsersPages;

@Test
public class DashboardTest {

	WebDriver driver = null;
	LoginPage lp = null;
	Dashboardpage dp = null;

	@BeforeMethod
	public void before() {
		System.setProperty("wbedriver.chrome.driver", "chromedriver.driver");
		driver = new ChromeDriver();
		driver.get("file:///E:/Seleniuom%20software/Offline%20Website/index.html");
		lp = new LoginPage(driver);
	}

	@Test(priority = 1)
	public void test01() {

		// dp.log("kiran@gmail.com", "123456");
		dp = lp.getDashboard();

		 Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
         System.out.println(driver.getTitle());
//		Assert.assertEquals("Selenium,Javv /J2EE,Python,Php", "Selenium,Javv /J2EE,Python,Php");
		
	}
}