package pageobjects.admin;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIPublishsettings {

	public UIPublishsettings (WebDriver driver) {

		PageFactory.initElements(driver, this);
	
	}
        //	========Create New Response ========
	
	//Click on create response
	@FindBy(xpath="//*[starts-with(@onclick,'createResponse')]")
	public WebElement createNewResponse;
	
	//Enter response name
	@FindBy( id= "name")
	public WebElement responseName;
	
	//Enter response tags
	@FindBy(id= "response")
	public WebElement reponseTags;
		
	//Click on Save 
	@FindBy( id = "saveResponse")
	public WebElement saveResponse;
	
	//  ==============Edit response================
	
	//Edit response list
	@FindAll(@FindBy(how = How.XPATH, using ="//*[@id='bmContainer']//*[contains(@href,'javascript:editResponse')]"))
	public List<WebElement> editResponseButton;
     
	//   ==============Delete response=============
	
	//Delete response
	@FindAll(@FindBy(how = How.XPATH, using ="//*[@id='bmContainer']//*[contains(@href,'javascript:deleteResponse')"))
	public List<WebElement> deleteResponseButton;

}
