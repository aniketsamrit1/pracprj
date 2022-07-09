package com.jbk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login2 {
	WebDriver driver;
	
public Login2(WebDriver driver) {

this.driver=driver;
}
public void logindata(){
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys("kiran@gmail.com");
	WebElement pass=driver.findElement(By.id("password"));
	pass.sendKeys("123456");
	WebElement button=driver.findElement(By.xpath("//button"));
	button.click();
}
}
