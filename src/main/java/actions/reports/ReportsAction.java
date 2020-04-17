package actions.reports;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import helpers.Hooks;
import helpers.Log;
import helpers.SimplifyUtils;
import pageobjects.reports.UIActivityReport;
import pageobjects.reports.UIBreakReport;
import pageobjects.reports.UILoginReport;
import pageobjects.reports.UIRepliesReport;
import pageobjects.reports.UISentimentReport;
import pageobjects.reports.UISocialActivityReport;
import pageobjects.reports.UITaggingReport;

public class ReportsAction {

	final Logger log = Logger.getLogger(this.getClass().getName());

	WebDriver driver;

	public ReportsAction()
	{
		driver = Hooks.driver;
	}

	public void	applyRandomFiltersInRepliesReport(){

		UIRepliesReport uiRepliesReport = new UIRepliesReport(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		
		sutils.pause(600);
		
		uiRepliesReport.filterAtTop.click();
		sutils.pause(300);
		
		uiRepliesReport.dateRange.click();
		sutils.pause(300);
		
		uiRepliesReport.dateMntToDate.click();
		sutils.pause(300);
		
		uiRepliesReport.dateRange.click();
		sutils.pause(300);
		
		uiRepliesReport.dateLast7.click();
		sutils.pause(300);
		
		uiRepliesReport.userListfirstUser.click();
		uiRepliesReport.userListSecondUser.click();
		sutils.pause(300);
		
		uiRepliesReport.srcListSecondSource.click();
		uiRepliesReport.srcListfirstSource.click();
		
		uiRepliesReport.applyFilterBtn.click();
		sutils.pause(2000);

	}
	
	public void	applyRandomFiltersInLoginReport(){

		UILoginReport uiLoginReport = new UILoginReport(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		
		sutils.pause(600);
		
		uiLoginReport.filterAtTop.click();
		sutils.pause(300);
		
		uiLoginReport.dateRange.click();
		sutils.pause(300);
		
		uiLoginReport.dateMntToDate.click();
		sutils.pause(300);
		
		uiLoginReport.dateRange.click();
		sutils.pause(300);
		
		uiLoginReport.dateLast7.click();
		sutils.pause(300);
		
		uiLoginReport.userListfirstUser.click();
		uiLoginReport.userListSecondUser.click();
		sutils.pause(300);
		
		uiLoginReport.applyFilterBtn.click();
		sutils.pause(2000);

	}
	
	public void	applyRandomFiltersInTaggingReport(){

		UITaggingReport uiTaggingReport = new UITaggingReport(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		
		sutils.pause(600);
		
		uiTaggingReport.filterAtTop.click();
		sutils.pause(300);
		
		uiTaggingReport.dateRange.click();
		sutils.pause(300);
		
		uiTaggingReport.dateMntToDate.click();
		sutils.pause(300);
		
		uiTaggingReport.dateRange.click();
		sutils.pause(300);
		
		uiTaggingReport.dateLast7.click();
		sutils.pause(300);
		
		uiTaggingReport.profileListFirstProfile.click();
		sutils.pause(300);
		
		uiTaggingReport.userListfirstUser.click();
		uiTaggingReport.userListSecondUser.click();
		sutils.pause(300);
		
		uiTaggingReport.applyFilterBtn.click();
		sutils.pause(2000);

	}
	
	public void	applyRandomFiltersInActivityReport(){

		UIActivityReport activityReport = new UIActivityReport(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		
		sutils.pause(600);
		
		activityReport.filterAtTop.click();
		sutils.pause(300);
		
		activityReport.dateRange.click();
		sutils.pause(300);
		
		activityReport.dateMntToDate.click();
		sutils.pause(300);
		
		activityReport.dateRange.click();
		sutils.pause(300);
		
		activityReport.dateLast7.click();
		sutils.pause(300);
		
		activityReport.profileListFirstProfile.click();
		sutils.pause(300);
		
		activityReport.userListfirstUser.click();
		activityReport.userListSecondUser.click();
		sutils.pause(300);
		
		activityReport.statusListFirstOptn.click();
		activityReport.statusListSecondOptn.click();
		sutils.pause(300);
		
		activityReport.applyFilterBtn.click();
		sutils.pause(2000);

	}
	
	public void	applyRandomFiltersInSentimentReport(){

		UISentimentReport sentimentReport = new UISentimentReport(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		
		sutils.pause(600);
		
		sentimentReport.filterAtTop.click();
		sutils.pause(300);
		
		sentimentReport.dateRange.click();
		sutils.pause(300);
		
		sentimentReport.dateMntToDate.click();
		sutils.pause(300);
		
		sentimentReport.dateRange.click();
		sutils.pause(300);
		
		sentimentReport.dateLast7.click();
		sutils.pause(300);
		
		sentimentReport.profileListFirstProfile.click();
		sutils.pause(300);
		
		sentimentReport.userListfirstUser.click();
		sentimentReport.userListSecondUser.click();
		sutils.pause(300);
		
		sentimentReport.applyFilterBtn.click();
		sutils.pause(2000);

	}

	public void	applyRandomFiltersInSocialActivityReport(){

		UISocialActivityReport socialActivityReport =  new UISocialActivityReport(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		
		sutils.pause(600);
		
		socialActivityReport.filterAtTop.click();
		sutils.pause(300);
		
		socialActivityReport.dateRange.click();
		sutils.pause(300);
		
		socialActivityReport.dateMntToDate.click();
		sutils.pause(300);
		
		socialActivityReport.dateRange.click();
		sutils.pause(300);
		
		socialActivityReport.dateLast7.click();
		sutils.pause(300);
		
		socialActivityReport.profileListFirstProfile.click();
		sutils.pause(300);
		
		socialActivityReport.userListfirstUser.click();
		socialActivityReport.userListSecondUser.click();
		sutils.pause(600);
		
		sutils.selectElementByValue(socialActivityReport.allStatus, "D");
		sutils.selectElementByValue(socialActivityReport.allStatus, "LK");
		
		socialActivityReport.applyFilterBtn.click();
		sutils.pause(2000);
		
	}
	
	public void	applyRandomFiltersInBreakReport(){

		UIBreakReport breakReport = new UIBreakReport(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		
		sutils.pause(600);
		
		breakReport.filterAtTop.click();
		sutils.pause(300);
		
		breakReport.dateRange.click();
		sutils.pause(300);
		
		breakReport.dateMntToDate.click();
		sutils.pause(300);
		
		breakReport.dateRange.click();
		sutils.pause(300);
		
		breakReport.dateLast7.click();
		sutils.pause(300);
		
		breakReport.userListfirstUser.click();
		sutils.pause(300);
		
		breakReport.applyFilterBtn.click();
		sutils.pause(2000);

	}
	
}
