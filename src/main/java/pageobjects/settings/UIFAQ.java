package pageobjects.settings;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class UIFAQ {

	/**
	 * @author maushumisen
	 * Date: January 5, 2018
	 */

	public UIFAQ (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	//=========================================FAQ Main Screen=====================================================//

	// FAQ menu
	@FindBy(xpath="//li[@id='admin_faq']/a")
	public WebElement FAQmenu;

	//Created FAQ's
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='allFaqsData']//h4[@class='panel-title']/a"))
	public List<WebElement> createdFAQs;

	//Edit FAQ
	@FindAll(@FindBy(how = How.XPATH, using = "//*[contains(@class,'editFaq')]"))
	public List<WebElement> editFAQ;

	//delete FAQ
	@FindAll(@FindBy(how = How.XPATH, using = "//*[contains(@class,'deleteFaq')]"))
	public List<WebElement> deleteFAQ;

	//=========================================FAQ Create Screen=====================================================//
	//Add New FAQ button
	@FindBy (xpath= "//*[@id='faqButton']//button")
	public WebElement AddFAQ;

	//Question field in Add FAQ
	@FindBy(id= "faqTitle")
	public WebElement Question;

	//Answer field in FAQ create window
	@FindBy (xpath= "//div[@class='note-editable']")
	public WebElement Answer;

	//Assign field in FAQ create window
	@FindBy (xpath= "//ul[@class='select2-selection__rendered']")
	public WebElement Assign;

	//Tags field in FAQ create window
	@FindBy (xpath= "//div[@class='bootstrap-tagsinput']/input")
	public WebElement Tags;

	//Create button in FAQ create window
	@FindBy (xpath= "//button[text()='Create' or @id='saveFaq'] ")
	public WebElement Create;

	//Cancel button in FAQ create window
	@FindBy (id= "cancelFaq")
	public WebElement Cancel;

}