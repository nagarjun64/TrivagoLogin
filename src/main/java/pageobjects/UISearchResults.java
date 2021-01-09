package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UISearchResults {

	public UISearchResults(WebDriver driver){
		PageFactory.initElements(driver, this);
	}    

	//===========================Filters in Results============================================
	@FindBy(how=How.XPATH, using="//*[@data-qa='rating-filter']")
	public WebElement ratingFilter;

	//search Suggestions
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@data-qa='rating-filter']//li[@class='range__item']"))
	public List <WebElement> srchSuggestions;

	@FindBy(how=How.XPATH, using="//*[@data-qa='rating-filter']//li[@class='range__item']//span[contains(text(),'Excellent')]")
	public WebElement ExcellentRating;

	
	//===========================Search Results============================================
	
	//hotel/resort search results
	@FindAll(@FindBy(how = How.XPATH, using = "//span[@data-qa='item-name']"))
	public List <WebElement> searchResults;

}
