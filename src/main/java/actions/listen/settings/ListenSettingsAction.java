package actions.listen.settings;

import java.util.Iterator;

import org.openqa.selenium.WebDriver;

import helpers.Hooks;
import helpers.ReadConfig;
import helpers.SimplifyUtils;
import pageobjects.Listen.UIListenHome;
import pageobjects.ListenSettings.UIProfileWorkbaskets;

public class ListenSettingsAction {
	
	WebDriver driver;
	String WORKBASKET_NAME;

	public ListenSettingsAction()
	{
		driver = Hooks.driver;
	}

	public String createWorkbasket() {

		UIListenHome listenHome = new UIListenHome(driver);
		UIProfileWorkbaskets workbaskets = new UIProfileWorkbaskets(driver);
		SimplifyUtils utils = new SimplifyUtils();
		
		workbaskets.createWorkbasket.click();
		
		utils.waitTillElementFound(workbaskets.workbasketName, 5);
		
		WORKBASKET_NAME = utils.profileNameGen();
		
		workbaskets.workbasketName.sendKeys(WORKBASKET_NAME);
		
		return WORKBASKET_NAME;
		
	}
	
	public void selectUsers() {
		
		
	}


}
