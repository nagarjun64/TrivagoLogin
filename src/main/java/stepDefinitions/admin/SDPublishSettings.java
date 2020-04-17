package stepDefinitions.admin;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import actions.LogInAction;
import actions.OpenModule;
import actions.settings.ManagePublishSettings;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import helpers.Hooks;
import helpers.Log;
import helpers.SimplifyUtils;
import pageobjects.admin.UIPublishsettings;

public class SDPublishSettings {

	private static Logger Log = Logger.getLogger(Log.class.getName());
	WebDriver driver;
	String userEmail;

	
	public SDPublishSettings()
	{
		driver = Hooks.driver;
	}
	
	@Given("^User navigates to create response page$")
	public void user_navigates_to_create_response_page() throws Throwable { 
	
		LogInAction login = new LogInAction();
		OpenModule open = new OpenModule();

		login.loginAsOwner();
//		open.openManagePublish();
		open.openManageFAQ();
		
		
	}
	@When("^Clicks on create response$")
	public void Clicks_on_create_response() throws Throwable {
		
		ManagePublishSettings mngPublish = new ManagePublishSettings();
		mngPublish.openCreateResponseScreen();
		
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$") 
	public void User_enters_and (String name, String Response) throws Throwable {
	    
		ManagePublishSettings mngPublish = new ManagePublishSettings();
		mngPublish.createNewResponse(name, Response);
	
	}

	@Then("^Response should be added successfully$") 
	public void Response_should_be_added_successfully() throws Throwable  {
	    
		UIPublishsettings mngPublish = new UIPublishsettings(driver);
		SimplifyUtils utils = new SimplifyUtils();
	}	
	
	

}
