package pageobjects.ListenSettings;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIProfileDashboardTemplates {

	public UIProfileDashboardTemplates (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	/**
	 * UI elements of the profile settings templates page
	 */

	//=========================================Template CRUD operations======================================================//

	//Create New Template
	@FindBy(xpath = "//*[@id='createTemplate']")
	public WebElement createNewTemplate;

	//Choose Default Dashboard
	@FindBy(xpath = "//*[@id='chooseDefaultDashboard']")
	public WebElement chooseDefaultTemplate;

	//Edit option for the templates present in the profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='sortableBody']//*[starts-with(@onclick,'editTemplate')]"))
	public List<WebElement> editTemplate;

	//Share button for the templates present in the profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='sortableBody']//*[starts-with(@onclick,'shareDashboard')]"))
	public List<WebElement> shareTemplate;

	//delete button for the template present in the profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='sortableBody']//*[starts-with(@onclick,'deleteConfirmTemplate')]"))
	public List<WebElement> deleteTemplate;

	//confirm deleting the template
	@FindBy(xpath = "//*[@id='jqi_state0_buttonYes']")
	public WebElement deleteTemplateConfirm;

	//Cancel Template Deletion
	@FindBy(xpath = "//*[@id='jqi_state0_buttonCancel']")
	public WebElement deleteTemplateCancel;

	//=========================================Template Settings - new Template Creation==========================================================//

	//Template Name while creating new one
	@FindBy(xpath = "//*[@id='templateName']")
	public WebElement templateName;

	//Delete Button for the grids while adding custom templates
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='sortableElements']//a[@data-tooltip='Delete row']"))
	public List<WebElement> deleteRow;

	//Widget Names to Enter
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='sortableElements']//h4[starts-with(@id,header)]"))
	public List<WebElement> widgetNames;

	//Click to add Graph in each added grid
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@class='row-fluid']//div[starts-with(@class,'addElement')]//i"))
	public List<WebElement> clickToAddGraph;

	//List of grids present in each row while adding graph
	@FindAll(@FindBy(how = How.XPATH, using = "//*[starts-with(@class,'m-t-20')]//*[starts-with(@class,'clearfix')]"))
	public List<WebElement> listOfAddedGrids;

	//Confirm Adding the graph in the grid even the lay out doesn't fit
	@FindBy(xpath = "//*[@id='confirmAddGraph']")
	public WebElement okConfirmAddGraph;

	//Cancel Adding the graph in the grid 
	@FindBy(xpath = "//*[@id='cancelAddGraph']")
	public WebElement cancelAddGraph;

	//Add row symbol while creating the template
	@FindBy(xpath = "//*[@id='templateSettingsForm']//span//i")
	public WebElement addRow;

	//List of graphs popup
	@FindBy(xpath = "//*[@id='mainTemplateDiv']//*[@class='modal-content']")
	public WebElement graphSelectionWindow;

	//Close add graph window
	@FindBy(xpath = "//*[@id='footerGraph']//button[contains(text(),'Close')]")
	public WebElement closeGraphSelectionWindow;

	//Save Template After adding the widgets
	@FindBy(xpath = "//*[@id='templateSettingsForm']//span[starts-with(text(),'Save Template')]")
	public WebElement saveTemplate;

	//Cancel template creation
	@FindBy(xpath = "//*[@id='templateSettingsForm']//button[starts-with(text(),'Cancel')]")
	public WebElement cancelTemplateCreation;

	//=================================Template Settings - Graphs - Brand Management ========================================//

	//Buzz Trend Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//span[starts-with(text(),'Buzz Trend')]")
	public WebElement buzzTrend;

	//Brand Opinion Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//span[starts-with(text(),'Brand Opinion')]")
	public WebElement brandOpinion;

	//Buzz Location Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//span[starts-with(text(),'Buzz Location')]")
	public WebElement buzzLocation;

	//Buzz By Gender Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//span[starts-with(text(),'Buzz by Gender')]")
	public WebElement buzzByGenderPie;

	//Buzz By Language Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//span[starts-with(text(),'Buzz by Language')]")
	public WebElement buzzByLanguage;

	//Buzz By Age Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//span[starts-with(text(),'Buzz by Age')]")
	public WebElement buzzByAge;

	//Buzz By Alexa Rank Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//span[starts-with(text(),'Buzz by Alexa Rank')]")
	public WebElement buzzByAlexaRank;

	//Buzz By Google Page Rank Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//span[starts-with(text(),'Buzz by Google Page Rank')]")
	public WebElement buzzByGooglePageRank;

	//Buzz By Age and Gender Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//span[starts-with(text(),'Buzz by Age and Gender')]")
	public WebElement buzzByAgeAndGender;

	//Tags Trend Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//span[starts-with(text(),'Tags Trend')]")
	public WebElement tagsTrend;

	//Tags Distribution Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//span[starts-with(text(),'Tags Distribution')]")
	public WebElement tagsDistribution;

	//Source Distribution Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//*[text()='Source Distribution ']")
	public WebElement sourceDistribution;

	//Source Distribution Absoulte Numbers Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//*[starts-with(text(),'Source Distribution (Absolute Numbers)')]")
	public WebElement sourceDistributionNumbers;

	//Distribution of Sentiment Across sources Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//*[starts-with(text(),'Distribution of sentiment across sources')]")
	public WebElement sentimentAcrossSources;

	//overall Cloud Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//*[text()='Overall Cloud ']")
	public WebElement overallCloud;

	//Top Sites Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//*[starts-with(text(),'Top Sites')]")
	public WebElement topSites;

	//Hourly buzz Trend Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//*[starts-with(text(),'Hourly Buzz Trend')]")
	public WebElement hourlyBuzzTrend;

	//Daily buzz Trend Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//*[starts-with(text(),'Daily Buzz Trend')]")
	public WebElement dailyBuzzTrend;

	//Application Usages Share on Twitter Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//*[starts-with(text(),'Application Usages Share on Twitter')]")
	public WebElement appUsageShareOnTwt;

	//Browser and OS Usages Share on Twitter Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//*[starts-with(text(),'Browser & OS Usages Share on Twitter')]")
	public WebElement browserAndOSUsageShareOnTwt;

	//Word Classification positive Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//*[starts-with(text(),'Word Classification - Positive')]")
	public WebElement wordClassificationPostitive;

	//Word Classification negative Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//*[starts-with(text(),'Word Classification - Negative')]")
	public WebElement wordClassificationNegative;

	//Word Classification Neutral Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//*[starts-with(text(),'Word Classification - Neutral')]")
	public WebElement wordClassificationNeutral;

	//Word Classification Overall Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//*[starts-with(text(),'Word Classification - Overall')]")
	public WebElement wordClassificationOverall;

	//Buzz Location Table Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//*[starts-with(text(),'Buzz Location - Table')]")
	public WebElement buzzLocationTable;

	//overall cloud bubble Graph Identifier
	@FindBy(xpath = "//*[@id='div_category_0']//*[starts-with(text(),'Overall Cloud - Bubble')]")
	public WebElement overallCloudBubble;

	//Buzz by Gender Graph Identifier in the representation of gender images
	@FindBy(xpath = "//*[@id='div_category_0']//*[starts-with(text(),'Buzz by Gender') and @data-sampleimg='/images/screenshots/profileGenderSample.png?v=1']")
	public WebElement buzzByGender;

	//Source Distribution Pie Graph Identifier 
	@FindBy(xpath = "//*[@id='div_category_0']//*[starts-with(text(),'Source Distribution - Pie')]")
	public WebElement sourceDistributionPie;

	//Buzz Prime Time Positive Graph Identifier 
	@FindBy(xpath = "//*[@id='div_category_0']//*[starts-with(text(),'Buzz - Prime Time - Positive')]")
	public WebElement buzzPrimeTimePositive;

	//Buzz Prime Time Negative Graph Identifier 
	@FindBy(xpath = "//*[@id='div_category_0']//*[starts-with(text(),'Buzz - Prime Time - Negative')]")
	public WebElement buzzPrimeTimeNegative;

	//Buzz Prime Time Overall Graph Identifier 
	@FindBy(xpath = "//*[@id='div_category_0']//*[starts-with(text(),'Buzz - Prime Time - Overall')]")
	public WebElement buzzPrimeTimeOverall;

	//Top Cities Graph Identifier 
	@FindBy(xpath = "//*[@id='div_category_0']//*[starts-with(text(),'Top Cities')]")
	public WebElement topCities;

	//HashTags Graph Identifier 
	@FindBy(xpath = "//*[@id='div_category_0']//*[starts-with(text(),'Hashtags')]")
	public WebElement hashTags;

	//Topic Word Cloud Graph Identifier 
	@FindBy(xpath = "//*[@id='div_category_0']//*[starts-with(text(),'Topic Word Cloud')]")
	public WebElement topicWordCloud;

	//=================================Template Settings - Graphs - Workflow ========================================//

	//Workflow Status Stats Graph Identifier 
	@FindBy(xpath = "//*[@id='div_category_1']//*[starts-with(text(),'Workflow Status Stats')]")
	public WebElement workflowStatusStats;

	//Workflow Stats By User Graph Identifier 
	@FindBy(xpath = "//*[@id='div_category_1']//*[starts-with(text(),'Workflow Stats By User')]")
	public WebElement workflowStatsByUser;

	//Workflow User Status Stats Graph Identifier 
	@FindBy(xpath = "//*[@id='div_category_1']//*[starts-with(text(),'Workflow User Status Stats')]")
	public WebElement workflowUserStatusStats;

	//Workflow Status Trend Graph Identifier 
	@FindBy(xpath = "//*[@id='div_category_1']//*[starts-with(text(),'Workflow Status Trend')]")
	public WebElement workflowStatusTrend;

	//Workflow Response Trend Graph Identifier 
	@FindBy(xpath = "//*[@id='div_category_1']//*[starts-with(text(),'Workflow Response Trend')]")
	public WebElement workflowResponseTrend;

	//Workflow Response Stats Graph Identifier 
	@FindBy(xpath = "//*[@id='div_category_1']//*[starts-with(text(),'Workflow Response Stats')]")
	public WebElement workflowResponseStats;

	//Workflow Status Distribution Graph Identifier 
	@FindBy(xpath = "//*[@id='div_category_1']//*[starts-with(text(),'Workflow Status Distribution')]")
	public WebElement workflowStatusDistribution;

	//Time to First Reply')] Graph Identifier 
	@FindBy(xpath = "//*[@id='div_category_1']//*[starts-with(text(),'Time to First Reply')]")
	public WebElement timeToFirstReply;

	//Workbasket Status Stats Graph Identifier 
	@FindBy(xpath = "//*[@id='div_category_1']//*[starts-with(text(),'Workbasket Status Stats') and @data-sampleimg='/images/screenshots/workflowstats.png?v=1']")
	public WebElement workbasketStatusStatsPercentage;

	//Workbaset Response Stats Graph Identifier 
	@FindBy(xpath = "//*[@id='div_category_1']//*[starts-with(text(),'Workbaset Response Stats')]")
	public WebElement workbasketResponseStats;

	//Workbasket Response Trend Graph Identifier 
	@FindBy(xpath = "//*[@id='div_category_1']//*[starts-with(text(),'Workbasket Response Trend')]")
	public WebElement workbasketResponseTrend;

	//Workbasket Status Stats Graph Identifier  
	@FindBy(xpath = "//*[@id='div_category_1']//*[starts-with(text(),'Workbasket Status Stats') and @data-sampleimg='/images/screenshots/workflowStatistics.png?v=1']")
	public WebElement workbasketStatusStatsCounter;

	//Workbasket Status Distribution Graph Identifier 
	@FindBy(xpath = "//*[@id='div_category_1']//*[starts-with(text(),'Workbasket Status Distribution')]")
	public WebElement workbasketStatusDistribution;

	//Workbasket Status Trend Graph Identifier 
	@FindBy(xpath = "//*[@id='div_category_1']//*[starts-with(text(),'Workbasket Status Trend')]")
	public WebElement workbasketStatusTrend;

	//Workbasket Stats By User Graph Identifier 
	@FindBy(xpath = "//*[@id='div_category_1']//*[starts-with(text(),'Workbasket Stats By User')]")
	public WebElement workbasketStatsByUser;

	//Response Time Daily Graph Identifier 
	@FindBy(xpath = "//*[@id='div_category_1']//*[starts-with(text(),'Response Time Daily')]")
	public WebElement responseTimeDaily;

	//Response Time Hourly Graph Identifier 
	@FindBy(xpath = "//*[@id='div_category_1']//*[starts-with(text(),'Response Time Hourly')]")
	public WebElement responseTimeHourly;


}
