package actions;

import helpers.Hooks;
import helpers.Log;
import helpers.ReadConfig;
import helpers.SimplifyUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;

import pageobjects.UIBoss;
import pageobjects.UIHomePage;
import pageobjects.UIMenu;
import pageobjects.Login.UILogin;

public class LogInAction {

	WebDriver driver;

	public LogInAction() {

		driver = Hooks.driver;
	}

	public void openLoginPage() {

		UIHomePage home = new UIHomePage(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();

		simplifyUtils.waitTillElementFound(home.loginButton ,120);

		home.loginButton.click();

	}

	public void loginAsCustomer(){

		UILogin loginHome = new UILogin(driver);
		UIHomePage uiHome = new UIHomePage(driver);
		UIMenu menu = new UIMenu(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();

		//		Log.info("Login UserName: "+ReadConfig.loginOwnerEmail);

	}


	public void login(String userEmail, String password){


		UIHomePage homepage = new UIHomePage(driver);
		UILogin loginPage = new UILogin(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();

		loginPage.loginEmail.sendKeys(userEmail);
		simplifyUtils.pause(2000);
		simplifyUtils.waitForElementToBeClickable(loginPage.googleLogin, 5);
		loginPage.loginNext.click();

		simplifyUtils.waitTillElementFound(loginPage.loginPassword ,120);
		simplifyUtils.pause(2000);
		
		loginPage.loginPassword.sendKeys(password);
		simplifyUtils.pause(2000);

		simplifyUtils.waitTillElementFound(loginPage.login ,120);

		loginPage.login.click();
		simplifyUtils.pause(2000);


	}



}
