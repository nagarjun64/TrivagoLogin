package stepDefinitions.LogIn;

import helpers.Hooks;
import helpers.ReadConfig;
import helpers.SimplifyUtils;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.openqa.selenium.WebDriver;

import actions.AccountRegistraction;
import actions.LogInAction;
import pageobjects.UIHomePage;
import pageobjects.UIUserSection;
import pageobjects.Login.UILogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SDLogin {

	final Logger log = Logger.getLogger(this.getClass().getName());

	WebDriver driver;

	public SDLogin()
	{
		driver = Hooks.driver;
	}


	@Given("Customer opens Trivago account")
	public void customer_opens_Trivago_account() {
		

	}

	@Then("Customer should login successfully")
	public void customer_should_login_successfully() {


	}

	@Given("Account is created on Trivago")
	public void account_is_created_on_Trivago() {

		AccountRegistraction registration = new AccountRegistraction();
		LogInAction login = new LogInAction();
		SimplifyUtils utils = new SimplifyUtils();

		//		driver.manage().deleteAllCookies();

		login.openLoginPage();

		utils.pause(2000);

		login.login("testngarjuna@123.com", "StrongPassword#123");

		//		registration.registerLoginUsingEmail(testngarjuna@123.com, StrongPassword#123);


	}

	@Given("Logged in using the created account")
	public void logged_in_using_the_created_account() {
		
		  AccountRegistraction registration = new AccountRegistraction(); LogInAction
		  login = new LogInAction(); 
		  SimplifyUtils utils = new SimplifyUtils();
		  
		  login.openLoginPage();
		  
		  utils.pause(2000);
		  
		  
		  
		  login.login("testngarjuna@123.com", "StrongPassword#123");
		 

	}

	@When("Ticket is created from Help Section located in Account Settings")
	public void ticket_is_created_from_Help_Section_located_in_Account_Settings() {
		

	}

	@Then("Ticket should be created successfully")
	public void ticket_should_be_created_successfully() {

		try 
		{
			//			Assert.assertEquals();
		} 
		catch (ComparisonFailure e) 
		{
			log.error("Error Would be: ",e);
			Assert.fail();
		}

	}
	
	@When("Navigated to Account Settings Page")
	public void navigated_to_Account_Settings_Page() {
		
		UIHomePage homePage = new UIHomePage(driver);
		UIUserSection userSection = new UIUserSection(driver);
		SimplifyUtils utils = new SimplifyUtils();
		
		utils.scrollToElement(userSection.usrLoggedIn);
		
		utils.pause(1000);
		
		userSection.acctSettings.click();
		
	}

	@Then("Account Settings Page should Load")
	public void account_Settings_Page_should_Load() {
		
	}



}
