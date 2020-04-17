package stepDefinitions.reports;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import actions.LogInAction;
import actions.OpenModule;
import actions.reports.ReportsAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import helpers.Hooks;
import helpers.Log;
import helpers.SimplifyUtils;
import pageobjects.reports.UIRepliesReport;

public class SDRepliesReport {

	final Logger log = Logger.getLogger(this.getClass().getName());

	WebDriver driver;

	public SDRepliesReport()
	{
		driver = Hooks.driver;
	}

	@Given("^User Navigates to Replies Report$")
	public void user_Navigates_to_Replies_Report() throws Throwable {

		LogInAction login = new LogInAction();
		OpenModule open = new OpenModule();

		login.loginAsOwner();

		open.openRepliesReport();

	}

	@Then("^Replies Report Should load$")
	public void replies_Report_Should_load() throws Throwable {

		UIRepliesReport uiRepliesReport = new UIRepliesReport(driver);
		SimplifyUtils sUtils = new SimplifyUtils();

		sUtils.waitForElementToBeClickable(uiRepliesReport.repliesReportTitle, 20);

		Assert.assertTrue(uiRepliesReport.repliesReportTitle.isDisplayed());

		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Replies Report"));		
	}

	
	@When("^User applies filters in Replies report$")
	public void user_applies_filters_in_report() throws Throwable {

		ReportsAction reportsAction = new ReportsAction();
		
		reportsAction.applyRandomFiltersInRepliesReport();
	}

	@Then("^Replies Report Should load as per the filters$")
	public void replies_Report_Should_load_as_per_the_filters() throws Throwable {
		
		UIRepliesReport uiRepliesReport = new UIRepliesReport(driver);
		SimplifyUtils sUtils = new SimplifyUtils();
		
		Assert.assertTrue(uiRepliesReport.repliesReportTitle.isDisplayed());
		Assert.assertTrue(uiRepliesReport.downloadReport.isDisplayed());
		Assert.assertTrue(uiRepliesReport.msgTitle.isDisplayed());
	}
}
