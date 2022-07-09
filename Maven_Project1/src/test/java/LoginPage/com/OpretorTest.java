package LoginPage.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import LoginPages.com.LoginPage;
import LoginPages.com.OpretorsPage;

public class OpretorTest {
	WebDriver driver=null;
	LoginPage lp=null;
	OpretorsPage op=null;

	@Test(priority=1)
	public void test01() {
		System.setProperty("wbedriver.chrome.driver", "chromedriver.driver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Seleniuom%20software/Offline%20Website/index.html");
         lp=new LoginPage(driver);
    	 lp.log("kiran@gmail.com", "123456");

         op=lp.getopretor();
         Assert.assertEquals(driver.getTitle(), "JavaByKiran | Opretors");
			System.out.println(driver.getTitle());
	
	
	}

}
