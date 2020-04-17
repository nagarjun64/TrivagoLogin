package pageobjects.reports;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIBrandPerformanceReport {

	public UIBrandPerformanceReport (WebDriver driver) {

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

	//Download Option
	@FindBy(id = "btnSetings")
	public WebElement download;

	//=========================================Filters==========================================================//

	//Date Type Filter
	@FindBy(id = "dateType")
	public WebElement dateType;

	//Case started between filter value
	@FindBy(xpath = "//li[contains(.,\"Case Started Between\")]")
	public WebElement caseStdBtwn;

	//Date select in filter drop down
	@FindBy(id = "dateRange")
	public WebElement dateRange;

	//Profile drop down
	@FindBy(id = "select2-profile-container")
	public WebElement profileSelect;
	
	//Profiles in profile drop down
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='select2-profile-results']//li"))
	public List<WebElement> profileList;
	
	//Filter Button
	@FindBy(id = "filterButton")
	public WebElement filterBtn;


}
