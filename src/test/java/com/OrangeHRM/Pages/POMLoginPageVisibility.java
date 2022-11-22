package com.OrangeHRM.Pages;
import org.openqa.selenium.*; import org.openqa.selenium.support.*;

public class POMLoginPageVisibility 
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

	public POMLoginPageVisibility(WebDriver driver)
	{
		PageFactory.initElements(driver, this);							//OR PageFactory.initElements(driver, LoginPagePOMVisibility.class);
		this.driver = driver;
	}
	
										//Step 3 = Create Methods Accordingly and Step 4 me as in TEST CASES me in sabko ek ek krke call krenge mast
	
	public boolean isUsernameVisible()
	{
		return username.isDisplayed();
	}
	
	public boolean isPasswordVisible()
	{
		return password.isDisplayed();
	}
	
	public boolean isLoginButtonVisible()
	{
		return loginButton.isDisplayed();
	}
	
	public boolean isLogoVisible()
	{		
		return logo.isDisplayed();	
	}
	
	public boolean isForgotPasswordVisible()
	{		
		return forgotPassword.isDisplayed();	
	}
	
	public boolean isSocialMediaLinkVisible()
	{		
		return socialMediaLink.isDisplayed();	
	}
	
}
