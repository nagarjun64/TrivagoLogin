package stepDefinitions.Listen;

import org.openqa.selenium.WebDriver;

import actions.LogInAction;
import actions.OpenModule;
import actions.listen.ProfileCreationAction;
import actions.listen.ProfileHomeAction;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import helpers.Hooks;
import helpers.SimplifyUtils;
import pageobjects.Listen.UIListenHome;
import pageobjects.Listen.UIListenProfileCreation;

/**
 * @author nagarjunareddy
 *
 */

public class SDListenProfileCreation {

	final Logger log = Logger.getLogger(this.getClass().getName());

	WebDriver driver;
	String PROFILE_NAME;
	public List<String> SUB_QUERY_NAME;
	public List<String> SECOND_SUB_QUERY_NAME;
	String FB_PAGE_ADDED;
	String TWT_ADDED_ACT;
	String YT_ADDED_ACT;
	String LKDN_ADDED_PAGE;
	String INSTA_ACCT_PERSONAL;
	String INSTA_ACCT_BUS;
	String ADDED_GOOGLE_PLUS_PAGE;

	public SDListenProfileCreation()
	{
		driver = Hooks.driver;
	}

	@Given("^User is Logged in As Admin/Owner$")
	public void user_is_Logged_in_As_Admin_Owner() throws Throwable {

		LogInAction login = new LogInAction();

		login.loginAsOwner();

	}

	@Given("^User open Profile Creation Screen from Listen Home$")
	public void user_open_Profile_Creation_Screen_from_Listen_Home() throws Throwable {

		OpenModule open = new OpenModule();
		UIListenHome listen = new UIListenHome(driver);

		open.openListenHome();

		listen.newListeningProfile.click();

	}

