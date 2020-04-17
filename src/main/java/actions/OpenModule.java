package actions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import helpers.Hooks;
import helpers.Log;
import helpers.SimplifyUtils;
import pageobjects.UIMenu;
import pageobjects.Analyze.UIPostAnalysis;
import pageobjects.admin.UIAdminChannels;
import pageobjects.admin.UIFAQ;
import pageobjects.admin.UIManageSignatures;
import pageobjects.admin.UIManageUsers;
import pageobjects.insights.UITwitterInsights;
import pageobjects.publish.UIMediaLibrary;
import pageobjects.reports.UIActivityReport;
import pageobjects.reports.UIBreakReport;
import pageobjects.reports.UILoginReport;
import pageobjects.reports.UIRepliesReport;
import pageobjects.reports.UISentimentReport;
import pageobjects.reports.UISocialActivityReport;
import pageobjects.reports.UITaggingReport;

public class OpenModule {

	WebDriver driver;

	public OpenModule(){

		driver = Hooks.driver;

	}

	//================================================== Listen ===========================================================//
	public void openListenHome(){

		UIMenu uiMenu = new UIMenu(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.pause(2000);

		sutils.waitTillElementFound(uiMenu.listen, 2);

		uiMenu.listen.click();

		sutils.pause(2000);

		sutils.waitTillElementFound(uiMenu.listenHome, 2);

		uiMenu.listenHome.click();

		sutils.pause(2000);

	}

	//================================================== Analyze ===========================================================//

	public void openPostAnalysis(){

		UIMenu uiMenu = new UIMenu(driver);
		UIPostAnalysis postAnalysis = new UIPostAnalysis(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitTillElementFound(uiMenu.analyze, 20);

		uiMenu.analyze.click();

		sutils.waitTillElementFound(uiMenu.postAnalysis, 20);

		sutils.pause(600);

		uiMenu.postAnalysis.click();

		sutils.waitForElementToBeClickable(postAnalysis.postAnalyticsTitle, 10);

		sutils.pause(4000);

	}

	//================================================== Publish ===========================================================//

	public void openScheduledMessage(){

		UIMenu uiMenu = new UIMenu(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();

		simplifyUtils.waitTillElementFound(uiMenu.listen, 20);

		uiMenu.publish.click();

		simplifyUtils.waitTillElementFound(uiMenu.broadCast, 20);

		uiMenu.broadCast.click();

	}

	public void openPublishDash(){

		UIMenu uiMenu = new UIMenu(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();

		simplifyUtils.waitTillElementFound(uiMenu.listen, 20);

		uiMenu.publish.click();

		simplifyUtils.waitTillElementFound(uiMenu.broadCast, 20);

		uiMenu.publishDashboard.click();

	}

	public void openMediaLib(){

		UIMenu uiMenu = new UIMenu(driver);
		UIMediaLibrary library = new UIMediaLibrary(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();

		simplifyUtils.waitForElementToBeClickable(uiMenu.publish, 10);
		simplifyUtils.pause(2000);
		
//		uiMenu.publish.click();
		driver.findElement(By.xpath("//a//*[@data-original-title='Publish']")).click();

		simplifyUtils.waitTillElementFound(uiMenu.mediaLibrary, 40);

		uiMenu.mediaLibrary.click();
		
		simplifyUtils.waitForElementToBeClickable(library.addNewMedia, 240);
		
		Log.info("Opened Media Library");

	}
	
	public void openComposeMsg() {
		
		UIMenu uiMenu = new UIMenu(driver);

		
	}

	//================================================== Insights ===========================================================//

	public void openTwtInsights(){

		UIMenu uiMenu = new UIMenu(driver);
		UITwitterInsights uiTwtInsights = new UITwitterInsights(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();

		simplifyUtils.waitTillElementFound(uiMenu.insights, 30);

		uiMenu.insights.click();

		simplifyUtils.waitTillElementFound(uiMenu.TwtInisghtsMenu, 30);

		uiMenu.TwtInisghtsMenu.click();

		simplifyUtils.waitForElementToBeClickable(uiTwtInsights.compareTwtAccts,20);
	}

	public void openFbPageInsights(){

		UIMenu uiMenu = new UIMenu(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();

		simplifyUtils.waitTillElementFound(uiMenu.insights, 20);

		uiMenu.insights.click();

		simplifyUtils.waitTillElementFound(uiMenu.fbPageInisghtsMenu, 20);

		uiMenu.fbPageInisghtsMenu.click();

		//			simplifyUtils.waitForElementToBeClickable(uiTwtInsights.compareTwtAccts,20);

	}

	//================================================== Reports ===========================================================//

	public void openRepliesReport(){

		UIMenu uiMenu = new UIMenu(driver);
		UIRepliesReport uiRepliesReport = new UIRepliesReport(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();

		simplifyUtils.waitTillElementFound(uiMenu.reports, 30);

		uiMenu.reports.click();

		simplifyUtils.waitTillElementFound(uiMenu.repliesReport, 30);

		uiMenu.repliesReport.click();

		simplifyUtils.waitForElementToBeClickable(uiRepliesReport.downloadReport,20);
	}

	public void openLoginReport(){

		UIMenu uiMenu = new UIMenu(driver);
		UILoginReport uiLoginReport = new UILoginReport(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();

		simplifyUtils.waitTillElementFound(uiMenu.reports, 30);

		uiMenu.reports.click();

		simplifyUtils.waitTillElementFound(uiMenu.loginReport, 30);

		uiMenu.loginReport.click();

		simplifyUtils.waitForElementToBeClickable(uiLoginReport.downloadReport,20);
	}

	public void openBreakReport(){

		UIMenu uiMenu = new UIMenu(driver);
		UIBreakReport uiBreakReport = new UIBreakReport(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();

		simplifyUtils.waitTillElementFound(uiMenu.reports, 30);

		uiMenu.reports.click();

		simplifyUtils.waitTillElementFound(uiMenu.breakReport, 30);

		uiMenu.breakReport.click();

		simplifyUtils.waitForElementToBeClickable(uiBreakReport.downloadReport,20);
	}

	public void openTaggingReport(){

		UIMenu uiMenu = new UIMenu(driver);
		UITaggingReport uiTaggingReport = new UITaggingReport(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();

		simplifyUtils.waitTillElementFound(uiMenu.reports, 30);

		uiMenu.reports.click();

		simplifyUtils.waitTillElementFound(uiMenu.taggingReport, 30);

		uiMenu.taggingReport.click();

		simplifyUtils.waitForElementToBeClickable(uiTaggingReport.downloadReport,20);
	}

	public void openActivityReport(){

		UIMenu uiMenu = new UIMenu(driver);
		UIActivityReport uiActivityReport = new UIActivityReport(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();

		simplifyUtils.waitTillElementFound(uiMenu.reports, 30);

		uiMenu.reports.click();

		simplifyUtils.waitTillElementFound(uiMenu.activityReport, 30);

		uiMenu.activityReport.click();

		simplifyUtils.waitForElementToBeClickable(uiActivityReport.downloadReport,20);
	}

	public void openSentimentReport(){

		UIMenu uiMenu = new UIMenu(driver);
		UISentimentReport uiSentimentReport = new UISentimentReport(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();

		simplifyUtils.waitTillElementFound(uiMenu.reports, 30);

		uiMenu.reports.click();

		simplifyUtils.waitTillElementFound(uiMenu.sentimentReport, 30);

		uiMenu.sentimentReport.click();

		simplifyUtils.waitForElementToBeClickable(uiSentimentReport.downloadReport,20);
	}

	public void openSocialActivityReport(){

		UIMenu uiMenu = new UIMenu(driver);
		UISocialActivityReport uiSocialActivityReport = new UISocialActivityReport(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();

		simplifyUtils.waitTillElementFound(uiMenu.reports, 30);

		uiMenu.reports.click();

		simplifyUtils.waitTillElementFound(uiMenu.socialActReport, 30);

		uiMenu.socialActReport.click();

		simplifyUtils.waitForElementToBeClickable(uiSocialActivityReport.downloadReport,20);
	}

	//=================================================== Admin Section ====================================================//

	public void openManageAdminChannels(){

		UIMenu uiMenu = new UIMenu(driver);

		SimplifyUtils simplifyUtils = new SimplifyUtils();

		//simplifyUtils.waitTillElementFound(uiMenu.listen, 60);
		simplifyUtils.pause(30);

		uiMenu.admin.click();

		uiMenu.manageAdminChannels.click();

	}

	public void openAdminTwitterChannels(){

		UIAdminChannels uiAdminChannels = new UIAdminChannels(driver);

		openManageAdminChannels(); 

		uiAdminChannels.twitterAdmin.click();

	}

	public void openAdminFacebookAccounts(){

		UIAdminChannels uiAdminChannels = new UIAdminChannels(driver);

		openManageAdminChannels(); 

		uiAdminChannels.facebookAccountAdmin.click();

	}

	public void openAdminFacebookPages(){

		UIAdminChannels uiAdminChannels = new UIAdminChannels(driver);

		openManageAdminChannels(); 

		uiAdminChannels.facebookPageAdmin.click();

	}

	public void openAdminFacebookGroups(){

		UIAdminChannels uiAdminChannels = new UIAdminChannels(driver);

		openManageAdminChannels(); 

		uiAdminChannels.facebookGroupAdmin.click();

	}

	public void openAdminLinkedinAccount(){

		UIAdminChannels uiAdminChannels = new UIAdminChannels(driver);

		openManageAdminChannels(); 

		uiAdminChannels.linkedinAccountAdmin.click();

	}

	public void openAdminLinkedinCompany(){

		UIAdminChannels uiAdminChannels = new UIAdminChannels(driver);

		openManageAdminChannels(); 

		uiAdminChannels.linkedinCompanyAdmin.click();

	}

	public void openAdminYouTube(){

		UIAdminChannels uiAdminChannels = new UIAdminChannels(driver);

		openManageAdminChannels(); 

		uiAdminChannels.youtubeChannelAdmin.click();

	}

	public void openAdminGooglePlusPages(){

		UIAdminChannels uiAdminChannels = new UIAdminChannels(driver);

		openManageAdminChannels(); 

		uiAdminChannels.googlePlusAdmin.click();

	}

	public void openAdminTumblrBlogs(){

		UIAdminChannels uiAdminChannels = new UIAdminChannels(driver);

		openManageAdminChannels(); 

		uiAdminChannels.tumblrBlogsAdmin.click();

	}

	public void openAdminInstagramChannels(){

		UIAdminChannels uiAdminChannels = new UIAdminChannels(driver);

		openManageAdminChannels(); 

		uiAdminChannels.instagramChannelAdmin.click();

	}

	public void openManageCompChannels(){

		UIMenu uiMenu = new UIMenu(driver);

		uiMenu.admin.click();

		uiMenu.manageCompChannels.click();

	}

	public void openManageIPAddress(){

		UIMenu uiMenu = new UIMenu(driver);

		uiMenu.admin.click();

		uiMenu.manageIPAddress.click();

	}

	public void openManageSite(){

		UIMenu uiMenu = new UIMenu(driver);

		uiMenu.admin.click();

		uiMenu.manageSite.click();

	}

	public void openManagePublish(){

		UIMenu uiMenu = new UIMenu(driver);

		uiMenu.admin.click();

		uiMenu.publishSettings.click();

	}

	public void openPackaging(){

		UIMenu uiMenu = new UIMenu(driver);

		uiMenu.admin.click();

		uiMenu.packaging.click();

	}

	public void openManageContacs(){

		UIMenu uiMenu = new UIMenu(driver);

		uiMenu.admin.click();

		uiMenu.manageContacts.click();

	}

	public void openManageUsers(){

		UIMenu uiMenu = new UIMenu(driver);
		UIManageUsers mgUser = new UIManageUsers(driver);
		SimplifyUtils utils = new SimplifyUtils();

		utils.waitForElementToBeClickable(uiMenu.admin, 5);

		uiMenu.admin.click();

		utils.pause(100);
		utils.scrolltoElementByLocator(uiMenu.manageUsers);

		uiMenu.manageUsers.click();

		utils.waitForElementToBeClickable(mgUser.createNewUser, 5);

	}

	public void openManageRolesPermission(){

		UIMenu uiMenu = new UIMenu(driver);

		uiMenu.admin.click();

		uiMenu.manageRolesPermissions.click();

	}

	public void openManageTeams(){

		UIMenu uiMenu = new UIMenu(driver);

		uiMenu.admin.click();

		uiMenu.manageTeams.click();

	}

	public void openIntegration(){

		UIMenu uiMenu = new UIMenu(driver);

		uiMenu.admin.click();

		uiMenu.integration.click();

	}

	public void openNewsBlogPush(){

		UIMenu uiMenu = new UIMenu(driver);

		uiMenu.admin.click();

		uiMenu.newsBlogPush.click();

	}

	public void openManageFAQ(){

		UIMenu uiMenu = new UIMenu(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();
		UIFAQ faq = new UIFAQ(driver);

		uiMenu.admin.click();
		simplifyUtils.pause(2000);

		simplifyUtils.scrollInToView(uiMenu.manageFAQ);

		uiMenu.manageFAQ.click();

		simplifyUtils.waitForElementToBeClickable(faq.AddFAQ, 10);

		simplifyUtils.pause(2000);

	}
	
	public void openEmailSettings(){

		UIMenu uiMenu = new UIMenu(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();
		UIManageSignatures manageSignatures = new UIManageSignatures(driver);

		uiMenu.admin.click();
		simplifyUtils.pause(2000);

		simplifyUtils.scrollInToView(uiMenu.emailSettings);

		uiMenu.emailSettings.click();

		simplifyUtils.waitForElementToBeClickable(manageSignatures.createNewSignature, 10);

		simplifyUtils.pause(2000);

	}

}
