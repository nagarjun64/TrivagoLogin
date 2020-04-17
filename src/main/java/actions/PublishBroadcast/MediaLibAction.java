package actions.PublishBroadcast;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.support.ui.ExpectedConditions;

import helpers.Hooks;
import helpers.SimplifyUtils;
import pageobjects.UIMenu;
import pageobjects.publish.UIMediaLibrary;

public class MediaLibAction {

	WebDriver driver;
	final Logger log = Logger.getLogger(this.getClass().getName());

	public MediaLibAction(){

		driver = Hooks.driver;

	}

	public void uploadImage(){

		UIMediaLibrary lib = new UIMediaLibrary(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		File file = new File("src/test/resources/testData/twt_Pic.jpg");

		//Clicking on add new media button in home screen
		sutils.pause(500);
		lib.addNewMedia.click();

		//Waiting for the elements to see the form is completed loaded
		sutils.waitTillElementFound(lib.titleOfMedia, 5);
		sutils.waitForElementToBeClickable(lib.saveMedia, 5);
		sutils.pause(1000);

		//Filling Title and Description
		lib.titleOfMedia.sendKeys("Media"+sutils.profileNameGen().substring(4));
		lib.descOfMedia.sendKeys("Media"+sutils.profileNameGen().substring(4));

		//Uploading Media
		sutils.pause(1000);
		sutils.scrollInToView(lib.imageUpload);
		lib.imageUpload.sendKeys(file.getAbsolutePath());
		sutils.waitTillElementFound(lib.cancelUploadedImg, 600);

		//Entering Tags
		lib.mediaTags.sendKeys("AutoUploadImage1");
		lib.mediaTags.sendKeys(Keys.TAB);
		lib.mediaTags.sendKeys("AutoUploadImage12");
		lib.mediaTags.sendKeys(Keys.TAB);
		sutils.pause(1000);

		lib.saveMedia.click();

		sutils.waitForElementToBeClickable(lib.addNewMedia, 300);

	}

	public void uploadImage(String MediaName, String MediaDescription){

		UIMediaLibrary lib = new UIMediaLibrary(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		File file = new File("src/test/resources/testData/twt_Pic.jpg");

		//Clicking on add new media button in home screen
		sutils.pause(500);
		sutils.waitForElementToBeClickable(lib.addNewMedia, 5);
		lib.addNewMedia.click();

		//Waiting for the elements to see the form is completed loaded
		sutils.waitTillElementFound(lib.titleOfMedia, 5);
		sutils.waitForElementToBeClickable(lib.saveMedia, 5);
		sutils.pause(1000);

		//Filling Title and Description
		lib.titleOfMedia.sendKeys(MediaName);
		lib.descOfMedia.sendKeys(MediaDescription);

		//Uploading Media
		sutils.pause(1000);
		sutils.scrollInToView(lib.imageUpload);
		lib.imageUpload.sendKeys(file.getAbsolutePath());
		sutils.waitTillElementFound(lib.cancelUploadedImg, 600);

		//Entering Tags
		lib.mediaTags.sendKeys("AutoUploadImage1");
		lib.mediaTags.sendKeys(Keys.TAB);
		lib.mediaTags.sendKeys("AutoUploadImage12");
		lib.mediaTags.sendKeys(Keys.TAB);
		sutils.pause(1000);

		lib.saveMedia.click();

		sutils.waitForElementToBeClickable(lib.addNewMedia, 2000);

	}

	public void uploadImage(String MediaName, String MediaDescription, String Tag1, String Tag2){

		UIMediaLibrary lib = new UIMediaLibrary(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		File file = new File("src/test/resources/testData/twt_Pic.jpg");

		//Clicking on add new media button in home screen
		sutils.pause(500);
		sutils.waitForElementToBeClickable(lib.addNewMedia, 5);
		lib.addNewMedia.click();

		//Waiting for the elements to see the form is completed loaded
		sutils.waitTillElementFound(lib.titleOfMedia, 5);
		sutils.waitForElementToBeClickable(lib.saveMedia, 5);
		sutils.pause(1000);

		//Filling Title and Description
		lib.titleOfMedia.sendKeys(MediaName);
		lib.descOfMedia.sendKeys(MediaDescription);

		//Uploading Media
		sutils.pause(1000);
		sutils.scrollInToView(lib.imageUpload);
		lib.imageUpload.sendKeys(file.getAbsolutePath());
		sutils.waitTillElementFound(lib.cancelUploadedImg, 600);

		//Entering Tags
		lib.mediaTags.sendKeys(Tag1);
		lib.mediaTags.sendKeys(Keys.TAB);
		lib.mediaTags.sendKeys(Tag2);
		lib.mediaTags.sendKeys(Keys.TAB);
		sutils.pause(1000);

		lib.saveMedia.click();

		sutils.waitForElementToBeClickable(lib.addNewMedia, 2000);

	}

	public void uploadImage(String MediaName, String MediaDescription, String Tag1, String Tag2, String Tag3){

		UIMediaLibrary lib = new UIMediaLibrary(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		File file = new File("src/test/resources/testData/twt_Pic.jpg");

		//Clicking on add new media button in home screen
		sutils.pause(500);
		sutils.waitForElementToBeClickable(lib.addNewMedia, 5);
		lib.addNewMedia.click();

		//Waiting for the elements to see the form is completed loaded
		sutils.waitTillElementFound(lib.titleOfMedia, 5);
		sutils.waitForElementToBeClickable(lib.saveMedia, 5);
		sutils.pause(1000);

		//Filling Title and Description
		lib.titleOfMedia.sendKeys(MediaName);
		lib.descOfMedia.sendKeys(MediaDescription);

		//Uploading Media
		sutils.pause(1000);
		sutils.scrollInToView(lib.imageUpload);
		lib.imageUpload.sendKeys(file.getAbsolutePath());
		sutils.waitTillElementFound(lib.cancelUploadedImg, 600);

		//Entering Tags
		lib.mediaTags.sendKeys(Tag1);
		lib.mediaTags.sendKeys(Keys.TAB);
		lib.mediaTags.sendKeys(Tag2);
		lib.mediaTags.sendKeys(Keys.TAB);
		lib.mediaTags.sendKeys(Tag3);
		lib.mediaTags.sendKeys(Keys.TAB);
		sutils.pause(1000);

		lib.saveMedia.click();

		sutils.waitForElementToBeClickable(lib.addNewMedia, 2000);

	}

	public void uploadVideos(){

		UIMediaLibrary lib = new UIMediaLibrary(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		File file = new File("src/test/resources/testData/twt_Video.mp4");

		//Clicking on add new media button in home screen
		sutils.pause(500);
		lib.addNewMedia.click();

		//Waiting for the elements to see the form is completed loaded
		sutils.waitTillElementFound(lib.titleOfMedia, 5);
		sutils.waitForElementToBeClickable(lib.saveMedia, 5);
		sutils.pause(1000);

		//Filling all the details to add media
		lib.titleOfMedia.sendKeys("Media"+sutils.profileNameGen().substring(4));
		lib.descOfMedia.sendKeys("Media"+sutils.profileNameGen().substring(4));

		//Uploading Media
		sutils.pause(1000);
		sutils.scrollInToView(lib.videoUpload);
		lib.videoUpload.sendKeys(file.getAbsolutePath());
		sutils.waitTillElementFound(lib.cancelUploadedVid, 600);

		//Entering Tags
		lib.mediaTags.sendKeys("AutoUploadVideo1");
		lib.mediaTags.sendKeys(Keys.TAB);
		lib.mediaTags.sendKeys("AutoUploadVideo2");
		lib.mediaTags.sendKeys(Keys.TAB);
		sutils.pause(1000);

		lib.saveMedia.click();

		sutils.waitForElementToBeClickable(lib.addNewMedia, 300);

	}

	public void uploadVideos(String MediaName, String MediaDescription){

		UIMediaLibrary lib = new UIMediaLibrary(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		File file = new File("src/test/resources/testData/twt_Video.mp4");

		//Clicking on add new media button in home screen
		sutils.pause(500);
		lib.addNewMedia.click();

		//Waiting for the elements to see the form is completed loaded
		sutils.waitTillElementFound(lib.titleOfMedia, 5);
		sutils.waitForElementToBeClickable(lib.saveMedia, 5);
		sutils.pause(1000);

		//Filling all the details to add media
		lib.titleOfMedia.sendKeys(MediaName);
		lib.descOfMedia.sendKeys(MediaDescription);

		//Uploading Media
		sutils.pause(1000);
		sutils.scrollInToView(lib.videoUpload);
		lib.videoUpload.sendKeys(file.getAbsolutePath());
		sutils.waitTillElementFound(lib.cancelUploadedVid, 600);

		//Entering Tags
		lib.mediaTags.sendKeys("AutoUploadVideo1");
		lib.mediaTags.sendKeys(Keys.TAB);
		lib.mediaTags.sendKeys("AutoUploadVideo2");
		lib.mediaTags.sendKeys(Keys.TAB);
		sutils.pause(1000);

		lib.saveMedia.click();

		sutils.waitForElementToBeClickable(lib.addNewMedia, 300);

	}

	public void filterByMediaName(String Media_Name) {

		UIMediaLibrary libUI = new UIMediaLibrary(driver);
		UIMenu menu = new UIMenu(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		try 
		{
			driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
			libUI.closeSuccessNotification.click();	
		} 
		catch (Exception e) 
		{
			log.error("GetCause"+ e.getCause());
		}

		JavascriptExecutor js = (JavascriptExecutor)driver;
		String className = (String) js.executeScript("return document.getElementById('chat-users').getAttribute('class');");

		if(!className.contains("visible")) 
		{
			libUI.accessFilters.click();	
		}

		className = (String) js.executeScript("return document.getElementById('chat-users').getAttribute('class');");

		if(className.contains("visible")) 
		{
			libUI.searchMediaName.clear();
			libUI.searchMediaName.sendKeys(Media_Name);
		}
		sutils.pause(1000);

		className = (String) js.executeScript("return document.getElementById('chat-users').getAttribute('class');");

		if(className.contains("visible")) 
		{
			try 
			{
				driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
				libUI.closeDeleteNotification.click();
			} 
			catch (Exception e) 
			{
				log.error("GetCause"+ e.getCause());
			}
			driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
			menu.applyFilterBtn.click();
		}

		sutils.pause(2000);
	}

	//Will delete first media returned after filtering with the name
	public void deleteMedia(String Media_Name) {

		UIMediaLibrary libUI = new UIMediaLibrary(driver);
		UIMenu menu = new UIMenu(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		try 
		{
			if(libUI.closeSuccessNotification.isDisplayed()) 
			{
				libUI.closeSuccessNotification.click();	
			}
		} 
		catch (Exception e) 
		{

			e.printStackTrace();
		}

		if(menu.applyFilterBtn.isDisplayed() == false) 
		{
			libUI.accessFilters.click();
		}

		sutils.waitForElementToBeClickable(menu.applyFilterBtn, 120);

		libUI.searchMediaName.sendKeys(Media_Name);

		sutils.pause(500);

		if(menu.applyFilterBtn.isDisplayed() == true) 
		{
			menu.applyFilterBtn.click();	
		}

		sutils.pause(2000);

		libUI.checkMedia.get(0).click();
		libUI.deleteMedia.click();

		sutils.waitForElementToBeClickable(libUI.confirmYes, 5);

		libUI.confirmYes.click();

	}

	//Will delete first media file resulted after filtering or with out filtering
	public void deleteMedia() {

		UIMediaLibrary libUI = new UIMediaLibrary(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		/*	if(libUI.closeSuccessNotification.isDisplayed()) 
		{
			libUI.closeSuccessNotification.click();	
		}*/

		libUI.checkMedia.get(0).click();
		libUI.deleteMedia.click();

		sutils.waitForElementToBeClickable(libUI.confirmYes, 5);

		libUI.confirmYes.click();

	}

	public void editMedia(String Media_Name) {

		UIMediaLibrary libUI = new UIMediaLibrary(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		this.filterByMediaName(Media_Name);

		libUI.editMedia.get(0).click();

		sutils.pause(2000);
		//		sutils.waitForElementToBeClickable(libUI.saveMedia, 5);
	}
}
