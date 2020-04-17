package actions.PublishBroadcast;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.Hooks;
import helpers.SimplifyUtils;
import pageobjects.publish.UICompose;
import pageobjects.publish.UIPublish;

public class PublishNewMsg {

	final Logger log = Logger.getLogger(this.getClass().getName());

	WebDriver driver;

	public PublishNewMsg(){

		driver = Hooks.driver;

	}

	public void openNewScheduleWindow(){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		
		sutils.waitForElementToBeClickable(compose.newMessageFromPublish, 5);
		sutils.pause(1000);
		
		compose.newMessageFromPublish.click();

		sutils.waitTillElementFound(compose.bulkAction, 60);
		sutils.pause(1000);

	}

	public void selectChannelsToPublish(){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitTillElementFound(compose.shrinkURL, 60);

		sutils.pause(3000);

		if (compose.selectAllChannelsToPublishList.size()>0) 
		{
			for (int i = 0 ; i < compose.selectAllChannelsToPublishList.size(); i++) 
			{
				WebElement ele = compose.selectAllChannelsToPublishList.get(i);

				if (ele.isSelected()==false)

					ele.click();
			}
		}
	}

	public void selectTwitterChannelsToPublish(int maxChannelsToSelect){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitTillElementFound(compose.shrinkURL, 60);

		sutils.pause(3000);

		if (compose.listOfAdminTwitterChannelsToPost.size()>0) 
		{
			for (int i = 0 ; i < compose.listOfAdminTwitterChannelsToPost.size(); i++) 
			{
				WebElement ele = compose.listOfAdminTwitterChannelsToPost.get(i);

				if (ele.isSelected()==false )
				{

					ele.click();

					if ( (maxChannelsToSelect - 1) == i)
					{

						break;
					}
				}
			}
		}
	}
	
	public void selectAllTwitterChannelsToPublish(){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitTillElementFound(compose.shrinkURL, 60);

		sutils.pause(3000);

		//checking if the twitter channels are present
		if (compose.listOfAdminTwitterChannelsToPost.size()>0) 
		{
			for (int i = 0 ; i < compose.listOfAdminTwitterChannelsToPost.size(); i++) 
			{
				WebElement ele = compose.listOfAdminTwitterChannelsToPost.get(i);

				if (ele.isSelected()==false )
				{
					ele.click();
				}
			}
		}
	}

	public void selectTwitterAccountToPublish(String channelNameToSelect){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitTillElementFound(compose.shrinkURL, 60);

		sutils.pause(3000);

		if (compose.selectAllChannelsToPublishList.size()>0) 
		{
			for (int i = 0 ; i < compose.listOfAdminTwitterChannelsToPost.size(); i++) 
			{
				WebElement channelToSelect = compose.listOfAdminTwitterChannelsToPost.get(i); //which channel to select

				WebElement currentChannelName = compose.twtChannelName.get(i); //select one channel at a time, one at a time to get the name 

				//getting the channel name
				if (currentChannelName.getAttribute("data-original-title").equalsIgnoreCase(channelNameToSelect))

				{
					if (channelToSelect.isSelected()==false )
					{
						channelToSelect.click();

						break;
					}
				}
			}
		}
	}

	public void selectFacebookAccountToPublish(int maxChannelsToSelect){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitTillElementFound(compose.shrinkURL, 60);

		sutils.pause(3000);

		if (compose.selectAllChannelsToPublishList.size()>0) 
		{
			System.err.println(compose.listOfFacebookAccountToPost.size());

			for (int i = 0 ; i < compose.listOfFacebookAccountToPost.size(); i++) 

			{
				WebElement ele = compose.listOfFacebookAccountToPost.get(i);

				if (ele.isSelected()==false )
				{
					ele.click();

					if ( (maxChannelsToSelect -1) == i)
					{

						break;
					}
				}
			}
		}
	}

	public void selectFacebookPagesToPublish(int maxChannelsToSelect){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitTillElementFound(compose.shrinkURL, 60);

		sutils.pause(3000);

		if (compose.selectAllChannelsToPublishList.size()>0) 
		{
			for (int i = 0 ; i < compose.listOfAdminFacebookPageToPost.size(); i++) 
			{
				WebElement ele = compose.listOfAdminFacebookPageToPost.get(i);

				if (ele.isSelected()==false )
				{

					System.err.println("page name "+driver.findElement(By.xpath("//*[starts-with(@id,'6Id')]//*[@class='social-profile-pic']")).getAttribute("data-original-title"));

					ele.click();

					if ( (maxChannelsToSelect -1) == i)
					{

						break;
					}
				}
			}
		}
	}

