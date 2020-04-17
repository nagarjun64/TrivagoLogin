package pageobjects.ListenSettings;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIProfileChatConfig {

	public UIProfileChatConfig (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	/**
	 * Workflow automation creation UI elements in Listen --> profile --> Settings --> Chat Config
	 */

	//=========================================Chat Config Main Screen=====================================================//

	//Page Names present in the Chat config list
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='tabContent']//div[starts-with(@class,'comment')]//div[2]//span"))
	public List<WebElement> chatEnabledPages;

	//Chat Source like facebook page
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='tabContent']//td[2]"))
	public List<WebElement> chatSource;

	//Edit button for the facebook page where chat is enabled
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='tabContent']//a[contains(@onclick,'getMenuContent')]"))
	public List<WebElement> editChatSettings;

	//=========================================Chat Config Edit Screen=====================================================//

	//Chat Page Name 
	@FindBy(xpath = "//input[@id='chatName']")
	public WebElement scheduleDownload;

	//Resend message Every time as per the selected duration
	@FindBy(xpath = "//*[@id='maxWaitTime']")
	public WebElement resendWelcomeMsgEvery;

	//Message to be sent as acknowledgment/welcome
	@FindBy(xpath = "//*[@id='welcomeText']")
	public WebElement welcomeText;

	//Online QUick Reply Tags
	@FindBy(xpath = "//*[@id='welcomeQuickReplies']")
	public WebElement welcomeQuickReplies;

	//offline Welcome Text
	@FindBy(xpath = "//*[@id='offlineText']")
	public WebElement offlineWelcomeText;

	//Offline quick reply types
	@FindBy(xpath = "//*[@id='offlineQuickReplies']")
	public WebElement offlineQuickReplies;

	//Save Chat config settings
	@FindBy(xpath = "//*[contains(@onclick,'saveChatConfiguration')]")
	public WebElement saveChatConfig;

	//Cancel button and click on the 
	@FindBy(xpath = "//*[contains(@onclick,'getMenuContent') and contains(text(),'Cancel')]")
	public WebElement cancelChatConfig;



}
