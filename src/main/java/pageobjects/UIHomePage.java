package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIHomePage {

	public UIHomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}    

	@FindBy(how=How.XPATH, using="//div[@class='greeting']")
	public WebElement welcomeText;
	
	@FindBy(how=How.XPATH, using="//*[@id='signin']/h5")
	public WebElement inCorrectLoginText;

	
}
