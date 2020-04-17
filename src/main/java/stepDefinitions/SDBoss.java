package stepDefinitions;

import org.openqa.selenium.WebDriver;

import actions.LogInAction;
import helpers.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SDBoss {
	
	WebDriver driver;

	public SDBoss()
	{
		driver = Hooks.driver;
	}
	
	
	@Given("User Logged in to Platform")
	public void user_Logged_in_to_Platform() {
		
		LogInAction login = new LogInAction();
		
		login.loginAsOwner();

	}

	@When("Switched to User")
	public void switched_to_User() {
		
		LogInAction login = new LogInAction();
		
		login.switchUser();
		
	}

	@Then("Respective User Account should open")
	public void respective_User_Account_should_open() {
	    
		System.out.println("Logged in to User Account");
		
	}

}
