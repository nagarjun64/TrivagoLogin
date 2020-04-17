package actions.settings;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import helpers.Hooks;
import helpers.Log;
import helpers.SimplifyUtils;
import pageobjects.settings.UIPublishsettings;

//Author: Lokesh

public class ManagePublishSettings {

	private static Logger Log = Logger.getLogger(Log.class.getName());

	WebDriver driver;

	public ManagePublishSettings ()
	{
		driver = Hooks.driver;
	}

	//===========================================Open CreateResponse Screen==================================//

	public void openCreateResponseScreen() {
		
		UIPublishsettings mgCreateResponse = new UIPublishsettings(driver);
		
		SimplifyUtils utils = new SimplifyUtils();
		
		utils.waitForElementToBeClickable(mgCreateResponse.createNewResponse, 10);
		
		mgCreateResponse.createNewResponse.click();
		
		utils.waitForElementToBeClickable(mgCreateResponse.saveResponse, 10);
		
	}

	//===========================================Create New Response===========================================//
	
	public void createNewResponse(String name, String Response) {

	
        UIPublishsettings mgCreateResponse = new UIPublishsettings(driver);
		
		SimplifyUtils utils = new SimplifyUtils();
		
		utils.waitForElementToBeClickable(mgCreateResponse.saveResponse, 5);
		
		mgCreateResponse.responseName.sendKeys(name);
		mgCreateResponse.reponseTags.sendKeys(Response);
		utils.scrolltoElementByLocator(mgCreateResponse.saveResponse);
		mgCreateResponse.saveResponse.click();
		
	}


	public void createnewresponse1(String name, String Response) {

        UIPublishsettings mgCreateResponse = new UIPublishsettings(driver);
		
		SimplifyUtils utils = new SimplifyUtils();
		
		utils.waitTillElementFound(mgCreateResponse.responseName, 5);
		
		mgCreateResponse.responseName.sendKeys(name);
		mgCreateResponse.reponseTags.sendKeys(Response);
		utils.scrolltoElementByLocator(mgCreateResponse.saveResponse);
		mgCreateResponse.saveResponse.click();
		
	}

	
}

