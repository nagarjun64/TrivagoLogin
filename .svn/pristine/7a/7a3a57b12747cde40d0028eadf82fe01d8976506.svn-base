package pageobjects.ListenSettings;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UIProfileCaseDetails {

	/**
	 * Workflow automation creation UI elements in Listen --> profile --> Settings --> Case Detail Form
	 */

	//=========================================Case Details Main Screen=====================================================//

	//Add field in the case detail form 
	@FindBy(xpath = "//*[@id='casedetailsform']//a[contains(@onclick,'addField')]")
	public WebElement addField;

	//Label List in Case detail form
	@FindAll(@FindBy(how = How.XPATH, using = "//*[contains(@id,'label-options')]//td//input"))
	public List<WebElement> labelName;

	//Label Type in Case detail form
	@FindAll(@FindBy(how = How.XPATH, using = "//td//*[contains(@onchange,'loadtype')]"))
	public List<WebElement> labelType;


	//li[@class='list-group-item ']//tr[1]//td[4]

	//Save Case Detail Form 
	@FindBy(xpath = "//*[@id='submitButton']")
	public WebElement saveCaseDetailForm;

	//Preview Case Detail Form 
	@FindBy(xpath = "//*[@id='savepreviewbuttons']//*[@value='Preview']")
	public WebElement previewCaseDetailForm;




}
