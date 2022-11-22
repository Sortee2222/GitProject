package com.OrangeHRM.Pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLoginPageFunctionality 
{	
	WebDriver driver;
									//Step 1 = Find All Elements on the Login Page
	@FindBy(name="username")
	private WebElement username;	
	
	@FindBy(name="password")
	private WebElement password;	
	
	@FindBy(css = "[type=\"submit\"]")
	private WebElement loginButton;
	
	@FindBy(css = "[alt=\"company-branding\"]")
	private WebElement logo;
	
	@FindBy(xpath = "//p[text()=\"Forgot your password? \"]")
	private WebElement forgotPassword;
	
	@FindBy(xpath = "//a[2]")
	private WebElement socialMediaLink;

												//Step 2 = Create a Constructor

	public POMLoginPageFunctionality(WebDriver driver)
	{
//		PageFactory.initElements(driver, LoginPagePOM.class);		OR
		PageFactory.initElements(driver, this);	
		this.driver = driver;
	}
	
	public void typeUsername(String uName)
	{
		username.sendKeys(uName);
	}
	public void typePassword(String pwd)
	{
		password.sendKeys(pwd);

	}
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
}
