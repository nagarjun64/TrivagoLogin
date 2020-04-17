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
import pageobjects.reports.UILoginReport;
import pageobjects.reports.UITaggingReport;

public class SDTaggingReport {
	
	final Logger log = Logger.getLogger(this.getClass().getName());

	WebDriver driver;

	public SDTaggingReport()
	{
		driver = Hooks.driver;
	}
	
	
	@Given("^User Navigates to Tagging Report$")
	public void user_Navigates_to_Tagging_Report() throws Throwable {
		
		LogInAction login = new LogInAction();
		OpenModule open = new OpenModule();

		login.loginAsOwner();
		open.openTaggingReport();
	}

	@Then("^Tagging Report Should load$")
	public void tagging_Report_Should_load() throws Throwable {
		
		UITaggingReport report = new UITaggingReport(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitForElementToBeClickable(report.taggingReportTitle, 20);

		Assert.assertTrue(report.taggingReportTitle.isDisplayed());

		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Message Tagging Report"));	
	}

	@When("^User applies filters in Tagging report$")
	public void user_applies_filters_in_Tagging_report() throws Throwable {
		
		ReportsAction reportsAction = new ReportsAction();

		reportsAction.applyRandomFiltersInTaggingReport();;
	}

	@Then("^Tagging Report Should load as per the filters$")
	public void tagging_Report_Should_load_as_per_the_filters() throws Throwable {
		
		UITaggingReport report = new UITaggingReport(driver); 

		Assert.assertTrue(report.taggingReportTitle.isDisplayed());
		Assert.assertTrue(report.downloadReport.isDisplayed());
		Assert.assertTrue(report.msgTitle.isDisplayed());
	}


}
