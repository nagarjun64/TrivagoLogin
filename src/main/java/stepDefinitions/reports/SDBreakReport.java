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
import helpers.SimplifyUtils;
import pageobjects.reports.UIBreakReport;
import pageobjects.reports.UISentimentReport;

public class SDBreakReport {

	final Logger log = Logger.getLogger(this.getClass().getName());

	WebDriver driver;

	public SDBreakReport()
	{
		driver = Hooks.driver;
	}

	@Given("^User Navigates to Break Report$")
	public void user_Navigates_to_Break_Report() throws Throwable {

		LogInAction login = new LogInAction();
		OpenModule open = new OpenModule();

		login.loginAsOwner();
		open.openBreakReport();

	}

	@Then("^Break Report Should load$")
	public void break_Report_Should_load() throws Throwable {

		UIBreakReport report = new UIBreakReport(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitForElementToBeClickable(report.breakReportTitle, 20);

		Assert.assertTrue(report.breakReportTitle.isDisplayed());

		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Breaktime Report"));	

	}

	@When("^User applies filters in Break report$")
	public void user_applies_filters_in_Break_report() throws Throwable {

		ReportsAction reportsAction = new ReportsAction();

		reportsAction.applyRandomFiltersInBreakReport();
	}

	@Then("^Break Report Should load as per the filters$")
	public void break_Report_Should_load_as_per_the_filters() throws Throwable {

		UIBreakReport report = new UIBreakReport(driver);

		Assert.assertTrue(report.breakReportTitle.isDisplayed());
		Assert.assertTrue(report.downloadReport.isDisplayed());
		Assert.assertTrue(report.msgTitle.isDisplayed());
	}



}
