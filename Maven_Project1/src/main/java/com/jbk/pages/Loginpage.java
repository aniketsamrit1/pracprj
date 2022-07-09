package com.jbk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	WebDriver driver;

	public Loginpage(WebDriver driver) {
		this.driver = driver;

	}
	public void correctcredential() throws Exception {
		
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("kiran@gmail.com");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123456");
		
		Thread.sleep(5000);
		
		WebElement button = driver.findElement(By.xpath("//button"));
		button.click();
		System.out.println("===1st page ok======");

	}
}
