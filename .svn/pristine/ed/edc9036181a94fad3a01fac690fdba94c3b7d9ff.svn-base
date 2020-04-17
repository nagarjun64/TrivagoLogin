package pageobjects.ListenSettings;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIProfileFeedbackSettings {

	public UIProfileFeedbackSettings (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	/**
	 * Workflow automation creation UI elements in Listen --> profile --> Settings --> Feedback Settings
	 */

	//=========================================Feedback Settings Main Screen=====PROFILE CSAT/NPS====================================================//

	//Profile CSAT Survey Name 
	@FindBy(xpath = "//*[@id='surveyTable']//td[1]")
	public WebElement createdProfileSurveyName;

	//Profile Survey Validity URL
	@FindBy(xpath = "//*[@id='surveyTable']//td[4]")
	public WebElement createdProfileSurveyURLValidity;

	//Profile CSAT Resent Duration 
	@FindBy(xpath = "//*[@id='surveyTable']//td[5]")
	public WebElement createdProfileSurveyReSend;

	//Edit Profile Survey
	@FindBy(xpath = "//*[@id='surveyTable']//*[contains(@onclick,'addEditSurveys')]")
	public WebElement editProfileSurvey;

	//Delete Profile Survey
	@FindBy(xpath = "//*[@id='surveyTable']//*[contains(@onclick,'delSurvey')]")
	public WebElement deleteProfileSurvey;

	//Navigate to Questions Page
	@FindBy(xpath = "//*[@id='surveyTable']//*[contains(@onclick,'addQuestionsPage')]")
	public WebElement viewSurveyQuestions;

	//View Profile Survey Responses
	@FindBy(xpath = "//*[@id='surveyTable']//*[contains(@onclick,'viewResponsesList')]")
	public WebElement viewProfileSurveyResponses;

	//=========================================Feedback Settings Main Screen=====TWITTER FEEDBACK====================================================//

	//Twitter Survey Type
	@FindBy(xpath = "//*[@id='twtFeedSettings']//td[1]")
	public WebElement createdTwtSurveyType;

	//Twitter Survey Display Name
	@FindBy(xpath = "//*[@id='twtFeedSettings']//td[2]")
	public WebElement twtSurveyDisplayName;

	//View Twitter Survey Responses
	@FindBy(xpath = "//*[@id='twtFeedSettings']//*[contains(@href,'showResponseFeedbackMain')]")
	public WebElement viewTwtSurveyResponses;

	//Edit Twitter Survey
	@FindBy(xpath = "//*[@id='twtFeedSettings']//*[contains(@href,'addFeedback')]")
	public WebElement editTwtSurvey;

	//Twitter Survey Display Name
	@FindBy(xpath = "//*[@id='twtFeedSettings']//*[contains(@href,'removeSettings')]")
	public WebElement deleteTwtSurvey;

	//Download Request Name
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='viewRequestDownloadTable']//td[1]"))
	public List<WebElement> createdDownloadName;

	//=========================================Feedback Settings=====PROFILE CSAT/NPS===CRUD=================================================//

	//Profile CSAT Survey Name to be created
	@FindBy(xpath = "//*[@id='surveyName']")
	public WebElement profileSurveyName;

	//Profile Survey Type
	@FindBy(xpath = "//*[@id='csat']")
	public WebElement profileSurveyType;

	//Profile Survey Validity URL
	@FindBy(xpath = "//*[@id='validityDays']")
	public WebElement profileSurveyURLValidity;

	//Profile CSAT ReSend Duration 
	@FindBy(xpath = "//*[@id='days']")
	public WebElement profileSurveyReSend;

	//Survey Response after survey submitted by the user
	@FindBy(xpath = "//*[@id='surveyResponseText']")
	public WebElement surveyResponseMsg;

	//Profile Survey Description
	@FindBy(xpath = "//*[@id='surveyDesc']")
	public WebElement profileSurveyDesc;

	//Profile Survey URL to be sent  out {name} and {link} are the variables which will be replaced when sent out
	@FindBy(xpath = "//*[@id='surveyCsatText']")
	public WebElement profileSurveyURL;

	//Profile Survey Disclaimer
	@FindBy(xpath = "//*[@id='surveyDisclaimer']")
	public WebElement profileSurveyDisclaimer;

	//Profile Survey Next button
	@FindBy(xpath = "//*[contains(@onclick,'saveOrUpdateSurvey')]")
	public WebElement nextProfileSurvey;

	//Profile Survey Cancel button in First Screen and in View Responses
	@FindBy(xpath = "//*[contains(@onclick,'cancelSurvey')]")
	public WebElement cancelProfileSurvey;

	//Edit Question 1
	@FindBy(xpath = "//*[@id='questionNumber1']//*[contains(@onclick,'editQuestion')]")
	public WebElement editQ1;

	//Question 1 Text
	@FindBy(xpath = "//*[@id='questionNumber1']//span[contains(@id,'quesText')]")
	public WebElement textQ1;

	//Edit Question 2
	@FindBy(xpath = "//*[@id='questionNumber2']//*[contains(@onclick,'editQuestion')]")
	public WebElement editQ2;

	//Question 2 Text
	@FindBy(xpath = "//*[@id='questionNumber2']//span[contains(@id,'quesText')]")
	public WebElement textQ2;

	//Delete Question 2
	@FindBy(xpath = "//*[@id='questionNumber2']//*[contains(@onclick,'delQuestion')]")
	public WebElement deleteQ2;

	//Profile Survey Cancel button in second Screen
	@FindBy(xpath = "//*[contains(@onclick,'refreshGrid')]")
	public WebElement cancelProfileSurveyQuestions;

	//=========================================Feedback Settings=====TWITTER FEEDBACK===CRUD=================================================//

	//Twitter Survey Type
	@FindBy(xpath = "//*[@id='feedbackType']")
	public WebElement twtSurveyType;

	//NPS questions in Twitter Survey
	@FindBy(xpath = "//*[@id='npsQuestions']")
	public WebElement npsQuestions;

	//CSAT questions in Twitter Survey
	@FindBy(xpath = "//*[@id='csatQuestions']")
	public WebElement csatQuestions;

	//Twitter Survey Display Name
	@FindBy(xpath = "//*[@id='displayName']")
	public WebElement twtDisplayName;

	//Twitter survey privacy URL 
	@FindBy(xpath = "//*[@id='privacyUrl']")
	public WebElement privacyURL;

	//Twitter Survey message
	@FindBy(xpath = "//*[@id='messageDm']")
	public WebElement twtSurveyMsg;

	//Twitter Survey Save button
	@FindBy(xpath = "//*[contains(@onclick,'saveSettings')]")
	public WebElement saveTwtSurvey;

	//Twitter Survey Cancel button 
	@FindBy(xpath = "//*[contains(@onclick,'cancelFeedabck')]")
	public WebElement cancelTwtSurvey;

	//=======================================================View Profile Survey Responses=======================================================//

	//cancelProfileSurvey this element can be used for "CANCEL" button


	//====================================================View TWITTER FEEDBACK Survey Responses=================================================//

	//Twitter Survey - Go button to apply the date range
	@FindBy(xpath = "//*[contains(@onclick,'goBackFeedback')]")
	public WebElement twtSurveyGo;
	
	//Twitter Survey - Back to Settings
	@FindBy(xpath = "//*[contains(@onclick,'showUserResponseFeedback')]")
	public WebElement twtSurveyBackToSettings;


}
