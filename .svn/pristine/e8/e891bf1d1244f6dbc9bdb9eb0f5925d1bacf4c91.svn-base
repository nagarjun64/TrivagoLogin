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
import pageobjects.reports.UIActivityReport;
import pageobjects.reports.UISentimentReport;

public class SDSentimentReport {

	final Logger log = Logger.getLogger(this.getClass().getName());

	WebDriver driver;

	public SDSentimentReport()
	{
		driver = Hooks.driver;
	}

	@Given("^User Navigates to Sentiment Report$")
	public void user_Navigates_to_Sentiment_Report() throws Throwable {

		LogInAction login = new LogInAction();
		OpenModule open = new OpenModule();

		login.loginAsOwner();
		open.openSentimentReport();
	}

	@Then("^Sentiment Report Should load$")
	public void sentiment_Report_Should_load() throws Throwable {

		UISentimentReport report = new UISentimentReport(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitForElementToBeClickable(report.sentimentReportTitle, 20);

		Assert.assertTrue(report.sentimentReportTitle.isDisplayed());

		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Sentiment Reports"));	
	}

	@When("^User applies filters in Sentiment report$")
	public void user_applies_filters_in_Sentiment_report() throws Throwable {

		ReportsAction reportsAction = new ReportsAction();

		reportsAction.applyRandomFiltersInSentimentReport();
	}

	@Then("^Sentiment Report Should load as per the filters$")
	public void sentiment_Report_Should_load_as_per_the_filters() throws Throwable {

		UISentimentReport report= new UISentimentReport(driver);

		Assert.assertTrue(report.sentimentReportTitle.isDisplayed());
		Assert.assertTrue(report.downloadReport.isDisplayed());
		Assert.assertTrue(report.msgTitle.isDisplayed());
	}

}
