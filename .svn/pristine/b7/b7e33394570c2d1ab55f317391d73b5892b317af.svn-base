package stepDefinitions.insights;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import actions.LogInAction;
import actions.OpenModule;
import actions.insights.TwtInsightAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import helpers.Hooks;

public class SDTwitterInsights {

	final Logger log = Logger.getLogger(this.getClass().getName());
	WebDriver driver;

	public SDTwitterInsights()
	{
		driver = Hooks.driver;
	}

	@Given("^User Navigates to Twitter Insights$")
	public void user_Navigates_to_Twitter_Insights() throws Throwable {

		LogInAction login = new LogInAction();
		OpenModule module = new OpenModule();

		try {
			login.loginAsOwner();
			module.openTwtInsights();
		} catch (Exception e) {
			log.error("Error in Login: ",e);
		}
	}

	@When("^User Add Competitive Account$")
	public void user_Add_Competitive_Account() throws Throwable {

		TwtInsightAction insightAction = new TwtInsightAction();

		insightAction.deleteCompChannel("Simplify360");

		Assert.assertTrue(insightAction.addCompTwt("Simplify360"));
	}

	@Then("^Competitor Account should be added Successfully$")
	public void competitor_Account_should_be_added_Successfully() throws Throwable {

		TwtInsightAction insightAction = new TwtInsightAction();


		Assert.assertTrue(insightAction.isNonAdminTwtAdded("Simplify360"));


	}


}
