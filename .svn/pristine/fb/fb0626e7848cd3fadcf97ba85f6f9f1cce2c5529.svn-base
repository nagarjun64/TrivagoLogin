package stepDefinitions.Publish;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

import actions.LogInAction;
import actions.OpenModule;
import actions.PublishBroadcast.Publish;
import actions.PublishBroadcast.PublishNewMsg;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import helpers.Hooks;
import helpers.SimplifyUtils;
import pageobjects.publish.UICompose;

public class SDPublishNewMessage {

	final Logger log = Logger.getLogger(this.getClass().getName());

	WebDriver driver;
	String MSG_TO_PUBLISH;

	public SDPublishNewMessage()
	{
		driver = Hooks.driver;
	}

	@Given("^User Navigates to New Message Compose Screen$") 
	public void User_Navigates_to_New_Message_Compose_Screen() {
		
		LogInAction login = new LogInAction();
		OpenModule nav = new OpenModule();
		PublishNewMsg publish = new PublishNewMsg();

		login.loginAsOwner();
		
		nav.openScheduledMessage();
		
		publish.openNewScheduleWindow();
		
	}

	@When("^Composes a Tweet$")
	public void Composes_a_Tweet(){
		
		PublishNewMsg publish = new PublishNewMsg();
		
		
		MSG_TO_PUBLISH = publish.generateMessageToPublish();
		
		publish.selectAllTwitterChannelsToPublish();
		publish.enterMessageToPublish(MSG_TO_PUBLISH);
//		publish.uploadPicture();
		publish.selectSendNowOption();

	}

	@When("^Sends the message$")
	public void Sends_the_message() {
		
		PublishNewMsg publish = new PublishNewMsg();
		Publish publishNew = new Publish();
		
		publish.sendMessageNow();

		log.error(publishNew.checkMessageIsSent(MSG_TO_PUBLISH));
	}

	@Then("^Message should be Successfuly Sent$")
	public void Message_should_be_Successfuly_Sent() {
		
		Publish publish = new Publish();
		Boolean isMessageSent;
		
		log.info(MSG_TO_PUBLISH);
		
		isMessageSent = publish.checkMessageIsSent(MSG_TO_PUBLISH);
		
		try 
		{

			Assert.assertTrue("Checking if the message is Sent: ", isMessageSent);
		}
		catch (Exception e) 
		{
			log.error("Error Would be: ",e);
			Assert.fail();
		}

	}

}
