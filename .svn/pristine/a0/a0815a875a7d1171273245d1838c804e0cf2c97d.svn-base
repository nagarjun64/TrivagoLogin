package pageobjects.publish;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIMediaLibrary {

	public UIMediaLibrary(WebDriver driver){
		PageFactory.initElements(driver, this);

	}

	//===========================================Add New Media===========================================//

	//Add New Button
	@FindBy(xpath = "//button[@id='addMediaBtn']/i")
	public WebElement addNewMedia;

	//Title of the media
	@FindBy(id = "title")
	public WebElement titleOfMedia;

	//Description of the media
	@FindBy(id = "desc")
	public WebElement descOfMedia;

	//Image Upload Option
	@FindBy(xpath = "//*[@id='fileList']//*[@type='file']")
	public WebElement imageUpload;

	//Image uploaded Success Preview
	@FindBy(xpath = "//li[@class=' qq-upload-success']")
	public WebElement imageUploadSuccess;

	//Remove Uploaded Image
	@FindBy(xpath = "//*[@id='cancelUploaded']")
	public WebElement cancelUploadedImg;

	//Video Upload Option
	@FindBy(xpath="//*[@id='fileListVideo']//*[@type='file']")
	public WebElement videoUpload;

	//Remove Uploaded Videos
	@FindBy(xpath = "//*[@id='cancelUploadedVideo']")
	public WebElement cancelUploadedVid;

	//Cancel Media Upload during the upload Process
	@FindBy(xpath = "//*[@class='qq-upload-cancel']")
	public WebElement cancelUploadProc;

	//Tags of the media	
	@FindBy(xpath = "//*[@id='addEditMedia']//*[starts-with(@placeholder,'Enter')]")
	public WebElement mediaTags;

	//add media button after uploading
	@FindBy(xpath = "//button[@id='add']")
	public WebElement saveMedia;

	//add media button after uploading
	@FindBy(xpath = "//button[@id='updateButton']")
	public WebElement updateMedia;

	//Cancel media upload and return to media library home screen
	@FindBy(xpath = "//input[@id='add']")
	public WebElement cancelUpload;

	//===========================================Filters===========================================//

	//Open Filter options in the top menu
	@FindBy(xpath = "//li[starts-with(@class,'quicklinks')]//a[@class='chat-menu-toggle']")
	public WebElement accessFilters;

	//User filter in the Media Library
	@FindBy(xpath = "//*[@id='groups-list']//*[@id='user']")
	public WebElement selectUser;

	//Media type Image, GIF, Video
	@FindBy(xpath = "//*[@id='groups-list']//*[@id='type']")
	public WebElement selectMediaType;

	//Search with Media Name
	@FindBy(xpath = "//*[@id='groups-list']//*[@id='titlename']")
	public WebElement searchMediaName;

	//Search with Media Description
	@FindBy(xpath = "//*[@id='groups-list']//*[@id='description']")
	public WebElement searchMediaDescription;

	//Search with Media Tags
	@FindBy(xpath = "//*[@id='groups-list']//*[@id='mediatags' and @name ='mediatags']")
	public WebElement selectMediaTags;

	//===========================================Media Table===========================================//

	//select all media using the bulk check box
	@FindBy(xpath = "//th[1]")
	public WebElement selectAll;

	//Individual check box
	@FindAll(@FindBy(how = How.XPATH, using = "//tr//td[1]"))
	public List<WebElement> selectMedia;

	//Titles of the media present in the table
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='mediaData']//div[1]/p[1]"))
	public List<WebElement> mediaTitle;

	//Updated By in the media list
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='mediaData']//div[1]/p[3]"))
	public List<WebElement> updatedBy;

	//media Uplaoded succesfully Message Notification
	@FindBy(xpath = "//li[starts-with(@class,'messenger-message-slot')]//*[starts-with(@class,'messenger-message-inner')]")
	public WebElement mediaUploadSuccessMsg;

	//Close Upload Success Notification
	@FindBy(xpath = "//*[div[contains(text(),'Media Uploded Successfully!!')]]//button")
	public WebElement closeSuccessNotification;

	//Edit Button of first Media
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='mediaData']//tr[1]//td[8]//i"))
	public WebElement editFirstMediaFile;

	//Edit buttons of the respective Media
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='mediaData']//tr//td[8]//i"))
	public List<WebElement> editMedia;

	//Bulk Delete Button
	@FindBy(xpath = "(//button[@id='addMediaBtn']/i)[2]")
	public WebElement deleteMedia;

	//Close Delete Success Notification
	@FindBy(xpath = "//*[div[contains(text(),'Selected media removed')]]//button")
	public WebElement closeDeleteNotification;


	//Delete Check boxes of the Media
	@FindAll(@FindBy(how = How.XPATH, using = "//tr//td[1]//input"))
	public List<WebElement> checkMedia;

	//Confirm Yes
	@FindBy(id = "jqi_state0_buttonYes")
	public WebElement confirmYes;

	//Confirm Cancel
	@FindBy(id = "jqi_state0_buttonCancel")
	public WebElement confirmCancel;


}
