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
import pageobjects.reports.UISocialActivityReport;

public class SDSocialActivityReport {

	final Logger log = Logger.getLogger(this.getClass().getName());

	WebDriver driver;

	public SDSocialActivityReport()
	{
		driver = Hooks.driver;
	}



	@Given("^User Navigates to SocialActivity Report$")
	public void user_Navigates_to_SocialActivity_Report() throws Throwable {
		
		LogInAction login = new LogInAction();
		OpenModule open = new OpenModule();

		login.loginAsOwner();
		open.openSocialActivityReport();
	}

	@Then("^SocialActivity Report Should load$")
	public void socialactivity_Report_Should_load() throws Throwable {
		
		UISocialActivityReport report = new UISocialActivityReport(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitForElementToBeClickable(report.socialActivityReportTitle, 20);

		Assert.assertTrue(report.socialActivityReportTitle.isDisplayed());

		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Social Activity Reports"));	
		
	}

	@When("^User applies filters in SocialActivity report$")
	public void user_applies_filters_in_SocialActivity_report() throws Throwable {
		
		ReportsAction reportsAction = new ReportsAction();

		reportsAction.applyRandomFiltersInSocialActivityReport();
		
	}

	@Then("^SocialActivity Report Should load as per the filters$")
	public void socialactivity_Report_Should_load_as_per_the_filters() throws Throwable {

		UISocialActivityReport report = new UISocialActivityReport(driver);

		Assert.assertTrue(report.socialActivityReportTitle.isDisplayed());
		Assert.assertTrue(report.downloadReport.isDisplayed());
		Assert.assertTrue(report.msgTitle.isDisplayed());
	}


}
