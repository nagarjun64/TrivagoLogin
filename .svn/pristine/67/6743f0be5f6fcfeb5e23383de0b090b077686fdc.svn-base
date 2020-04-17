package pageobjects.ListenSettings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UIListenProfileWorkflowAutomation {

	public UIListenProfileWorkflowAutomation (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	/**
	 * UI elements of the profile Workflow Automation
	 */

	//New Workflow Create button
	@FindBy(xpath = "//*[@id='autoassigntable']//button[starts-with(text(),' New Workflow')]")
	public WebElement createWorkflow;

	//===============================Workflow Automation Creation = Add Automation Details ========================================//

	//Workflow automation name
	@FindBy(xpath = "//*[@id='autoAssignName']")
	public WebElement nameWorkflowAutomation;

	//Workflow automation description
	@FindBy(xpath = "//*[@id='autoAssignDesc']")
	public WebElement descWorkflowAutomation;

	//Priority of workflow automation
	@FindBy(xpath = "//*[@id='workPriority']")
	public WebElement assignPriority;

	//Assign to User List
	@FindBy(xpath = "//*[@id='toUser']")
	public WebElement assignTo;

	//Save Workflow Automation
	@FindBy(xpath = "//*[@id='commentForm']//*[contains(@onclick,'saveOrUpdateAutoAssign')]")
	public WebElement saveWorklow;

	//Cancel Workflow automation creation
	@FindBy(xpath = "//*[@id='commentForm']//*[contains(@onclick,'refreshAutoAssigns')]")
	public WebElement cancelWorkflowCreation;

	//===============================Workflow Automation Creation = Add Rule Details ========================================//

	


}
