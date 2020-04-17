package pageobjects.ListenSettings;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIProfileSLA {

	public UIProfileSLA (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	/**
	 * Workflow automation creation UI elements in Listen --> profile --> Settings --> SLA
	 */

	//=========================================SLA Main Screen=====================================================//

	//New SLA Create button 
	@FindBy(xpath = "//*[@id='tabContent']//button[contains(@onclick,'addEditProfileSLA')]")
	public WebElement createNewComplainerAlert;

	//Name of created SLA
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='tabContent']//td[1]"))
	public List<WebElement> createdSlaName;

	//Edit SLA
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='tabContent']//a[contains(@onclick,'addEditProfileSLA')]"))
	public List<WebElement> editSLA;

	//deleteSLA
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='tabContent']//a[contains(@onclick,'deleteProfileSLA')]"))
	public List<WebElement> deleteSLA;

	//=====================================================SLA Creation============================================================//

	//SLA Name
	@FindBy(xpath = "//*[@id='slaName']")
	public WebElement slaName;

	//SLA description 
	@FindBy(xpath = "//*[@id='slaDesc']")
	public WebElement slaDescription;

	//Complete Query Selection 
	@FindBy(xpath = "//*[@name='queryfltr']")
	public WebElement selectCompleteQuery;

	//Public Source Selection
	@FindBy(xpath = "//*[@name='sourcefltr']")
	public WebElement selectSource;

	//Workbasket Selection 
	@FindBy(xpath = "//*[@name='workflowfltr']")
	public WebElement selectWorkbasket;

	//Workflow status select
	@FindBy(xpath = "//*[@id='actionStates']")
	public WebElement selectWkStatus;

	//Case priority selection drop down
	@FindBy(xpath = "//*[@id='priority']")
	public WebElement priorityToMatchSLA;

	//SLA hour selection
	@FindBy(xpath = "//*[@id='slahour']")
	public WebElement selectSLAHour;

	//SLA Minute selection
	@FindBy(xpath = "//*[@id='slaminute']")
	public WebElement selectSLAMinute;

	//change priority check box
	@FindBy(xpath = "//*[@id='changePriority']")
	public WebElement slaPriorityChkBox;

	//change priority check box
	@FindBy(xpath = "//*[@class='controls']//*[@id='prioritySel']")
	public WebElement changePriority;

	//Re-assign to user or workbasket once the messages crosses SLA
	@FindBy(xpath = "//*[@class='controls']//*[@id='toUserOrBasket']")
	public WebElement reAssignTo;

	//email address of the users to whom the email should be sent
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='slaAlertToUser']//td[2]"))
	public List<WebElement> sendAlertToEmail;

	//Check the check box to send the alert mail
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='slaAlertToUser']//td[3]"))
	public List<WebElement> checkSendAlertTo;

	//Save Button 
	@FindBy(xpath = "//*[@id='submitButton']")
	public WebElement saveSLA;

	//Cancel Alert Creation 
	@FindBy(xpath = "//input[contains(@onclick,'cancel')]")
	public WebElement cancelAlertCreation;

}
