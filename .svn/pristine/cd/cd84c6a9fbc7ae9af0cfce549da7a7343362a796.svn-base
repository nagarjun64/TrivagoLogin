package pageobjects.Listen;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UIListenProfileCreation {

	public UIListenProfileCreation(WebDriver driver){

		PageFactory.initElements(driver, this);

	}

	//Confirmation Message which appears when ever there is an update like profile update, update name, volume etc
	@FindAll(@FindBy(how = How.XPATH, using = "//button[@data-dismiss='alert']"))
	public List<WebElement> closeConfirmationMessages;

	//==============Profile Creation Menu====================================================//

	@FindBy(how=How.XPATH, using="//*[@id='profileCreateMenu']//a[@href='#moose']")
	public WebElement profileInformation;

	@FindBy(how=How.XPATH, using="//*[@id='profileCreateMenu']//a[@href='#bear']")
	public WebElement profileSettings;

	@FindBy(how=How.XPATH, using="//*[@id='profileCreateMenu']//a[@href='#beaver']")
	public WebElement profileKeyWordSetup;

	@FindBy(how=How.XPATH, using="//*[@id='profileCreateMenu']//a[@href='#bobcat']")
	public WebElement profileSocialChannels;

	@FindBy(how=How.XPATH, using="//*[@id='profileCreateMenu']//a[@href='#koala']")
	public WebElement profileSpamWords;

	@FindBy(how=How.XPATH, using="//*[@id='profileCreateMenu']//a[@href='#racoon']")
	public WebElement profileShareList;



	//==============Profile Information Tab====================================================//

	@FindBy(how=How.XPATH, using="//input[@id='dashboardName']")
	public WebElement profileName;

	@FindBy(how=How.XPATH, using="//input[@id='amountVal']")
	public WebElement profileVolumeToSet;

	@FindBy(how=How.XPATH, using="//*[@id='dashboardName-error']")
	public WebElement errNoProfileName;

	@FindBy(how=How.XPATH, using="//*[@id='amountVal-error']")
	public WebElement errNoProfileVolume;

	@FindBy(how=How.XPATH, using="//*[@id='moose']//button[contains(.,'Create') or contains(.,'Update')]")
	public WebElement createNewProfile;

	@FindBy(how=How.XPATH, using="//*[@id='moose']//button[contains(.,'Update')]")
	public WebElement updateExistingProfile;


	//==============Profile Settings====================================================//

	@FindBy(how=How.XPATH, using="//*[@id='bear']//h4[contains(.,'Profile Settings')]")
	public WebElement profileSettingsTitle;

	//Case Association  
	//	@FindBy(xpath="//*[@id='bear']//*[starts-with(@class,'ios-switch')]")
	@FindBy(xpath="//*[@id='bear']//div[input[@id='caseAssociation']]//*[starts-with(@class,'ios-switch')]")
	public WebElement caseAssociation;

	//Case Association Enabled
	//	@FindBy(xpath="//*[@id='bear']//div[starts-with(@class,'on-background')]")
	@FindBy(xpath="//*[@id='bear']//div[input[@id='caseAssociation']]//div[starts-with(@class,'on-background')]")
	public WebElement caseAssociationEnabled;

	//Case Association Disabled
	//	@FindBy(xpath="//*[@id='bear']//div[starts-with(@class,'state-background')]")
	@FindBy(xpath="//*[@id='bear']//div[input[@id='caseAssociation']]//div[starts-with(@class,'state-background')]")
	public WebElement caseAssociationDisabled;

	//Case Association Duration  
	@FindBy(id="reassignPeriodMins") 
	public WebElement caseAssociationDuration;

	//Reply Settings  
	@FindBy(id="replySetting")
	public WebElement replySetting;

	//Selected Reply Settings  
	@FindBy(xpath="//*[@id='replySetting']//option[@selected]")
	public WebElement selectedReplyStng;

	//Save Profile Settings  
	@FindBy(xpath="//*[@id='bear']//button[contains(text(),'Save')]")
	public WebElement saveProfileSettings;

	//Skip Profile Settings  
	@FindBy(xpath="//*[@id='bear']//button[contains(text(),'Skip')]")
	public WebElement skipProfileSettings;


	//=====================================Keyword Combination Setup=====================================//

	//Yes button in are you sure you want to add keyword setup  
	@FindBy(xpath="//*[@id='subquery_keyword']//button[contains(text(),'Yes')]")
	public WebElement confirmAddSubQuery;

	//skip button in are you sure you want to add keyword setup  
	@FindBy(xpath="//*[@id='subquery_keyword']//button[contains(text(),'Skip')]")
	public WebElement skipAddingSubquery;

	//sub query names in the profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='subquery_keyword']//a[span[@class='subqueryheader']]"))
	public List<WebElement> subQueryNames;

	//Add another sub query in profile creation or editing  
	@FindBy(xpath="//*[@id='subquery_keyword']//button[contains(text(),'Add Another')]")
	public WebElement addAnotherSubquery;

	//Update the subqueries added for the profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='beaver']//*[contains(@onclick,'saveProfileWords')][2]"))
	public List<WebElement> updateSubQuery;

	//Delete SubQuery
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='subquery_keyword']//span[@data-original-title='Delete']"))
	public List<WebElement> deleteSubQuery;

	//SubQuery
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='subquery_keyword']//a[span[@class='subqueryheader']]"))
	public List<WebElement> subQuerySlider;

	//Save Subqueries
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='beaver']//*[contains(@onclick,'saveProfileWords')][2]"))
	public List<WebElement> saveSubQueries;
	//*[@id='beaver']//*[contains(@onclick,'saveProfileWords')][2]
	//*[@id='beaver']//button[@type='button' and contains(., 'Save')]


	//=====================================First Keyword Combination Setup=====================================//


	@FindBy(how=How.XPATH, using="//*[@id='subquery_keyword']//div[@class='panel-heading']")
	public WebElement addSubQueryTitle;

	//First Subquery Set up Subqeury name  
	@FindBy(xpath="//*[@id='panelBody_']//input[@class='wordtext']")
	public WebElement firstSubqueryName;

	//First Words to track  
	@FindBy(xpath="//*[@id='panelBody_']//textarea[@name='word']")
	public WebElement firstSetUpWordToTrack;

	//First Containig all words  
	@FindBy(xpath="//*[@id='panelBody_']//textarea[@name='allword']")
	public WebElement firstSetUpAllWords;

	//First Containig any words  
	@FindBy(xpath="//*[@id='panelBody_']//textarea[@name='anyword']")
	public WebElement firstSetUpAnyWords;

	//First not Containig  words  
	@FindBy(xpath="//*[@id='panelBody_']//textarea[@name='noneword']")
	public WebElement firstSetUpNotWords;

	//First Sub query Select Country drop down  
	@FindBy(xpath="//*[@id='panelBody_']//*[@id='selectcountry']")
	public WebElement firstSetUpSelectCountry;

	//Invert Location Selected for the profile  
	@FindBy(xpath="//*[@id='panelBody_']//div[8]//*[starts-with(@class,'ios-switch')]")
	public WebElement firstSetUpInvertLocation;

	//Invert Location Selected for the profile ENABLED
	@FindBy(xpath="//*[@id='panelBody_']//div[8]//div[starts-with(@class,'on-background')]")
	public WebElement firstSetUpInvertLocationEnabled;

	//Invert Location Selected for the profile DISABLED
	@FindBy(xpath="//*[@id='panelBody_']//div[8]//div[starts-with(@class,'state-background')]")
	public WebElement firstSetUpInvertLocationDisabled;

	//Apply Location Selected for the profile  
	@FindBy(xpath="//*[@id='panelBody_']//div[9]//*[starts-with(@class,'ios-switch')]")
	public WebElement firstSetUpApplyLocation;

	//Apply Location Selected for the profile ENABLED
	@FindBy(xpath="//*[@id='panelBody_']//div[9]//div[starts-with(@class,'on-background')]")
	public WebElement firstSetUpApplyLocationEnabled;

	//Apply Location Selected for the profile DISABLED
	@FindBy(xpath="//*[@id='panelBody_']//div[9]//div[starts-with(@class,'state-background')]")
	public WebElement firstSetUpApplyLocationDisabled;

	//First Sub query Select Language drop down  
	@FindBy(xpath="//*[@id='panelBody_']//*[@id='selectlanguage']")
	public WebElement firstSetUpSelectLanguage;

	//=====================================First Public Source Locators=====================================//

	//Public Twitter for first set up
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='twitter']]//div[starts-with(@class,'ios-switch')]")
	public WebElement firstSetUpPublicTwitter;

	//Public Twitter for first set up ENABLED
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='twitter']]//div[starts-with(@class,'on-background')]")
	public WebElement firstSetUpPublicTwitterEnabled;

	//Public Twitter for first set up ENABLED
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='twitter']]//div[starts-with(@class,'state-background')]")
	public WebElement firstSetUpPublicTwitterDisabled;

	//Public Blogs for first set up
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='blogs']]//div[starts-with(@class,'ios-switch')]")
	public WebElement firstSetUpPublicBlog;

	//Public Blogs for first set up Enabled
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='blogs']]//div[starts-with(@class,'on-background')]")
	public WebElement firstSetUpPublicBlogEnabled;

	//Public Blogs for first set up Disabled
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='blogs']]//div[starts-with(@class,'state-background')]")
	public WebElement firstSetUpPublicBlogDisabled;

	//Public News for first set up
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='news']]//div[starts-with(@class,'ios-switch')]")
	public WebElement firstSetUpPublicNews;

	//Public News for first set up Enabled
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='news']]//div[starts-with(@class,'on-background')]")
	public WebElement firstSetUpPublicNewsEnabled;

	//Public News for first set up Disabled
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='news']]//div[starts-with(@class,'state-background')]")
	public WebElement firstSetUpPublicNewsDisabled;

	//Public Videos for first set up
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='videos']]//div[starts-with(@class,'ios-switch')]")
	public WebElement firstSetUpPublicVideos;

	//Public Videos for first set up Enabled
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='videos']]//div[starts-with(@class,'on-background')]")
	public WebElement firstSetUpPublicVideosEnabled;

	//Public Videos for first set up Disabled
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='videos']]//div[starts-with(@class,'state-background')]")
	public WebElement firstSetUpPublicVideosDisabled;

	//Public Discussions for first set up
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='discussion']]//div[starts-with(@class,'ios-switch')]")
	public WebElement firstSetUpPublicDiscussions;

	//Public Discussions for first set up Enabled
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='discussion']]//div[starts-with(@class,'on-background')]")
	public WebElement firstSetUpPublicDiscussionsEnabled;

	//Public Discussions for first set up Disabled
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='discussion']]//div[starts-with(@class,'state-background')]")
	public WebElement firstSetUpPublicDiscussionsDisabled;

	//Public Instagram for first set up
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='instagram']]//div[starts-with(@class,'ios-switch')]")
	public WebElement firstSetUpPublicInstagram;

	//Public Instagram for first set up Enabled
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='instagram']]//div[starts-with(@class,'on-background')]")
	public WebElement firstSetUpPublicInstagramEnabled;

	//Public Instagram for first set up Disabled
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='instagram']]//div[starts-with(@class,'state-background')]")
	public WebElement firstSetUpPublicInstagramDisabled;

	//Public GooglePlus for first set up
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='googleplus']]//div[starts-with(@class,'ios-switch')]")
	public WebElement firstSetUpPublicGooglePlus;

	//Public GooglePlus for first set up Enabled
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='googleplus']]//div[starts-with(@class,'on-background')]")
	public WebElement firstSetUpPublicGooglePlusEnabled;

	//Public GooglePlus for first set up Disabled
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='googleplus']]//div[starts-with(@class,'state-background')]")
	public WebElement firstSetUpPublicGooglePlusDisabled;

	//Public Tumblr for first set up
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='tumblr']]//div[starts-with(@class,'ios-switch')]")
	public WebElement firstSetUpPublicTumblr;

	//Public Tumblr for first set up Enabled
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='tumblr']]//div[starts-with(@class,'on-background')]")
	public WebElement firstSetUpPublicTumblrEnabled;

	//Public Tumblr for first set up Disabled
	@FindBy(xpath="//*[@id='panelBody_']//div[input[@name='tumblr']]//div[starts-with(@class,'state-background')]")
	public WebElement firstSetUpPublicTumblrDisabled;


	//=====================================Second Keyword Combination Setup=====================================//

	//Second Subquery Set up Subqeury name  
	@FindBy(xpath="//*[@id='panelBody_1']//input[@class='wordtext']")
	public WebElement secondSubqueryName;

	//Second Words to track  
	@FindBy(xpath="//*[@id='panelBody_1']//textarea[@name='word']")
	public WebElement secondSetUpWordToTrack;

	//Second Containig all words  
	@FindBy(xpath="//*[@id='panelBody_1']//textarea[@name='allword']")
	public WebElement secondSetUpAllWords;

	//Second Containig any words  
	@FindBy(xpath="//*[@id='panelBody_1']//textarea[@name='anyword']")
	public WebElement secondSetUpAnyWords;

	//Second not Containig  words  
	@FindBy(xpath="//*[@id='panelBody_1']//textarea[@name='noneword']")
	public WebElement secondSetUpNotWords;

	//Second Sub query Select Country drop down  
	@FindBy(xpath="//*[@id='panelBody_1']//*[@id='selectcountry']")
	public WebElement secondSetUpSelectCountry;

	//Invert Location Selected for the profile  
	@FindBy(xpath="//*[@id='panelBody_1']//div[9]//*[starts-with(@class,'ios-switch')]")
	public WebElement secondSetUpInvertLocation;

	//Invert Location Selected for the profile ENABLED
	@FindBy(xpath="//*[@id='panelBody_1']//div[9]//div[starts-with(@class,'on-background')]")
	public WebElement secondSetUpInvertLocationEnabled;

	//Invert Location Selected for the profile DISABLED
	@FindBy(xpath="//*[@id='panelBody_1']//div[9]//div[starts-with(@class,'state-background')]")
	public WebElement secondSetUpInvertLocationDisabled;

	//Second Sub query Select Language drop down  
	@FindBy(xpath="//*[@id='panelBody_1']//*[@id='s2id_selectlanguage']")
	public WebElement secondSetUpSelectLanguage;

	//Apply Location Selected for the profile  
	@FindBy(xpath="//*[@id='panelBody_1']//div[10]//*[starts-with(@class,'ios-switch')]")
	public WebElement secondSetUpApplyLocation;

	//Apply Location Selected for the profile ENABLED
	@FindBy(xpath="//*[@id='panelBody_1']//div[10]//div[starts-with(@class,'on-background')]")
	public WebElement secondSetUpApplyLocationEnabled;

	//Apply Location Selected for the profile DISABLED
	@FindBy(xpath="//*[@id='panelBody_1']//div[10]//div[starts-with(@class,'state-background')]")
	public WebElement secondSetUpApplyLocationDisabled;

	//=====================================Second Public Source Locators=====================================//

	//Public Twitter for second set up
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[1]/div[1]//div[starts-with(@class,'ios-switch')]")
	public WebElement secondSetUpPublicTwitter;

	//Public Twitter for second set up ENABLED
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[1]/div[1]//div[starts-with(@class,'on-background')]")
	public WebElement secondSetUpPublicTwitterEnabled;

	//Public Twitter for second set up ENABLED
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[1]/div[1]//div[starts-with(@class,'state-background')]")
	public WebElement secondSetUpPublicTwitterDisabled;

	//Public Blogs for second set up
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[1]/div[2]//div[starts-with(@class,'ios-switch')]")
	public WebElement secondSetUpPublicBlog;

	//Public Blogs for second set up Enabled
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[1]/div[2]//div[starts-with(@class,'on-background')]")
	public WebElement secondSetUpPublicBlogEnabled;

	//Public Blogs for second set up Disabled
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[1]/div[2]//div[starts-with(@class,'state-background')]")
	public WebElement secondSetUpPublicBlogDisabled;

	//Public News for second set up
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[1]/div[3]//div[starts-with(@class,'ios-switch')]")
	public WebElement secondSetUpPublicNews;

	//Public News for second set up Enabled
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[1]/div[3]//div[starts-with(@class,'on-background')]")
	public WebElement secondSetUpPublicNewsEnabled;

	//Public News for second set up Disabled
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[1]/div[3]//div[starts-with(@class,'state-background')]")
	public WebElement secondSetUpPublicNewsDisabled;

	//Public Videos for second set up
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[1]/div[4]//div[starts-with(@class,'ios-switch')]")
	public WebElement secondSetUpPublicVideos;

	//Public Videos for second set up Enabled
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[1]/div[4]//div[starts-with(@class,'on-background')]")
	public WebElement secondSetUpPublicVideosEnabled;

	//Public Videos for second set up Disabled
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[1]/div[4]//div[starts-with(@class,'state-background')]")
	public WebElement secondSetUpPublicVideosDisabled;

	//Public Discussions for second set up
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[2]/div[1]//div[starts-with(@class,'ios-switch')]")
	public WebElement secondSetUpPublicDiscussions;

	//Public Discussions for second set up Enabled
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[2]/div[1]//div[starts-with(@class,'on-background')]")
	public WebElement secondSetUpPublicDiscussionsEnabled;

	//Public Discussions for second set up Disabled
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[2]/div[1]//div[starts-with(@class,'state-background')]")
	public WebElement secondSetUpPublicDiscussionsDisabled;

	//Public Instagram for second set up
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[2]/div[2]//div[starts-with(@class,'ios-switch')]")
	public WebElement secondSetUpPublicInstagram;

	//Public Instagram for second set up Enabled
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[2]/div[2]//div[starts-with(@class,'on-background')]")
	public WebElement secondSetUpPublicInstagramEnabled;

	//Public Instagram for second set up Disabled
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[2]/div[2]//div[starts-with(@class,'state-background')]")
	public WebElement secondSetUpPublicInstagramDisabled;

	//Public GooglePlus for second set up
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[2]/div[3]//div[starts-with(@class,'ios-switch')]")
	public WebElement secondSetUpPublicGooglePlus;

	//Public GooglePlus for second set up Enabled
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[2]/div[3]//div[starts-with(@class,'on-background')]")
	public WebElement secondSetUpPublicGooglePlusEnabled;

	//Public GooglePlus for second set up Disabled
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[2]/div[3]//div[starts-with(@class,'state-background')]")
	public WebElement secondSetUpPublicGooglePlusDisabled;

	//Public Tumblr for second set up
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[2]/div[3]//div[starts-with(@class,'ios-switch')]")
	public WebElement secondSetUpPublicTumblr;

	//Public Tumblr for second set up Enabled
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[2]/div[3]//div[starts-with(@class,'on-background')]")
	public WebElement secondSetUpPublicTumblrEnabled;

	//Public Tumblr for second set up Disabled
	@FindBy(xpath="//*[@id='panelBody_']//div[13]/div[2]/div[3]//div[starts-with(@class,'state-background')]")
	public WebElement secondSetUpPublicTumblrDisabled;


	//=====================================Add Facebook pages=====================================//

	//Facebook Accordion
	@FindBy(xpath="//*[@id='bobcat']//*[@id='accordion']//a[div[div[contains(text(),'Facebook Page')]]]")
	public WebElement fbPageAccordion;

	//*[@id='bobcat']//*[@id='accordion']//a[starts-with(@class,'expand-pos')]//div[contains(text(),'Facebook Page')]
	//*[@id='bobcat']//*[@id='accordion']//a[div[div[contains(text(),'Facebook Page')]]]

	//Add Admin Facebook Page
	@FindBy(xpath="//*[@id='collapseOne']//*[@class='panel-body']//button[contains(.,'Add as admin')]")
	public WebElement addAdminFbpage;

	//Add Non-Admin Facebook Page
	@FindBy(xpath="//*[@id='collapseOne']//*[@class='panel-body']//button[contains(.,'Add as non-admin')]")
	public WebElement addNonAdminFbpage;

	//no Facebook Pages added for the profile
	@FindBy(xpath="//*[@id='social-channel-FACEBOOK']//div[starts-with(@class,'row')]//p")
	public WebElement noFbPagesAdded;

	//Facebook Pages added for the profile -- important locator
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-FACEBOOK']//span/a"))
	public List<WebElement> fbPagesAddedForProfile;

	//Type of Facebook Page added for the profile i.e either Admin or Non-Admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-FACEBOOK']//span[contains(., 'ADMIN') or contains(., 'NON-ADMIN')]"))
	public List<WebElement> typeOfFbPagesAddedForProfile;

	//Removing the Facebook Page added from the profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-FACEBOOK']//a[@class='remove']"))
	public List<WebElement> removeFbPageFromProfile;

	//marking the fb page keyword  based
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-FACEBOOK']//div[2]/input"))
	public List<WebElement> markFbPageKeyWordBased;

	//Excluding the brand conversations
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-FACEBOOK']//div[3]/input"))
	public List<WebElement> markFbPageExcludeBrandConversation;

	//Added Total Facebook Page admin and Non-Admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-FACEBOOK']//div[contains(@class,'tiles-body')]//span/a"))
	public List<WebElement>  addedFbPages;

	//Added Total Facebook Page admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-FACEBOOK']//div[div[span[contains(@class,'label-important')]]]//div[starts-with(@class,'user-name')]//a"))
	public List<WebElement>  addedAdminFbPages;

	//Added Total Facebook Page admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-FACEBOOK']//div[div[span[contains(@class,'label-primary')]]]//div[starts-with(@class,'user-name')]//a"))
	public List<WebElement>  addedNonAdminFbPages;

	//=====================================Add Facebook pages===Import====================================//

	//Import admin Facebook Pages for profile
	@FindBy(xpath="//*[@id='collapseOne']//button[contains(text(),'Import')]")
	public WebElement importFbpage;

	//Count of Pages that can be imported
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-FACEBOOK']//div[contains(@class,'tiles-body')]"))
	public List<WebElement> fbPagesAvailableToImport;

	//Facebook page names to import
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-FACEBOOK']//div[contains(@class,'tiles-body')]//span/a"))
	public List<WebElement> fbPageNamesToImport;

	//Button to import Facebook pages and add to profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-FACEBOOK']//a[contains(@data-original-title,'Add to Profile')]"))
	public List<WebElement> importResultedFbPages;

	//Facebook Done Button
	@FindBy(xpath="//*[@id='social-channel-import-FACEBOOK']//button[contains(.,'Done')]")
	public WebElement fbPageImportDone;

	//=====================================Add Facebook pages===Admin=====================================//


	@FindBy(how=How.XPATH, using="//*[@id='email']")
	public WebElement fbLoginEmail;

	@FindBy(how=How.XPATH, using="//*[@id='pass']")
	public WebElement fbLoginPassword;

	@FindBy(how=How.XPATH, using="//*[@id='loginbutton']")
	public WebElement fbLoginButton;

	//List of facebook pages available while adding admin fb pages to profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[starts-with(@class,'table-responsive')]//tbody//tr//td[2]"))
	public List<WebElement> adminFbPagesToAdd;

	//add button for the fb pages while adding admin fb pages to profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[starts-with(@class,'table-responsive')]//tbody//tr//td[3]/a"))
	public List<WebElement> addButtonAdminFbPages;

	@FindBy(how=How.XPATH, using="//*[starts-with(@class,'row')]//input[@value='Done']")
	public WebElement finishAddAdminFbPage;

	//=====================================Add Facebook pages===NonAdmin==================================//

	//Non-Admin Fb page search Box
	@FindBy(xpath="//*[@id='cmpPageName']")
	public WebElement nonAdminFbPageSearchBox;

	//Non-Admin Search button
	@FindBy(xpath="//*[@id='collapseOne']//button[contains(text(),'Search')]")
	public WebElement nonAdminFbSearchButton;

	//Facebook page Name of the results
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-nonadmin-FACEBOOK']//span/a"))
	public List<WebElement> nonAdminFbPageFromSearch;

	//add Facebook page button for the results
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-nonadmin-FACEBOOK']//i"))
	public List<WebElement> addNonAdminFbPageFromSearch;

	//Facebook Done Button
	@FindBy(xpath="//*[@id='social-channel-nonadmin-FACEBOOK']//button[contains(.,'Done')]")
	public WebElement completeFbPageNonAdminAddition;

	//=====================================Add Twitter=====================================//

	//Twitter Accordion
	@FindBy(xpath="//*[@id='bobcat']//*[@id='accordion']//a[div[div[contains(text(),'Twitter Account')]]]")
	public WebElement twtAccordion;

	//Import admin Twitter handles  for profile
	@FindBy(xpath="//*[@id='collapseTwo']//button[contains(text(),'Import')]")
	public WebElement importTwtAct;

	//Add Admin Twitter Account Button
	@FindBy(xpath="//*[@id='collapseTwo']//*[@class='panel-body']//button[contains(.,'Add as admin')]")
	public WebElement addAdminTwtAct;

	//Add Non-Admin Twitter Account button
	@FindBy(xpath="//*[@id='collapseTwo']//*[@class='panel-body']//button[contains(.,'Add as non-admin')]")
	public WebElement addNonAdminTwtAct;

	//no Twitter Accounts added for the profile
	@FindBy(xpath="//*[@id='social-channel-TWITTER']//div[starts-with(@class,'row')]//p")
	public WebElement noTwtActAdded;

	//Twitter channels added for the profile -- important locator
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-TWITTER']//span/a"))
	public List<WebElement> twtActAddedForProfile;

	//Type of Twitter channels added for the profile i.e either Admin or Non-Admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-TWITTER']//span[contains(., 'ADMIN') or contains(., 'NON-ADMIN')]"))
	public List<WebElement> typeOfTwtActAddedForProfile;

	//Removing the Twitter account added from the profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-TWITTER']//a[@class='remove']"))
	public List<WebElement> removeTwtActFromProfile;

	//marking the Twitter channel based
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-TWITTER']//div[@class='preview-wrapper']/input[@type='checkbox']"))
	public List<WebElement> excludeTwtBrandConv;

	//Added Total Twitter admin and Non-Admin accounts
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-TWITTER']//div[contains(@class,'tiles-body')]//span/a"))
	public List<WebElement>  addedTwtActs;

	//Added Total Twitter Admin handles
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-TWITTER']//div[div[span[contains(@class,'label-important')]]]//div[starts-with(@class,'user-name')]//a"))
	public List<WebElement>  addedAdminTwtActs;

	//Added Total Twitter Non Admin handles
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-TWITTER']//div[div[span[contains(@class,'label-primary')]]]//div[starts-with(@class,'user-name')]//a"))
	public List<WebElement>  addedNonAdminTwtActs;

	//=====================================Add Twitter===Import====================================//


	//Count of Twitter Accounts that can be imported
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-TWITTER']//div[contains(@class,'tiles-body')]"))
	public List<WebElement> twtActAvailableToImport;

	//Twitter Account names to import
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-TWITTER']//div[contains(@class,'tiles-body')]//span/a"))
	public List<WebElement> twtActNamesToImport;

	//Button to import Twitter Accounts and add to profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-TWITTER']//a[contains(@data-original-title,'Add to Profile')]"))
	public List<WebElement> importResultedTwtAct;

	//Twitter Account Importing Done Button
	@FindBy(xpath="//*[@id='social-channel-import-TWITTER']//button[contains(.,'Done')]")
	public WebElement twtActImportDone;


	//=====================================Add Twitter===Admin=====================================//

	//Twitter Login name
	@FindBy(how=How.XPATH, using="//*[@id='username_or_email']")
	public WebElement twtLoginEmail;

	//Twitter login password
	@FindBy(how=How.XPATH, using="//*[@id='password']")
	public WebElement twtLoginPassword;

	//Twitter login button or authorise button
	@FindBy(how=How.XPATH, using="//*[@id='allow']")
	public WebElement twtAuthorizeApp;

	//=====================================Add Twitter===NonAdmin==================================//

	//Non-Admin Twitter Account search Box
	@FindBy(xpath="//*[@id='twitterHandle']")
	public WebElement nonAdminTwtActSearchBox;

	//Non-Admin Search button for twitter accounts
	@FindBy(xpath="//*[@id='collapseTwo']//button[contains(text(),'Search')]")
	public WebElement nonAdminTwtActSearchButton;

	//Results from the twitter account non-admin search
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-nonadmin-TWITTER']//span/a"))
	public List<WebElement> nonAdminTwtActFromSearch;

	//add Twitter account button for the results
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-nonadmin-TWITTER']//i"))
	public List<WebElement> addNonAdminTwtActFromSearch;

	//Complete adding non-admin twitter account by clicking on this DONE button
	@FindBy(xpath="//*[@id='social-channel-nonadmin-TWITTER']//button[contains(.,'Done')]")
	public WebElement completeTwtActNonAdminAddition;


	//=====================================Add Facebook Groups=====================================//

	//Facebook group Accordion
	@FindBy(xpath="//*[@id='bobcat']//*[@id='accordion']//a[div[div[contains(text(),'Facebook Group')]]]")
	public WebElement fbGrpAccordion;

	//Import admin Facebook Groups button for profile
	@FindBy(xpath="//*[@id='collapseThree']//button[contains(text(),'Import')]")
	public WebElement importFbGrp;

	//Add Admin Facebook Group button
	@FindBy(xpath="//*[@id='collapseThree']//*[@class='panel-body']//button[contains(.,'Add as admin')]")
	public WebElement addAdminFbGrp;

	//no Facebook Groups added for the profile
	@FindBy(xpath="//*[@id='social-channel-FBGROUP']//div[starts-with(@class,'row')]//p")
	public WebElement noFbGrpAdded;

	//Facebook Groups added for the profile -- important locator
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-FBGROUP']//span/a"))
	public List<WebElement> fbGrpAddedForProfile;

	//Type of Facebook Groups added for the profile i.e either Admin or Non-Admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-FBGROUP']//span[contains(., 'ADMIN') or contains(., 'NON-ADMIN')]"))
	public List<WebElement> typeOfFbGrpForProfile;

	//Removing the Facebook Group added from the profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-FBGROUP']//a[@class='remove']"))
	public List<WebElement> removeFbGrpFromProfile;

	//=====================================Add Facebook Groups===Import====================================//

	//Count of groups that can be imported
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-FBGROUP']//div[contains(@class,'tiles-body')]"))
	public List<WebElement> fbGrpAvailableToImport;

	//Facebook groups names to import
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-FBGROUP']//div[contains(@class,'tiles-body')]//span/a"))
	public List<WebElement> fbGrpNamesToImport;

	//Button to import facebook groups and add to profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-FBGROUP']//a[contains(@data-original-title,'Add to Profile')]"))
	public List<WebElement> importResultedFbGrp;

	//Facebook Groups done Button after importing
	@FindBy(xpath="//*[@id='social-channel-import-FBGROUP']//button[contains(.,'Done')]")
	public WebElement fbGrpImportDone;


	//=====================================Add Facebook Groups===Admin=====================================//

	//List of facebook groups available while adding admin fb groups to profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[starts-with(@class,'table-responsive')]//tbody//tr//td[2]"))
	public List<WebElement> adminFbGrpToAdd;

	//add button for the fb groups while adding admin fb groups to profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[starts-with(@class,'table-responsive')]//tbody//tr//td[3]/a"))
	public List<WebElement> addButtonAdminFbGrp;

	@FindBy(how=How.XPATH, using="//*[starts-with(@class,'row')]//input[@value='Done']")
	public WebElement finishAddAdminFbGrp;


	//=====================================Add YouTube Channels=====================================//

	//YouTube Source Accordion/Slider
	@FindBy(xpath="//*[@id='bobcat']//*[@id='accordion']//a[div[div[contains(text(),'YouTube Channel')]]]")
	public WebElement ytAccordion;

	//Import YouTube Channel button for profile
	@FindBy(xpath="//*[@id='collapseFour']//button[contains(text(),'Import')]")
	public WebElement importYtChnl;

	//Add Admin YouTube Channel button
	@FindBy(xpath="//*[@id='collapseFour']//*[@class='panel-body']//button[contains(.,'Add as admin')]")
	public WebElement addAsAdminYtChnl;

	//Add Non-Admin YouTube Channel button
	@FindBy(xpath="//*[@id='collapseFour']//*[@class='panel-body']//button[contains(.,'Add as non-admin')]")
	public WebElement addAsNonAdminYtChnl;

	//no YouTube channel added for the profile
	@FindBy(xpath="//*[@id='social-channel-YOUTUBE']//div[starts-with(@class,'row')]//p")
	public WebElement noYtChnlAdded;

	//YouTube Channels added for the profile -- important locator
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-YOUTUBE']//span/a"))
	public List<WebElement> ytChnlAddedToProfile;

	//Type of Youtube channels added for the profile i.e either Admin or Non-Admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-YOUTUBE']//span[contains(., 'ADMIN') or contains(., 'NON-ADMIN')]"))
	public List<WebElement> typeOfYtChnlForProfile;

	//Removing the YouTube channels added from the profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-YOUTUBE']//a[@class='remove']"))
	public List<WebElement> removeYtChnlFromProfile;

	//Added Total YouTube  admin and Non-Admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-YOUTUBE']//div[contains(@class,'tiles-body')]//span/a"))
	public List<WebElement>  addedYTChnl;

	//Added Total YouTube admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-YOUTUBE']//div[div[span[contains(@class,'label-important')]]]//div[starts-with(@class,'user-name')]//a"))
	public List<WebElement>  addedAdminYTChnl;

	//Added Total YouTube non admin channel
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-YOUTUBE']//div[div[span[contains(@class,'label-primary')]]]//div[starts-with(@class,'user-name')]//a"))
	public List<WebElement>  addedNonAdminYTChnl;


	//=====================================Add YouTube Channels===Import====================================//

	//YouTube channel names to import
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-YOUTUBE']//div[contains(@class,'tiles-body')]//span/a"))
	public List<WebElement> ytChnlNamesToImport;

	//Button to import Youtube channels and add to profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-YOUTUBE']//a[contains(@data-original-title,'Add to Profile')]"))
	public List<WebElement> importResultedYtChnl;

	//Youtube channels done Button after importing
	@FindBy(xpath="//*[@id='social-channel-import-YOUTUBE']//button[contains(.,'Done')]")
	public WebElement ytChnlImportDone;


	//=====================================Add YouTube Channels===Admin=====================================//

	//YouTube login id
	@FindBy(how=How.XPATH, using="//*[@id='identifierId']")
	public WebElement ytLoginId;

	//Next button after entering the youtube email or login id
	@FindBy(how=How.XPATH, using="//*[@id='identifierNext']//span")
	public WebElement ytLoginNext;

	//youtube password field
	@FindBy(how=How.XPATH, using="//input[@type='password']")
	public WebElement ytPwd;

	//Youtube sign in button
	@FindBy(how=How.XPATH, using="//*[@id='passwordNext']//span")
	public WebElement ytSignIn;

	//List of youtube channels available while adding youtube channels to profile. Another location for single element is present below
	//*[@id='account-list']//li[starts-with(@id,'account')]//a[contains(.,'sabrina galloway')]
	//	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='account-list']//li[starts-with(@id,'account')]//span[@class='account-name']"))
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@role='presentation']//p[@role='presentation']"))
	public List<WebElement> adminYtChannelToAdd;

	//approve button to add selected youtube channel
	@FindBy(how=How.XPATH, using="//*[@id='submit_approve_access']//span[text()='ALLOW']")
	public WebElement ytApprove;

	//Deny button after selecting the requried youtube channel is selected to add
	@FindBy(how=How.XPATH, using="//*[@id='submit_deny_access']")
	public WebElement ytDeny;

	//*[@id='view_container']//div[@role='presentation']//p[@role='presentation'] YOUTUBE CHANNEL NAMES

	//=====================================Add YouTube Channels===NonAdmin==================================//

	//Non-Admin YouTube Channel search Box
	@FindBy(xpath="//*[@id='ytChannelName']")
	public WebElement nonAdminYtChnlSearchBox;

	//Non-Admin Search button for youtube channels
	@FindBy(xpath="//*[@id='social-channel-nonadmin-YOUTUBE']//button[contains(text(),'Search')]")
	public WebElement nonAdminYtChnlSearchButton;

	//Youtube channels shown after search
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-nonadmin-YOUTUBE']//span/a"))
	public List<WebElement> nonAdminYtChnlFromSearch;

	//add Youtube channels button for the results
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-nonadmin-YOUTUBE']//i"))
	public List<WebElement> addNonAdminYtChnlFromSearch;

	//Youtube channels Done Button
	@FindBy(xpath="//*[@id='social-channel-nonadmin-YOUTUBE']//button[contains(.,'Done')]")
	public WebElement completeYtChnlNonAdminAddition;


	//=====================================Add Tumblr Blogs=====================================//

	//Tumblr Blog Source Accordion/Slider
	@FindBy(xpath="//*[@id='bobcat']//*[@id='accordion']//a[div[div[contains(text(),'Tumblr Blog')]]]")
	public WebElement tumblrSlider;

	//Import Tumblr Blog button for profile
	@FindBy(xpath="//*[@id='collapseFive']//button[contains(text(),'Import')]")
	public WebElement importTumblrBlg;

	//Add Admin Tumblr Blog button
	@FindBy(xpath="//*[@id='collapseFive']//*[@class='panel-body']//button[contains(.,'Add as admin')]")
	public WebElement addAsAdminTumblrBlg;

	//no Tumblr Blog added for the profile
	@FindBy(xpath="//*[@id='social-channel-TMBLOG']//div[starts-with(@class,'row')]//p")
	public WebElement noTumblrBlgAdded;

	//Tumblr Blog added for the profile -- important locator
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-TMBLOG']//span/a"))
	public List<WebElement> tumblrBlgAddedToProfile;

	//Type of Tumblr Blog added for the profile i.e either Admin or Non-Admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-TMBLOG']//span[contains(., 'ADMIN') or contains(., 'NON-ADMIN')]"))
	public List<WebElement> typeOfTumblrBlgForProfile;

	//Removing the Tumblr Blog added from the profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-TMBLOG']//a[@class='remove']"))
	public List<WebElement> removeTumblrBlgFromProfile;

	//Added Total Tumblr Blogs admin and Non-Admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-TMBLOG']//div[contains(@class,'tiles-body')]//span/a"))
	public List<WebElement>  addedTumblrBlg;

	//Added Total Tumblr Blogs admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-TMBLOG']//div[div[span[contains(@class,'label-important')]]]//div[starts-with(@class,'user-name')]//a"))
	public List<WebElement>  addedAdminTumblrBlg;

	//=====================================Add Tumblr Blog===Import====================================//

	//Tumblr Blog names to import
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-TMBLOG']//div[contains(@class,'tiles-body')]//span/a"))
	public List<WebElement> tumblrBlgNamesToImport;

	//Button to import Tumblr Blogs and add to profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-TMBLOG']//a[contains(@data-original-title,'Add to Profile')]"))
	public List<WebElement> importResultedTumblrBlg;

	//Tumblr Blogs done Button after importing
	@FindBy(xpath="//*[@id='social-channel-import-TMBLOG']//button[contains(.,'Done')]")
	public WebElement tumblrBlgImportDone;

	//=====================================Add Tumblr Blogs===Admin=====================================//

	//Tumblr email id field in the first screen
	@FindBy(how=How.XPATH, using="//*[@id='signup_determine_email']")
	public WebElement tumblrBlgSignUpEmailId;

	//Next button after entering the Tumblr Blog Email. Also after entering the user name and password
	@FindBy(how=How.XPATH, using="//*[@id='signup_forms_submit']")
	public WebElement tumblrBlgLogin;

	//Tumblr email id field in the login Screen
	@FindBy(how=How.XPATH, using="//*[@id='signup_email']")
	public WebElement tumblrBlgSignInEmailId;

	//Password for the tumblr blog
	@FindBy(how=How.XPATH, using="//*[@id='signup_password']")
	public WebElement tumblrBlgLoginPwd;

	//approve button for tumblr after entering the user credentials
	@FindBy(how=How.XPATH, using="//form[@method='post']//button[@name='allow']")
	public WebElement tumblrBlgApprove;

	//List of Tumblr Blogs available while adding admin Tumblr Blogs to profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[starts-with(@class,'table-responsive')]//tbody//tr//td[2]"))
	public List<WebElement> adminTumblrBlgToAdd;

	//add button for the Tumblr Blogs while adding admin Tumblr Blogs to profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[starts-with(@class,'table-responsive')]//tbody//tr//td[3]/a"))
	public List<WebElement> addButtonAdminTumblrBlg;

	//Done button after adding the blogs
	@FindBy(how=How.XPATH, using="//*[starts-with(@class,'row')]//input[@value='Done']")
	public WebElement finishAddAdminTumblrBlg;


	//=====================================Add LinkedIn Company Page=====================================//

	//LinkedIn Company Page Source Accordion/Slider
	@FindBy(xpath="//*[@id='bobcat']//*[@id='accordion']//a[div[div[contains(text(),'LinkedIn Company Page')]]]")
	public WebElement lkdnCompSlider;

	//Import LinkedIn Company Page button for profile
	@FindBy(xpath="//*[@id='collapseSix']//button[contains(text(),'Import')]")
	public WebElement importLkdnComp;

	//Add Admin LinkedIn Company Page button
	@FindBy(xpath="//*[@id='collapseSix']//*[@class='panel-body']//button[contains(.,'Add as admin')]")
	public WebElement addAsAdminLkdnComp;

	//no LinkedIn Company Page added for the profile
	@FindBy(xpath="//*[@id='social-channel-LNCOMPAGE']//div[starts-with(@class,'row')]//p")
	public WebElement noLkdnCompAdded;

	// LinkedIn Company Page added for the profile -- important locator
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-LNCOMPAGE']//span/a"))
	public List<WebElement> lkdnCompAddedToProfile;

	//Type of  LinkedIn Company Page added for the profile i.e either Admin or Non-Admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-LNCOMPAGE']//span[contains(., 'ADMIN') or contains(., 'NON-ADMIN')]"))
	public List<WebElement> typeOfLkdnCompForProfile;

	//Removing the LinkedIn Company Page added from the profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-LNCOMPAGE']//a[@class='remove']"))
	public List<WebElement> removeLkdnCompFromProfile;

	//Added Total Linkedin company admin and Non-Admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-LNCOMPAGE']//div[contains(@class,'tiles-body')]//span/a"))
	public List<WebElement>  addedLkdnComp;

	//Added Total Linkedin company Page admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-LNCOMPAGE']//div[div[span[contains(@class,'label-important')]]]//div[starts-with(@class,'user-name')]//a"))
	public List<WebElement>  addedAdminLkdnComp;


	//=====================================Add LinkedIn Company Page===Import====================================//

	//LinkedIn Company Page names to import
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-LNCOMPAGE']//div[contains(@class,'tiles-body')]//span/a"))
	public List<WebElement> lkdnCompNamesToImport;

	//Button to import selected LinkedIn Company Page and add to profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-LNCOMPAGE']//a[contains(@data-original-title,'Add to Profile')]"))
	public List<WebElement> importResultedLkdnComp;

	//LinkedIn Company Page done Button after importing
	@FindBy(xpath="//*[@id='social-channel-import-LNCOMPAGE']//button[contains(.,'Done')]")
	public WebElement lkdnCompImportDone;

	//=====================================Add LinkedIn Company Page===Admin=====================================//

	//LinkedIn Company Page email id field in the first screen
	@FindBy(how=How.XPATH, using="//*[@id='session_key-login']")
	public WebElement lkdnEmailId;

	//Password for the LinkedIn Company Page
	@FindBy(how=How.XPATH, using="//*[@id='session_password-login']")
	public WebElement lkdnPwd;

	//LinkedIn Company Page login button/allow access
	@FindBy(how=How.XPATH, using="//*[@id='btn-primary' and @name='signin']")
	public WebElement lkdnLoginBtn;

	//Cancel button in linkedin login screen
	@FindBy(how=How.XPATH, using="//*[@id='cancelBtn']")
	public WebElement lkdnCancelBtn;

	//List of LinkedIn Company Page available while adding admin LinkedIn Company Page to profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[starts-with(@class,'table-responsive')]//tbody//tr//td[2]"))
	public List<WebElement> adminLkdnCompToAdd;

	//add button for the LinkedIn Company Page while adding admin LinkedIn Company Page to profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[starts-with(@class,'table-responsive')]//tbody//tr//td[3]/a"))
	public List<WebElement> addButtonAdminLkdnComp;

	//Done button after adding the LinkedIn Company Page
	@FindBy(how=How.XPATH, using="//*[starts-with(@class,'row')]//input[@value='Done']")
	public WebElement finishAddAdminLkdnComp;

	//=====================================Add Instagram Perosnal Channel=====================================//

	// Instagram Channel Source Accordion/Slider
	@FindBy(xpath="//*[@id='bobcat']//*[@id='accordion']//a[div[div[contains(text(),'Instagram Account')]]]")
	public WebElement igSlider;

	//Import Instagram Channel button for profile
	@FindBy(xpath="//*[@id='collapseSeven']//button[contains(text(),'Import')]")
	public WebElement importIg;

	//Add Admin Instagram Channel button
	@FindBy(xpath="//*[@id='collapseSeven']//*[@class='panel-body']//button[contains(.,'Add as admin')]")
	public WebElement addAsAdminIg;

	//Add Non-Admin Instagram Channel button
	@FindBy(xpath="//*[@id='collapseSeven']//*[@class='panel-body']//button[contains(.,'Add as non-admin')]")
	public WebElement addAsNonAdminIg;

	//no Instagram Channel added for the profile
	@FindBy(xpath="//*[@id='social-channel-INSTAGRAM']//div[starts-with(@class,'row')]//p")
	public WebElement noIgAdded;

	//Instagram Channel added for the profile -- important locator
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-INSTAGRAM']//span/a"))
	public List<WebElement> igAddedToProfile;

	//Type of Instagram Channel added for the profile i.e either Admin or Non-Admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-INSTAGRAM']//span[contains(., 'ADMIN') or contains(., 'NON-ADMIN')]"))
	public List<WebElement> typeOfIgForProfile;

	//Removing the Instagram Channel added from the profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-INSTAGRAM']//a[@class='remove']"))
	public List<WebElement> removeIgFromProfile;

	//Added Total Instagram Channel admin and Non-Admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-INSTAGRAM']//div[contains(@class,'tiles-body')]//span/a"))
	public List<WebElement>  addedIGPersonal;

	//Added Total Instagram Channel admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-INSTAGRAM']//div[div[span[contains(@class,'label-important')]]]//div[starts-with(@class,'user-name')]//a"))
	public List<WebElement>  addedAdminIGPersonal;

	//Added Total Instagram Channel non admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-INSTAGRAM']//div[div[span[contains(@class,'label-primary')]]]//div[starts-with(@class,'user-name')]//a"))
	public List<WebElement>  addedNonAdminIGPersonal;

	//=====================================Add Instagram Perosnal channel===Import====================================//

	//Instagram channel names to import
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-INSTAGRAM']//div[contains(@class,'tiles-body')]//span/a"))
	public List<WebElement> igNamesToImport;

	//Button to import selected instagram channels and add to profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-INSTAGRAM']//a[contains(@data-original-title,'Add to Profile')]"))
	public List<WebElement> importResultedIg;

	//Instagram channel done Button after importing
	@FindBy(xpath="//*[@id='social-channel-import-INSTAGRAM']//button[contains(.,'Done')]")
	public WebElement igImportDone;

	//=====================================Add Instagram Personal===Admin=====================================//

	//Instagram email id field in the first screen
	@FindBy(how=How.XPATH, using="//*[@name='username']")
	public WebElement igEmailId;

	//Password for the Instagram
	@FindBy(how=How.XPATH, using="//*[@name='password']")
	public WebElement igPwd;

	//Instagram login button
	@FindBy(how=How.XPATH, using="//button[contains(.,'Log in')]")
	public WebElement igLoginBtn;

	//=====================================Add Instagram Personal===NonAdmin==================================//

	//Non-Admin Instagram Channel search Box
	@FindBy(xpath="//*[@id='instagramName']")
	public WebElement nonAdminIGChnlSearchBox;

	//Non-Admin Search button for Instagram channels
	@FindBy(xpath="//*[@id='social-channel-nonadmin-INSTAGRAM']//button[contains(text(),'Search')]")
	public WebElement nonAdminIGChnlSearchButton;

	//Instagram channels shown after search
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-nonadmin-INSTAGRAM']//span/a"))
	public List<WebElement> nonAdminIGChnlFromSearch;

	//add Instagram channels button for the results
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-nonadmin-INSTAGRAM']//i"))
	public List<WebElement> addNonAdminIGChnlFromSearch;

	//Instagram channels Done Button
	@FindBy(xpath="//*[@id='social-channel-nonadmin-INSTAGRAM']//button[contains(.,'Done')]")
	public WebElement completeIGChnlNonAdminAddition;

	//=====================================Add Instagram Business Channel=====================================//

	// Instagram Business Channel Source Accordion/Slider
	@FindBy(xpath="//*[@id='bobcat']//*[@id='accordion']//a[div[div[contains(text(),'Instagram Business')]]]")
	public WebElement igBusSlider;

	//Import Instagram Business Channel button for profile
	@FindBy(xpath="//*[@id='collapsetherteen']//button[contains(text(),'Import')]")
	public WebElement importIgBus;

	//Add Admin Instagram Business Channel button
	@FindBy(xpath="//*[@id='collapsetherteen']//*[@class='panel-body']//button[contains(.,'Add as Admin')]")
	public WebElement addAsAdminIgBus;

	//no Instagram Business Channel added for the profile
	@FindBy(xpath="//*[@id='social-channel-INSTAGRAM_BUSINESS']//div[starts-with(@class,'row')]//p")
	public WebElement noIgBusAdded;

	//Instagram Business Channel added for the profile -- important locator
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-INSTAGRAM_BUSINESS']//span/a"))
	public List<WebElement> igBusAddedToProfile;

	//Type of Instagram Business Channel added for the profile i.e either Admin or Non-Admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-INSTAGRAM_BUSINESS']//span[contains(., 'ADMIN') or contains(., 'NON-ADMIN')]"))
	public List<WebElement> typeOfIgBusForProfile;

	//Removing the Instagram Channel added from the profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-INSTAGRAM_BUSINESS']//a[@class='remove']"))
	public List<WebElement> removeIgBusFromProfile;

	//Added Total Instagram Business Channel admin and Non-Admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-INSTAGRAM_BUSINESS']//div[contains(@class,'tiles-body')]//span/a"))
	public List<WebElement>  addedIGBus;

	//Added Total Instagram Channel admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-INSTAGRAM_BUSINESS']//div[div[span[contains(@class,'label-important')]]]//div[starts-with(@class,'user-name')]//a"))
	public List<WebElement>  addedAdminIGBus;

	//Added Total Instagram Channel non admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-INSTAGRAM_BUSINESS']//div[div[span[contains(@class,'label-primary')]]]//div[starts-with(@class,'user-name')]//a"))
	public List<WebElement>  addedNonAdminIGBusiness;


	//=====================================Add Instagram Business channel===Import====================================//

	//Instagram Business channel names to import
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-INSTAGRAM_BUSINESS']//div[contains(@class,'tiles-body')]//span/a"))
	public List<WebElement> igBusNamesToImport;

	//Button to import selected instagram business channels and add to profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-INSTAGRAM_BUSINESS']//a[contains(@data-original-title,'Add to Profile')]"))
	public List<WebElement> importResultedIgBus;

	//Instagram Business channel done Button after importing
	@FindBy(xpath="//*[@id='social-channel-import-INSTAGRAM_BUSINESS']//button[contains(.,'Done')]")
	public WebElement igBusImportDone;

	//=====================================Add Instagram Business ===Admin=====================================//

	// This will use facebook login so Facebook login will be used

	//=====================================Add Google Plus Page Channel=====================================//

	//Google Plus Page Source Accordion/Slider
	@FindBy(xpath="//*[@id='bobcat']//*[@id='accordion']//a[div[div[contains(text(),'Google+ Page')]]]")
	public WebElement gpPageSlider;

	//Import Google Plus Page button for profile
	@FindBy(xpath="//*[@id='collapseEight']//button[contains(text(),'Import')]")
	public WebElement importGpPage;

	//Add Admin Google Plus Page button
	@FindBy(xpath="//*[@id='collapseEight']//*[@class='panel-body']//button[contains(.,'Add as admin')]")
	public WebElement addAsAdminGpPage;

	//no Google Plus Page added for the profile
	@FindBy(xpath="//*[@id='social-channel-GPPAGE']//div[starts-with(@class,'row')]//p")
	public WebElement noGpPageAdded;

	//Google Plus Page added for the profile -- important locator
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-GPPAGE']//span/a"))
	public List<WebElement> gpPageAddedToProfile;

	//Type of Google Plus Page added for the profile i.e either Admin or Non-Admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-GPPAGE']//span[contains(., 'ADMIN') or contains(., 'NON-ADMIN')]"))
	public List<WebElement> typeOfGpPageForProfile;

	//Removing the Google Plus Page added from the profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-GPPAGE']//a[@class='remove']"))
	public List<WebElement> removeGpPageFromProfile;

	//Added Total google plus Page admin and Non-Admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-GPPAGE']//div[contains(@class,'tiles-body')]//span/a"))
	public List<WebElement>  addedGpPages;

	//Added Total google plus Page admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-GPPAGE']//div[div[span[contains(@class,'label-important')]]]//div[starts-with(@class,'user-name')]//a"))
	public List<WebElement>  addedAdminGpPages;

	//=====================================Add Google Plus Page channel===Import====================================//

	//Google Plus Page names to import
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-GPPAGE']//div[contains(@class,'tiles-body')]//span/a"))
	public List<WebElement> gpPageNamesToImport;

	//Button to import selected Google Plus Page and add to profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-GPPAGE']//a[contains(@data-original-title,'Add to Profile')]"))
	public List<WebElement> importResultedGpPage;

	//Google Plus Page done Button after importing
	@FindBy(xpath="//*[@id='social-channel-import-GPPAGE']//button[contains(.,'Done')]")
	public WebElement gpPageImportDone;

	//=====================================Add Google Plus Page Channel===Admin=====================================//

	//Google Play login id
	@FindBy(how=How.XPATH, using="//*[@id='identifierId']")
	public WebElement gpLoginId;

	//Next button after entering the google user name
	@FindBy(how=How.XPATH, using="//*[@id='identifierNext']//span[contains(., 'Next')]")
	public WebElement gpLoginNext;

	//New Password button for google plus login
	@FindBy(how=How.XPATH, using="//*[@id='password']//input[@type='password']")
	public WebElement gpPassword;

	//Next Button after entering the password
	@FindBy(how=How.XPATH, using="//*[@id='passwordNext']//span[contains(., 'Next')]")
	public WebElement gpPwdNext;

	//deny button after entering the google plus credentials
	@FindBy(how=How.XPATH, using="//*[@id='submit_deny_access']")
	public WebElement gpDeny;

	//approve button after entering the google plus credentials
	@FindBy(how=How.XPATH, using="//*[@id='submit_approve_access']")
	public WebElement gpApprove;

	//Enter the Recovery Email Address
	@FindBy(how=How.XPATH, using="//*[@id='knowledge-preregistered-email-response']")
	public WebElement gpRecoveryEmail;

	//Confirm recovery email
	@FindAll(@FindBy(how = How.XPATH, using = "//div[contains(string(),'Confirm your recovery email')]"))
	public List<WebElement> confirmRecoveryEmail;

	//Next button after entering the email address.
	@FindBy(how=How.XPATH, using="//*[@id='next']")
	public WebElement gpRecoveryNext;

	//List of Google Plus Page available while adding admin Google Plus Page to profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[starts-with(@class,'table-responsive')]//tbody//tr//td[2]"))
	public List<WebElement> adminGpPageToAdd;

	//add button for the Google Plus Page while adding admin Google Plus Page to profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[starts-with(@class,'table-responsive')]//tbody//tr//td[3]/a"))
	public List<WebElement> addButtonAdminGpPage;

	//Done button after adding the Google Plus Page
	@FindBy(how=How.XPATH, using="//*[starts-with(@class,'row')]//input[@value='Done']")
	public WebElement finishAddAdminGpPage;

	//=====================================Add We Chat Account=====================================//

	//We Chat Account Source Accordion/Slider
	@FindBy(xpath="//*[@id='bobcat']//*[@id='accordion']//a[div[div[contains(text(),'WeChat Accounts')]]]")
	public WebElement weChatSlider;

	//Import We Chat Account button for profile
	@FindBy(xpath="//*[@id='collapseNine']//button[contains(text(),'Import')]")
	public WebElement importWeChat;

	//Add Admin We Chat Account button
	@FindBy(xpath="//*[@id='collapseNine']//*[@class='panel-body']//button[contains(.,'Add as admin')]")
	public WebElement addAsAdminWeChat;

	//no We Chat Account added for the profile
	@FindBy(xpath="//*[@id='social-channel-WECHAT']//div[starts-with(@class,'row')]//p")
	public WebElement noWeChatAdded;

	//We Chat Account added for the profile -- important locator
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-WECHAT']//span/a"))
	public List<WebElement> weChatAddedToProfile;

	//Type of We Chat Account added for the profile i.e either Admin or Non-Admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-WECHAT']//span[contains(., 'ADMIN') or contains(., 'NON-ADMIN')]"))
	public List<WebElement> typeOfWeChatForProfile;

	//Removing the We Chat Account added from the profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-WECHAT']//a[@class='remove']"))
	public List<WebElement> removeWeChatFromProfile;

	//Added Total We Chat Account
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-WECHAT']//div[contains(@class,'tiles-body')]//span/a"))
	public List<WebElement>  addedWeChat;

	//Added Total We Chat Account admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-WECHAT']//div[div[span[contains(@class,'label-important')]]]//div[starts-with(@class,'user-name')]//a"))
	public List<WebElement>  addedAdminWeChat;

	//=====================================Add WeChat channel===Import====================================//

	//WeChat names to import
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-WECHAT']//div[contains(@class,'tiles-body')]//span/a"))
	public List<WebElement> weChatNamesToImport;

	//Button to import selected WeChat and add to profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-WECHAT']//a[contains(@data-original-title,'Add to Profile')]"))
	public List<WebElement> importResultedWeChat;

	//WeChat done Button after importing
	@FindBy(xpath="//*[@id='social-channel-import-WECHAT']//button[contains(.,'Done')]")
	public WebElement weChatImportDone;

	//=====================================Add WeChat channel===Admin====================================//

	//WeChat ID of the admin Account
	@FindBy(xpath="//*[@id='wcId']")
	public WebElement weChatID;

	//WeChat App id of the admin account
	@FindBy(xpath="//*[@id='wcAppId']")
	public WebElement weChatAppId;

	//WeChat App secret of the account
	@FindBy(xpath="//*[@id='wcAppSecret']")
	public WebElement weChatAppSecret;

	//WeChat Name of the admin account
	@FindBy(xpath="//*[@id='wcName']")
	public WebElement weChatName;
	//*[@id='fine-uploader-validation']//input[@name='file']

	//WeChat Picture
	@FindBy(xpath="//*[@id='fine-uploader-validation']//input[@name='file']")
	public WebElement weChatActPic;

	//WeChat done Button after importing
	@FindBy(xpath="//*[@id='social-channel-add-WECHAT']//button[contains(.,'ADD')]")
	public WebElement weChatAddComplete;

	//=====================================Add Google Play App=====================================//

	//Google Play App Source Accordion/Slider
	@FindBy(xpath="//*[@id='bobcat']//*[@id='accordion']//a[div[div[contains(text(),'Google Play')]]]")
	public WebElement gPlaySlider;

	//Import Google Play App button for profile
	@FindBy(xpath="//*[@id='collapseTen']//button[contains(text(),'Import')]")
	public WebElement importGPlay;

	//Add Admin Google Play App button
	@FindBy(xpath="//*[@id='collapseTen']//*[@class='panel-body']//button[contains(.,'Add as admin')]")
	public WebElement addAsAdminGPlay;

	//no Google Play App added for the profile
	@FindBy(xpath="//*[@id='social-channel-GOOGLEPLAY']//div[starts-with(@class,'row')]//p")
	public WebElement noGPlayAdded;

	//Google Play App added for the profile -- important locator
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-GOOGLEPLAY']//span/a"))
	public List<WebElement> gPlayAddedToProfile;

	//Type of Google Play App added for the profile i.e either Admin or Non-Admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-GOOGLEPLAY']//span[contains(., 'ADMIN') or contains(., 'NON-ADMIN')]"))
	public List<WebElement> typeOfGPlayForProfile;

	//Removing the Google Play App added from the profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-GOOGLEPLAY']//a[@class='remove']"))
	public List<WebElement> removeGPlayFromProfile;

	//Added Total Google Play App admin and Non-Admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-GOOGLEPLAY']//div[contains(@class,'tiles-body')]//span/a"))
	public List<WebElement>  addedGPlay;

	//Added Total Google Play App admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-GOOGLEPLAY']//div[div[span[contains(@class,'label-important')]]]//div[starts-with(@class,'user-name')]//a"))
	public List<WebElement>  addedAdminGPlay;

	//Added Total Google Play non admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-GOOGLEPLAY']//div[div[span[contains(@class,'label-primary')]]]//div[starts-with(@class,'user-name')]//a"))
	public List<WebElement>  addedNonAdminGPlay;


	//=====================================Add Google Play===Import====================================//

	//Google play app names to import
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-GOOGLEPLAY']//div[contains(@class,'tiles-body')]//span/a"))
	public List<WebElement> gPlayActNamesToImport;

	//Button to import selected Google play app and add to profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-GOOGLEPLAY']//a[contains(@data-original-title,'Add to Profile')]"))
	public List<WebElement> importResultedGPlayApp;

	//Google play app done Button after importing
	@FindBy(xpath="//*[@id='social-channel-import-GOOGLEPLAY']//button[contains(.,'Done')]")
	public WebElement gPlayImportDone;

	//=====================================Add Google Play===Admin====================================//

	//Google App Name of the admin Account
	@FindBy(xpath="//*[@id='appName']")
	public WebElement gPlayAppName;

	//Google App Package Name of the admin Account
	@FindBy(xpath="//*[@id='appPackageName']")
	public WebElement gPlayPkgName;

	//Google App Client Id of the admin Account
	@FindBy(xpath="//*[@id='clientId']")
	public WebElement gPlayClientId;

	//Google App Client Secret of the admin Account
	@FindBy(xpath="//*[@id='clientSecret']")
	public WebElement gPlayClientSecret;

	//Save button for Google App Details while adding the app details
	@FindBy(xpath="//*[@id='addAcctForm']//input[@data-original-title='Save']")
	public WebElement gPlaySaveDtls;

	//Google App Name of the admin Account
	@FindBy(xpath="//*[@id='addAcctForm']//input[@value='Cancel']")
	public WebElement gPlayCancel;

	//Google Play login id
	@FindBy(how=How.XPATH, using="//*[@id='identifierId']")
	public WebElement gPlayLoginId;

	//Next button after entering the Google Play user name
	@FindBy(how=How.XPATH, using="//*[@id='identifierNext']//span[contains(., 'Next')]")
	public WebElement gPlayUserNameNext;

	// Google Play New Password field
	@FindBy(how=How.XPATH, using="//*[@id='password']//input[@type='password']")
	public WebElement gPlayLoginPwd;

	// Google Play New Password button
	@FindBy(how=How.XPATH, using="//*[@id='passwordNext']//span[contains(., 'Next')]")
	public WebElement gPlayLoginPwdNext;

	//approve button to add selected Google Play
	@FindBy(how=How.XPATH, using="//*[@id='submit_approve_access']")
	public WebElement gPlayAddApprove;

	//Google Play Deny Permission
	@FindBy(how=How.XPATH, using="//*[@id='submit_deny_access']")
	public WebElement gPlayAddDeny;

	//=====================================Add Itunes  Channel=====================================//

	// Itunes Channel Source Accordion/Slider
	@FindBy(xpath="//*[@id='bobcat']//*[@id='accordion']//a[div[div[contains(text(),'iTunes')]]]")
	public WebElement itunesSlider;

	//Import Itunes Channel button for profile
	@FindBy(xpath="//*[@id='collapse_11']//button[contains(text(),'Import')]")
	public WebElement importITunes;

	//no itunes Channel added for the profile
	@FindBy(xpath="//*[@id='social-channel-ITUNES']//div[starts-with(@class,'row')]//p")
	public WebElement noITunesAdded;

	//ITunes Channel added for the profile -- important locator
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-ITUNES']//span/a"))
	public List<WebElement> itunesAddedToProfile;

	//Type of ITunes Channel added for the profile i.e either Admin or Non-Admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-ITUNES']//span[contains(., 'ADMIN') or contains(., 'NON-ADMIN')]"))
	public List<WebElement> typeOfITunesForProfile;

	//Removing the ITunes Channel added from the profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-ITUNES']//a[@class='remove']"))
	public List<WebElement> removeITunesFromProfile;

	//Added Total ITunes admin and Non-Admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-FACEBOOK']//div[contains(@class,'tiles-body')]//span/a"))
	public List<WebElement>  addedITunes;

	//Added Total ITunes admin
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-FACEBOOK']//div[div[span[contains(@class,'label-important')]]]//div[starts-with(@class,'user-name')]//a"))
	public List<WebElement>  addedAdminITunes;

	//=====================================Add ITunes channel===Import====================================//

	//ITunes channel names to import
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-ITUNES']//div[contains(@class,'tiles-body')]//span/a"))
	public List<WebElement> itunesNamesToImport;

	//Button to import selected itunes channels and add to profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='social-channel-import-ITUNES']//a[contains(@data-original-title,'Add to Profile')]"))
	public List<WebElement> importResultedITunes;

	//ITunes channel done Button after importing
	@FindBy(xpath="//*[@id='social-channel-import-ITUNES']//button[contains(.,'Done')]")
	public WebElement itunesImportDone;

	//=====================================SPAM SETTINGS=====================================//

	//Spam words for the profile
	@FindBy(xpath="//*[@id='neg_words']")
	public WebElement spamWords;

	//Update button for the spam words
	@FindBy(xpath="//*[@id='koala']//button[contains(text(),'Update')]")
	public WebElement updateSpamWords;

	//Facebook Spam Words
	@FindBy(xpath="//*[@id='neg_fb_acct_list']")
	public WebElement fbSpamList;

	//Twitter Add to Spam button
	@FindBy(xpath="//*[@id='koala']//button[contains(text(),'Add to spam')]")
	public WebElement addTwtSpam;

	//Search box for twitter spam account
	@FindBy(xpath="//*[@id='twitterScreenName']")
	public WebElement spamTwtActSearchBox;

	//Spam Search button for twitter accounts
	@FindBy(xpath="//*[@id='spam-channel-add-twitter']//button[contains(text(),'Search')]")
	public WebElement spamTwtActSearchButton;

	//Results from the twitter account for SPAM search
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='spam-channel-add-twitter']//span/a"))
	public List<WebElement> spamTwtActFromSearch;

	//add Twitter account button for the results to add the accounts to SPAM
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='spam-channel-add-twitter']//i"))
	public List<WebElement> addSpamTwtActFromSearch;

	//Complete adding spam twitter account by clicking on this DONE button
	@FindBy(xpath="//*[@id='spam-channel-add-twitter']//button[contains(.,'Done')]")
	public WebElement completeTwtActSpamAddition;

	//Spam emails that shouldn't be shown in the profile
	@FindBy(xpath="//*[@id='neg_emails]")
	public WebElement spamEmailSenders;

	//Update spam email senders 
	@FindBy(xpath="//*[@class='form-group']//button[contains(@onclick,'saveSpamEmails')]")
	public WebElement updateSpamEmailers;



	//=====================================Share Profile with user settings=====================================//

	//Select Drop down which shows how many users to be displayed in one page 10/25/50/100
	@FindBy(xpath="//*[@id='share_user_length']/label/select")
	public WebElement userSizeInOnePage;

	//User search box in the user table while create/edit the profile
	@FindBy(xpath="//*[@id='share_user_filter']//input")
	public WebElement userSearch;

	//List of users check box for the current page
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='share_user']//td[1]/div/input"))
	public List<WebElement> userChkBoxList;

	//List of users email id present in the current page
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='share_user']//td[2]//span"))
	public List<WebElement> userEmailList;

	//*[@id='share_user']//span[@class='selection']//span[2]/b
	//User role drop down while sharing the profile
	@FindAll(@FindBy(how = How.XPATH, using = "//*[@id='share_user']//span[@class='selection']//span[@role='combobox']"))
	public List<WebElement> userRoleDropDown;

	//role selection
	@FindBy(xpath="//*[@name='profileUsers.roleId']")
	public WebElement selectRole;

	//Search box in the role drop down while sharing the profile
	@FindBy(xpath="//span[starts-with(@class,select2-results)]//ul/li[1]")
	public WebElement roleDropDownSearch;

	//pages present in user share, reduce the count by two as this includes previous and next 
	@FindBy(xpath="//*[@id='share_user_wrapper']//li[not(@class='next') and not(contains(@class,'prev'))]/a")
	public WebElement pagesInUserShare;

	//Save Profile user settings with the roles given
	@FindBy(xpath="//*[@id='racoon']//button[contains(.,'Update')]")
	public WebElement saveProfileUserSettings;

	//After completion of profile creation, click on Done button to go to Home Screen
	@FindBy(xpath="//*[@id='racoon']//button[contains(.,'Done')]")
	public WebElement completeProfileCreation;







}
