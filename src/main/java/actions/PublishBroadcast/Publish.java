package actions.PublishBroadcast;

import helpers.SimplifyUtils;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageobjects.publish.UICompose;
import pageobjects.publish.UIPublish;

public class Publish {
	
	final Logger log = Logger.getLogger(this.getClass().getName());
	
	WebDriver driver;

	
	public Boolean checkMessageIsScheduled(String message, String channelNameToCheck, String channelTypeToCheck){

		UIPublish uiPublish = new UIPublish(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();

		Boolean isMessageScheduled = null;

		simplifyUtils.pageRefresh();

//		simplifyUtils.waitTillElementFound(uiPublish.scheduledMessages, 60);
		simplifyUtils.pause(30);

		uiPublish.scheduledMessages.click();

		simplifyUtils.pause(5000);

		int pageCount = Integer.parseInt( uiPublish.totalPages.getText());// pages present in scheduled section

		int messageRow = 0;  

		String currentChannel = null;

		String currentChannelType = null;

		int messagesCount = uiPublish.listOfTextInMessagesSocial.size(); //count of messages in current page

		for (int j = 0; j < pageCount; j++) 
		{

			for (int i = 0; i < messagesCount; i++)

			{
				//getting message text from each messages present in this module and matching with the message required

				if (uiPublish.listOfTextInMessagesSocial.get(i).getText().contains(message)) {

					messageRow = i;

					messageRow++;

					break;
				}

			}

			if (messageRow == 0 && pageCount > 1 && j < pageCount) //if the message is not present in first page

			{

				uiPublish.navigateToNextPage.click();

				simplifyUtils.pause(3000);

				messagesCount = uiPublish.listOfTextInMessagesSocial.size();

				isMessageScheduled = false;

			}

			else if(messageRow>0) 

			{
				isMessageScheduled = false;

				break; // if the message is present in the page come out of the second for loop
			}

		}

		if (messageRow > 0) 
		{

			currentChannel = driver.findElement(By.xpath("//*[@id='inbox-wrapper']//tr[" + messageRow+ "]//td[2]//div[@class='profile-pic']")).getAttribute("data-original-title");

			currentChannelType = driver.findElement(By.xpath("//*[@id='inbox-wrapper']//tr[" + messageRow+ "]//td[2]//span")).getAttribute("class");

			if(currentChannel.equalsIgnoreCase(channelNameToCheck) && currentChannelType.contains(channelTypeToCheck))
			{

				isMessageScheduled = true;

			}
			else
			{

				isMessageScheduled = false;

			}
		}

		return isMessageScheduled;
	}

	/*	public Boolean checkMessageIsSent(String message, String channelNameToCheck, String channelTypeToCheck){

		UIPublish uiPublish = new UIPublish(driver);

		Boolean isMessageSent = null;

		uiPublish.sentMessages.click();

		SimplifyUtils.waitTillElementFound(uiPublish.currentPageNumber, 60);

		int pageCount = Integer.parseInt( uiPublish.totalPages.getText());

		for (int j=1; j< pageCount;j++)
		{

			int messagesCount = uiPublish.listOfTextInMessages.size();

			for (int i = 0; i < messagesCount; i++) 
			{

				//matching the text of the required message sent with the messages present in the sent messages

				if (uiPublish.listOfTextInMessages.get(i).getText().equalsIgnoreCase(message)) 
				{
					String currentChannel = driver.findElements(By.xpath("//*[@id='inbox-wrapper']//tr["+ (i + 1)+ "]//td[2]//div[@class='profile-pic']")).get(i).getAttribute("data-original-title");

					SimplifyUtils.s360sleep(2000);

					if (currentChannel.equalsIgnoreCase(channelNameToCheck)) 
					{
						String currentChannelType = driver.findElements(By.xpath("//*[@id='inbox-wrapper']//tr["+ (i + 1) + "]//td[2]//span")).get(i).getAttribute("class");

						SimplifyUtils.s360sleep(2000);

						if (currentChannelType.contains(channelTypeToCheck)) 
						{
							isMessageSent = true;

							break;

						}

					}
				}
				else
				{
					isMessageSent = false;

				}

			}

			if (isMessageSent == false) 
			{
				//navigating to naxt page if the condition is not matched

				uiPublish.navigateToNextPage.click();

				messagesCount = uiPublish.listOfTextInMessages.size();

			}
			else if(isMessageSent == true)
			{
				break;
			}

		}
		return isMessageSent;		
	}
	 */

	public Boolean checkMessageIsSent(String message){

		UIPublish uiPublish = new UIPublish(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		Boolean isMessageSent = false;

		sutils.pageRefresh();
		sutils.waitTillPageLoad(10);
		sutils.pause(10000);
		
		uiPublish.sentMessages.click();

		sutils.pause(10000);

		int pageCount = Integer.parseInt( uiPublish.totalPages.getText());

		int messagesCount = uiPublish.listOfTextInMessagesSocial.size();

		//Iterating through the pages
		for (int currentPageCount = 0; currentPageCount < pageCount; currentPageCount++) 

		{
			//Iterating through the messages
			for (int i = 0; i < messagesCount; i++)

			{
				log.info(currentPageCount+"page count" +pageCount+"==> "+uiPublish.listOfTextInMessagesSocial.get(i).getText()+"==> "+uiPublish.listOfTextInMessagesSocial.get(i).getText().contains(message));

				//getting message text from each messages present in this module and matching with the message required
				if (uiPublish.listOfTextInMessagesSocial.get(i).getText().contains(message)) 

				{
					isMessageSent = true;

					break;
				}

			}
		}
			
		return isMessageSent;

	}
	
	public Boolean checkMessageIsSent(String message, String channelNameToCheck, String channelTypeToCheck){

		UIPublish uiPublish = new UIPublish(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();

		Boolean isMessageSent = null;

		simplifyUtils.pageRefresh();

//		simplifyUtils.waitTillElementFound(uiPublish.sentMessages, 60);
		simplifyUtils.pause(30);

		uiPublish.sentMessages.click();

		simplifyUtils.pause(3000);

		int pageCount = Integer.parseInt( uiPublish.totalPages.getText());

		int messageRow = 0;

		String currentChannel = null;

		String currentChannelType = null;

		int messagesCount = uiPublish.listOfTextInMessagesSocial.size();

		for (int j = 0; j < pageCount; j++) 

		{

			for (int i = 0; i < messagesCount; i++)

			{
				System.err.println(j+"page count" +pageCount+"==> "+uiPublish.listOfTextInMessagesSocial.get(i).getText()+"==> "+uiPublish.listOfTextInMessagesSocial.get(i).getText().contains(message));

				//getting message text from each messages present in this module and matching with the message required
				if (uiPublish.listOfTextInMessagesSocial.get(i).getText().contains(message)) 

				{
					messageRow = i;

					messageRow++;

					break;
				}

			}

			if (messageRow == 0 && pageCount > 1 && j < pageCount)

			{

				uiPublish.navigateToNextPage.click();

				simplifyUtils.pause(3000);

				messagesCount = uiPublish.listOfTextInMessagesSocial.size();

				isMessageSent = false;
			}

			else

			{
				isMessageSent = false;

				break;
			}

		}

		if (messageRow > 0) 
		{

			currentChannel = driver.findElement(By.xpath("//*[@id='inbox-wrapper']//tr[" + messageRow+ "]//td[2]//div[@class='profile-pic']")).getAttribute("data-original-title");

			currentChannelType = driver.findElement(By.xpath("//*[@id='inbox-wrapper']//tr[" + messageRow+ "]//td[2]//span")).getAttribute("class");

			if(currentChannel.equalsIgnoreCase(channelNameToCheck) && currentChannelType.contains(channelTypeToCheck))
			{

				isMessageSent = true;

			}

			else

			{

				isMessageSent = false;

			}
		}

		return isMessageSent;

	}

	public Boolean checkMessageIsFailed(String message, String channelNameToCheck, String channelTypeToCheck){

		UIPublish uiPublish = new UIPublish(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();

		Boolean isMessageFailed = null;

		simplifyUtils.pageRefresh();

//		simplifyUtils.waitTillElementFound(uiPublish.FailedMessages, 60);
		simplifyUtils.pause(30);

		uiPublish.FailedMessages.click();

		simplifyUtils.pause(5000);

		int pageCount = Integer.parseInt( uiPublish.totalPages.getText());

		int messageRow = 0;

		String currentChannel = null;

		String currentChannelType = null;

		int messagesCount = uiPublish.listOfTextInMessagesSocial.size();

		for (int j = 0; j < pageCount; j++) {

			for (int i = 0; i < messagesCount; i++)

			{

				//getting message text from each messages present in this module and matching with the message required
				if (uiPublish.listOfTextInMessagesSocial.get(i).getText().contains(message)) 

				{
					messageRow = i;

					messageRow++;

					break;
				}

			}
			if (messageRow == 0 && pageCount > 1 && j < pageCount)

			{
				uiPublish.navigateToNextPage.click();

				simplifyUtils.pause(3000);

				messagesCount = uiPublish.listOfTextInMessagesSocial.size();

				isMessageFailed = false;
			}

			else

			{
				isMessageFailed = false;

				break;
			}

		}

		if (messageRow > 0) 
		{

			currentChannel = driver.findElement(By.xpath("//*[@id='inbox-wrapper']//tr[" + messageRow+ "]//td[2]//div[@class='profile-pic']")).getAttribute("data-original-title");

			currentChannelType = driver.findElement(By.xpath("//*[@id='inbox-wrapper']//tr[" + messageRow+ "]//td[2]//span")).getAttribute("class");

			if(currentChannel.equalsIgnoreCase(channelNameToCheck) && currentChannelType.contains(channelTypeToCheck))
			{

				isMessageFailed = true;

			}

			else

			{

				isMessageFailed = false;

			}
		}

		return isMessageFailed;	
	}



}
