package com.jbk.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.Logs;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.Login2;

public class Login2Test {
	WebDriver driver;
	Login2 lp2;
	
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///E:/Seleniuom%20software/Offline%20Website/index.html");
		driver.manage().window().maximize();
		lp2=new Login2(driver);
	}
	@Test
	public void veryfyCorrectCritensial(){
		lp2.logindata();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
}
