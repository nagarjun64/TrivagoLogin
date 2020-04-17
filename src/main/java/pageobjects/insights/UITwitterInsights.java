package pageobjects.insights;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UITwitterInsights {

	public UITwitterInsights (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	//Twitter Insights Compare Button
	@FindBy(xpath = "//*[@id='twterDiv']//button[@onclick='getCompareContent();']")
	public WebElement compareTwtAccts;

	//List of added Admin Channel Twitter User Names
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='twterDiv']//form//td[2]//div[2]/a[2]/span"))
	public List<WebElement> adminTwtHandles;

	//Competitor Twitter Channels names
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='compTwitterAcct']//td[2]//a[2]/span"))
	public List<WebElement> compTwtHandles;


	//List of Daily Digest Mail options for admin Twitter Channels
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='twterDiv']//form//td[6]"))
	public List<WebElement> dailyDgstAdminMail;




	//================================================== Add Competitor Twitter Account ==================================================//

	//Add Competitor Account
	@FindBy(xpath = "//*[@id='cmpTwtAccntAdd']")
	public WebElement addCompTwt;

	//Input field for user to enter the twitter handle name
	@FindBy(xpath = "//*[@id='cmpTwtAccnt']")
	public WebElement enterTwtHandle;

	//Twitter handle search button for non-admin accounts
	@FindBy(xpath = "//input[@id='cmpTwtAccnt']")
	public WebElement twtHandleToSearch;

	//Search button for based on the twitter handle provided
	@FindBy(xpath = "//button[contains(.,'Search')]")
	public WebElement searchForTwtHandles;

	//Twitter CHannel names resulted from search
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='cmpUsrDtls']//span/a"))
	public List<WebElement> twtHandleSearchResults;

	//Add Twitter Channel from search results
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='cmpUsrDtls']//a/i"))
	public List<WebElement> addTwtHandleFromSearch;

	//Close the twitter search button
	@FindBy(xpath = "//*[@id='closemodle']")
	public WebElement closeTwtCompSearch;

	//Delete Competitor Twitter Channels
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='compTwitterAcct']//td[6]/button//i"))
	public List<WebElement> delteCompTwt;

	//confirm delete of comp channel
	@FindBy(xpath = "//*[@id='jqi_state0_buttonYes']")
	public WebElement confrmDelete;

	//cancel delete of comp channel
	@FindBy(xpath = "//*[@id='jqi_state0_buttonCancel']")
	public WebElement cancelDelete;

	//Close the non-admin channel confirmation popup
	@FindBy(xpath = "//div[@class='jqiclose ']")
	public WebElement closeConfirWndw;

	//================================================== Navigation in Twitter Insights Home Page ==================================================//
	//Total Pages for Competitor Twitter Accounts
	@FindBy(xpath = "//*[@id='compTwitterAcct']//*[@id='totalPages']")
	public WebElement compTotalPgs;

	//Current Page of Competitor Twitter Channel
	@FindBy(xpath = "//*[@id='compTwitterAcct']//*[@id='currentPageTwtComptPage']")
	public WebElement currentPgCompTwt;

	//Navigate to Next Page in Competitor Pages
	@FindBy(xpath = "//*[@id='compTwitterAcct']//li[@class='pagination-arrow ' and contains(@onclick, 'nextCompTwtAccts')]//i")
	public WebElement gotoNextPgComp;

	//Navigate to Previous Page in Competitor Pages
	@FindBy(xpath = "//*[@id='compTwitterAcct']//li[@class='pagination-arrow' and contains(@onclick, 'previousCompTwtAccts')]//i")
	public WebElement gotoPreviousPgComp;

	//Total Pages for Admin Twitter Accounts
	@FindBy(xpath = "//*[@id='twterDiv']//form//*[@id='totalPages']")
	public WebElement adminTotalPgs;

	//Navigate to Next Page in Admin Pages
	@FindBy(xpath = "//*[@id='twterDiv']//li[@class='pagination-arrow ' and contains(@onclick, 'nextTwitterPages')]//i")
	public WebElement gotoNextPgAdmin;

	//Navigate to Previous Page in Admin Pages
	@FindBy(xpath = "//*[@id='twterDiv']//li[@class='pagination-arrow' and contains(@onclick, 'previousTwitterPages')]//i")
	public WebElement gotoPreviousPgAdmin;

	//Current Page in Admin channels
	@FindBy(xpath = "//*[@id='twterDiv']//form//*[@id='currentPage']")
	public WebElement currentPgAdminTwt;

	//Message Notification Area
	@FindBy(xpath = "//div[@class='messenger-message-inner']")
	public WebElement notificationMsg;

	//================================================== Twitter Insights Menu inside ==================================================//

	//Account Statistics in Twitter Insights inside menu
	@FindBy(xpath = "//*[@id='accountStatsmenu']")
	public WebElement actStatsMenu;

	//Tweet Statistics in Twitter Insights inside menu
	@FindBy(xpath = "//*[@id='tweetStatsmenu']")
	public WebElement twtStatsMenu;

	//Tweet Analytics in Twitter Insights inside menu
	@FindBy(xpath = "//*[@id='tweetAnalyticmenu']")
	public WebElement twtAnalyticsMenu;

	//Compare in Twitter Insights inside menu
	@FindBy(xpath = "//*[@id='comparemenu']")
	public WebElement compareTwtMenu;


}
