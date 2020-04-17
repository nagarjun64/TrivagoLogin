package pageobjects.admin;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIManageUsers {

	public UIManageUsers (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	//	========Create New user Screen========

	//Create new user button
	@FindBy(xpath = "//button[contains(text(),'Add User')]")
	public WebElement createNewUser;

	//Email id for the new user
	@FindBy(id = "emailId")
	public WebElement emailId;

	//Shor Name for the new user
	@FindBy(id = "shortname")
	public WebElement shortname;

	//First Name of the new user
	@FindBy(id = "firstname")
	public WebElement firstname;

	//last name of the new user
	@FindBy(id = "lastname")
	public WebElement lastname;

	//Password of the new user
	@FindBy(id = "password")
	public WebElement password;

	//Re-Enter the password of the new user
	@FindBy(id = "password2")
	public WebElement reenterPwd;

	//Overall level role of the new user
	@FindBy(id = "reason")
	public WebElement userRole;

	//Time Zone of the new user
	@FindBy(id = "selectTimeZone")
	public WebElement userTimeZones;

	//Reason to add the new user
	@FindBy(id = "regAddByAdminfrm_user_reason")
	public WebElement reason;

	//Add user button after filling all the new user details.
	@FindBy(id = "addUser")
	public WebElement saveNewUser;

	//==================OutSide of User Creation Screen===========

	//User Search box
	@FindBy(xpath = "//*[@id='viewAllUsersTable_filter']//input[@aria-controls='viewAllUsersTable']")
	public WebElement searchUsers;

	//Page Drop Down in Manage users
	@FindBy(xpath = "//div[@id='viewAllUsersTable_length']//*[@name='viewAllUsersTable_length']")
	public WebElement pageDropDwn;

	//User Email for the first user
	@FindBy(xpath = "//tbody[@role='alert']//tr[1]//td[1]//p[2]")
	public WebElement emailFirstUser;

	//Edit Email for the first user
	@FindBy(xpath = "//tbody[@role='alert']//tr[1]//td[5]//a[1]//i")
	public WebElement editFirstUsr;

	//Change Password Email for the first user
	@FindBy(xpath = "//tbody[@role='alert']//tr[1]//td[5]//a[2]//i")
	public WebElement changePwdFirstUsr;

	//delete Email for the first user
	@FindBy(xpath = "//tbody[@role='alert']//tr[1]//td[5]//a[3]//i")
	public WebElement deleteFirstUsr;

	//Confirm delete user
	@FindBy(xpath = "//*[@id='jqi_state0_buttonOk']")
	public WebElement confirmDelete;

	//Cancel delete user
	@FindBy(xpath = "//*[@id='jqi_state0_buttonCancel']")
	public WebElement cancelUserDelete;


	//==================Change Password Screen========================

	//First Password while resetting the password
	@FindBy(xpath = "//*[@id='newPwd']")
	public WebElement pwdReset;

	//Reenter the password while resetting the password
	@FindBy(xpath = "//*[@id='ConfirmnewPwd']")
	public WebElement pwdReEntrReset;

	//Save the changed password
	@FindBy(xpath = "//*[@id='updateResponse']")
	public WebElement updatePwd;

}
