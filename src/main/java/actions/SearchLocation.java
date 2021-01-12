package actions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
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

	public void requiredAdutlsChildRooms(int adultsCnt, int childCnt, int roomCnt) {

		UIHomePage search = new UIHomePage(driver);
		SimplifyUtils utils = new SimplifyUtils();


		utils.pause(1000);

		search.adultsCnt.clear(); utils.pause(2000);
		search.adultsCnt.sendKeys(String.valueOf(adultsCnt));



		/*
		 * int currentAdultsCnt = Integer.parseInt(search.adultsCnt.getText());
		 * 
		 * if((currentAdultsCnt!=adultsCnt)&&(currentAdultsCnt<adultsCnt)) {
		 * 
		 * for(int i=0; i<adultsCnt-currentAdultsCnt;i++) {
		 * search.adultsCntIncrease.click();
		 * 
		 * }
		 * 
		 * } else if((currentAdultsCnt!=adultsCnt)&&(currentAdultsCnt>adultsCnt)) {
		 * 
		 * for(int i=0; i<currentAdultsCnt-adultsCnt;i++) {
		 * search.adultsCntReduce.click();
		 * 
		 * }
		 * 
		 * 
		 * }
		 */

		search.childrenCnt.clear(); utils.pause(2000);
		search.childrenCnt.sendKeys(String.valueOf(childCnt));

		search.roomCnt.clear(); utils.pause(2000);
		search.roomCnt.sendKeys(String.valueOf(roomCnt));


		search.applyRoomType.click();
		utils.pause(2000);


	}

	public void requiredAdutlsChildRooms(int adultsCnt) {

		UIHomePage search = new UIHomePage(driver);
		SimplifyUtils utils = new SimplifyUtils();


		utils.pause(1000);

		search.adultsCntReduce.click();

		/*
		 * int currentAdultsCnt = Integer.parseInt(search.adultsCnt.getText());
		 * 
		 * if((currentAdultsCnt!=adultsCnt)&&(currentAdultsCnt<adultsCnt)) {
		 * 
		 * for(int i=0; i<adultsCnt-currentAdultsCnt;i++) {
		 * search.adultsCntIncrease.click();
		 * 
		 * }
		 * 
		 * } else if((currentAdultsCnt!=adultsCnt)&&(currentAdultsCnt>adultsCnt)) {
		 * 
		 * for(int i=0; i<currentAdultsCnt-adultsCnt;i++) {
		 * search.adultsCntReduce.click();
		 * 
		 * }
		 * 
		 * 
		 * }
		 */

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

	public void viewDeal(String requiredPlace) 
	{

		UISearchResults searchResults = new UISearchResults(driver);
		SimplifyUtils utils = new SimplifyUtils();
		List<WebElement> results =  searchResults.srchSuggestions;
		int pagesCount = searchResults.totalSearchPages.size();
		boolean placePresent = false;


		for(int i = 0; i < pagesCount; i++) {
			System.out.println(searchResults.srchSuggestions.size());
			for (int j=0; j<searchResults.srchSuggestions.size(); j++) {

				System.out.println(searchResults.srchSuggestions.get(j).getText());
				utils.pause(500);

				if(j>23){
					//					utils.scrollToElement(searchResults.navigateRight);
					utils.scrollInToEndOfPage();
					utils.scrollInToView(searchResults.srchSuggestions.get(j));

				}
				if(searchResults.srchSuggestions.get(j).getText().equalsIgnoreCase(requiredPlace)) {

					utils.pause(500);
					searchResults.cheapDeal.get(j).click();

					placePresent = true;
					break;

				}

			}
			utils.pause(500);
			searchResults.navigateRight.click();
			utils.scrollInToView(searchResults.srchSuggestions.get(0));
			if(placePresent==true || i ==pagesCount) {
				break;
			}

		}

	}



}
