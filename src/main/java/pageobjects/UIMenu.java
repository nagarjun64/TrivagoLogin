package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIMenu {
	public UIMenu (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	//acknowledgment messages that appear after profile update, message send successfully etc
	@FindAll(@FindBy(how = How.XPATH, using = "//div[starts-with(@class,'messenger-message')]//button[starts-with(@data-dismiss,'alert')]"))
	public List<WebElement> acknowledmentMessage;

	//============================================Home============================================//

	//Home
	@FindBy(xpath = "//span[contains(text(),'Home')]")
	public WebElement homePage;

	//============================================Unibox+============================================//

	//Unibox+
	@FindBy(xpath = "//span[contains(text(),'Unibox')]")
	public WebElement analyze;


	//============================================Stacking View============================================//

	//Publish
	@FindBy(linkText = "Publish")
	//	@FindBy(xpath = "//a//*[@data-original-title='Publish']")
	public WebElement publish;


	//BroadCast 
	@FindBy(linkText = "Broadcast")
	public WebElement broadCast ;

	//publish Dashboard
	@FindBy(linkText = "Dashboard")
	public WebElement publishDashboard ;

	//BroadCast 
	@FindBy(linkText = "Media Library")
	public WebElement mediaLibrary ;

	//============================================Insights============================================//

	//Insights Main Menu
	@FindBy(linkText = "Insights")
	public WebElement insights;

	//Twitter Insights Link in the menu
	@FindBy(xpath = "//*[@id='analytics_twitter']/a")
	public WebElement TwtInisghtsMenu;

	//Facebook Insights Link in the menu
	@FindBy(xpath = "//*[@id='analytics_facebook']/a")
	public WebElement fbPageInisghtsMenu;

	//============================================Reports============================================//

	//Reports Main Menu
	@FindBy(linkText = "//span[contains(text(),'Reports')]")
	public WebElement reports;

	//Activity Report in Menu
	@FindBy(xpath = "//span[contains(text(),'Reports')]/../..//a[text() = 'Activity']")
	public WebElement activityReport;

	//Agent Report in Menu
	@FindBy(xpath = "//span[contains(text(),'Reports')]/../..//a[text() = 'Agent']")
	public WebElement agentReport;

	//Break Report in Menu
	@FindBy(xpath = "//span[contains(text(),'Reports')]/../..//a[contains(text(),'Break')]")
	public WebElement breakReport;

	//Case SLA Report in Menu
	@FindBy(xpath = "//span[contains(text(),'Reports')]/../..//a[contains(text(),'Case SLA')]")
	public WebElement caseSLAReport;



	//Brand Performance Report
	@FindBy(linkText = "Brand Performance Report")
	public WebElement brandPerformanceReport;

	//Replies Report in Menu
	@FindBy(xpath = "//*[@id='report_reply']//a")
	public WebElement repliesReport;

	//Login Report in Menu
	@FindBy(xpath = "//*[@id='report_login']//a")
	public WebElement loginReport;


	//Tagging Report in Menu
	@FindBy(xpath = "//*[@id='report_tag']//a")
	public WebElement taggingReport;

	//Facebook Insights Link in the menu
	@FindBy(xpath = "//*[@id='report_sentiment']//a")
	public WebElement sentimentReport;

	//Social Activity Report in the menu
	@FindBy(xpath = "//*[@id='report_social']//a")
	public WebElement socialActReport;

	//============================================Settings============================================//

	//Settings
	@FindBy(xpath = "//span[contains(text(),'Settings')]")
	public WebElement settings;

	//Bulk Operations
	@FindBy(xpath = "//a[contains(text(),'Bulk Operations')]")
	public WebElement bulkOperations;

	//Manage Competitor Channels
	@FindBy(linkText = "Manage Competitor Channels")
	public WebElement manageCompChannels;

	//Manage IP Address
	@FindBy(linkText = "Manage IP Address")
	public WebElement manageIPAddress;

	//Manage Sites
	@FindBy(linkText = "Manage Site")
	public WebElement manageSite;

	//Manage Publish
	@FindBy(linkText = "Publish Settings")
	public WebElement publishSettings;

	//Manage Packaging
	@FindBy(linkText = "Packaging")
	public WebElement packaging;

	//Manage Contacts
	@FindBy(linkText = "Manage Contacts")
	public WebElement manageContacts;

	//Manage Users
	@FindBy(xpath = "//a[contains(text(),'Users')]")
	public WebElement users;

	//Manage Roles And Permissions
	@FindBy(linkText = "Manage Roles/Permissions")
	public WebElement rolesPermissions;

	//Manage teams
	@FindBy(linkText = "Manage Teams")
	public WebElement manageTeams;

	//News Blog Push
	@FindBy(linkText = "News/Blog Push")
	public WebElement newsBlogPush;

	//Manage FAQ
	@FindBy(xpath = "//*[@id='admin_faq']//a")
	public WebElement manageFAQ;

	//Integration
	@FindBy(linkText = "Integration")
	public WebElement integration;

	//Link for Email Settings
	@FindBy(xpath = "//a[@href='/admin/EmailSettings']")
	public WebElement emailSettings;

	//============================================Generic=================================================//

	//delete confirm
	@FindBy(xpath = "//*[@id='jqi_state0_buttonContinue' or @id= 'jqi_state0_buttonYes' or @id= 'jqi_state0_buttonOk']")
	public WebElement deleteConfirm;

	//Cancel Delete  
	@FindBy(xpath = "//*[@id='jqi_state0_buttonCancel']")
	public WebElement deleteCancel;

	//============================================Date options============================================//

	//Date Range in the filter
	@FindBy(xpath = "//input[@id='dateRange']")
	public WebElement dateRange;

	//Date Range in the filter - Today Option
	@FindBy(xpath = "//div[@class='ranges']//li[text()[contains(.,'Today')]]")
	public WebElement dateToday;

	//Date Range in the filter - Yesterday Option
	@FindBy(xpath = "//div[@class='ranges']//li[text()[contains(.,'Yesterday')]]")
	public WebElement dateYesterday;

	//Date Range in the filter - Last 7 Days
	@FindBy(xpath = "//div[@class='ranges']//li[text()[contains(.,'Last 7')]]")
	public WebElement dateLast7;

	//Date Range in the filter - Last 30 Days
	@FindBy(xpath = "//div[@class='ranges']//li[text()[contains(.,'Last 30')]]")
	public WebElement dateLast30;

	//Date Range in the filter - This Month
	@FindBy(xpath = "//div[@class='ranges']//li[text()[contains(.,'This Month')]]")
	public WebElement dateThisMonth;

	//Date Range in the filter - Last Month
	@FindBy(xpath = "//div[@class='ranges']//li[text()[contains(.,'Last Month')]]")
	public WebElement dateLastMonth;

	//Date Range in the filter - Custom Range
	@FindBy(xpath = "//div[@class='ranges']//li[text()[contains(.,'Custom Range')]]")
	public WebElement dateCustomRange;

	//Apply the selected Date Range
	@FindBy(xpath = "//div[@class='range_inputs']//*[text()[contains(.,'Apply')]]")
	public WebElement applyDate;

	//Cancel the opened date filter
	@FindBy(xpath = "//div[@class='range_inputs']//*[text()[contains(.,'Cancel')]]")
	public WebElement cancelDate;


	//=========================================Filters===================================================//

	//Filter button when filter slider is opened from the right side
	//	@FindBy(xpath = "//button[@id='filterButton' and text()[contains(.,'Filter')]]")
	//	@FindBy(xpath = "//button[@id='filterButton' and @onclick[contains(.,'getFilteredMedia')]]")
	//	@FindBy(css="button#filterButton.submit.btn.btn-primary.btn-mini.filter-focus")
	@FindBy(xpath ="//*[@id='main-chat-wrapper']//button[@id='filterButton' and text()[contains(.,'Filter')]]")
	public WebElement applyFilterBtn;

	//Reset button when filter slider is opened from the right side
	@FindBy(xpath = "//button[@id='filterButton' and text()[contains(.,'Reset')]]")
	public WebElement resetBtn;

	//Close button when filter slider is opened from the right side
	@FindBy(xpath = "//button[@id='closeButton']")
	public WebElement closeFilterBtn;


}