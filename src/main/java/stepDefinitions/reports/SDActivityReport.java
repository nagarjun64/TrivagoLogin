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
import pageobjects.reports.UIActivityReport;
import pageobjects.reports.UITaggingReport;

public class SDActivityReport {

	final Logger log = Logger.getLogger(this.getClass().getName());

	WebDriver driver;

	public SDActivityReport()
	{
		driver = Hooks.driver;
	}


	@Given("^User Navigates to Activity Report$")
	public void user_Navigates_to_Activity_Report() throws Throwable {
		
		LogInAction login = new LogInAction();
		OpenModule open = new OpenModule();

		login.loginAsOwner();
		open.openActivityReport();
	}

	@Then("^Activity Report Should load$")
	public void activity_Report_Should_load() throws Throwable {

		UIActivityReport report = new UIActivityReport(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitForElementToBeClickable(report.activityReportTitle, 20);

		Assert.assertTrue(report.activityReportTitle.isDisplayed());

		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Activity Reports"));	
	}

	@When("^User applies filters in Activity report$")
	public void user_applies_filters_in_Activity_report() throws Throwable {
		
		ReportsAction reportsAction = new ReportsAction();

		reportsAction.applyRandomFiltersInActivityReport();
	}

	@Then("^Activity Report Should load as per the filters$")
	public void activity_Report_Should_load_as_per_the_filters() throws Throwable {
		
		UIActivityReport report = new UIActivityReport(driver);

		Assert.assertTrue(report.activityReportTitle.isDisplayed());
		Assert.assertTrue(report.downloadReport.isDisplayed());
		Assert.assertTrue(report.msgTitle.isDisplayed());
	}

}
