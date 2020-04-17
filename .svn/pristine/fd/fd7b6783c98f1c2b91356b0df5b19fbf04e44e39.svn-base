package pageobjects.reports;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UIBreakReport {

	public UIBreakReport (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	final Logger log = Logger.getLogger(this.getClass().getName());


	//=========================================Report Title==========================================================//

	//Report title in the bread crumb
	@FindBy(linkText = "Break Report")
	public WebElement breakReportTitle;

	//Message title for the data table in the report
	@FindBy(xpath = "//thead[@id='thead']//th[1]")
	public WebElement msgTitle;

	//=========================================Download and Navigation==========================================================//

	//Download Icon/option in reports
	@FindBy(xpath = "//li[@class='btn-group']//a[@data-toggle='dropdown']//i")
	public WebElement downloadReport;

	//Download Excel option in reports
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

	//All user filter in report
	@FindBy(xpath = "//select[@id='user']") //input[@class='select2-search__field' and @placeholder='All User']
	public WebElement allUser;

	//First User in the user filter
	@FindBy(xpath = "//select[@id='user']//option[2]") 
	public WebElement userListfirstUser;

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
