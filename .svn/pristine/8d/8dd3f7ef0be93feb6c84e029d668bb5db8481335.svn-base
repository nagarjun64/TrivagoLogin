package pageobjects.ListenSettings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UIProfileSetitingPriority {

	public UIProfileSetitingPriority (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	/**
	 * Workflow automation creation UI elements in Listen --> profile --> Settings --> Priority
	 */

	//=========================================Complainer Alerts Main Screen=====================================================//

	//Twitter Follower Count  
	@FindBy(xpath = "//*[@id='twt_w1']")
	public WebElement twtFollowerCnt;

	//Twitter Following Count  
	@FindBy(xpath = "//*[@id='twt_w2']")
	public WebElement twtFollowingCnt;

	//Twitter List Count  
	@FindBy(xpath = "//*[@id='twt_w3']")
	public WebElement twtListedCnt;

	//Facebook Likes Count  
	@FindBy(xpath = "//*[@id='fb_w1']")
	public WebElement fbLikesCnt;

	//Facebook comments Count  
	@FindBy(xpath = "//*[@id='fb_w2']")
	public WebElement fbCommentsCnt;

	//Alexa Count
	@FindBy(xpath = "//*[@id='blog_w1']")
	public WebElement alexaScore;

	//Google Score  
	@FindBy(xpath = "//*[@id='blog_w2']")
	public WebElement googleScore;

	//Severity  
	@FindBy(xpath = "//*[@id='priority_w1']")
	public WebElement severityCnt;

	//Influence Score  
	@FindBy(xpath = "//*[@id='priority_w2']")
	public WebElement influencerCnt;

	//Post Type Score  
	@FindBy(xpath = "//*[@id='priority_w3']")
	public WebElement postTypeCnt;

	//Save Priority Settings  
	@FindBy(xpath = "//*[contains(@onclick,'saveOrUpdatePriority')]")
	public WebElement savePriority;

}
