package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UIBoss {


	public UIBoss (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	//Switch User option
//	@FindBy(id = "ui-id-2")
	@FindBy(xpath = "//*[(@title='#tabs-switchusr')]")
	public WebElement switchUserOptn;

	//Switch User Drop down to select the users
	@FindBy(id = "users")
	public WebElement switchUserDropDown;

	//Switch User Drop down to select the users
	@FindBy(xpath = "//*[@value='Switch User']")
	public WebElement switchUserBtn;


}
