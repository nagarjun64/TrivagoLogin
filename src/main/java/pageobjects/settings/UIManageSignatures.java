package pageobjects.settings;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIManageSignatures {

	public UIManageSignatures (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	//========Create New Signature Screen========

	//Create new Email Signature Button
	@FindBy(xpath = "//button[starts-with(@onclick,'addEditSignature')]")
	public WebElement createNewSignature;

	//Title of the Signature
	@FindBy(xpath = "//input[starts-with(@id,'title')]")
	public WebElement titleOfSignature;

	//Description of the Signature
	@FindBy(xpath = "//textarea[starts-with(@id,'description')]")
	public WebElement descOfSignature;

	//Iframe of the Signature Content
	@FindBy(xpath = "//iframe[@class='wysihtml5-sandbox']")
	public WebElement emailSignatureContainer;

	//Content of the Signature
	@FindBy(xpath = "//*[starts-with(@class,'form-control')]")
	public WebElement emailSignatureContent;

	//Save Signature
	@FindBy(xpath = "//button[starts-with(@ onclick,'saveOrUpdateSignature')]")
	public WebElement saveSignature;

	//Cancel Signature Creation
	@FindBy(xpath = "//button[starts-with(@ onclick,'saveOrUpdateSignature')]")
	public WebElement cancelSignatureCreation;


	//========Signature Home page========

	//Delete Signature
	@FindAll(@FindBy(how = How.XPATH, using = "//a[contains(@href,'deleteSignature')]"))
	public List <WebElement> deleteSignature;

	//Search Box For Signature
	@FindBy(xpath = "//input[@aria-controls='manageSignatureTable']")
	public WebElement searchForSignature;

	//Created Signature Name
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='manageSignatureTable']//td[1]"))
	public List <WebElement> nameOfCreatedSignature;
	
	//Email of the user created the signature
	@FindBy(xpath = "//*[@id='manageSignatureTable']//td[3]//h6")
	public WebElement createdByUserEmail;

	//Drop down value in the number of entries to show
	@FindBy(xpath = "//*[@name='manageSignatureTable_length']")
	public WebElement signsToShow;
	
	//Edit option of the signature
	@FindAll(@FindBy(how = How.XPATH, using = "//*[contains(@href,'addEditSignature')]"))
	public List <WebElement> editSignature;



}
