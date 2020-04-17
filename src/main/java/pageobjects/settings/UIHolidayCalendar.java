package pageobjects.settings;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIHolidayCalendar {

	public UIHolidayCalendar (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	//=========================================Holiday Calendar Home Screen=====================================================//

	//Add new Holiday Calendar 
	@FindBy(xpath = "//*[contains(@onclick,'addCalendar')]")
	public WebElement addNewCalendar;

	//Holiday Calendar Name
	@FindAll(@FindBy(how = How.XPATH, using ="//*[contains(@class,'table-responsive')]//td[1]"))
	public List<WebElement> nameHolidayCalendar;

	//Email of the user who created the holiday calendar
	@FindAll(@FindBy(how = How.XPATH, using ="//*[contains(@class,'table-responsive')]//td[2]//*[@class='muted']//span"))
	public List<WebElement> createdByEmail;

	//Edit Holiday Calendar
	@FindAll(@FindBy(how = How.XPATH, using ="//*[contains(@onclick,'editCalendar')]"))
	public List<WebElement> editHolidayCalendar;

	//Delete Holiday Calendar
	@FindAll(@FindBy(how = How.XPATH, using ="//*[contains(@onclick,'deleteCalendar')]"))
	public List<WebElement> deleteHolidayCalendar;


	//=========================================Holiday Calendar Creation=====================================================//

}
