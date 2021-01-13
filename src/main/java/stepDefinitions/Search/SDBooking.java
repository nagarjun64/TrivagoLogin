package stepDefinitions.Search;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actions.SearchLocation;
import helpers.Hooks;
import helpers.SimplifyUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageobjects.UIHomePage;
import pageobjects.UISearchResults;

public class SDBooking {

	final Logger log = Logger.getLogger(this.getClass().getName());

	WebDriver driver;

	public SDBooking()
	{
		driver = Hooks.driver;
	}

	@Given("Enter the search details")
	public void enter_the_search_details() {

		SearchLocation search = new SearchLocation();

		search.searchLocation("Goa", "Region");
		search.reuqiredStartDate();
		search.requiredAdutlsChildRooms(1);
		

	}

	@Given("Execute the Search")
	public void execute_the_Search() {

		SearchLocation search = new SearchLocation();
		SimplifyUtils utils = new SimplifyUtils();

		search.exceuteSearch();
		utils.pause(5000);

		search.selectGuestRating();


	}

	@Then("Validate the resort is listed or not")
	public void validate_the_resort_is_listed_or_not() {

		SearchLocation search = new SearchLocation();

		assertEquals(true, search.searchrequiredPlaceInResults("Azaya Beach Resort Goa"));
		
	}
	
	@When("required resort is found")
	public void required_resort_is_found() {
		
		SearchLocation search = new SearchLocation();
		
		search.viewDeal("Azaya Beach Resort Goa");
	}

	@Then("View the deals for the requried resort")
	public void view_the_deals_for_the_requried_resort() {
		
		UISearchResults searchResults = new UISearchResults(driver);
		SimplifyUtils utils = new SimplifyUtils();
		
		utils.scrollInToView(searchResults.dealTab);
		
		assertEquals(true, utils.isClickable(searchResults.dealTab));
	
	}


}
