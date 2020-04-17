package pageobjects.ListenSettings;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIWorkflowAutomation {

	public UIWorkflowAutomation (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	/**
	 * Workflow automation creation UI elements in Listen --> profile --> Settings --> Workflow automation
	 */

	//=========================================Workflow Automation Main Screen=====================================================//

	//Create New Template
	@FindBy(xpath = "//*[@id='autoassigntable']//*[starts-with(@onclick,'addEditAutoAssign') and starts-with(text(),' New Workflow')]")
	public WebElement createNewTemplate;

	//Edit option for auto assign agents
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='autoassigntable']//tr//*[starts-with(@onclick,'addEditAutoAssign')]"))
	public List<WebElement> editAutoAssign;

	//Delete option for Auto assign Agents
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='autoassigntable']//tr//*[starts-with(@onclick,'delAutoAssign')]"))
	public List<WebElement> deleteAutoAssign;

	//=================================Workflow Automation CRUD== 1 - Add Automatin Details======================================//

	//Name of auto assign during creation
	@FindBy(xpath = "//*[@id='autoAssignName']")
	public WebElement autoAssignName;

	//Description of auto assign during creation
	@FindBy(xpath = "//*[@id='autoAssignDesc']]")
	public WebElement autoAssignDescription;

	//Priority for auto assign
	@FindBy(xpath = "//*[@id='workPriority']]")
	public WebElement autoAssignPriority;

	//Assign to user or workbasket drop down
	@FindBy(xpath = "//*[@id='toUser']//optgroup[@id='user']//option")
	public WebElement autoAssignToUser;

	//Assign to user or workbasket drop down
	@FindBy(xpath = "//*[@id='toUser']//optgroup[@id='workbasket']//option")
	public WebElement autoAssignToWorkbasket;

	//Save Auto Assign and navigate to Rule selection Screen
	@FindBy(xpath = "//*[contains(@onclick,'saveOrUpdateAutoAssign')]")
	public WebElement saveAutoAssign;

	//Cancel Auto Assign creation
	@FindBy(xpath = "//*[contains(@onclick,'refreshAutoAssigns')]")
	public WebElement cancelAutoAssignCreation;

	//=================================Workflow Automation CRUD== 2 - Add Rule Details======================================//

	//Associate Rule while auto assigning 
	@FindBy(xpath = "//*[@id='ruleId']]")
	public WebElement associateRule;

	//Edit Rule from workflow automation 
	@FindBy(xpath = "//*[@id='tab2']//*[@class='row']//*[contains(@onclick,'addEditRule')]")
	public WebElement editRule;

	//Add new rule button in the second screen of auto assignment creation 
	@FindBy(xpath = "//*[@id='tab2']//li//*[contains(@onclick,'addEditRule')]")
	public WebElement addNewRule;


}
