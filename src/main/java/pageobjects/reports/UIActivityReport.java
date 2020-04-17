package pageobjects.reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UIActivityReport {

	public UIActivityReport (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
	//=========================================Report Title==========================================================//

	//Download Icon/option in reports
	@FindBy(linkText = "Activity Report")
	public WebElement activityReportTitle;

	//Message title for the data table in the report
	@FindBy(xpath = "//tr[1]//th[1]")
	public WebElement msgTitle;

	//=========================================Download and Navigation==========================================================//

	//Download Icon/option in reports
	@FindBy(xpath = "//li[@class='btn-group']//a[@data-toggle='dropdown']//i")
	public WebElement downloadReport;

	//Download Icon/option in reports
	@FindBy(xpath = "//a[@class='download' and contains(.,' Download Excel')]//i")
	public WebElement downloadExl;

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


	//=========================================Filters==========================================================//

	//Filter icon
	@FindBy(xpath = "//div[@class='navbar-inner']//div[contains(@class,'filter-icon')]")
	public WebElement filterAtTop;

	//Profile Filter in Tagging Report
	@FindBy(xpath = "//select[@id='profile']") //input[@class='select2-search__field' and @placeholder='All User']
	public WebElement allProfile;

	//First Profile in the profile filters 
	@FindBy(xpath = "//select[@id='profile']//option[2]") 
	public WebElement profileListFirstProfile;

	//All user filter in replies report
	@FindBy(xpath = "//select[@id='user']") //input[@class='select2-search__field' and @placeholder='All User']
	public WebElement allUser;

	//First User in the user filter
	@FindBy(xpath = "//select[@id='user']//option[2]") 
	public WebElement userListfirstUser;

	//Second User in the user filter
	@FindBy(xpath = "//select[@id='user']//option[3]") 
	public WebElement userListSecondUser;

	//All Status filter in Activity report
	@FindBy(xpath = "//select[@id='msgPropType']") //input[@class='select2-search__field' and @placeholder='All User']
	public WebElement allStatus;

	//First Status in the Status filter
	@FindBy(xpath = "//select[@id='msgPropType']//option[2]") 
	public WebElement statusListFirstOptn;

	//Second Status in the Status filter
	@FindBy(xpath = "//select[@id='msgPropType']//option[3]") 
	public WebElement statusListSecondOptn;

	//Filter button when filter slider is opened from the right side
	@FindBy(xpath = "//button[@id='filterButton' and text()[contains(.,'Filter')]]")
	public WebElement applyFilterBtn;

	//Reset button when filter slider is opened from the right side
	@FindBy(xpath = "//button[@id='filterButton' and text()[contains(.,'Reset')]]")
	public WebElement resetBtn;

	//Close button when filter slider is opened from the right side
	@FindBy(xpath = "//button[@id='closeButton']")
	public WebElement closeFilterBtn;

	//Date Range in the filter
	@FindBy(xpath = "//input[@id='dateRange']")
	public WebElement dateRange;

	//Date Range in the filter - Today Option
	@FindBy(xpath = "//div[@class='ranges']//li[text()[contains(.,'Today')]]")
	public WebElement dateToday;

	//Date Range in the filter - Last 7 Days
	@FindBy(xpath = "//div[@class='ranges']//li[text()[contains(.,'Last 7')]]")
	public WebElement dateLast7;

	//Date Range in the filter - Month to Date
	@FindBy(xpath = "//div[@class='ranges']//li[text()[contains(.,'Month to Date')]]")
	public WebElement dateMntToDate;

	//Date Range in the filter - Custom Range
	@FindBy(xpath = "//div[@class='ranges']//li[text()[contains(.,'Custom Range')]]")
	public WebElement dateCustomRange;

	//Apply the selected Date Range
	@FindBy(xpath = "//div[@class='range_inputs']//*[text()[contains(.,'Apply')]]")
	public WebElement applyDate;

	//Cancel the opened date filter
	@FindBy(xpath = "//div[@class='range_inputs']//*[text()[contains(.,'Cancel')]]")
	public WebElement cancelDate;
}
