package pageobjects.Listen;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIListenHome {

	public UIListenHome(WebDriver driver){
		PageFactory.initElements(driver, this);

	}

	@FindBy(how=How.XPATH, using="//*[@id='breadcrumb']/li/a[Contains(.,'Listen')]")
	public WebElement listenTitle;

	@FindBy(how=How.XPATH, using="//div[@class='greeting']")
	public WebElement welcomeText;

	//Button to create new profile
	@FindBy(how=How.XPATH, using="//button[contains(.,' New Profile')]")
	public WebElement newListeningProfile;

	//Current Page in the listen Home
	@FindBy(how=How.XPATH, using="//*[@id='currentPage']")
	public WebElement currentPageInListenHome;

	//Total Pages in the listen Home
	@FindBy(how=How.XPATH, using="//*[@id='totalPages']")
	public WebElement totalPagesInListenHome;

	//Next page Navigation Listen Home
	@FindBy(how=How.XPATH, using="//li[@class='pagination-arrow']/i")
	public WebElement nextPage;

	//Profile Names in Listen Home Current Page
	@FindAll(@FindBy(how = How.XPATH, using = "//form[@name='brandwordform']//span[starts-with(@id,'pname')]"))
	public List<WebElement> profileNamesInListenHome;

	//Profile Boxes in one page
	@FindAll(@FindBy(how = How.XPATH, using = "(//*[@id='dashboardDiv']//div[starts-with(@class,'widget-item')])"))
	public List<WebElement> profileGridsInListenHome;

	//================Profile Actions===============//

	//Profile messages link
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='dashboardDiv']//*[@class='pull-right']//a[@data-original-title='Messages']"))
	public List<WebElement> messagesOfProfile;

	//Delete option for the profiles which are not set up completely
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='dashboardDiv']//a[@data-original-title='Delete Profile']"))
	public List<WebElement> deleteProfileFromHome;

	//Option drop down for the profile
	@FindAll(@FindBy(how = How.XPATH, using = "//div[@class='dropup']//i[@class='caret']"))
	public List<WebElement> optionsDropDown;

	//Edit option for the profile inside the drop down
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@class='dropup']//*[@class='dropdown-menu']//a[@rel='createNewProfile']"))
	public List<WebElement> editProfileFromDropDown;

	//Delete option for the profile inside the drop down
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='dashboardDiv']//ul[@class='dropdown-menu']//li[4]//a"))
	public List<WebElement> deleteProfileFromDropDown;


}
