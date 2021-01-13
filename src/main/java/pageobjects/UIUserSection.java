package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIUserSection {
	
	public UIUserSection(WebDriver driver){
		PageFactory.initElements(driver, this);
	} 
	
	//=======================================User Section=======================================//
	
		//logged in user email
		@FindBy(how=How.XPATH, using="//button[@id='user']//span[@id='user-text']")
		public WebElement usrLoggedIn;
		
		//Account Settings
		@FindBy(how=How.XPATH, using="//a[@class='popover-list__link'][contains(text(),'Account settings')]")
		public WebElement acctSettings;
		
		//Account Settings
		@FindBy(how=How.XPATH, using="//a[@class='popover-list__link'][contains(text(),'Help and support')]")
		public WebElement helpAndSupport;

}
