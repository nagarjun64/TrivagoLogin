package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIHomePage {

	public UIHomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}    

//	@FindBy(how=How.XPATH, using="//div[@class='pos-relative has-popover']//button[@type='button']//span")
	@FindBy(how=How.XPATH, using="//header[@id='js_navigation']//*[@data-qa='header-login']//span")
	public WebElement loginButton;


	//=======================================Search=======================================//

	@FindBy(how=How.XPATH, using="//input[@id='querytext']")
	public WebElement requiredPlace;

	//search Suggestions
	@FindAll(@FindBy(how = How.XPATH, using = "//span[@class='ssg-title']"))
	public List <WebElement> srchSuggestions;

	//search Suggestion type
	@FindAll(@FindBy(how = How.XPATH, using = "//span[@class='ssg-subtitle']"))
	public List <WebElement> srchSuggestionsType;
	
	@FindBy(how=How.XPATH, using="//button[@data-qa='calendar-checkin']")
	public WebElement checkInDate;
	
	@FindBy(how=How.XPATH, using="//button[@data-qa='calendar-checkout']")
	public WebElement checkOutDate;
	
	@FindBy(how=How.XPATH, using="//div[@class='room-filters__content']//button[@data-role='removeAdult']")
	public WebElement adultsCntReduce;
	
	@FindBy(how=How.XPATH, using="//input[@id='adults-input']")
	public WebElement adultsCnt;

	@FindBy(how=How.XPATH, using="//div[@class='room-filters__content']//button[@data-role='addAdult']")
	public WebElement adultsCntIncrease;
	
	@FindBy(how=How.XPATH, using="//input[@id='children-input']")
	public WebElement childrenCnt;
	
	@FindBy(how=How.XPATH, using="//input[@id='rooms-input']")
	public WebElement roomCnt;
	
	@FindBy(how=How.XPATH, using="//div[@data-qa='roomtype']//button[@type='button'][contains(text(),'Apply')]")
	public WebElement applyRoomType;

	@FindBy(how=How.XPATH, using="//div[@class='dealform__flex-wrapper']//button[starts-with(@data-qa,'search-button')]")
	public WebElement executeMainSearch;
	
	

}
