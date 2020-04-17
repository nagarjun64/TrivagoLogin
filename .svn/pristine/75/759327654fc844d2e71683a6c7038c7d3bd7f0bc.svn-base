package pageobjects.Analyze;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIPostAnalysis {

	public UIPostAnalysis (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
	
	//Post Analysis title in the bread crumb
	@FindBy(linkText = "Post Analysis")
	public WebElement postAnalyticsTitle;

	//============================================Filter Criteria============================================//

	//Select Source Drop Down 
	@FindBy(xpath = "//*[@id='source']")
	public WebElement selectSource;

	//Select All Source Drop Down 
	@FindBy(xpath = "//*[@id='source']//option[1]")
	public WebElement selectAllSources;

	//Select Twitter Source Drop Down 
	@FindBy(xpath = "//*[@id='source']//option[2]")
	public WebElement selectTwtSrc;

	//Select Facebook Source Drop Down 
	@FindBy(xpath = "//*[@id='source']//option[3]")
	public WebElement selectFbPageSrc;

	//Select Instagram Source Drop Down 
	@FindBy(xpath = "//*[@id='source']//option[4]")
	public WebElement selectInstagramSrc;

	//list Of Check Boxes after selecting the source
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@class='list-inline']//span[@class='check-account']"))
	public List <WebElement> listOfCheckBox;

	//Select Profile Drop Down 
	@FindBy(xpath = "//*[@id='profileId']")
	public WebElement selectProfile;

	//list Of Profile in the Profile drop down
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='profileId']//option"))
	public List <WebElement> profileList;

	//Select First Profile Drop Down 
	@FindBy(xpath = "//*[@id='profileId']//option[2]")
	public WebElement selectFirstProfile;

	//Select Tag Drop Down 
	@FindBy(xpath = "//*[@id='tagIds']")
	public WebElement selectTag;

	//list Of Tags in the Tag drop down after selecting the profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='tagIds']//option"))
	public List <WebElement> tagList;

	//Select First Tag from Drop Down 
	@FindBy(xpath = "//*[@id='tagIds']//option[2]")
	public WebElement selectFirstTag;

	//Select Campaign Drop Down 
	@FindBy(xpath = "//*[@id='campaignIds']")
	public WebElement selectCampaign;

	//list Of Campaign in the Campaign drop down
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='campaignIds']//option"))
	public List <WebElement> campaignList;

	//Select First Tag from Drop Down 
	@FindBy(xpath = "//*[@id='campaignIds']//option[2]")
	public WebElement selectFirstCampaign;

	//Search Text Filter in Analyze 
	@FindBy(xpath = "//*[@id='searchTxt']")
	public WebElement searchTxt;

	//Date Range in the filter
	@FindBy(xpath = "//div[@id='dateRangeDiv']")
	public WebElement dateRange;

	//Date Range in the filter - Today Option
	@FindBy(xpath = "//div[@class='ranges']//li[text()[contains(.,'Today')]]")
	public WebElement dateToday;

	//Date Range in the filter - Today Option
	@FindBy(xpath = "//div[@class='ranges']//li[text()[contains(.,'Yesterday')]]")
	public WebElement dateYesterday;

	//Date Range in the filter - Last 7 Days
	@FindBy(xpath = "//div[@class='ranges']//li[text()[contains(.,'Last 7')]]")
	public WebElement dateLast7;

	//Date Range in the filter - Last Month
	@FindBy(xpath = "//div[@class='ranges']//li[text()[contains(.,'Last Month')]]")
	public WebElement dateLastMnth;

	//Date Range in the filter - Custom Range
	@FindBy(xpath = "//div[@class='ranges']//li[text()[contains(.,'Custom Range')]]")
	public WebElement dateCustomRange;

	//Apply the selected Date Range
	@FindBy(xpath = "//div[@class='range_inputs']//*[text()[contains(.,'Apply')]]")
	public WebElement applyDate;

	//Cancel the opened date filter
	@FindBy(xpath = "//div[@class='range_inputs']//*[text()[contains(.,'Cancel')]]")
	public WebElement cancelDate;

	//Go button after selecting the filter values in analyze
	@FindBy(xpath = "//div[@id='goDiv']//button[text()[contains(.,'Go')]]")
	public WebElement goBtn;

	//============================================Displaying Posts============================================//

	//Go button after selecting the filter values in analyze
	@FindBy(xpath = "//div[@id='step2']//h4")
	public WebElement dsplyPosts;

	//Download report option 
	@FindBy(xpath = "//*[@id='popover_download']//i")
	public WebElement downloadReport;

	//Total Pages in Report
	@FindBy(xpath = "//*[@id='totalPages']")
	public WebElement totalPgs;

	//Current Page in Report
	@FindBy(xpath = "//*[@id='currentPage']")
	public WebElement currentPg;

	//Navigate to Next Page in Competitor Pages
	@FindBy(xpath = "//li[@class='pagination-arrow' and contains(@data-original-title, 'Go to next page')]//i")
	public WebElement gotoNextPg;

	//Navigate to Previous Page in Competitor Pages
	@FindBy(xpath = "//li[@class='pagination-arrow' and contains(@data-original-title, 'Go to previous page')]//i")
	public WebElement gotoPreviousPg;

	//list Of messages in current page
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@class='parent']//div[contains(@class,'alternate')]"))
	public List <WebElement> msgList;

	//Permalink of the messages
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@class='parent']//div[starts-with(@class,'col-md-7')]//a[@target='_blank']"))
	public List <WebElement> permalink;

	//Scroll left to see the more statistics
	@FindBy(xpath = "//*[@id='step2']//div[starts-with(@class,'grid-title')]//button[1]")
	public WebElement scrlLeft;

	//Scroll right to see the more statistics
	@FindBy(xpath = "//*[@id='step2']//div[starts-with(@class,'grid-title')]//button[2]")
	public WebElement scrlRight;
	
	
}