	public void selectFbPageToPublish(String channelNameToSelect){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitTillElementFound(compose.shrinkURL, 60);

		sutils.pause(3000);

		if (compose.selectAllChannelsToPublishList.size()>0) 
		{
			for (int i = 0 ; i < compose.listOfAdminFacebookPageToPost.size(); i++) 
			{
				WebElement channelToSelect = compose.listOfAdminFacebookPageToPost.get(i); //facebook check box to select

				WebElement currentChannelName = compose.fbPageName.get(i); //select one fb page, one at a time to get the name 

				//getting the channel name
				if (currentChannelName.getAttribute("data-original-title").equalsIgnoreCase(channelNameToSelect))

				{
					if (channelToSelect.isSelected()==false )
					{
						channelToSelect.click();

						break;
					}
				}
			}
		}
	}

	public void selectFacebookGroupsToPublish(int maxChannelsToSelect){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitTillElementFound(compose.shrinkURL, 60);

		sutils.pause(3000);

		if (compose.selectAllChannelsToPublishList.size()>0) 
		{
			for (int i = 0 ; i < compose.listOfFacebookGroupToPost.size(); i++) 
			{
				WebElement ele = compose.listOfFacebookGroupToPost.get(i);

				if (ele.isSelected()==false )
				{
					ele.click();

					if ( (maxChannelsToSelect -1) == i)
					{

						break;
					}
				}
			}
		}
	}

	public void selectLinkedinAccountToPublish(int maxChannelsToSelect){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitTillElementFound(compose.shrinkURL, 60);

		sutils.pause(3000);

		if (compose.selectAllChannelsToPublishList.size()>0) 
		{
			for (int i = 0 ; i < compose.listOfLinkedinAccountToPost.size(); i++) 
			{
				WebElement ele = compose.listOfLinkedinAccountToPost.get(i);

				if (ele.isSelected()==false )
				{
					ele.click();

					if ( (maxChannelsToSelect -1) == i)
					{

						break;
					}
				}			
			}
		}
	}

	public void selectLinkedinCompToPublish(int maxChannelsToSelect){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitTillElementFound(compose.shrinkURL, 60);

		sutils.pause(3000);

		if (compose.selectAllChannelsToPublishList.size()>0) 
		{
			for (int i = 0 ; i < compose.listOfLinkedinCompToPost.size(); i++) 
			{
				WebElement ele = compose.listOfLinkedinCompToPost.get(i);

				if (ele.isSelected()==false )
				{
					ele.click();

					if ( (maxChannelsToSelect -1) == i)
					{

						break;
					}
				}
			}
		}
	}

	public void selectYouTubeChannelsToPublish(int maxChannelsToSelect){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitTillElementFound(compose.shrinkURL, 60);

		sutils.pause(3000);

		if (compose.selectAllChannelsToPublishList.size()>0) 
		{
			for (int i = 0 ; i < compose.listOfYouTubeChannelsToPost.size(); i++) 
			{
				WebElement ele = compose.listOfYouTubeChannelsToPost.get(i);

				if (ele.isSelected()==false )
				{
					ele.click();

					if ( (maxChannelsToSelect -1) == i)
					{

						break;
					}
				}
			}
		}
	}

	public void selectGooglePlusPagesToPublish(int maxChannelsToSelect){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitTillElementFound(compose.shrinkURL, 60);

		sutils.pause(3000);

		if (compose.selectAllChannelsToPublishList.size()>0) 
		{
			for (int i = 0 ; i < compose.listOfGooglePlusToPost.size(); i++) 
			{
				WebElement ele = compose.listOfGooglePlusToPost.get(i);

				if (ele.isSelected()==false )
				{
					ele.click();

					if ( (maxChannelsToSelect -1) == i)
					{

						break;
					}
				}
			}
		}
	}

	public void selectTumblrBlogsToPublish(int maxChannelsToSelect){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitTillElementFound(compose.shrinkURL, 60);

		sutils.pause(3000);

		if (compose.selectAllChannelsToPublishList.size()>0) 
		{
			for (int i = 0 ; i < compose.listOfTumblrBlogs.size(); i++) 
			{
				WebElement ele = compose.listOfTumblrBlogs.get(i);

				if (ele.isSelected()==false )
				{
					ele.click();

					if ( (maxChannelsToSelect -1) == i)
					{

						break;
					}
				}
			}
		}
	}

