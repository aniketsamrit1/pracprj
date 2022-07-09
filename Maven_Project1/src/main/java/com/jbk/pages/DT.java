package com.jbk.pages;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

public class DT {
	WebDriver driver = null;

	@BeforeSuite
	public void setup() {
		System.setProperty("wbedriver.chrome.driver", "chromedriver.driver");


		driver = new ChromeDriver();

	}

	@Test(dataProvider = "logindata")

	public void Logintest(String uname, String pass,String errMsg,String Passerr) {
		driver.get("file:///E:/Seleniuom%20software/Offline%20Website/index.html");

		if(driver.getTitle().equals("JavaByKiran | Dashboard"))
        driver.findElement(By.id("LOGOUT")).click();

		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(uname);

		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(pass);

		driver.findElement(By.xpath("//button")).click();
		
		if(driver.getTitle().equals("JavaByKiran | Dashboard"))
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		else{
			WebElement emailErr=driver.findElement(By.id("email_error"));
			Assert.assertEquals(emailErr.getText(), errMsg);
			WebElement passErr=driver.findElement(By.id("password_error"));
			Assert.assertEquals(passErr.getText(), Passerr);
		}
		
	}
	

	@DataProvider
	public Object[][] logindata(){
		return new Object[][] { 
			new Object[] { "", "" ,"Please enter email.","Please enter password."},
			
			new Object[] { "aniket@gmail.com", "1245697" ,"Please enter email as kiran@gmail.com","Please enter password 123456"},
			new Object[] { "kiran@gmail.com", "123456" ,"",""},

			new Object[] { "kiran@gmail.com", "123456789" ,"","Please enter password 123456"},
			new Object[] { "anikett@gmail.com", "123456" ,"Please enter email as kiran@gmail.com",""},

			};
	}
}
