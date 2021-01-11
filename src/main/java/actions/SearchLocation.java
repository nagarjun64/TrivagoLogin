package actions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.Hooks;
import helpers.SimplifyUtils;
import pageobjects.UIHomePage;
import pageobjects.UISearchResults;

public class SearchLocation {

	WebDriver driver;

	public SearchLocation() {

		driver = Hooks.driver;
	}


	public void searchLocation(String searchLocation, String locationType) {

		UIHomePage search = new UIHomePage(driver);
		SimplifyUtils  utils = new SimplifyUtils();

		search.requiredPlace.clear();
		utils.pause(1000);

		search.requiredPlace.sendKeys(searchLocation);

		List<WebElement> searchSuggestions = search.srchSuggestions;
		List<WebElement> searchSuggestionsType = search.srchSuggestionsType;

		for (int i = 0; i < searchSuggestions.size(); i++) {

			if((searchSuggestions.get(i).getText().contains(searchLocation))&&((searchSuggestionsType.get(i).getText().contains("Region")))) {

				System.out.println((searchSuggestions.get(i).getText()));
				System.out.println((searchSuggestionsType.get(i).getText().contains("Region")));
				searchSuggestions.get(i).click();

				break;

			}

		}

	}

	public void reuqiredStartDate() {

		SimplifyUtils utils = new SimplifyUtils();

		utils.selectStartDate("January 2021", "2021-01-25");
		utils.selectEndDate("January 2021", "2021-01-27");

	}

	public void reuiredAdutlsChildRooms(int adultsCnt, int childCnt, int roomCnt) {

		UIHomePage search = new UIHomePage(driver);
		SimplifyUtils utils = new SimplifyUtils();

		search.adultsCnt.clear();
		utils.pause(2000);
		search.adultsCnt.sendKeys(String.valueOf(adultsCnt));

		/*
		 * if(Integer.parseInt(search.adultsCnt.getText())==adultsCnt) {
		 * 
		 * 
		 * } else if(Integer.parseInt(search.adultsCnt.getText())!=adultsCnt) {
		 * 
		 * 
		 * }
		 */

		search.childrenCnt.clear();
		utils.pause(2000);
		search.childrenCnt.sendKeys(String.valueOf(childCnt));

		search.roomCnt.clear();
		utils.pause(2000);
		search.roomCnt.sendKeys(String.valueOf(roomCnt));

		search.applyRoomType.click();
		utils.pause(2000);


	}


	public void exceuteSearch(){

		UIHomePage search = new UIHomePage(driver);

		search.executeMainSearch.click();
	}

	public void selectGuestRating(){

		UISearchResults searchResults = new UISearchResults(driver);
		SimplifyUtils utils = new SimplifyUtils();

		utils.scrollToElement(searchResults.ratingFilter);
		utils.pause(500);

		searchResults.ExcellentRating.click();

		utils.pause(2000);


	}

	public boolean searchrequiredPlaceInResults(String requiredPlace) 
	{

		UISearchResults searchResults = new UISearchResults(driver);
		List<WebElement> results =  searchResults.srchSuggestions;
		int pagesCount = searchResults.totalSearchPages.size();
		boolean placePresent = false;

		for(int i = 0; i <= pagesCount; i++) {

			for(WebElement ele : results) {

				System.out.println(ele.getText());

				if(ele.getText().equalsIgnoreCase(requiredPlace)) {
					System.out.println("found place");
					placePresent = true;
					break;
				}

			}

		}

		return placePresent;
	}

}
