package pageobjects.Listen;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIListenProfileMenu {

	public UIListenProfileMenu (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	/**
	 * Once user naivgates inside Profile, elements present in the menu are listed below.
	 */


	//=========================================Profile Dashboard==========================================================//

	//Dashboard Main Link
	@FindBy(xpath = "//*[@id='listen_dashboard']//span[@class='title' and contains(.,'Dashboard')]")
	public WebElement dashboard;

	//Summary Dashboard Link
	@FindBy(xpath = "//*[@id='listen_dashboard']//*[@id='listen_dashboard_summary']")
	public WebElement summaryDash;

	//Live Dashboard Link
	@FindBy(xpath = "//*[@id='listen_dashboard']//*[@id='listen_dashboard_live']")
	public WebElement liveDash;

	//=========================================Profile Messages==========================================================//

	//Messages Main Link
	@FindBy(xpath = "//*[@id='listen_messages']//span[@class='title' and contains(.,'Messages')]")
	public WebElement messages;

	//Messages live Stream
	@FindBy(xpath = "//*[@id='listen_messages']//*[@id='listen_messages_stream']")
	public WebElement streamMsg;

	//Inbox Messages in profile
	@FindBy(xpath = "//*[@id='listen_messages']//*[@id='listen_messages_admin']")
	public WebElement inboxMsg;

	//Pending Messages
	@FindBy(xpath = "//*[@id='listen_messages']//*[@id='listen_messages_pending']")
	public WebElement pendingMsg;

	//Sent Messages
	@FindBy(xpath = "//*[@id='listen_messages']//*[@id='listen_messages_sent']")
	public WebElement sentMsg;

	//Workbasket Drop Down
	@FindBy(xpath = "//*[@id='listen_messages_basket']//span[@class='title' and contains(.,'Workbasket')]")
	public WebElement workbasketMsg;

	//Saved Filters
	@FindBy(xpath = "//*[@id='listen_messages_filter']//span[@class='title' and contains(.,'Filter')]")
	public WebElement savedFilterMsg;

	//=========================================Influencers==========================================================//

	//Influencer Main Menu Link
	@FindBy(xpath = "//*[@id='listen_influencer']//span[@class='title' and contains(.,'Influencer')]")
	public WebElement influencer;

	//Twitter Influencer Main Link
	@FindBy(xpath = "//*[@id='listen_influencer_twitter']//span[@class='title' and contains(.,'Twitter')]")
	public WebElement twtInfluencerDrpDwn;

	//Twitter Influencer sub link which is present under twitter
	@FindBy(xpath = "//*[@id='listen_influencer_twitter_top']")
	public WebElement twtInfluencer;

	//Twitter Influencer Main Link
	@FindBy(xpath = "//*[@id='listen_influencer_twitter_cont']")
	public WebElement twtContributor;

	//Facebook Contributor
	@FindBy(xpath = "//*[@id='listen_influencer_facebook']//span[@class='title' and contains(.,'Facebook Contributor')]")
	public WebElement fbContributor;

	//Instagram Contributor
	@FindBy(xpath = "//*[@id='listen_influencer_instagram']//span[@class='title' and contains(.,'Instagram Contributor')]")
	public WebElement igContributor;

	//=========================================Compare==========================================================//

	//Influencer Main Menu Link
	@FindBy(xpath = "//*[@id='listen_compare']//span[@class='title' and contains(.,'Compare')]")
	public WebElement compare;

	//=========================================Settings==========================================================//

	//Settings inside profile
	@FindBy(xpath = "//*[@id='listen_settings']//span[@class='title' and contains(.,'Settings')]")
	public WebElement settings;

	//Template Settings 
	@FindBy(xpath = "//*[@id='listen_settings_template']")
	public WebElement templateStngs;

	//Workflow Automation
	@FindBy(xpath = "//*[@id='workflowAuto']")
	public WebElement workflowAutomation;

	//Profile Order
	@FindBy(xpath = "//*[@id='orderSettings']")
	public WebElement profileOrder;

	//Workbasket
	@FindBy(xpath = "//*[@id='workbasket']")
	public WebElement workbasket;

	//Rules 
	@FindBy(xpath = "//*[@id='rules']")
	public WebElement rules;

	//Tags Creation
	@FindBy(xpath = "//*[@id='newtagging']")
	public WebElement tags;

	//Alerts Tab 
	@FindBy(xpath = "//*[@id='observer']")
	public WebElement alerts;

	//Complainer Alert
	@FindBy(xpath = "//*[@id='complain']")
	public WebElement complainerAlert;

	//Case  Details form creation tab
	@FindBy(xpath = "//*[@id='casedetails']")
	public WebElement caseDtlsForm;

	//Priority
	@FindBy(xpath = "//*[@id='priorityObserver']")
	public WebElement priority;

	//SLA creation
	@FindBy(xpath = "//*[@id='profilesla']")
	public WebElement sla;

	//Download Request
	@FindBy(xpath = "//*[@id='downloadRequest']")
	public WebElement downloadRqst;

	//FeedBack Settings
	@FindBy(xpath = "//*[@id='twtFeedback']")
	public WebElement feedbackSettings;

	//Twitter Influencer Main Link
	@FindBy(xpath = "//*[@id='complain']")
	public WebElement chatConfig;

}
