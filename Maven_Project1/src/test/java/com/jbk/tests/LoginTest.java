package com.jbk.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.Loginpage;

public class LoginTest {
	WebDriver driver;
	Loginpage lp;

	@BeforeMethod
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("file:///E:/Seleniuom%20software/Offline%20Website/index.html");
		driver.manage().window().maximize();
		lp = new Loginpage(driver);
	}

	@Test
	public void verifycorrectcredential() throws Exception  {
		lp.correctcredential();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}

}
