package stepDefinitions;

import helpers.Hooks;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import actions.LogInAction;
import actions.OpenModule;
import pageobjects.Listen.UIListenHome;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SDNavigation {

	WebDriver driver;

	public SDNavigation()
	{
		driver = Hooks.driver;
	}

	@When("^User login to application$")
	public void user_login_to_application() throws Throwable {
		
		LogInAction logInAction = new LogInAction();
		
		logInAction.loginAsOwner();

	}

	@When("^Click on Listen Home$")
	public void click_on_Listen_Home() throws Throwable {

		OpenModule openModule = new OpenModule();

		openModule.openListenHome();

	}

	@Then("^Listen Home Should be displayed$")
	public void listen_Home_Should_be_displayed() throws Throwable {
		
		UIListenHome uiListenHome = new UIListenHome(driver);
		
		Assert.assertTrue(uiListenHome.listenTitle.getText().equalsIgnoreCase("Listen"));

	}


}