	@When("^User Clicked on Create with out Name and Volume$")
	public void user_Clicked_on_Create_with_out_Name_and_Volume() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.saveNameAndVolume();

	}

	@Then("^Error message to enter the mandatory details should be displayed$")
	public void error_message_to_enter_the_mandatory_details_should_be_displayed() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		assertEquals(true, profileAction.isProfileNameNotAddedErrPresent());
		assertEquals(true, profileAction.isProfileVolumeNotAddedErrPresent());

	}

	@Given("^User Provides Name and Volume$")
	public void user_Provides_Name_and_Volume() throws Throwable {

		SimplifyUtils sutils = new SimplifyUtils();
		ProfileCreationAction profileAction = new ProfileCreationAction();

		PROFILE_NAME = sutils.profileNameGen();

		profileAction.setProfileNameAndVolume(PROFILE_NAME, "100");

	}

	@Given("^Save the Profile Information$")
	public void save_the_Profile_Information() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.saveNameAndVolumeOptimised();

	}

	@When("^User Enables the Case Association$")
	public void user_Enables_the_Case_Association() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.turnCaseAssociationOn();
	}

	@When("^Selects Case Association Duration$")
	public void selects_Case_Association_Duration() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.setCaseAssociationDuration();
	}

	@When("^Save the Profile Settings$")
	public void save_the_Profile_Settings() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.saveProfileSettings();
	}

	@Given("Skips Keyword Listening$") 
	public void skips_Keyword_Listening(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		profileCreation.skipAddingSubquery.click();

		sutils.pause(700);

	};

	@When("^Save a Keyword Set$")
	public void save_a_Keyword_Set() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.confirmAddSubquery();

		SUB_QUERY_NAME = profileAction.fillFirstSubqueryDetails();

		profileAction.saveSubqueriess();

	}

	@Then("^Case Association Should be Saved with the selected duration$")
	public void case_Association_Should_be_Saved_with_the_selected_duration() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();
		ProfileHomeAction profileHomeAction = new ProfileHomeAction();
		OpenModule open = new OpenModule();

		open.openListenHome();

		profileHomeAction.editProfile(PROFILE_NAME);

		try 
		{
			assertTrue(profileAction.caseAssociationStatus());
		}
		catch (Exception e) 
		{
			log.error("Error Would be: ",e);
			Assert.fail();		
		}

	}

	@When("^User selects the Reply option$")
	public void user_selects_the_Reply_option() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.setReplyOption();
	}

	@Then("^Reply Settings should be saved with Selected Option$")
	public void reply_Settings_should_be_saved_with_Selected_Option() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();
		ProfileHomeAction profileHomeAction = new ProfileHomeAction();
		OpenModule open = new OpenModule();

		//opening listen home and editing the profile
		open.openListenHome();
		profileHomeAction.editProfile(PROFILE_NAME);

		try 
		{
			//Validating the Reply option Status
			assertTrue(profileAction.selectedReplyOption());
		} 
		catch (Exception e) 
		{
			log.error("Error Would be: ",e);
			Assert.fail();
		}
	}

	@Given("^Save Profile Settings$")
	public void save_Profile_Settings() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.saveProfileSettings();
	}

	@Then("^Profile Should be Created with the keywords Added$")
	public void profile_Should_be_Created_with_the_keywords_Added() {

		ProfileCreationAction profileAction = new ProfileCreationAction();
		ProfileHomeAction profileHomeAction = new ProfileHomeAction();
		OpenModule open = new OpenModule();

		open.openListenHome();

		profileHomeAction.editProfile(PROFILE_NAME);

		try 
		{
			assertEquals("Comparing the Subquery Names", profileAction.getSubqueryNames().get(0), SUB_QUERY_NAME.get(0));
		}
		catch (Exception e) 
		{
			log.error("Error Would be: ",e);
			Assert.fail();		
		}

	}

	@Given("^Save another Keyword Set$")
	public void save_another_Keyword_Set() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.addSubQueryRow();

		SECOND_SUB_QUERY_NAME = profileAction.fillSecondSubqueryDetails();

		profileAction.saveSubqueriess();

	}

	@When("^User Deletes the Subquery$")
	public void user_Deletes_the_Subquery() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();
		ProfileHomeAction homeAction = new ProfileHomeAction();

		homeAction.editProfile(PROFILE_NAME);
		log.info(SECOND_SUB_QUERY_NAME.get(0));
		profileAction.deleteSubquery(SECOND_SUB_QUERY_NAME.get(0));

	}

	@Then("^Subquery Should be Deleted$")
	public void subquery_Should_be_Deleted() throws Throwable {

	}

	//===========================Facebook Pages===========================//
	@When("^User imports an Facebook Page$")
	public void user_imports_an_Facebook_Page() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.expandFbpageSlider();

		profileAction.importFbPagesToProfile();

	}

	@Then("^Imported Facebook Page Should be Added to the Profile$")
	public void imported_Facebook_Page_Should_be_Added_to_the_Profile() throws Throwable {

	}

	@When("^User Add Admin Facebook Page$")
	public void user_Add_Admin_Facebook_Page() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.expandFbpageSlider();

		FB_PAGE_ADDED = profileAction.addAdminFbPageToProfile();

	}

	@When("^User Add Non-Admin Facebook Page$")
	public void user_Add_Non_Admin_Facebook_Page() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.addNonAdminFbPagesToProfile("englandcricket");

	}

	@Then("^Added Admin Facebook Page Should be added$")
	public void added_Admin_Facebook_Page_Should_be_added() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();
		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		ProfileHomeAction homeAction = new ProfileHomeAction();
		SimplifyUtils sutils = new SimplifyUtils();
		OpenModule open = new OpenModule();

		open.openListenHome();

		homeAction.editProfile(PROFILE_NAME);

		sutils.waitForElementToBeClickable(profileCreation.createNewProfile, 3);

		profileCreation.profileSocialChannels.click();

		profileAction.expandFbpageSlider();

		List<String> pagesToMatch = profileAction.getAddedAdminFbPages();

		try 
		{
			assertTrue(pagesToMatch.contains(FB_PAGE_ADDED));
		}
		catch (Exception e) 
		{
			log.error("Error Would be: ",e);
			Assert.fail();		
		}

	}

	//===========================Twitter===========================//
	@When("^User imports an Twitter Channel$")
	public void user_imports_an_Twitter_Channel() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.importTwtActsToProfile();

	}

	@Then("^Imported Twitter Channel Should be Added to the Profile$")
	public void imported_Twitter_Channel_Should_be_Added_to_the_Profile() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();
		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		ProfileHomeAction homeAction = new ProfileHomeAction();
		SimplifyUtils sutils = new SimplifyUtils();
		OpenModule open = new OpenModule();


	}

	@When("^User Add Admin Twitter Channel$")
	public void user_Add_Admin_Twitter_Channel() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.expandTwtSourceSlider();

		TWT_ADDED_ACT = profileAction.addAdminTwtActToProfile();

	}

	@Then("^Added Admin Twitter Channel Should be added$")
	public void added_Admin_Twitter_Channel_Should_be_added() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();
		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		ProfileHomeAction homeAction = new ProfileHomeAction();
		SimplifyUtils sutils = new SimplifyUtils();
		OpenModule open = new OpenModule();

		open.openListenHome();

		homeAction.editProfile(PROFILE_NAME);

		sutils.waitForElementToBeClickable(profileCreation.createNewProfile, 3);

		profileCreation.profileSocialChannels.click();

		profileAction.expandTwtSourceSlider();

		List<String> pagesToMatch = profileAction.getAddedAdminTwts();

		try 
		{
			assertTrue(pagesToMatch.contains(TWT_ADDED_ACT));
		}
		catch (Exception e) 
		{
			log.error("Error Would be: ",e);
			Assert.fail();		
		}

	}

	@When("^User Add Non-Admin Twitter Channel$")
	public void user_Add_Non_Admin_Twitter_Channel() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.addNonAdminTwtActToProfile("englandcricket");

	}

	//===========================Facebook Groups===========================//
	@When("^User imports an Facebook Group$")
	public void user_imports_an_Facebook_Group() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.importFbGrpsToProfile();

	}

	@Then("^Imported Facebook Group Should be Added to the Profile$")
	public void imported_Facebook_Group_Should_be_Added_to_the_Profile() throws Throwable {

	}

	@When("^User Add Admin Facebook Group$")
	public void user_Add_Admin_Facebook_Group() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.addAdminFbGrpToProfile("F1 2016");
	}

	@Then("^Added Admin Facebook Group Should be added$")
	public void added_Admin_Facebook_Group_Should_be_added() throws Throwable {

	}

	//===========================YouTube Channels===========================//
	@When("^User imports an YouTube Channel$")
	public void user_imports_an_YouTube_Channel() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.importYTChannelToProfile();
	}

	@Then("^Imported YouTube Channel Should be Added to the Profile$")
	public void imported_YouTube_Channel_Should_be_Added_to_the_Profile() throws Throwable {


	}

	@When("^User Add Admin YouTube Channel$")
	public void user_Add_Admin_YouTube_Channel() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.expandYTChannelSlider();

		YT_ADDED_ACT = profileAction.addAdminYtChannelToProfile();

	}

	@Then("^Added Admin YouTube Channel Should be added$")
	public void added_Admin_YouTube_Channel_Should_be_added() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();
		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		ProfileHomeAction homeAction = new ProfileHomeAction();
		SimplifyUtils sutils = new SimplifyUtils();
		OpenModule open = new OpenModule();

		open.openListenHome();

		homeAction.editProfile(PROFILE_NAME);

		sutils.waitForElementToBeClickable(profileCreation.createNewProfile, 3);

		profileCreation.profileSocialChannels.click();

		profileAction.expandYTChannelSlider();

		List<String> channelsToMatch = profileAction.getAddedAdminYtChnls();

		try 
		{
			assertTrue(channelsToMatch.contains(YT_ADDED_ACT));
		}
		catch (Exception e) 
		{
			log.error("Error Would be: ",e);
			Assert.fail();		
		}

	}

	//===========================Tumblr Blogs===========================//
	@When("^User imports an Tumblr Blog$")
	public void user_imports_an_Tumblr_Blog() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.importTumblrBlgsToProfile();

	}

	@Then("^Imported Tumblr Blog Should be Added to the Profile$")
	public void imported_Tumblr_Blog_Should_be_Added_to_the_Profile() throws Throwable {
	}

	@When("^User Add Admin Tumblr Blog$")
	public void user_Add_Admin_Tumblr_Blog() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.addAdminTumblrBlgsToProfile("alexxm360");

	}

	@Then("^Added Admin Tumblr Blog Should be added$")
	public void added_Admin_Tumblr_Blog_Should_be_added() throws Throwable {

	}

	//===========================Linkedin Company Pages===========================//
	@When("^User imports an Linkedin Company Page$")
	public void user_imports_an_Linkedin_Company_Page() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.importTumblrBlgsToProfile();

	}

	@Then("^Imported Linkedin Company Page Should be Added to the Profile$")
	public void imported_Linkedin_Company_Page_Should_be_Added_to_the_Profile() throws Throwable {

	}

	@When("^User Add Admin Linkedin Company Page$")
	public void user_Add_Admin_Linkedin_Company_Page() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.expandLkdnCompSlider();

		LKDN_ADDED_PAGE = profileAction.addAdminLkdnCompToProfile();

	}

	@Then("^Added Admin Linkedin Company Page Should be added$")
	public void added_Admin_Linkedin_Company_Page_Should_be_added() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();
		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		ProfileHomeAction homeAction = new ProfileHomeAction();
		SimplifyUtils sutils = new SimplifyUtils();
		OpenModule open = new OpenModule();

		open.openListenHome();

		homeAction.editProfile(PROFILE_NAME);

		sutils.waitForElementToBeClickable(profileCreation.createNewProfile, 3);

		profileCreation.profileSocialChannels.click();

		profileAction.expandLkdnCompSlider();

		List<String> channelsToMatch = profileAction.getAddedAdminLkdnCompPgs();

		try 
		{
			assertTrue(channelsToMatch.contains(LKDN_ADDED_PAGE));
		}
		catch (Exception e) 
		{
			log.error("Error Would be: ",e);
			Assert.fail();		
		}

	}

	//===========================Instagram Perosnal Account===========================//
	@When("^User imports an Instagram Channel$")
	public void user_imports_an_Instagram_Channel() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.importInstaActToProfile();

	}

	@Then("^Imported Instagram Channel Should be Added to the Profile$")
	public void imported_Instagram_Channel_Should_be_Added_to_the_Profile() throws Throwable {
	}

	@When("^User Add Admin Personal Instagram Channel$")
	public void user_Add_Admin_Instagram_Channel() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.expandInstaSlider();

		INSTA_ACCT_PERSONAL = profileAction.addAdminInstaActToProfile();

	}

	@Then("^Added Admin Instagram Personal Channel Should be added$")
	public void added_Admin_Instagram_Channel_Should_be_added() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();
		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		ProfileHomeAction homeAction = new ProfileHomeAction();
		SimplifyUtils sutils = new SimplifyUtils();
		OpenModule open = new OpenModule();

		open.openListenHome();

		homeAction.editProfile(PROFILE_NAME);

		sutils.waitForElementToBeClickable(profileCreation.createNewProfile, 3);

		profileCreation.profileSocialChannels.click();

		profileAction.expandInstaSlider();

		List<String> channelsToMatch = profileAction.getAddedAdminIgPer();

		try 
		{
			assertTrue(channelsToMatch.contains(INSTA_ACCT_PERSONAL));
		}
		catch (Exception e) 
		{
			log.error("Error Would be: ",e);
			Assert.fail();		
		}
	}

	//===========================Instagram Business Account===========================//
	@When("^User imports an Instagram Business Channel$")
	public void user_imports_an_Instagram_Business_Channel() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.importInstaActToProfile();

	}

	@Then("^Imported Instagram Business Channel Should be Added to the Profile$")
	public void imported_Instagram_Business_Channel_Should_be_Added_to_the_Profile() throws Throwable {
	}

	@When("^User Add Admin Business Instagram Channel$")
	public void user_Add_Admin_Instagram_Business_Channel() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.expandInstaBusSlider();

		INSTA_ACCT_BUS = profileAction.addAdminInstaBusActToProfile();

	}

	@Then("^Added Admin Instagram Business Channel Should be added$")
	public void added_Admin_Instagram_Business_Channel_Should_be_added() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();
		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		ProfileHomeAction homeAction = new ProfileHomeAction();
		SimplifyUtils sutils = new SimplifyUtils();
		OpenModule open = new OpenModule();

		open.openListenHome();

		homeAction.editProfile(PROFILE_NAME);

		sutils.waitForElementToBeClickable(profileCreation.createNewProfile, 3);

		profileCreation.profileSocialChannels.click();

		profileAction.expandInstaBusSlider();

		List<String> channelsToMatch = profileAction.getAddedAdminIgBusChnls();

		try 
		{
			assertTrue(channelsToMatch.contains(INSTA_ACCT_BUS));
		}
		catch (Exception e) 
		{
			log.error("Error Would be: ",e);
			Assert.fail();		
		}
	}

	//===========================Google Plus Pages===========================//
	@When("^User imports an Google Plus Page$")
	public void user_imports_an_Google_Plus_Page() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.importGpPageToProfile();

	}

	@Then("^Imported Google Plus Page Should be Added to the Profile$")
	public void imported_Google_Plus_Page_Should_be_Added_to_the_Profile() throws Throwable {
	}

	@When("^User Add Admin Google Plus Page$")
	public void user_Add_Admin_Google_Plus_Page() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.expandGpPageSlider();

		ADDED_GOOGLE_PLUS_PAGE = profileAction.addOneAdminGpPageToProfile();

	}

	@Then("^Added Admin Google Plus Page Should be added$")
	public void added_Admin_Google_Plus_Page_Should_be_added() throws Throwable {
		
		ProfileCreationAction profileAction = new ProfileCreationAction();
		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		ProfileHomeAction homeAction = new ProfileHomeAction();
		SimplifyUtils sutils = new SimplifyUtils();
		OpenModule open = new OpenModule();

		open.openListenHome();

		homeAction.editProfile(PROFILE_NAME);

		sutils.waitForElementToBeClickable(profileCreation.createNewProfile, 3);

		profileCreation.profileSocialChannels.click();

		profileAction.expandGpPageSlider();

		List<String> channelsToMatch = profileAction.getAddedAdminGpPages();

		try 
		{
			assertTrue(channelsToMatch.contains(ADDED_GOOGLE_PLUS_PAGE));
		}
		catch (Exception e) 
		{
			log.error("Error Would be: ",e);
			Assert.fail();		
		}


	}

	//===========================We Chat Accounts===========================//
	@When("^User imports an WeChat Account$")
	public void user_imports_an_WeChat_Account() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.importWeChatToProfile();

	}

	@Then("^Imported WeChat Account Should be Added to the Profile$")
	public void imported_WeChat_Account_Should_be_Added_to_the_Profile() throws Throwable {

	}

	@When("^User Add Admin WeChat Account$")
	public void user_Add_Admin_WeChat_Account() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.expandYTChannelSlider();

		profileAction.addAdminWeChatToProfile();

	}

	@Then("^Added Admin WeChat Account Should be added$")
	public void added_Admin_WeChat_Account_Should_be_added() throws Throwable {
	}

	//===========================Google Play Store===========================//
	@When("^User imports an Google Play App$")
	public void user_imports_an_Google_Play_App() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.importGplayToProfile();
	}

	@Then("^Imported Google Play App Should be Added to the Profile$")
	public void imported_Google_Play_App_Should_be_Added_to_the_Profile() throws Throwable {
	}

	@When("^User Add Admin Google Play App$")
	public void user_Add_Admin_Google_Play_App() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.expandYTChannelSlider();

		profileAction.addAdminGplayToProfile();

	}

	@Then("^Added Admin Google Play App Should be added$")
	public void added_Admin_Google_Play_App_Should_be_added() throws Throwable {


	}

	//================================ ITunes ===========================//
	@When("^User imports an Itunes App$")
	public void user_imports_an_Itunes_App() throws Throwable {

		ProfileCreationAction profileAction = new ProfileCreationAction();

		profileAction.expandYTChannelSlider();

		profileAction.importITunesChnlToProfile();

	}

	@Then("^Imported Itunes App Should be Added to the Profile$")
	public void imported_Itunes_App_Should_be_Added_to_the_Profile() throws Throwable {
	}


}