	//========================================Message to publish===============================================//

	public String generateMessageToPublish(){

		SimplifyUtils sutils = new SimplifyUtils();

		String messageToPublish = "Source: Auto " + sutils.dateGenerator() + " Message: How's your day?";

		return messageToPublish;

	}

	public void enterMessageToPublish(String messageToPublish){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.pause(1000);
		
		sutils.scrollInToView(compose.messageToPublish);

		sutils.waitTillElementFound(compose.shrinkURL, 60);
		
		compose.messageToPublish.sendKeys(messageToPublish);

	}

	public void enterMessageTitle(String messageToPublish){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitTillElementFound(compose.shrinkURL, 60);

		compose.messageTitle.sendKeys(messageToPublish);

	}

	public void enterURLToPublish(){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitTillElementFound(compose.shrinkURL, 60);

		compose.urlToShrink.sendKeys("http://www.telegraph.co.uk/");

	}

	public void shrinkURL(){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitTillElementFound(compose.shrinkURL, 60);

		compose.shrinkURL.click();

	}

	public int messageLength(WebElement sourceSpecificCounterElement){

		String length = sourceSpecificCounterElement.getText();

		int messageLength = Integer.parseInt(length);

		return messageLength;
	}

	//========================================Media Upload===============================================//

	public void uploadPicture(){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		File file = new File("src/test/resources/testData/twt_Pic.jpg");

		sutils.scrollInToView(compose.pictureVideoTab);
		
		compose.pictureVideoTab.click();

		sutils.pause(1000);
		
		sutils.scrollInToView(compose.uploadPicture);

		compose.uploadPicture.sendKeys(file.getAbsolutePath());

		sutils.pause(5000);

	}

	public void waitForImageUploadToComplete(){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitTillElementFound(compose.imageUploadedDefaultThumbnail, 60);

	}

	public void uploadVideo(){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		compose.pictureVideoTab.click();

		sutils.pause(1000);

		compose.uploadVideo.sendKeys("src/test/resources/testData/twt_Video.mp4");

		sutils.pause(5000);
	}

	public void waitForVideoUploadToComplete(){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitTillElementFound(compose.videoUploadedDefaultThumbnail, 60);

	}

	public void createFbPageAlbum(String fbAlbumName , String fbAlbumDescription){

		UICompose compose = new UICompose(driver);

		compose.createFbPageAlbum.click();

		compose.FbPageAlbumName.sendKeys(fbAlbumName);

		compose.FbPageAlbumNameDescription.sendKeys(fbAlbumDescription);

		compose.saveFbAlbum.click();

	}

	public Boolean isFbPageAlbumCreated(String fbAlbum){

		UICompose compose = new UICompose(driver);

		compose.changeAlbum.click();

		Boolean albumIsPresent = null ; 

		if (compose.albumsList.size()>0)

		{
			for (int i = 0 ; i < compose.albumsList.size(); i++) 
			{
				WebElement ele = compose.albumsList.get(i);

				if(ele.getText().equalsIgnoreCase(fbAlbum))
				{
					albumIsPresent = true ; //return true if present

					break;
				}

				else
				{
					albumIsPresent = false ; //return false if not present
				}
			}
		}

		return albumIsPresent;

	}

	//========================================Target Option===============================================//

	public int countOfTargetValuesFbPage(){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		int targetOptions = 0;

		if (compose.targetBlock.isDisplayed()) {

			targetOptions = sutils.getCounOfAllValuesInDropDwown(compose.targetDropDownFBPage);
		}

		System.err.println(targetOptions);

		return targetOptions;

	}

