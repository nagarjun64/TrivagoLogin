package pageobjects.ListenSettings;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIProfileTags {

	public UIProfileTags (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	/**
	 * Workflow automation creation UI elements in Listen --> profile --> Settings --> Tags
	 */

	//=========================================Tags Main Screen=====================================================//

	//New Tag Create button 
	@FindBy(xpath = "//*[@id='autoassigntable']//button[starts-with(@data-original-title,'Add new tag')]")
	public WebElement createNewTag;

	//Import Tag Create button 
	@FindBy(xpath = "//*[@id='autoassigntable']//*[starts-with(@onclick,'importProfileTags')]")
	public WebElement importTag;

	//Edit Tag List
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='autoassigntable']//a[starts-with(@title,'Edit Tag')]"))
	public List<WebElement> editTag;

	//Delete Tag List
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='autoassigntable']//a[starts-with(@title,'Delete Tag')]"))
	public List<WebElement> deleteTag;

	//=========================================Tags CRUD=====First Tab(Add Tag Details)===============================//

	//Tag Name 
	@FindBy(xpath = "//*[@id='tagName']")
	public WebElement tagName;

	//Tag Color Code 
	@FindBy(xpath = "//*[@id='colorcode']//input")
	public WebElement tagColor;

	//List of parent tags 
	@FindBy(xpath = "//*[@id='parentTagsDiv']//li")
	public WebElement parentTagsList;

	//Tag Description
	@FindBy(xpath = "//*[@id='tagDesc']")
	public WebElement tagDescription;

	//Create Tag or Finish Tag Creation
	@FindBy(xpath = "//*[@id='addTagging']//input[@value='Finish']")
	public WebElement saveTag;

	//Cancel Tag Create/Edit
	@FindBy(xpath = "//*[@id='addTagging']//input[@value='Cancel']")
	public WebElement cancelTag;

	//=========================================Tags CRUD=====Second Tab(Add Rule Details)=============================//

	//Rule Selection Drop Down 
	@FindBy(xpath = "//*[@name='ruleId']")
	public WebElement selectRule;

	//Edit Rule 
	@FindBy(xpath = "//div/a[contains(@onclick,'addEditRule')]")
	public WebElement editRule;
	
	//Add new Rule
	@FindBy(xpath = "//li//a[starts-with(@onclick,'addEditRule')]")
	public WebElement addNewRule;

	//skip Auto tagging
	@FindBy(xpath = "//li/a[contains(@onclick,'refreshProfileTagging')]")
	public WebElement skipAutoTag;


}
