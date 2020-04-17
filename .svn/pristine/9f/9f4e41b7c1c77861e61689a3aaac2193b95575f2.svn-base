package pageobjects.ListenSettings;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIProfileWorkbaskets {

	public UIProfileWorkbaskets (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	/**
	 * Workflow automation creation UI elements in Listen --> profile --> Settings --> WorkBaskets
	 */

	//=========================================Workbasket Main Screen=====================================================//

	//New Workbasket Creation
	@FindBy(xpath = "//*[@id='tabContent']//button[starts-with(@onclick,'addEditWorkbasket')]")
	public WebElement createWorkbasket;

	//Edit workbaskets List
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='workbasketsTable']//*[contains(@onclick,'addEditWorkbasket')]"))
	public List<WebElement> editWorkbasket;

	//Delete Workbaskets List
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='workbasketsTable']//*[contains(@onclick,'delBasket')]"))
	public List<WebElement> deleteWorkbasket;

	//=========================================Workbasket CRUD=====================================================//

	//Name of the workbasket
	@FindBy(xpath = "//*[@id='basketName']]")
	public WebElement workbasketName;

	//Description of the workbasket
	@FindBy(xpath = "//*[@id='basketDesc']]")
	public WebElement workbasketDescription;

	//CheckBoxes to share the users list
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='basketusers']//td[1]"))
	public List<WebElement> usersEmailId;

	//CheckBoxes to share the users list
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='basketusers']//*[@class='checkbox']"))
	public List<WebElement> usersCheckBox;

	//Workbasket Role Drop Down 
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='basketusers']//td[4]//select[starts-with(@id,'rolelink')]"))
	public List<WebElement> workbasketRole;
	
	//Save workbasket
	@FindBy(xpath = "//div[@class='row']//input[@value='Save']")
	public WebElement saveWorkbasket;
	
	//Update workbasket
	@FindBy(xpath = "//div[@class='row']//input[@value='Update']")
	public WebElement updateWorkbasket;
	
	//New Workbasket Creation
	@FindBy(xpath = "//div[@class='row']//input[@value='Cancel']")
	public WebElement cancelWorkbasketUpdate;




}
