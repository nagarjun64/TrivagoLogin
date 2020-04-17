package stepDefinitions.Analyze;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import actions.LogInAction;
import actions.OpenModule;
import actions.Analyze.PostAnalysisAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import helpers.Hooks;
import pageobjects.Analyze.UIPostAnalysis;

public class SDPostAnalysis {
	
	final Logger log = Logger.getLogger(this.getClass().getName());

	WebDriver driver;

	public SDPostAnalysis()
	{
		driver = Hooks.driver;
	}
	
	@Given("^User Navigates to Post Analysis$")
	public void user_Navigates_to_Post_Analysis() throws Throwable {

		LogInAction login = new LogInAction();
		OpenModule open = new OpenModule();

		login.loginAsOwner();
		open.openPostAnalysis();
		
		log.info("opened Post Analysis Dashboard");
	}

	@Given("^Applied random Filters$")
	public void applied_random_Filters() throws Throwable {

		PostAnalysisAction postAnalysisAction = new PostAnalysisAction();
		
		postAnalysisAction.applyRandomFilter();
		
	}

	@Then("^Post Analysis \\(Analyze\\) dashboard loads$")
	public void post_Analysis_Analyze_dashboard_loads() throws Throwable {

		PostAnalysisAction postAnalysisAction = new PostAnalysisAction();
		UIPostAnalysis analysis = new UIPostAnalysis(driver);
		
		Assert.assertTrue("Messages cannot be displayed", analysis.dsplyPosts.isDisplayed());
		
	}

}
