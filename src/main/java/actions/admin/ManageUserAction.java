package actions.admin;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.ListAutoNumber;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import actions.OpenModule;
import actions.listen.ListenUtils.replyOptions;
import helpers.Hooks;
import helpers.Log;
import helpers.SimplifyUtils;
import helpers.SocialLogin;
import pageobjects.UIMenu;
import pageobjects.Listen.UIListenProfileCreation;
import pageobjects.admin.UIManageUsers;

/**
 * @author nagarjunareddy
 *
 */

public class ManageUserAction {

	final Logger log = Logger.getLogger(this.getClass().getName());
	
	WebDriver driver;

	public ManageUserAction()
	{
		driver = Hooks.driver;
	}

	//===========================================Open UserCreation Screen==================================//

	public void openUserCreationScreen() {

		UIManageUsers mgUser = new UIManageUsers(driver);
		SimplifyUtils utils = new SimplifyUtils();


		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");

		utils.waitForElementToBeClickable(mgUser.createNewUser, 5);

		mgUser.createNewUser.click();

	}

	//===========================================Create New User===========================================//

	public void createNewUser(String emailId, String shortName,String firstName, String lastName, String password, String reEnterPassword, String Role) {

		UIManageUsers mgUser = new UIManageUsers(driver);
		SimplifyUtils utils = new SimplifyUtils();

		utils.waitTillElementFound(mgUser.emailId, 5);

		mgUser.emailId.sendKeys(emailId);
		mgUser.shortname.sendKeys(shortName);
		mgUser.firstname.sendKeys(firstName);
		mgUser.lastname.sendKeys(lastName);
		mgUser.password.sendKeys(password);
		mgUser.reenterPwd.sendKeys(reEnterPassword);

		utils.selectElementByVisibleText(mgUser.userRole, Role);
		utils.selectElementByValue(mgUser.userTimeZones, "Asia/Calcutta");
		utils.scrolltoElementByLocator(mgUser.saveNewUser);

		mgUser.saveNewUser.click();

	}

	public void createNewUser1(String emailId, String shortName,String firstName, String lastName, String password, String reEnterPassword, String Role) {

		UIManageUsers mgUser = new UIManageUsers(driver);
		SimplifyUtils utils = new SimplifyUtils();

		utils.waitTillElementFound(mgUser.emailId, 5);

		mgUser.emailId.sendKeys(emailId);
		mgUser.shortname.sendKeys(shortName);
		mgUser.firstname.sendKeys(firstName);
		mgUser.lastname.sendKeys(lastName);
		mgUser.password.sendKeys(password);
		mgUser.reenterPwd.sendKeys(reEnterPassword);

		utils.selectElementByVisibleText(mgUser.userRole, Role);
		utils.selectElementByValue(mgUser.userTimeZones, "Asia/Calcutta");

		mgUser.saveNewUser.click();

	}

	//===========================================Other Operations===========================================//

	public boolean searchUser(String requiredUser) {

		UIManageUsers mgUser = new UIManageUsers(driver);
		SimplifyUtils utils = new SimplifyUtils();
		boolean userPresent = false;
		
		utils.pause(100);
		utils.waitForElementToBeClickable(mgUser.createNewUser, 5);
		utils.scrolltoElementByLocator(mgUser.searchUsers);
		
		mgUser.searchUsers.clear();

		mgUser.searchUsers.sendKeys(requiredUser);

		if(mgUser.emailFirstUser.isDisplayed()) 
		{
			userPresent =  true;
		}
		else if (!mgUser.emailFirstUser.isDisplayed()) 
		{
			userPresent =  false;	
		}

		return userPresent;
	}

	public boolean deleteUser(String requiredUser) {

		UIManageUsers mgUser = new UIManageUsers(driver);
		SimplifyUtils utils = new SimplifyUtils();


		boolean userToBeDeleted = false;

		//checking if the user is present or not
		if (this.searchUser(requiredUser)==true) 
		{
			mgUser.deleteFirstUsr.click();
		}

		utils.waitForElementToBeClickable(mgUser.confirmDelete, 5);

		mgUser.confirmDelete.click();											//Clicking on the confirmation whether to delete the user or not

		utils.pageRefresh();													//refreshig the page after deleting the user

		utils.waitForElementToBeClickable(mgUser.createNewUser, 5);

		//checking if the user is present or not
		if(!mgUser.emailFirstUser.isDisplayed()) 
		{
			userToBeDeleted =  true;
		}
		else if (mgUser.emailFirstUser.isDisplayed()) 
		{
			userToBeDeleted =  false;	
		}
		return userToBeDeleted;

	}
}
