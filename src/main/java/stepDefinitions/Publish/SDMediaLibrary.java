package stepDefinitions.Publish;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import actions.LogInAction;
import actions.OpenModule;
import actions.PublishBroadcast.MediaLibAction;
import actions.PublishBroadcast.PublishNewMsg;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import helpers.Hooks;
import helpers.SimplifyUtils;
import pageobjects.UIMenu;
import pageobjects.publish.UIMediaLibrary;

public class SDMediaLibrary {

	final Logger log = Logger.getLogger(this.getClass().getName());

	WebDriver driver;
	String MEDIA_TITLE;
	String MEDIA_DESCRIPTION;

	public SDMediaLibrary()
	{
		driver = Hooks.driver;
	}

	@Given("^User is in Media Library$")
	public void User_is_in_Media_Library() {

		LogInAction login = new LogInAction();
		OpenModule nav = new OpenModule();

		login.loginAsOwner();

		nav.openMediaLib();
		
	}

	//	@When("^Upload an Image$")
	@When("^Upload an Image to Media Library$")
	public void Upload_an_Image(){

		MediaLibAction libAction = new MediaLibAction();
		SimplifyUtils sutils = new SimplifyUtils();

		MEDIA_TITLE="Media"+sutils.profileNameGen().substring(4);
		MEDIA_DESCRIPTION="Media"+sutils.profileNameGen().substring(4);

		libAction.uploadImage(MEDIA_TITLE,MEDIA_DESCRIPTION);
	}

	@Then("^Image should be added to the Media Library$")
	public void Image_should_be_added_to_the_Media_Library(){

		UIMediaLibrary libUI = new UIMediaLibrary(driver);
		MediaLibAction libAction = new MediaLibAction();

		libAction.filterByMediaName(MEDIA_TITLE);

		String resultedMedia = libUI.mediaTitle.get(0).getText().substring(6);

		try 
		{
			Assert.assertEquals(resultedMedia,MEDIA_TITLE);
		} 
		catch (Exception e) 
		{
			log.error("Error Would be: ",e);
			Assert.fail();
		}

	}

	@When("^Delete the Image$")
	public void Delete_the_Image() {

		MediaLibAction libAction = new MediaLibAction();

		libAction.filterByMediaName(MEDIA_TITLE);

		libAction.deleteMedia();

	}

	@Then("^Image should be deleted$")
	public void Image_should_be_deleted(){

		MediaLibAction libAction = new MediaLibAction();
		UIMediaLibrary libUI = new UIMediaLibrary(driver);

		libAction.filterByMediaName(MEDIA_TITLE);

		try 
		{
			Assert.assertTrue(libUI.updatedBy.size()==0);
		}
		catch (Exception e) 
		{
			log.error("Error Would be: ",e);
			Assert.fail();
		}

	}

	@When("^Edit and Update the Image$") 
	public void Edit_and_Update_the_Image(){

		MediaLibAction libAction = new MediaLibAction();
		UIMediaLibrary libUI = new UIMediaLibrary(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		libAction.editMedia(MEDIA_TITLE);

		libUI.titleOfMedia.clear();
		libUI.titleOfMedia.sendKeys(MEDIA_TITLE+"Updated");

		sutils.pause(500);

		sutils.scrollInToView(libUI.updateMedia);
		libUI.updateMedia.click();

		sutils.waitForElementToBeClickable(libUI.addNewMedia, 2000);

	};

	@Then("^Image should be Updated$")
	public void Image_should_be_Updated(){

		MediaLibAction libAction = new MediaLibAction();
		UIMediaLibrary libUI = new UIMediaLibrary(driver);

		libAction.filterByMediaName(MEDIA_TITLE+"Updated");

		try 
		{
			Assert.assertEquals(MEDIA_TITLE+"Updated",libUI.mediaTitle.get(0).getText().substring(6));
		}
		catch (Exception e) 
		{
			log.error("Error Would be: ",e);
			Assert.fail();
		}

	};

}
