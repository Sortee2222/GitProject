package com.OrangeHRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageNormal 
{	
	WebDriver driver;
	
	By username = By.name("username");
	By password = By.name("password");
	By loginButton = By.xpath("//button [@type=\"submit\"]");
	
	public LoginPageNormal(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void typeUsername(String uName)
	{
		driver.findElement(username).sendKeys(uName);
	}
	public void typePassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickLoginButton()
	{
		driver.findElement(loginButton).click();
	}
	
}