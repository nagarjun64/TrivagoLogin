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

	public void loginAsOwner(){

		UILogin loginHome = new UILogin(driver);
		UIHomePage uiHome = new UIHomePage(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();

//		Log.info("Login UserName: "+ReadConfig.loginOwnerEmail);
		loginHome.userName.sendKeys(ReadConfig.loginOwnerEmail);

//		Log.info("Login Password: "+ ReadConfig.loginOwnerPassword);
		loginHome.userPassword.sendKeys(ReadConfig.loginOwnerPassword);

		loginHome.loginButton.submit();
		
		simplifyUtils.pause(3000);
		
		simplifyUtils.waitTillElementFound(uiHome.welcomeText, 120);
		
	}

	public void loginAsAdmin(){

		UILogin loginHome = new UILogin(driver);
		UIHomePage uiHome = new UIHomePage(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();;

		loginHome.userName.sendKeys(ReadConfig.loginAdminEmail);

		loginHome.userPassword.sendKeys(ReadConfig.loginAdminPassword);

		loginHome.loginButton.click();
		
		simplifyUtils.pause(2000);
		
		simplifyUtils.waitTillElementFound(uiHome.welcomeText, 120);
	}

	public void login(String userEmail, String password){

		UILogin loginHome = new UILogin(driver);
		UIHomePage uiHome = new UIHomePage(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();

		loginHome.userName.sendKeys(ReadConfig.loginOwnerEmail);

		loginHome.userPassword.sendKeys(ReadConfig.loginOwnerPassword);

		loginHome.loginButton.submit();
		
		simplifyUtils.pause(2000);
		
		simplifyUtils.waitTillElementFound(uiHome.welcomeText, 120);
	}
	
	public void switchUser(){

		UIBoss boss = new UIBoss(driver);
		UIMenu menu = new UIMenu(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		
		driver.get(ReadConfig.baseURL+"Boss");

		sutils.implicitlyWaitFor(20);
		sutils.pause(20000);
		
		boss.switchUserOptn.click();
		
		sutils.implicitlyWaitFor(8);

		sutils.selectElementByValue(boss.switchUserDropDown, "nagarjun.reddy@in-rev.com");
		
		boss.switchUserBtn.click();

		sutils.implicitlyWaitFor(3);
		
		sutils.waitForElementToBeClickable(menu.listenHome, 12);
		
	}
	

}
