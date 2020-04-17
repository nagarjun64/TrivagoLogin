package pageobjects.ListenSettings;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIProfileRules {

	public UIProfileRules (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	/**
	 * Workflow automation creation UI elements in Listen --> profile --> Settings --> Rules
	 */

	//=========================================Rules Main Screen=====================================================//

	//New Rule Create button 
	@FindBy(xpath = "//*[@id='tabContent']//button[starts-with(@onclick,'addEditRule')]")
	public WebElement createNewRule;

	//Edit Rule List
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='autoassigntable']//*[contains(@onclick,'addEditRule')]"))
	public List<WebElement> editRule;

	//Delete Rule List
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='autoassigntable']//*[contains(@onclick,'del')]"))
	public List<WebElement> deleteRule;

	//Rule Name while creating rule 
	@FindBy(xpath = "//*[@id='ruleName']")
	public WebElement ruleName;

	//Complete Query Drop Down which has the subqueries and added channels 
	@FindBy(xpath = "//*[@id='queryfltr']")
	public WebElement completeQueryFltr;

	//=========================================Rules  CRUD=====================================================//


	//Public Source Filter  
	@FindBy(xpath = "//*[@id='sourcefltr']")
	public WebElement publicSourceFltr;

	//Public Source Filter  
	@FindBy(xpath = "//*[@id='newAdvSourcefltr']")
	public WebElement allConversationFltr;

	//Continue Button in First Tab of rule creation
	@FindBy(xpath = "//*[@id='addEditRule']//*[contains(@onclick,'saveUpdateRule') and (@value='Continue')]")
	public WebElement saveRule;

	//Cance Button in First Tab of rule creation
	@FindBy(xpath = "//*[@id='addEditRule']//*[contains(@onclick,'viewRules') and (@value='Cancel')]")
	public WebElement cancelRuleCreation;

	//=======================Rules Main Screen CRUD============Standard Properties==========================================//

	//Select Property filter for standard properties
	@FindBy(xpath = "//*[@id='ruleType']//*[@id='stdProps']")
	public WebElement selectPropertyStandard;

	//Select Location
	@FindBy(xpath = "//*[@id='location']")
	public WebElement selectLocation;

	//Select Language
	@FindBy(xpath = "//*[@id='language']")
	public WebElement selectLanguage;

	//Sentiment Options
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='ruleSet']//*[@name='sentiment' and @type='radio']"))
	public List<WebElement> sentimentList;

	//Select Google Rank
	@FindBy(xpath = "//*[@id='googlerank']")
	public WebElement selectGoogleRank;

	//Select Alexa Rank
	@FindBy(xpath = "//*[@id='alexarank']")
	public WebElement selectAlexaRank;

	//Select Custom Site
	@FindBy(xpath = "//*[@id='ruleSet']//*[@name='customsiteid']")
	public WebElement selectCustomSite;

	//All words in rule creation
	@FindBy(xpath = "//*[@id='allwords']")
	public WebElement allWordsInRule;

	//Any words in rule creation
	@FindBy(xpath = "//*[@id='anywords']")
	public WebElement anyWordsInRule;

	//Not words in rule creation
	@FindBy(xpath = "//*[@id='notwords']")
	public WebElement notWordsInRule;

	//Priority of the messages to match the rule
	@FindBy(xpath = "//*[@id='priorityScore']")
	public WebElement priorityOfMsg;

	//=======================Rules Main Screen CRUD============Twitter Properties==========================================//

	//Select Property filter for Twitter properties like follower count, following count etc
	@FindBy(xpath = "//*[@id='ruleType']//*[@id='twtProps']")
	public WebElement selectPropertyTwitter;

	//Minimum Follower count
	@FindBy(xpath = "//*[@id='twtFollowerMin']")
	public WebElement minTwtFollowerCnt;

	//Maximum Follower Count
	@FindBy(xpath = "//*[@id='twtFollowerMax']")
	public WebElement maxTwtFollowerCnt;

	//Minimum Following Count
	@FindBy(xpath = "//*[@id='twtFollowingMin']")
	public WebElement minTwtFollowingCnt;

	//Maximum Twitter Following Count
	@FindBy(xpath = "//*[@id='twtFollowingMax']")
	public WebElement maxTwtFollowingCnt;

	//Minimum Twitter Listed count
	@FindBy(xpath = "//*[@id='twtListedMin']")
	public WebElement minTwtListedCnt;

	//Maximum twitter listed count
	@FindBy(xpath = "//*[@id='twtListedMax']")
	public WebElement maxTwtListedCnt;

	//Twitter retweet count greater than or equal to
	@FindBy(xpath = "//*[@id='twtRetweetCnt']")
	public WebElement twtReTweetCnt;

	//=======================Rules Main Screen CRUD============Facebook Properties==========================================//

	//Select Property filter for facebook properties like comments count, like coount etc
	@FindBy(xpath = "//*[@id='ruleType']//*[@id='fbProps']")
	public WebElement selectPropertyFacebook;

	//Facebook Comment count greater than or equal to
	@FindBy(xpath = "//*[@id='fbCommCnt']")
	public WebElement fbPgCommentCnt;

	//Facebook Likes count greater than or equal to
	@FindBy(xpath = "//*[@id='fbLikesCnt']")
	public WebElement fbPgLikesCnt;

	//Facebook Shares count greater than or equal to
	@FindBy(xpath = "//*[@id='fbShareCnt']")
	public WebElement fbPgShareCnt;

	//=======================Rules Main Screen CRUD============Other Properties==========================================//

	//Select Property filter for Other properties like blog url, twitter handles etc
	@FindBy(xpath = "//*[@id='ruleType']//*[@id='overallProps']")
	public WebElement selectPropertyOther;

	//Blogs posts from which domain should have come from
	@FindBy(xpath = "//*[@id='rule_blog_handle']")
	public WebElement blogsToMatch;

	//Tweet handles from which the tweet should come from
	@FindBy(xpath = "//*[@id='rule_twitter_handle']")
	public WebElement twtHandlesToMatch;


	//=========================================Second Tab in Rule Creation==========================================//

	//Auto Alert Create button 
	@FindBy(xpath = "//*[@id='addEditRule']//*[contains(@onclick,'autoAlert')]")
	public WebElement autoAlertCreate;

	//Auto Tagging Create Button
	@FindBy(xpath = "//*[@id='addEditRule']//*[contains(@onclick,'autoTagging')]")
	public WebElement autoTagCreate;

	//Auto Assign Create Button
	@FindBy(xpath = "//*[@id='addEditRule']//*[contains(@onclick,'autoAssign')]")
	public WebElement autoAssignCreate;

}
