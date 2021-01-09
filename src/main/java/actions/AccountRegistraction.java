package actions;

import org.openqa.selenium.WebDriver;

import helpers.Hooks;
import helpers.SimplifyUtils;
import pageobjects.UIHomePage;
import pageobjects.Login.UILogin;

public class AccountRegistraction {


	WebDriver driver;

	public AccountRegistraction() {

		driver = Hooks.driver;
	}


	public void registerLoginUsingEmail(String emailId, String password) {

		UIHomePage homePage = new UIHomePage(driver);
		UILogin  loginpage = new UILogin(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();
		

		simplifyUtils.waitForElementToBeClickable(homePage.loginButton, 120);

		homePage.loginButton.click();

		simplifyUtils.waitForElementToBeClickable(loginpage.createAnAccount, 120);
		
		loginpage.loginRegistrationEmail.sendKeys(emailId);
		
		loginpage.loginNext.click();
		
		simplifyUtils.waitForElementToBeClickable(loginpage.loginRegisterButton, 120);
		
		loginpage.loginRegistrationPassword.sendKeys(password);
		
		loginpage.loginRegisterButton.click();

	}



}
