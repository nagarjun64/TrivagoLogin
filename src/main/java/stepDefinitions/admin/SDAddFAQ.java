package stepDefinitions.admin;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import actions.LogInAction;
import actions.OpenModule;
import actions.settings.FAQActions;
import helpers.Hooks;
import helpers.SimplifyUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.settings.UIFAQ;


public class SDAddFAQ {

	WebDriver driver;
	String FAQ_TITLE;
	final Logger log = Logger.getLogger(this.getClass().getName());

	public SDAddFAQ()
	{
		driver = Hooks.driver;
	}

	@Given("^User navigates to FAQ page$")
	public void user_Navigates_to_AddFAQ_Page() throws Throwable {

		LogInAction login = new LogInAction();
		OpenModule open = new OpenModule();

		login.loginAsOwner();

		open.openManageFAQ();

	}

	@When("^Click on Add FAQ$")
	public void Click_on_Add_FAQ() {

		FAQActions faq= new FAQActions();

		faq.openAddFAQScreen();


	}

	@When("^Fill details to create FAQ$")
	public void Fill_details_to_create_FAQ() {

		FAQActions faq= new FAQActions();
		SimplifyUtils sutils = new SimplifyUtils();

		FAQ_TITLE = sutils.profileNameGen();
		System.err.println(FAQ_TITLE);

		faq.addFAQ(FAQ_TITLE, FAQ_TITLE + " "+ "Description of the Email @ # $ % ^ & * ( ) _ + ! { } [ ] : \" , . < > ? / ","AutoFAQ");

	}

	@Then("^FAQ should be added successfully$")
	public void FAQ_should_be_added_successfully() {

		FAQActions faq= new FAQActions();

		try 
		{
			Assert.assertTrue(faq.isFAQPresent(FAQ_TITLE));
		} 
		catch (Exception e) 
		{
			log.error("Error Would be: ",e);
			Assert.fail();
		}
	}

	@Given("^Create FAQ$")
	public void Create_FAQ() {
		
		LogInAction login = new LogInAction();
		OpenModule open = new OpenModule();
		FAQActions faq= new FAQActions();
		SimplifyUtils sutils = new SimplifyUtils();
		
		faq.openAddFAQScreen();

		FAQ_TITLE = sutils.profileNameGen();

		faq.addFAQ(FAQ_TITLE, FAQ_TITLE + " "+ "Description of the Email @ # $ % ^ & * ( ) _ + ! { } [ ] : \" , . < > ? / ","AutoFAQ");

	}

	@When("^Changes to existing FAQ are edited and saved$")
	public void Changes_to_existing_FAQ_are_edited_and_saved() {
		
		FAQActions faqAction = new FAQActions();
		UIFAQ faq = new UIFAQ(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		
		faqAction.editFAQ(FAQ_TITLE);
		
		FAQ_TITLE = sutils.profileNameGen();
		
		sutils.scrollToElement(faq.Question);
		
		faq.Question.clear();
		faq.Question.sendKeys(FAQ_TITLE);

		faq.Answer.clear();
		faq.Answer.sendKeys(FAQ_TITLE + " "+ "Description of the Email @ # $ % ^ & * ( ) _ + ! { } [ ] : \" , . < > ? / ");
		
		sutils.scrollToElement(faq.Create);
		
		faq.Create.click();
		
	}

	@Then("^FAQ should be updated$")
	public void FAQ_should_be_updated() {
		
		FAQActions faq= new FAQActions();
		SimplifyUtils sutils = new SimplifyUtils();

		try 
		{
			Assert.assertTrue(faq.isFAQPresent(FAQ_TITLE));
		} 
		catch (Exception e) 
		{
			log.error("Error Would be: ",e);
			Assert.fail();
		}

	}
	
	@When("^Created FAQ is deleted$")
	public void Created_FAQ_is_deleted() {
		
		FAQActions faq= new FAQActions();
		
		faq.deleteFAQ(FAQ_TITLE);
	
	}


	@Then("^FAQ should be deleted$")
	public void FAQ_should_be_deleted() {
		
		FAQActions faq= new FAQActions();
		SimplifyUtils sutils = new SimplifyUtils();

		try 
		{
			
			Assert.assertFalse(faq.isFAQPresent(FAQ_TITLE));
		} 
		catch (Exception e) 
		{
			log.error("Error Would be: ",e);
			Assert.fail();
		}
		
		
	}

}