	public void selectFbPageTargetOptions(String FbPageTargetOption){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.selectElementByVisibleText(compose.targetDropDownFBPage, FbPageTargetOption);

		if (compose.targetBlock.isDisplayed() && sutils.getCounOfAllValuesInDropDwown(compose.targetDropDownFBPage) > 0) {

			if (FbPageTargetOption.equalsIgnoreCase("Gender"))
			{
				sutils.selectElementByValue(compose.fbPageTargetOptionGender, "1");

				sutils.selectElementByValue(compose.fbPageTargetOptionGender, "2");
			}
			else if(FbPageTargetOption.equalsIgnoreCase("Target By Interests"))
			{
				compose.fbPageTargetOptionSelectInterests.click();

				sutils.pause(4000);

				compose.enterFbPageTargetInterests.sendKeys("bangalore");

				compose.searchFbPageInterests.click();

				sutils.pause(4000);

				//selecting all facebook interests
				if (compose.listOfFbPageInterests.size()>0) 
				{
					for (int i = 0 ; i < compose.listOfFbPageInterests.size(); i++) 
					{
						WebElement ele = compose.listOfFbPageInterests.get(i);

						if (ele.isSelected()==false )

							ele.click();
					}
				}

				compose.saveFbPageTargetInterests.click();

			}
			else if(FbPageTargetOption.equalsIgnoreCase("Relationship Status"))
			{

			}
			else if(FbPageTargetOption.equalsIgnoreCase("Educational Status"))
			{

			}
			else if(FbPageTargetOption.equalsIgnoreCase("Interested In"))
			{

			}
			else if(FbPageTargetOption.equalsIgnoreCase("Age"))
			{

			}
			else if(FbPageTargetOption.equalsIgnoreCase("Location"))
			{

			}
			else if(FbPageTargetOption.equalsIgnoreCase("Language"))
			{

			}
		}

	}

	public int countOfTargetValuesLinkedinComp(){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		int targetOptions = 0;

		compose.targetTab.click();

		if (compose.targetBlock.isDisplayed()) {

			targetOptions = sutils.getCounOfAllValuesInDropDwown(compose.targetDropDownLinkedinComp);
		}

		System.err.println(targetOptions);

		return targetOptions;

	}

	public void selectLinkedinCompTargetOption(String lkTargetOption){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		compose.targetTab.click();

		sutils.selectElementByVisibleText(compose.targetDropDownLinkedinComp, lkTargetOption);

		if (lkTargetOption.equalsIgnoreCase("Industry"))
		{
			sutils.selectElementByVisibleText(compose.lkCompTargetOptionIndustry, "Accounting");

			sutils.selectElementByVisibleText(compose.lkCompTargetOptionIndustry, "Biotechnology");
		}
		else if(lkTargetOption.equalsIgnoreCase("Job Function"))
		{
			sutils.selectElementByVisibleText(compose.lkCompTargetOptionJobFunction, "Research");

			sutils.selectElementByVisibleText(compose.lkCompTargetOptionJobFunction, "Education");

		}
		else if(lkTargetOption.equalsIgnoreCase("Seniority"))
		{
			sutils.selectElementByValue(compose.lkCompTargetOptionSeniority, "tr");

			sutils.selectElementByValue(compose.lkCompTargetOptionSeniority, "ic");

		}else if(lkTargetOption.equalsIgnoreCase("Geography"))
		{
			sutils.selectElementByValue(compose.lkCompTargetOptionGeography, "as.in");

			sutils.selectElementByValue(compose.lkCompTargetOptionGeography, "as");

		}
	}

	//========================================Scheduling Option===============================================//

	public void clickScheduleOptionsTab(){

		UICompose compose = new UICompose(driver);

		compose.schedulingOptions.click();

	}

	public void selectSendNowOption(){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		compose.schedulingOptions.click();

		sutils.radiobutton_Select(compose.sendNowOption);

	}

	public void sendMessageNow(){

		UICompose compose = new UICompose(driver);
		UIPublish publish = new UIPublish(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.pause(2000);

		compose.schedulingOptions.click();

		sutils.radiobutton_Select(compose.sendNowOption);

		compose.sendNowButton.click();

		sutils.waitForElementToBeClickable(publish.compose, 3000);

	}

	public void selectScheduleLaterOptionWithTime(){

		UICompose compose = new UICompose(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		//		sutils.scrolltoElementUsingCoordinates(UICompose.scheduleNow);

		compose.schedulingOptions.click();

		sutils.radiobutton_Select(compose.scheduleLater);

		compose.scheduleTimer.clear();

		compose.scheduleTimer.sendKeys(scheduleTime());

	}

	public void clickScheduleButton(){

		UICompose compose = new UICompose(driver);
		UIPublish publish = new UIPublish(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.pause(2000);

		compose.scheduleButton.click();

		sutils.waitForElementToBeClickable(publish.compose, 300);

	}

	public String scheduleTime(){

		//String date = "2016-12-09 03:43 PM";

		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm aa");

		//Date d = f.parse(date);

		Date d = new Date();

		Long millis = d.getTime() + 15 * 60 * 1000; // epoch time / unix time 

		Long mins = millis / 1000 / 60;

		Long round5 = mins / 5 + 1;

		Date d5 = new Date(round5 * 5 * 60 * 1000);

		String Time = f.format(d5);

		return Time;

	}


}
