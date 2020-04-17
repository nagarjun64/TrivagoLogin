package pageobjects.ListenSettings;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIProfileDownloadRequest {

	public UIProfileDownloadRequest (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	/**
	 * Workflow automation creation UI elements in Listen --> profile --> Settings --> Download Request
	 */

	//=========================================Data Download Main Screen=====================================================//

	//New Schedule Download button 
	@FindBy(xpath = "//input[contains(@onclick,'requestDownloadWorkflowMessages')]")
	public WebElement scheduleDownload;

	//select how many entries should be displayed in one page like 10/25/50 etc
	@FindBy(xpath = "//*[@name='viewRequestDownloadTable_length']")
	public WebElement paginationLength;

	//Search for download
	@FindBy(xpath = "//*[@id='viewRequestDownloadTable_filter']//*[contains(@aria-controls,'viewRequestDownloadTable')]")
	public WebElement searchDownload;

	//Download Request Name
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='viewRequestDownloadTable']//td[1]"))
	public List<WebElement> createdDownloadName;

	//Download Excel of the data scheduled
	@FindAll(@FindBy(how = How.XPATH, using = "//*[contains(@href,'downloadProfileWorkflow')]"))
	public List<WebElement> downloadExcel;

	//Delete Excel of the data scheduled
	@FindAll(@FindBy(how = How.XPATH, using = "//*[contains(@href,'deleteDnldProfFile')]"))
	public List<WebElement> deleteExcel;

	//=========================================Schedule Download Filters====================================================//

	//Report Name
	@FindBy(xpath = "//*[@id='reportName']")
	public WebElement downloadName;

	//Report Type
	@FindBy(xpath = "//*[@id='reportType']")
	public WebElement reportType;

	//Date Duration criteria 
	@FindBy(xpath = "//*[@id='msgDateCriteria']")
	public WebElement dateCriteria;

	//Complete Query 
	@FindBy(xpath = "//*[@id='compQuery']")
	public WebElement completeQuery;


	//public source filter
	@FindBy(xpath = "//*[@id='source']")
	public WebElement publicSource;

	//Advance source filter
	@FindBy(xpath = "//*[@id='newAdvSourcefltr']")
	public WebElement advSourceFilter;

	//Tag Filter
	@FindBy(xpath = "//*[@id='messagetags']")
	public WebElement selectTag;

	//Sentiment Filter
	@FindBy(xpath = "//*[@id='sentiment_filter']")
	public WebElement selectSentiment;

	//Priority of the message
	@FindBy(xpath = "//*[@id='prioritySel']")
	public WebElement selectPriority;

	//Location
	@FindBy(xpath = "//*[@id='locationWD']")
	public WebElement selectCountry;

	//Language filter
	@FindBy(xpath = "//*[@id='languageWD']")
	public WebElement selectLanguage;

	//Workflow Filter
	@FindBy(xpath = "//*[@id='msgpropsWD']")
	public WebElement selectWorkflowStatus;

	//Assigned By 
	@FindBy(xpath = "//*[@id='assignedBy']")
	public WebElement selectAssignedBy;

	//Assigned to
	@FindBy(xpath = "//*[@id='assignedTo']")
	public WebElement selectAssignedTo;

	//Repeat Download Settings
	@FindBy(xpath = "//*[@id='rptDownload']")
	public WebElement selectRepeatDownload;

	//Repeat Download Duration
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='scheduledDownload']//label"))
	public List<WebElement> repeatDownloadDuration;

	//Schedule one time download 
	@FindBy(xpath = "//input[contains(@onclick,'oneTimeDownload')]")
	public WebElement scheduleOneTimeDowload;

	//Schedule Repeat Download 
	@FindBy(xpath = "//input[contains(@onclick,'schDownload')]")
	public WebElement scheduleRepeatDowload;

	//Cancel the schedule download 
	@FindBy(xpath = "//div[@class='oneTimeDownload']//input[contains(@onclick,'cancelDnld')]")
	public WebElement cancelDownload;


}
