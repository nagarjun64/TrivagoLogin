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
import pageobjects.reports.UIRepliesReport;

public class SDLoginReport {

	final Logger log = Logger.getLogger(this.getClass().getName());

	WebDriver driver;

	public SDLoginReport()
	{
		driver = Hooks.driver;
	}

	@Given("^User Navigates to Login Report$")
	public void user_Navigates_to_Login_Report() throws Throwable {

		LogInAction login = new LogInAction();
		OpenModule open = new OpenModule();

		login.loginAsOwner();

		open.openLoginReport();
	}

	@Then("^Login Report Should load$")
	public void login_Report_Should_load() throws Throwable {

		UILoginReport loginReport = new UILoginReport(driver);
		SimplifyUtils sUtils = new SimplifyUtils();

		sUtils.waitForElementToBeClickable(loginReport.repliesReportTitle, 20);

		Assert.assertTrue(loginReport.repliesReportTitle.isDisplayed());

		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Login Report"));	
	}

	@When("^User applies filters in Login report$")
	public void user_applies_filters_in_Login_report() throws Throwable {

		ReportsAction reportsAction = new ReportsAction();

		reportsAction.applyRandomFiltersInLoginReport();
	}

	@Then("^Login Report Should load as per the filters$")
	public void login_Report_Should_load_as_per_the_filters() throws Throwable {

		UILoginReport loginReport = new UILoginReport(driver);
		SimplifyUtils sUtils = new SimplifyUtils();

		Assert.assertTrue(loginReport.repliesReportTitle.isDisplayed());
		Assert.assertTrue(loginReport.downloadReport.isDisplayed());
		Assert.assertTrue(loginReport.msgTitle.isDisplayed());
	}

}
