package pageobjects.ListenSettings;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIProfileComplainerAlert {

	public UIProfileComplainerAlert (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	/**
	 * Workflow automation creation UI elements in Listen --> profile --> Settings --> Complainer Alerts
	 */

	//=========================================Complainer Alerts Main Screen=====================================================//

	//New complainer Alert Create button 
	@FindBy(xpath = "//*[@id='tabContent']//button[starts-with(@onclick,'createComplain')]")
	public WebElement createNewComplainerAlert;

	//Complainer Alert Names
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='tabContent']//td[1]"))
	public List<WebElement> existingComplainAlertNames;

	//Complainer Alert Duration
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='tabContent']//td[3]"))
	public List<WebElement> complainerAlertDuration;

	//Complainer Alert min count
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='tabContent']//td[3]"))
	public List<WebElement> alertMinCount;

	//Edit Complainer Alert
	@FindAll(@FindBy(how = How.XPATH, using = "//a[starts-with(@onclick,'addEditProfileComplain')]"))
	public List<WebElement> editAlert;

	//Delete Complainer Alert
	@FindAll(@FindBy(how = How.XPATH, using = "//a[starts-with(@onclick,'delComplain')]"))
	public List<WebElement> deleteAlert;

	//=========================================Alerts CRUD=====First Tab(Add Alert Details)===============================//

	//Complainer alert name 
	@FindBy(xpath = "//*[@id='complainName']")
	public WebElement complainerAlertName;

	//Complainer Source
	@FindBy(xpath = "//*[@id='source']")
	public WebElement complainerSource;

	//Complainer Alert Frequency
	@FindBy(xpath = "//*[@id='frequency']")
	public WebElement complainerAlertFreq;

	//Minimum count of messages
	@FindBy(xpath = "//*[@id='count']")
	public WebElement minCount;

	//List of email id to send the complainer alert mails
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='userList']//td[2]"))
	public List<WebElement> userEmails;

	//Check boxes against the user to be checked to send the alerts
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='userList']//td[3]//input"))
	public List<WebElement> userCheckBox;

	//Save Button 
	@FindBy(xpath = "//input[starts-with(@onclick,'saveComplain')]")
	public WebElement saveAlert;

	//Cancel alert creation and go back to alerts main screen 
	@FindBy(xpath = "//input[starts-with(@onclick,'getComplainPage')]")
	public WebElement cancelAlertCreation;



}
