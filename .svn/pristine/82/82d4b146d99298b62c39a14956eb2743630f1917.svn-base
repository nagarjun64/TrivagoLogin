package pageobjects.ListenSettings;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIProfileAlerts {

	public UIProfileAlerts (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	/**
	 * Workflow automation creation UI elements in Listen --> profile --> Settings --> Alerts
	 */

	//=========================================Alerts Main Screen=====================================================//

	//New Alert Create button 
	@FindBy(xpath = "//*[@id='autoassigntable']//button[starts-with(@onclick,'addEditProfileAlert')]")
	public WebElement createNewAlert;

	//Alert Names
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='autoassigntable']//td[1]"))
	public List<WebElement> existingAlerts;

	//Alert Rule
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='autoassigntable']//td[2]"))
	public List<WebElement> alertRule;

	//Alert Frequency
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='autoassigntable']//td[3]"))
	public List<WebElement> alertFrequency;

	//Alert Minimum Count
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='autoassigntable']//td[4]"))
	public List<WebElement> alertMinCount;

	//Edit Alert List
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='autoassigntable']//a[starts-with(@onclick,'addEditProfileAlert')]"))
	public List<WebElement> editAlert;

	//Delete Alert List
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='autoassigntable']//a[starts-with(@onclick,'delAlert')]"))
	public List<WebElement> deleteAlert;

	//Pause Alert button for the alerts
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='autoassigntable']//a[contains(@onclick,'modifyAlert')]"))
	public List<WebElement> pauseAlert;


	//=========================================Alerts CRUD=====First Tab(Add Alert Details)===============================//

	//Alert Name 
	@FindBy(xpath = "//*[@id='alertName']")
	public WebElement alertName;

	//Alert Description 
	@FindBy(xpath = "//*[@id='alertDesc']")
	public WebElement alertDescription;

	//Alert Frequency to be set while creating alert 
	@FindBy(xpath = "//*[@id='frequency']")
	public WebElement alertFrequencyToSet;

	//Send alert drop down
	@FindBy(xpath = "//*[@id='minCountSel']")
	public WebElement sendAlertWhen;

	//Minimum count of messages to send alert
	@FindBy(xpath = "//*[@id='minCnt']")
	public WebElement sendAlertMinCounter;

	//Send alerts to additional users. Comma separated email id's to be entered
	@FindBy(xpath = "//*[@id='additionalEmailIds']")
	public WebElement additionalUsers;

	//List of email address
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@class='controls']//td[2]"))
	public List<WebElement> emailAddressToSendAlert;

	//checkBox to selectUsers
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@class='controls']//td[3]"))
	public List<WebElement> usersCheckBox;

	//Save Button 
	@FindBy(xpath = "//input[starts-with(@onclick,'saveOrUpdateAlert')]")
	public WebElement saveAlert;

	//Cancel alert creation and go back to alerts main screen 
	@FindBy(xpath = "//input[starts-with(@onclick,'refreshNewAlerts')]")
	public WebElement cancelAlertCreation;

	//=========================================Alerts CRUD=====Second Tab(select rule Details)===============================//

	//Select Rule
	@FindBy(xpath = "//*[@id='ruleId']")
	public WebElement selectRule;

	//Edit Rule 
	@FindBy(xpath = "//div/a[contains(@onclick,'addEditRule')]")
	public WebElement editRule;
	
	//Add new Rule
	@FindBy(xpath = "//li//a[starts-with(@onclick,'addEditRule')]")
	public WebElement addNewRule;
	
	

}
