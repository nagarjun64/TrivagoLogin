package actions.listen;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.ListAutoNumber;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actions.listen.ListenUtils.replyOptions;
import helpers.Hooks;
import helpers.Log;
import helpers.ReadConfig;
import helpers.SimplifyUtils;
import helpers.SocialLogin;
import pageobjects.UIMenu;
import pageobjects.Listen.UIListenProfileCreation;
import stepDefinitions.Listen.SDListenProfileCreation;

/**
 * @author nagarjunareddy
 *
 */

public class ProfileCreationAction {

	final Logger log = Logger.getLogger(this.getClass().getName());

	WebDriver driver;


	public ProfileCreationAction()
	{
		driver = Hooks.driver;
	}

	public void closeConfirmationMessages() {

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils utils = new SimplifyUtils();

		if (profileCreation.closeConfirmationMessages.size()>0 && profileCreation.closeConfirmationMessages.get(0).isDisplayed()) {

			for (int i = 0; i < profileCreation.closeConfirmationMessages.size(); i++) {

				profileCreation.closeConfirmationMessages.get(i).click();
			} 
		}
	}

	//===========================================1=Profile Information===========================================//

	//Enter the profile name and volume based on the user input
	public void setProfileNameAndVolume(String ProfileName, String Volume){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils utils = new SimplifyUtils();

		utils.waitForElementToBeClickable(profileCreation.createNewProfile, 15);

		profileCreation.profileName.sendKeys(ProfileName);

		profileCreation.profileVolumeToSet.sendKeys(Volume);

		utils.pause(1000);

	}

	//Save the profile and Volume of the profile. If the profile is new, driver will click on create. If the profile is existing, driver will click on Update
	public void saveNameAndVolume(){

		UIListenProfileCreation profCreate = new UIListenProfileCreation(driver);
		SimplifyUtils utils = new SimplifyUtils();

		utils.waitForElementToBeClickable(profCreate.createNewProfile, 5);

		if(profCreate.createNewProfile.isDisplayed()){

			profCreate.createNewProfile.click();
		}
		else if(profCreate.updateExistingProfile.isDisplayed()){

			profCreate.updateExistingProfile.click();

		}

		utils.pause(1000);

		utils.waitForElementToBeClickable(profCreate.createNewProfile, 3);

		this.closeConfirmationMessages();
	}

	//pending optimisation
	public void saveNameAndVolumeOptimised(){

		UIListenProfileCreation profCreate = new UIListenProfileCreation(driver);
		SimplifyUtils utils = new SimplifyUtils();

		utils.waitForElementToBeClickable(profCreate.createNewProfile, 5);

		profCreate.createNewProfile.click();

		utils.pause(1000);

		//		utils.waitForElementToBeClickable(profCreate.createNewProfile, 3);

		this.closeConfirmationMessages();
	}

	public Boolean isProfileNameNotAddedErrPresent() {

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils utils = new SimplifyUtils();

		utils.pause(100);

		boolean errMsgPresent = profileCreation.errNoProfileName.isDisplayed();

		return errMsgPresent;

	} 

	public Boolean isProfileVolumeNotAddedErrPresent() {

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils utils = new SimplifyUtils();

		utils.pause(100);

		boolean errMsgPresent = profileCreation.errNoProfileVolume.isDisplayed();

		return errMsgPresent;

	} 

	//===========================================2=Profile Settings===========================================//

	public void turnCaseAssociationOn(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitTillElementFound(profileCreation.caseAssociation, 5);

		if(profileCreation.caseAssociationDisabled.isDisplayed())
		{
			profileCreation.caseAssociation.click();
		}
	}

	public void turnCaseAssociationOff(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitTillElementFound(profileCreation.caseAssociation, 10);

		if(profileCreation.caseAssociationEnabled.isDisplayed()){

			profileCreation.caseAssociation.click();

		}

	}

	/*	public boolean IsCaseAssociationOn(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.scrollInToView(profileCreation.profileSettingsTitle);

		sutils.waitTillElementFound(profileCreation.caseAssociation, 10);

		return profileCreation.caseAssociationEnabled.isDisplayed();
	}
	 */	 

	/*	public boolean IsCaseAssociationOff(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.scrollInToView(profileCreation.profileSettingsTitle);

		sutils.waitTillElementFound(profileCreation.caseAssociation, 10);

		return profileCreation.caseAssociationDisabled.isDisplayed();
	}
	 */

	//Verifying if the case association is enabled 
	public boolean caseAssociationStatus() {

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		boolean  AssociationStatus = false;


		sutils.scrollInToView(profileCreation.profileSettingsTitle);
		sutils.waitTillElementFound(profileCreation.caseAssociation, 10);


		if(profileCreation.caseAssociationEnabled.isDisplayed()) 
		{
			AssociationStatus = true;
		}
		else if (profileCreation.caseAssociationDisabled.isDisplayed()) 
		{
			AssociationStatus = false;
		}


		return AssociationStatus ;
	} 

	public void setCaseAssociationDuration(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();


		sutils.waitTillElementFound(profileCreation.caseAssociation, 60);

		sutils.selectElementByValue(profileCreation.caseAssociationDuration, "15");

	}

	public void setCaseAssociationDuration(String durationforAssociation){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitTillElementFound(profileCreation.caseAssociation, 60);

		sutils.selectElementByValue(profileCreation.caseAssociationDuration, durationforAssociation);

	}

	//Setting the reply option based as "Reply"
	public String setReplyOption(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		String replyOption = ListenUtils.replyOptions.REPLY.toString();

		sutils.waitForElementToBeClickable(profileCreation.replySetting, 10);

		sutils.selectElementByValue(profileCreation.replySetting,replyOption);
		log.info("Selected the Reply options as \"Reply\" ");

		return replyOption;
	}

	//Setting the reply option based on the user Input
	public String setReplyOption(String replyOption){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitForElementToBeClickable(profileCreation.replySetting, 10);
		sutils.selectElementByValue(profileCreation.replySetting, replyOption);

		return replyOption;
	}

	//Matching if the set reply option and saved reply option is same. Will match only for reply option
	public boolean selectedReplyOption() {

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		boolean rplyOptnMatchStatus = false;

		sutils.scrollInToView(profileCreation.profileSettingsTitle);
		sutils.waitTillElementFound(profileCreation.caseAssociation, 10);

		String SelectedRplyOptn = profileCreation.selectedReplyStng.getText();

		if (ListenUtils.replyOptions.REPLY.toString().equalsIgnoreCase(SelectedRplyOptn))
		{
			rplyOptnMatchStatus = true;
		}
		else if (!ListenUtils.replyOptions.REPLY.toString().equalsIgnoreCase(SelectedRplyOptn)) 
		{
			rplyOptnMatchStatus = false;
		}

		return rplyOptnMatchStatus;

	}

	public void saveProfileSettings(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitForElementToBeClickable(profileCreation.saveProfileSettings, 10);

		profileCreation.saveProfileSettings.click();

		sutils.pause(3000);

		this.closeConfirmationMessages();

	}

	//===========================================3=Keyword Combination Setup===========================================//

	public void skipAddSubQuery(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitForElementToBeClickable(profileCreation.skipAddingSubquery, 10);

		profileCreation.skipAddingSubquery.click();


	}

	public void confirmAddSubquery(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitForElementToBeClickable(profileCreation.skipAddingSubquery, 10);

		profileCreation.confirmAddSubQuery.click();

	}

	public void addSubQueryRow(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitForElementToBeClickable(profileCreation.confirmAddSubQuery, 10);

		profileCreation.addAnotherSubquery.click();

	}

	public void saveSubqueriess(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		if (profileCreation.updateSubQuery.size()>0) {

			profileCreation.updateSubQuery.get(0).click();

		}
		/*else if (profileCreation.saveSubQueries.size()>0) {

			profileCreation.saveSubQueries.get(0).click();

		}
		 */
		sutils.pause(3000);

		this.closeConfirmationMessages();
	}

	public void deleteSubquery(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		if(profileCreation.deleteSubQuery.size()>0) 
		{
			sutils.waitForElementToBeClickable(profileCreation.deleteSubQuery.get(0), 10);
		}

		sutils.pause(200);

		profileCreation.updateSubQuery.get(0).click();

	}

	public void deleteSubquery(String SubQueryName)
	{
		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		for(int i =0; i< profileCreation.subQueryNames.size(); i++) 
		{
			sutils.waitForElementToBeClickable(profileCreation.deleteSubQuery.get(0), 10);

			if(profileCreation.deleteSubQuery.get(i).getText().equalsIgnoreCase(SubQueryName)) 
			{
				profileCreation.deleteSubQuery.get(i);
			}
		} 
		profileCreation.updateSubQuery.get(0).click();
	}

	public List<String> fillFirstSubqueryDetails(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		SDListenProfileCreation listenProfileCreation = new SDListenProfileCreation();

		List<String> subQueryDetails = new ArrayList<>();

		String SubQueryName = "Query" + sutils.profileNameGen().substring(6);
		//		SubQueryName = "Query" + sutils.profileNameGen().substring(6);
		String WordsToTrack = "Social CRM";
		String AllWords = "Social CRM";
		String AnyWords = "Social CRM";
		String NotWords = "Social CRM";
		String Country = "India";
		String Language = "en";

		subQueryDetails.add(SubQueryName);
		subQueryDetails.add(WordsToTrack);
		subQueryDetails.add(AllWords);
		subQueryDetails.add(AnyWords);
		subQueryDetails.add(NotWords);
		subQueryDetails.add(Country);
		subQueryDetails.add(Language);

		sutils.waitTillElementFound(profileCreation.addSubQueryTitle, 20);

		sutils.waitTillElementFound(profileCreation.firstSubqueryName, 20);

		//if the slider is closed, then expand
		if (profileCreation.subQuerySlider.get(0).getAttribute("aria-expanded").equalsIgnoreCase("true"))
		{
			profileCreation.addSubQueryTitle.click();
		}

		//Entering the subquery and other keywords
		profileCreation.profileKeyWordSetup.click();
		profileCreation.firstSubqueryName.sendKeys(SubQueryName);
		profileCreation.firstSetUpWordToTrack.sendKeys(WordsToTrack);
		profileCreation.firstSetUpAllWords.sendKeys(AllWords);
		profileCreation.firstSetUpAnyWords.sendKeys(AnyWords);
		profileCreation.firstSetUpNotWords.sendKeys(NotWords);

		//Selecting Country
		sutils.selectElementByVisibleText(profileCreation.firstSetUpSelectCountry, Country);

		sutils.pause(1000);

		profileCreation.firstSetUpNotWords.click();

		sutils.scrollInToView(profileCreation.firstSetUpInvertLocation);

		sutils.turnOnIosSwitch(profileCreation.firstSetUpInvertLocationDisabled, profileCreation.firstSetUpInvertLocation);

		sutils.pause(1000);

		sutils.scrollInToView(profileCreation.firstSetUpApplyLocation);

		sutils.turnOnIosSwitch(profileCreation.firstSetUpApplyLocationDisabled, profileCreation.firstSetUpApplyLocation);

		sutils.pause(1000);

		sutils.turnOffIosSwitch(profileCreation.firstSetUpPublicTwitterEnabled, profileCreation.firstSetUpPublicTwitter);

		sutils.pause(1000);

		//Selecting Language
		sutils.selectElementByValue(profileCreation.firstSetUpSelectLanguage, Language);

		sutils.pause(1000);

		return subQueryDetails;

	}

	public void fillFirstSubqueryDetails(String SubQueryName, String WordsToTrack, String AllWords,String AnyWords, String NotWords, String Country, String Language){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitTillElementFound(profileCreation.addSubQueryTitle, 20);

		sutils.waitTillElementFound(profileCreation.firstSubqueryName, 20);

		if (profileCreation.firstSubqueryName.getAttribute("aria-expanded").equalsIgnoreCase("false"))
		{
			profileCreation.addSubQueryTitle.click();
		}

		profileCreation.firstSubqueryName.sendKeys(SubQueryName);
		profileCreation.firstSetUpWordToTrack.sendKeys(WordsToTrack);
		profileCreation.firstSetUpAllWords.sendKeys(AllWords);
		profileCreation.firstSetUpAnyWords.sendKeys(AnyWords);
		profileCreation.firstSetUpNotWords.sendKeys(NotWords);

		//		((JavascriptExecutor) driver).executeScript("scroll(0,1000)");

		sutils.selectElementByValue(profileCreation.firstSetUpSelectCountry, Country);

		sutils.scrolltoElementUsingCoordinates(profileCreation.firstSetUpInvertLocation);

		sutils.turnOnIosSwitch(profileCreation.firstSetUpInvertLocationDisabled, profileCreation.firstSetUpInvertLocation);

		sutils.scrolltoElementUsingCoordinates(profileCreation.firstSetUpApplyLocation);

		sutils.turnOnIosSwitch(profileCreation.firstSetUpApplyLocationDisabled, profileCreation.firstSetUpApplyLocation);

		sutils.turnOffIosSwitch(profileCreation.firstSetUpPublicTwitterEnabled, profileCreation.firstSetUpPublicTwitter);

	}

	public List<String> fillSecondSubqueryDetails(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		SDListenProfileCreation listenProfileCreation = new SDListenProfileCreation();

		List<String> subQueryDetails = new ArrayList<>();

		String SubQueryName = "Query" + sutils.profileNameGen().substring(6);
		//		SubQueryName = "Query" + sutils.profileNameGen().substring(6);
		String WordsToTrack = "Social CRM";
		String AllWords = "Social CRM";
		String AnyWords = "Social CRM";
		String NotWords = "Social CRM";
		String Country = "India";
		String Language = "en";

		subQueryDetails.add(SubQueryName);
		subQueryDetails.add(WordsToTrack);
		subQueryDetails.add(AllWords);
		subQueryDetails.add(AnyWords);
		subQueryDetails.add(NotWords);
		subQueryDetails.add(Country);
		subQueryDetails.add(Language);

		//		sutils.waitTillElementFound(profileCreation.addSubQueryTitle, 20);

		sutils.waitTillElementFound(profileCreation.secondSubqueryName, 7);

		//if the slider is closed, then expand
		if (profileCreation.subQuerySlider.get(1).getAttribute("aria-expanded").equalsIgnoreCase("true"))
		{
			profileCreation.addSubQueryTitle.click();
		}

		//entering the sub query and other words
		profileCreation.profileKeyWordSetup.click();
		profileCreation.secondSubqueryName.sendKeys(SubQueryName);
		profileCreation.secondSetUpWordToTrack.sendKeys(WordsToTrack);
		profileCreation.secondSetUpAllWords.sendKeys(AllWords);
		profileCreation.secondSetUpAnyWords.sendKeys(AnyWords);
		profileCreation.secondSetUpNotWords.sendKeys(NotWords);

		//Selecting Country
		sutils.selectElementByVisibleText(profileCreation.secondSetUpSelectCountry, Country);

		sutils.pause(1000);

		profileCreation.secondSetUpNotWords.click();

		sutils.scrollInToView(profileCreation.secondSetUpInvertLocation);

		sutils.turnOnIosSwitch(profileCreation.secondSetUpInvertLocationDisabled, profileCreation.secondSetUpInvertLocation);

		sutils.pause(1000);

		sutils.scrollInToView(profileCreation.secondSetUpApplyLocation);

		sutils.turnOnIosSwitch(profileCreation.secondSetUpApplyLocationEnabled, profileCreation.secondSetUpApplyLocation);

		sutils.pause(1000);

		sutils.turnOffIosSwitch(profileCreation.secondSetUpPublicTwitterEnabled, profileCreation.secondSetUpPublicTwitter);

		sutils.pause(1000);

		//Selecting Language
		sutils.selectElementByValue(profileCreation.secondSetUpSelectLanguage, Language);

		sutils.pause(1000);

		return subQueryDetails;

	}

	public List<String> getSubqueryNames(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		List<String> subqueryName = new ArrayList<>();

		sutils.scrollInToView(profileCreation.subQueryNames.get(0));

		for(int i=0; i<profileCreation.subQueryNames.size();i++) {

			subqueryName.add(profileCreation.subQueryNames.get(i).getText());

		}

		return subqueryName;

	}

	//===========================================4-1=Social Channels=Facebook Page==========================================//

	public void expandFbpageSlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		profileCreation.profileSocialChannels.click();

		if(profileCreation.fbPageAccordion.getAttribute("aria-expanded").equalsIgnoreCase("false"))
		{

			profileCreation.fbPageAccordion.click();

		}

	}

	public void closeFbpageSlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);

		profileCreation.profileSocialChannels.click();

		if(profileCreation.fbPageAccordion.getAttribute("aria-expanded").equalsIgnoreCase("true"))
		{

			profileCreation.fbPageAccordion.click();

		}

	}

	public String importFbPagesToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String pageadded = null;

		sutils.waitForElementToBeClickable(profileCreation.importFbpage, 10);

		profileCreation.importFbpage.click();

		sutils.waitTillElementFound(profileCreation.fbPagesAvailableToImport.get(0), 10);

		pageadded = profileCreation.fbPageNamesToImport.get(0).getText();

		profileCreation.importResultedFbPages.get(0).click();

		profileCreation.fbPageImportDone.click();

		return pageadded;

	}

	public String importFbPagesToProfile(String fbPageToImport){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String pageadded = null;

		sutils.waitForElementToBeClickable(profileCreation.importFbpage, 10);

		profileCreation.importFbpage.click();

		sutils.pause(2000);

		if(profileCreation.fbPagesAvailableToImport.size()>0)
		{
			for(int i=0; i<profileCreation.importResultedFbPages.size();i++)
			{

				if(profileCreation.fbPageNamesToImport.get(i).getText().equalsIgnoreCase(fbPageToImport))

				{
					pageadded = profileCreation.fbPageNamesToImport.get(i).getText();

					profileCreation.importResultedFbPages.get(i).click();
				}

			}
		}

		profileCreation.fbPageImportDone.click();

		return pageadded;

	}

	public ArrayList<String> addAdminFbPageToProfile( int CountOfPagesToAdd){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		ArrayList<String> pageadded = new ArrayList<String>();

		sutils.waitForElementToBeClickable(profileCreation.importFbpage, 10);

		String ProfileCreationWindowHandle = driver.getWindowHandle();

		profileCreation.addAdminFbpage.click();

		sutils.switchToNewWindow();

		sutils.waitForElementToBeClickable(profileCreation.fbLoginEmail, 20);

		profileCreation.fbLoginEmail.sendKeys("nagarjun64@hotmail.com");

		profileCreation.fbLoginPassword.sendKeys("Simplify360*");

		profileCreation.fbLoginButton.click();

		sutils.waitForElementToBeClickable(profileCreation.finishAddAdminFbPage, 20);

		while (profileCreation.adminFbPagesToAdd.size() > 0)

		{
			pageadded.add(profileCreation.adminFbPagesToAdd.get(0).getText());

			profileCreation.addButtonAdminFbPages.get(0).click();

			sutils.pause(5000);

			break;
		}

		//		profileCreation.finishAddAdminFbPage.click();

		driver.close();

		sutils.switchToWindow(ProfileCreationWindowHandle);

		return pageadded;

	}

	public String addAdminFbPageToProfile(String AdminFbPageToAdd){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		ReadConfig readConfig = new ReadConfig();

		String pageadded = null;

		sutils.waitForElementToBeClickable(profileCreation.importFbpage, 10);

		String ProfileCreationWindowHandle = driver.getWindowHandle();

		profileCreation.addAdminFbpage.click();

		sutils.switchToNewWindow();

		sutils.waitForElementToBeClickable(profileCreation.fbLoginEmail, 20);

		profileCreation.fbLoginEmail.sendKeys(readConfig.fbAccount);

		profileCreation.fbLoginPassword.sendKeys(readConfig.fbAccountPassword);

		profileCreation.fbLoginButton.click();

		sutils.waitForElementToBeClickable(profileCreation.finishAddAdminFbPage, 10);

		for(int i=0; i < profileCreation.adminFbPagesToAdd.size();i++)
		{
			if(profileCreation.adminFbPagesToAdd.get(i).getText().equals(AdminFbPageToAdd))
			{
				pageadded = profileCreation.adminFbPagesToAdd.get(i).getText();

				profileCreation.addButtonAdminFbPages.get(i).click();

				sutils.pause(5000);

				break;
			}
		}

		//		profileCreation.finishAddAdminFbPage.click();

		driver.close();

		sutils.switchToWindow(ProfileCreationWindowHandle);

		return pageadded;
	}

	public String addAdminFbPageToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		ReadConfig readConfig = new ReadConfig();

		String pageadded = null;

		sutils.waitForElementToBeClickable(profileCreation.importFbpage, 10);

		String ProfileCreationWindowHandle = driver.getWindowHandle();

		profileCreation.addAdminFbpage.click();

		sutils.switchToNewWindow();

		sutils.waitForElementToBeClickable(profileCreation.fbLoginEmail, 20);

		profileCreation.fbLoginEmail.sendKeys(readConfig.fbAccount);

		profileCreation.fbLoginPassword.sendKeys(readConfig.fbAccountPassword);

		profileCreation.fbLoginButton.click();

		sutils.waitForElementToBeClickable(profileCreation.finishAddAdminFbPage, 10);

		pageadded = profileCreation.adminFbPagesToAdd.get(0).getText();

		profileCreation.addButtonAdminFbPages.get(0).click();

		sutils.pause(3000);

		//		profileCreation.finishAddAdminFbPage.click();

		driver.close();

		sutils.switchToWindow(ProfileCreationWindowHandle);

		return pageadded;
	}

	public String addNonAdminFbPagesToProfile(String PageToAdd){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String pageImported = null;

		sutils.pause(200);

		sutils.scrolltoElementUsingCoordinates(profileCreation.addNonAdminFbpage);

		profileCreation.addNonAdminFbpage.click();

		sutils.waitTillElementFound(profileCreation.nonAdminFbPageSearchBox, 5);

		profileCreation.nonAdminFbPageSearchBox.sendKeys(PageToAdd);

		profileCreation.nonAdminFbSearchButton.click();

		sutils.waitForElementToBeClickable(profileCreation.nonAdminFbPageFromSearch.get(0), 10);

		((JavascriptExecutor) driver).executeScript("scroll( 0,700)");

		for (int i=0; i< profileCreation.nonAdminFbPageFromSearch.size();i++)
		{

			sutils.scrolltoElementUsingCoordinates(profileCreation.addNonAdminFbPageFromSearch.get(i));

			if (profileCreation.nonAdminFbPageFromSearch.get(i).getText().equalsIgnoreCase(PageToAdd))
			{
				pageImported = profileCreation.nonAdminFbPageFromSearch.get(i).getText();

				System.err.println(pageImported);

				profileCreation.addNonAdminFbPageFromSearch.get(i).click();

				sutils.pause(500);

				break;

			}
		}

		profileCreation.completeFbPageNonAdminAddition.click();

		return pageImported;

	}

	//list of pages added admin fb pages
	public  List<String> getAddedAdminFbPages() {

		UIListenProfileCreation uiprofileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		List<String> addedAdminFbPages = new ArrayList<String>();

		int totalAdminPages = uiprofileCreation.addedAdminFbPages.size();

		for(int i = 0;i<totalAdminPages; i++) {

			addedAdminFbPages.add(uiprofileCreation.addedAdminFbPages.get(i).getText());
		}

		return addedAdminFbPages;

	}

	//===========================================4-2=Social Channels=Twitter==========================================//

	public void expandTwtSourceSlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		profileCreation.profileSocialChannels.click();

		if(profileCreation.twtAccordion.getAttribute("aria-expanded").equalsIgnoreCase("false"))
		{

			profileCreation.twtAccordion.click();

		}

	}

	public void closeTwtSourceSlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		profileCreation.profileSocialChannels.click();

		if(profileCreation.twtAccordion.getAttribute("aria-expanded").equalsIgnoreCase("true"))
		{

			profileCreation.twtAccordion.click();

		}

	}

	public String importTwtActsToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		String actAdded = null;

		try 
		{
			sutils.waitForElementToBeClickable(profileCreation.importTwtAct, 10);

			profileCreation.importTwtAct.click();

			sutils.waitTillElementFound(profileCreation.twtActAvailableToImport.get(0), 10);

			actAdded = profileCreation.twtActNamesToImport.get(0).getText();

			profileCreation.importResultedTwtAct.get(0).click();

			profileCreation.twtActImportDone.click();
		} 
		catch (Exception e) 
		{
			log.error("importTwtActsToProfile"+ e);
		}
		return actAdded;
	}

	public String importTwtActToProfile(String actToImport){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String actAdded = null;

		sutils.waitForElementToBeClickable(profileCreation.importTwtAct, 10);

		profileCreation.importTwtAct.click();

		sutils.pause(2000);

		if(profileCreation.twtActAvailableToImport.size()>0)
		{
			for(int i=0; i<profileCreation.twtActNamesToImport.size();i++)
			{

				if(profileCreation.twtActNamesToImport.get(i).getText().equalsIgnoreCase(actToImport))

				{
					actAdded = profileCreation.twtActNamesToImport.get(i).getText();

					profileCreation.importResultedTwtAct.get(i).click();
				}

			}
		}

		profileCreation.twtActImportDone.click();

		return actAdded;

	}

	public String addAdminTwtActToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitForElementToBeClickable(profileCreation.importTwtAct, 10);

		String ProfileCreationWindowHandle = driver.getWindowHandle();

		profileCreation.addAdminTwtAct.click();

		sutils.switchToNewWindow();

		sutils.waitForElementToBeClickable(profileCreation.twtAuthorizeApp, 20);

		profileCreation.twtLoginEmail.sendKeys(ReadConfig.twitterAccount);

		profileCreation.twtLoginPassword.sendKeys(ReadConfig.twitterAccountPassword);

		profileCreation.twtAuthorizeApp.click();

		sutils.pause(2000);

		sutils.switchToWindow(ProfileCreationWindowHandle);

		String addedTwtAcct = ReadConfig.twitterAccount;

		return addedTwtAcct;

	}

	public void addAdminTwtActToProfile(String TwtUserName, String Password){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitForElementToBeClickable(profileCreation.importFbpage, 10);

		String ProfileCreationWindowHandle = driver.getWindowHandle();

		profileCreation.addAdminTwtAct.click();

		sutils.switchToNewWindow();

		sutils.waitForElementToBeClickable(profileCreation.twtAuthorizeApp, 20);

		profileCreation.twtLoginEmail.sendKeys(TwtUserName);

		profileCreation.twtLoginPassword.sendKeys(Password);

		profileCreation.twtAuthorizeApp.click();

		sutils.pause(2000);

		sutils.switchToWindow(ProfileCreationWindowHandle);

	}

	public String addNonAdminTwtActToProfile(String actToAdd){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String pageImported = null;

		sutils.pause(200);

		sutils.scrolltoElementUsingCoordinates(profileCreation.addNonAdminFbpage);

		profileCreation.addNonAdminTwtAct.click();

		sutils.waitTillElementFound(profileCreation.nonAdminTwtActSearchBox, 5);

		profileCreation.nonAdminTwtActSearchBox.sendKeys(actToAdd);

		profileCreation.nonAdminTwtActSearchButton.click();

		sutils.waitForElementToBeClickable(profileCreation.addNonAdminTwtActFromSearch.get(0), 10);

		((JavascriptExecutor) driver).executeScript("scroll( 0,700)");

		for (int i=0; i< profileCreation.nonAdminTwtActFromSearch.size();i++)
		{

			sutils.scrolltoElementUsingCoordinates(profileCreation.addNonAdminTwtActFromSearch.get(i));

			if (profileCreation.nonAdminFbPageFromSearch.get(i).getText().equalsIgnoreCase(actToAdd))
			{
				pageImported = profileCreation.nonAdminFbPageFromSearch.get(i).getText();

				profileCreation.addNonAdminFbPageFromSearch.get(i).click();

				sutils.pause(500);

				break;

			}
		}

		profileCreation.completeFbPageNonAdminAddition.click();

		return pageImported;

	}

	//list of pages added admin twitter accounts
	public  List<String> getAddedAdminTwts() {

		UIListenProfileCreation uiprofileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		List<String> addedAdminTwtActs = new ArrayList<String>();

		int totalAdminPages = uiprofileCreation.addedAdminTwtActs.size();

		for(int i = 0;i<totalAdminPages; i++) {

			addedAdminTwtActs.add(uiprofileCreation.addedAdminTwtActs.get(i).getText());
		}

		return addedAdminTwtActs;

	}

	//===========================================4-3=Social Channels=Facebook Groups==========================================//

	public void expandFbGrpSourceSlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		profileCreation.profileSocialChannels.click();

		if(profileCreation.fbGrpAccordion.getAttribute("aria-expanded").equalsIgnoreCase("false"))
		{

			profileCreation.fbGrpAccordion.click();

		}


	}

	public void closeFbGrpSourceSlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.scrolltoElementUsingCoordinates(profileCreation.fbGrpAccordion);

		if(profileCreation.fbGrpAccordion.getAttribute("aria-expanded").equalsIgnoreCase("true"))
		{

			profileCreation.fbGrpAccordion.click();

		}

	}

	public String importFbGrpsToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String fbGrpAdded = null;

		sutils.waitForElementToBeClickable(profileCreation.importFbGrp, 10);

		profileCreation.importFbGrp.click();

		sutils.waitForElementToBeClickable(profileCreation.fbGrpImportDone, 10);

		fbGrpAdded = profileCreation.fbGrpNamesToImport.get(0).getText();

		profileCreation.importResultedFbGrp.get(0).click();

		profileCreation.fbGrpImportDone.click();

		return fbGrpAdded;

	}

	public String importFbGrpToProfile(String FbGroupToImport){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String fbGrpAdded = null;

		sutils.waitForElementToBeClickable(profileCreation.importFbGrp, 10);

		profileCreation.importFbGrp.click();

		sutils.pause(2000);

		if(profileCreation.twtActAvailableToImport.size()>0)
		{
			for(int i=0; i<profileCreation.fbGrpNamesToImport.size();i++)
			{

				if(profileCreation.fbGrpNamesToImport.get(i).getText().equalsIgnoreCase(FbGroupToImport))

				{
					fbGrpAdded = profileCreation.fbGrpNamesToImport.get(i).getText();

					profileCreation.importResultedFbGrp.get(i).click();
				}

			}
		}

		profileCreation.fbGrpImportDone.click();

		return fbGrpAdded;

	}

	public ArrayList<String> addAdminFbGrpToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		ArrayList<String> fbGrpAdded = new ArrayList<String>();

		sutils.waitForElementToBeClickable(profileCreation.importFbGrp, 10);

		String ProfileCreationWindowHandle = driver.getWindowHandle();

		profileCreation.addAdminFbGrp.click();

		sutils.switchToNewWindow();

		sutils.waitForElementToBeClickable(profileCreation.fbLoginEmail, 20);

		profileCreation.fbLoginEmail.sendKeys("nagarjun64@hotmail.com");

		profileCreation.fbLoginPassword.sendKeys("Simplify360*");

		profileCreation.fbLoginButton.click();

		sutils.waitForElementToBeClickable(profileCreation.finishAddAdminFbGrp, 20);

		while (profileCreation.adminFbGrpToAdd.size() > 0)

		{
			fbGrpAdded.add(profileCreation.adminFbGrpToAdd.get(0).getText());

			profileCreation.addButtonAdminFbGrp.get(0).click();

			sutils.pause(5000);

			break;
		}


		driver.close();

		sutils.switchToWindow(ProfileCreationWindowHandle);

		return fbGrpAdded;

	}

	public String addAdminFbGrpToProfile(String AdminFbGrpToAdd){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String pageadded = null;

		sutils.waitForElementToBeClickable(profileCreation.importFbGrp, 10);

		String ProfileCreationWindowHandle = driver.getWindowHandle();

		profileCreation.addAdminFbGrp.click();

		sutils.switchToNewWindow();

		sutils.waitForElementToBeClickable(profileCreation.fbLoginEmail, 20);

		profileCreation.fbLoginEmail.sendKeys("nagarjun64@hotmail.com");

		profileCreation.fbLoginPassword.sendKeys("Simplify360*");

		profileCreation.fbLoginButton.click();

		sutils.waitForElementToBeClickable(profileCreation.finishAddAdminFbGrp, 10);

		for(int i=0; i < profileCreation.adminFbGrpToAdd.size();i++)
		{
			if(profileCreation.adminFbGrpToAdd.get(i).getText().equals(AdminFbGrpToAdd))
			{
				pageadded = profileCreation.adminFbGrpToAdd.get(i).getText();

				profileCreation.addButtonAdminFbGrp.get(i).click();

				sutils.pause(5000);

				break;
			}
		}

		driver.close();

		sutils.switchToWindow(ProfileCreationWindowHandle);

		return pageadded;
	}

	//list of pages added admin twitter accounts
	/*public  List<String> getAddedAdminTwts() {

		UIListenProfileCreation uiprofileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		List<String> addedAdminTwtActs = new ArrayList<String>();

		int totalAdminPages = uiprofileCreation.addedAdminTwtActs.size();

		for(int i = 0;i<totalAdminPages; i++) {

			addedAdminTwtActs.add(uiprofileCreation.addedAdminTwtActs.get(i).getText());
		}

		return addedAdminTwtActs;

	}*/

	//===========================================4-4=Social Channels=YouTube Channels==========================================//

	public void expandYTChannelSlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		profileCreation.profileSocialChannels.click();

		if(profileCreation.ytAccordion.getAttribute("aria-expanded").equalsIgnoreCase("false"))
		{

			profileCreation.ytAccordion.click();

		}

	}

	public void closeYTChannelSlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);

		if(profileCreation.ytAccordion.getAttribute("aria-expanded").equalsIgnoreCase("true"))
		{

			profileCreation.ytAccordion.click();

		}

	}

	public String importYTChannelToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String pageadded = null;

		sutils.waitForElementToBeClickable(profileCreation.importYtChnl, 10); //Wait for import channel button to appear

		profileCreation.importYtChnl.click(); // Click on Import channel button

		sutils.waitTillElementFound(profileCreation.ytChnlNamesToImport.get(0), 10); // Wait till channels appear to import

		pageadded = profileCreation.ytChnlNamesToImport.get(0).getText(); // getting the first channel name available to import 

		profileCreation.importResultedYtChnl.get(0).click(); // Click on add button of first youtube channel available to import

		profileCreation.ytChnlImportDone.click();

		return pageadded;

	}

	public String importYTChannelToProfile(String ytChannelToImport){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String pageadded = null;

		sutils.waitForElementToBeClickable(profileCreation.importYtChnl, 10); //Wait for import channel button to appear

		profileCreation.importYtChnl.click(); // Click on Import channel button

		sutils.pause(2000);

		if(profileCreation.ytChnlNamesToImport.size()>0) //Check if there arechannels are present to import
		{
			for(int i=0; i<profileCreation.importResultedYtChnl.size();i++)
			{

				if(profileCreation.ytChnlNamesToImport.get(i).getText().equalsIgnoreCase(ytChannelToImport))

				{
					pageadded = profileCreation.ytChnlNamesToImport.get(i).getText();

					profileCreation.importResultedYtChnl.get(i).click();
				}

			}
		}

		profileCreation.fbPageImportDone.click();

		return pageadded;

	}

	public String addAdminYtChannelToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		SocialLogin login = new SocialLogin();

		String channelAdded = null;

		sutils.waitForElementToBeClickable(profileCreation.addAsAdminYtChnl, 10);

		String ProfileCreationWindowHandle = driver.getWindowHandle();

		sutils.pause(1000);

		profileCreation.addAsAdminYtChnl.click();

		sutils.switchToNewWindow();

		login.youtubeLogin();

		sutils.waitForElementToBeClickable(profileCreation.adminYtChannelToAdd.get(0), 10);

		channelAdded = profileCreation.adminYtChannelToAdd.get(0).getText();

		profileCreation.adminYtChannelToAdd.get(0).click();

		sutils.pause(1000);

		sutils.scrollInToView(profileCreation.ytApprove);

		profileCreation.ytApprove.click();

		sutils.pause(5000);

		//		driver.close();

		sutils.switchToWindow(ProfileCreationWindowHandle);

		return channelAdded;

	}

	public String addAdminYtChannelToProfile(String ChannelToAdd){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		SocialLogin login = new SocialLogin();

		String pageadded = null;

		sutils.waitForElementToBeClickable(profileCreation.addAsAdminYtChnl, 10);

		String ProfileCreationWindowHandle = driver.getWindowHandle();

		profileCreation.addAsAdminYtChnl.click();

		sutils.switchToNewWindow();

		login.youtubeLogin();

		sutils.waitForElementToBeClickable(profileCreation.adminYtChannelToAdd.get(0), 10);

		for(int i=0; i < profileCreation.adminYtChannelToAdd.size();i++)
		{
			if(profileCreation.adminYtChannelToAdd.get(i).getText().equals(ChannelToAdd))
			{
				pageadded = profileCreation.adminYtChannelToAdd.get(i).getText();

				profileCreation.adminYtChannelToAdd.get(i).click();

				sutils.pause(5000);

				break;
			}
		}

		driver.close();

		sutils.switchToWindow(ProfileCreationWindowHandle);

		return pageadded;
	}

	public String addNonAdminYtChnlToProfile(String ChannelToAdd){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String pageImported = null;

		sutils.pause(200);

		sutils.scrolltoElementUsingCoordinates(profileCreation.addAsNonAdminYtChnl);

		profileCreation.addAsNonAdminYtChnl.click();

		sutils.waitTillElementFound(profileCreation.nonAdminYtChnlSearchBox, 5);

		profileCreation.nonAdminYtChnlSearchBox.sendKeys(ChannelToAdd);

		profileCreation.nonAdminYtChnlSearchButton.click();

		sutils.waitForElementToBeClickable(profileCreation.nonAdminYtChnlFromSearch.get(0), 10);

		((JavascriptExecutor) driver).executeScript("scroll( 0,700)");

		for (int i=0; i< profileCreation.nonAdminYtChnlFromSearch.size();i++)
		{

			sutils.scrolltoElementUsingCoordinates(profileCreation.addNonAdminYtChnlFromSearch.get(i));

			if (profileCreation.addNonAdminYtChnlFromSearch.get(i).getText().equalsIgnoreCase(ChannelToAdd))
			{
				pageImported = profileCreation.addNonAdminYtChnlFromSearch.get(i).getText();

				System.err.println(pageImported);

				profileCreation.addNonAdminYtChnlFromSearch.get(i).click();

				sutils.pause(500);

				break;

			}
		}

		profileCreation.completeYtChnlNonAdminAddition.click();

		return pageImported;

	}

	//List of pages added admin youtube channels
	public  List<String> getAddedAdminYtChnls() {

		UIListenProfileCreation uiprofileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		List<String> addedAdminYtChnls = new ArrayList<String>();

		int totalAdminPages = uiprofileCreation.addedAdminYTChnl.size();

		for(int i = 0;i<totalAdminPages; i++) {

			addedAdminYtChnls.add(uiprofileCreation.addedAdminYTChnl.get(i).getText());
		}

		return addedAdminYtChnls;

	}

	//===========================================4-5=Social Channels=Tumblr Blogs==========================================//

	public void expandTumblrSlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		profileCreation.profileSocialChannels.click();

		if(profileCreation.tumblrSlider.getAttribute("aria-expanded").equalsIgnoreCase("false"))
		{

			profileCreation.tumblrSlider.click();

		}

	}

	public void closeTumblrSlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);

		if(profileCreation.tumblrSlider.getAttribute("aria-expanded").equalsIgnoreCase("true"))
		{

			profileCreation.tumblrSlider.click();

		}

	}

	public String importTumblrBlgsToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String blogAdded = null;

		sutils.waitForElementToBeClickable(profileCreation.importTumblrBlg, 10);

		profileCreation.importTumblrBlg.click();

		sutils.waitTillElementFound(profileCreation.tumblrBlgNamesToImport.get(0), 10);

		blogAdded = profileCreation.tumblrBlgNamesToImport.get(0).getText();

		profileCreation.importResultedTumblrBlg.get(0).click();

		profileCreation.tumblrBlgImportDone.click();

		return blogAdded;

	}

	public String importTumblrBlgsToProfile(String BlogToAdd){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String BlogAdded = null;

		sutils.waitForElementToBeClickable(profileCreation.importTumblrBlg, 10);

		profileCreation.importTumblrBlg.click();

		sutils.waitTillElementFound(profileCreation.tumblrBlgNamesToImport.get(0), 10);

		if(profileCreation.tumblrBlgNamesToImport.size()>0)
		{
			for(int i=0; i<profileCreation.importResultedTumblrBlg.size();i++)
			{

				if(profileCreation.tumblrBlgNamesToImport.get(i).getText().equalsIgnoreCase(BlogToAdd))

				{
					BlogAdded = profileCreation.tumblrBlgNamesToImport.get(i).getText();

					profileCreation.importResultedTumblrBlg.get(i).click();
				}

			}
		}

		profileCreation.tumblrBlgImportDone.click();

		return BlogAdded;

	}

	public ArrayList<String> addAdminTumblrBlgsToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		SocialLogin login = new SocialLogin();

		ArrayList<String> pageadded = new ArrayList<String>();

		sutils.waitForElementToBeClickable(profileCreation.addAsAdminTumblrBlg, 10);

		String ProfileCreationWindowHandle = driver.getWindowHandle();

		profileCreation.addAsAdminTumblrBlg.click();

		sutils.switchToNewWindow();

		login.tumblrLogin();

		sutils.waitForElementToBeClickable(profileCreation.finishAddAdminTumblrBlg, 20);

		while (profileCreation.adminTumblrBlgToAdd.size() > 0)

		{
			pageadded.add(profileCreation.adminTumblrBlgToAdd.get(0).getText());

			profileCreation.addButtonAdminTumblrBlg.get(0).click();

			sutils.pause(5000);

			break;
		}

		driver.close();

		sutils.switchToWindow(ProfileCreationWindowHandle);

		return pageadded;

	}

	public String addAdminTumblrBlgsToProfile(String BlogToAdd){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		SocialLogin login = new SocialLogin();

		String BlogAdded = null;

		sutils.waitForElementToBeClickable(profileCreation.addAsAdminTumblrBlg, 10);

		String ProfileCreationWindowHandle = driver.getWindowHandle();

		profileCreation.addAsAdminTumblrBlg.click();

		sutils.switchToNewWindow();

		sutils.waitForElementToBeClickable(profileCreation.fbLoginEmail, 20);

		login.tumblrLogin();

		sutils.waitForElementToBeClickable(profileCreation.finishAddAdminTumblrBlg, 10);

		for(int i=0; i < profileCreation.adminTumblrBlgToAdd.size();i++)
		{
			if(profileCreation.adminTumblrBlgToAdd.get(i).getText().equals(BlogAdded))
			{
				BlogAdded = profileCreation.adminTumblrBlgToAdd.get(i).getText();

				profileCreation.addButtonAdminTumblrBlg.get(i).click();

				sutils.pause(5000);

				break;
			}
		}

		driver.close();

		sutils.switchToWindow(ProfileCreationWindowHandle);

		return BlogAdded;
	}

	//list of pages added admin twitter accounts
	/*	public  List<String> getAddedAdminTwts() {

		UIListenProfileCreation uiprofileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		List<String> addedAdminTwtActs = new ArrayList<String>();

		int totalAdminPages = uiprofileCreation.addedAdminTwtActs.size();

		for(int i = 0;i<totalAdminPages; i++) {

			addedAdminTwtActs.add(uiprofileCreation.addedAdminTwtActs.get(i).getText());
		}

		return addedAdminTwtActs;

	}*/

	//===========================================4-6=Social Channels=Linkedin Company Blogs==========================================//

	public void expandLkdnCompSlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		profileCreation.profileSocialChannels.click();

		if(profileCreation.lkdnCompSlider.getAttribute("aria-expanded").equalsIgnoreCase("false"))
		{

			profileCreation.lkdnCompSlider.click();

		}

	}

	public void closeLkdnCompSlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.scrolltoElementUsingCoordinates(profileCreation.lkdnCompSlider);

		if(profileCreation.lkdnCompSlider.getAttribute("aria-expanded").equalsIgnoreCase("true"))
		{

			profileCreation.lkdnCompSlider.click();

		}

	}

	public String importLkdnCompToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String PageAdded = null;

		sutils.waitForElementToBeClickable(profileCreation.importLkdnComp, 10);

		profileCreation.importLkdnComp.click();

		sutils.waitTillElementFound(profileCreation.lkdnCompNamesToImport.get(0), 10);

		PageAdded = profileCreation.lkdnCompNamesToImport.get(0).getText();

		profileCreation.importResultedLkdnComp.get(0).click();

		profileCreation.lkdnCompImportDone.click();

		return PageAdded;

	}

	public String importLkdnCompToProfile(String PageToAdd){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String PageAdded = null;

		sutils.waitForElementToBeClickable(profileCreation.importLkdnComp, 10);

		profileCreation.importLkdnComp.click();

		sutils.waitTillElementFound(profileCreation.lkdnCompNamesToImport.get(0), 10);

		if(profileCreation.lkdnCompNamesToImport.size()>0)
		{
			for(int i=0; i<profileCreation.lkdnCompNamesToImport.size();i++)
			{

				if(profileCreation.lkdnCompNamesToImport.get(i).getText().equalsIgnoreCase(PageToAdd))

				{
					PageAdded = profileCreation.lkdnCompNamesToImport.get(i).getText();

					profileCreation.importResultedLkdnComp.get(i).click();
				}

			}
		}

		profileCreation.lkdnCompImportDone.click();

		return PageAdded;

	}

	public ArrayList<String> addAdminLkdnCompToProfile(int CountOfPagesToAdd){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		SocialLogin login = new SocialLogin();

		ArrayList<String> CompPageAdded = new ArrayList<String>();

		sutils.waitForElementToBeClickable(profileCreation.addAsAdminLkdnComp, 10);

		String ProfileCreationWindowHandle = driver.getWindowHandle();

		profileCreation.addAsAdminLkdnComp.click();

		sutils.switchToNewWindow();

		login.lkdCompLogin();

		sutils.waitForElementToBeClickable(profileCreation.finishAddAdminLkdnComp, 20);

		while (profileCreation.adminLkdnCompToAdd.size() > 0)

		{
			CompPageAdded.add(profileCreation.adminLkdnCompToAdd.get(0).getText());

			profileCreation.addButtonAdminLkdnComp.get(0).click();

			sutils.pause(5000);

			break;
		}

		driver.close();

		sutils.switchToWindow(ProfileCreationWindowHandle);

		return CompPageAdded;

	}

	//Method to add a linkedin page and return
	public String addAdminLkdnCompToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		SocialLogin login = new SocialLogin();

		String CompPageAdded;

		sutils.waitForElementToBeClickable(profileCreation.addAsAdminLkdnComp, 10);

		String ProfileCreationWindowHandle = driver.getWindowHandle();

		profileCreation.addAsAdminLkdnComp.click();

		sutils.switchToNewWindow();

		login.lkdCompLogin();

		sutils.waitForElementToBeClickable(profileCreation.finishAddAdminLkdnComp, 20);

		CompPageAdded=profileCreation.adminLkdnCompToAdd.get(0).getText();

		profileCreation.addButtonAdminLkdnComp.get(0).click();

		driver.close();

		sutils.switchToWindow(ProfileCreationWindowHandle);

		return CompPageAdded;

	}

	public String addAdminLkdnCompToProfile(String CompPageToAdd){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		SocialLogin login = new SocialLogin();

		String CompPageAdded = null;

		sutils.waitForElementToBeClickable(profileCreation.addAsAdminLkdnComp, 10);

		String ProfileCreationWindowHandle = driver.getWindowHandle();

		profileCreation.addAsAdminLkdnComp.click();

		sutils.pause(1000);

		sutils.switchToNewWindow();

		sutils.waitForElementToBeClickable(profileCreation.fbLoginEmail, 20);

		login.lkdCompLogin();

		sutils.waitForElementToBeClickable(profileCreation.finishAddAdminLkdnComp, 10);

		for(int i=0; i < profileCreation.adminLkdnCompToAdd.size();i++)
		{
			if(profileCreation.adminLkdnCompToAdd.get(i).getText().equals(CompPageAdded))
			{
				CompPageAdded = profileCreation.adminLkdnCompToAdd.get(i).getText();

				profileCreation.addButtonAdminLkdnComp.get(i).click();

				sutils.pause(3000);

				break;
			}
		}

		driver.close();

		sutils.switchToWindow(ProfileCreationWindowHandle);

		return CompPageAdded;
	}

	//list of pages added admin linkedin company pages
	public  List<String> getAddedAdminLkdnCompPgs() {

		UIListenProfileCreation uiprofileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		List<String> addedAdminTwtActs = new ArrayList<String>();

		int totalAdminPages = uiprofileCreation.addedAdminLkdnComp.size();

		for(int i = 0;i<totalAdminPages; i++) {

			addedAdminTwtActs.add(uiprofileCreation.addedAdminLkdnComp.get(i).getText());
		}

		return addedAdminTwtActs;

	}

	//===========================================4-7=Social Channels=Instagram Personal Channels==========================================//

	public void expandInstaSlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		profileCreation.profileSocialChannels.click();

		if(profileCreation.igSlider.getAttribute("aria-expanded").equalsIgnoreCase("false"))
		{

			profileCreation.igSlider.click();

		}

	}

	public void closeInstaSlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		if(profileCreation.igSlider.getAttribute("aria-expanded").equalsIgnoreCase("true"))
		{

			profileCreation.igSlider.click();

		}

	}

	public String importInstaActToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String ChannelAdded = null;

		sutils.waitForElementToBeClickable(profileCreation.importYtChnl, 10); //Wait for import channel button to appear

		profileCreation.importYtChnl.click(); // Click on Import channel button

		sutils.waitTillElementFound(profileCreation.igNamesToImport.get(0), 10); // Wait till channels appear to import

		ChannelAdded = profileCreation.igNamesToImport.get(0).getText(); // getting the first channel name available to import 

		profileCreation.importResultedIg.get(0).click(); // Click on add button of first youtube channel available to import

		profileCreation.igImportDone.click();

		return ChannelAdded;

	}

	public String importInstaActToProfile(String ytChannelToImport){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String ChannelAdded = null;

		sutils.waitForElementToBeClickable(profileCreation.importIg, 10); //Wait for import channel button to appear

		profileCreation.importIg.click(); // Click on Import channel button

		sutils.pause(2000);

		if(profileCreation.igNamesToImport.size()>0) //Check if there arechannels are present to import
		{
			for(int i=0; i<profileCreation.igNamesToImport.size();i++)
			{

				if(profileCreation.igNamesToImport.get(i).getText().equalsIgnoreCase(ytChannelToImport))

				{
					ChannelAdded = profileCreation.igNamesToImport.get(i).getText();

					profileCreation.importResultedIg.get(i).click();
				}

			}
		}

		profileCreation.igImportDone.click();

		return ChannelAdded;

	}

	public String addAdminInstaActToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		SocialLogin login = new SocialLogin();

		sutils.waitForElementToBeClickable(profileCreation.addAsAdminIg, 10);

		String ProfileCreationWindowHandle = driver.getWindowHandle();

		profileCreation.addAsAdminIg.click();

		sutils.switchToNewWindow();

		String addedInstaPersonalAct = 	login.iGPersonalActLogin();

		sutils.switchToWindow(ProfileCreationWindowHandle);

		return addedInstaPersonalAct;

	}

	public String addNonAdminInstaActToProfile(String ChannelToAdd){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String ChannelAdded = null;

		sutils.pause(200);

		sutils.scrolltoElementUsingCoordinates(profileCreation.addAsNonAdminIg);

		profileCreation.addAsNonAdminIg.click();

		sutils.waitTillElementFound(profileCreation.nonAdminIGChnlSearchBox, 5);

		profileCreation.nonAdminIGChnlSearchBox.sendKeys(ChannelToAdd);

		profileCreation.nonAdminIGChnlSearchButton.click();

		sutils.waitForElementToBeClickable(profileCreation.nonAdminIGChnlFromSearch.get(0), 10);

		((JavascriptExecutor) driver).executeScript("scroll( 0,700)");

		for (int i=0; i< profileCreation.nonAdminIGChnlFromSearch.size();i++)
		{

			sutils.scrolltoElementUsingCoordinates(profileCreation.nonAdminIGChnlFromSearch.get(i));

			if (profileCreation.nonAdminIGChnlFromSearch.get(i).getText().equalsIgnoreCase(ChannelToAdd))
			{
				ChannelAdded = profileCreation.nonAdminIGChnlFromSearch.get(i).getText();

				System.err.println(ChannelAdded);

				profileCreation.addNonAdminIGChnlFromSearch.get(i).click();

				sutils.pause(500);

				break;

			}
		}

		profileCreation.completeIGChnlNonAdminAddition.click();

		return ChannelAdded;

	}

	//list of pages added admin twitter accounts
	public  List<String> getAddedAdminIgPer() {

		UIListenProfileCreation uiprofileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		List<String> addedAdminIgPerActs = new ArrayList<String>();

		int totalAdminPages = uiprofileCreation.addedAdminIGPersonal.size();

		for(int i = 0;i<totalAdminPages; i++) {

			addedAdminIgPerActs.add(uiprofileCreation.addedAdminIGPersonal.get(i).getText());
		}

		return addedAdminIgPerActs;

	}

	//===========================================4-8=Social Channels=Google Plus Page==========================================//

	public void expandGpPageSlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		profileCreation.profileSocialChannels.click();

		if(profileCreation.gpPageSlider.getAttribute("aria-expanded").equalsIgnoreCase("false"))
		{

			profileCreation.gpPageSlider.click();

		}

	}

	public void closeGpPagelusSlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);

		if(profileCreation.gpPageSlider.getAttribute("aria-expanded").equalsIgnoreCase("true"))
		{

			profileCreation.gpPageSlider.click();

		}

	}

	public String importGpPageToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String pageadded = null;

		expandGplaySlider();

		sutils.waitForElementToBeClickable(profileCreation.importGpPage, 10);

		profileCreation.importGpPage.click();

		sutils.waitTillElementFound(profileCreation.gpPageNamesToImport.get(0), 10);

		pageadded = profileCreation.gpPageNamesToImport.get(0).getText();

		profileCreation.importResultedGpPage.get(0).click();

		profileCreation.gpPageImportDone.click();

		return pageadded;

	}

	public String importGpPagesToProfile(String GPlusPageToImport){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String pageadded = null;

		expandGplaySlider();

		sutils.waitForElementToBeClickable(profileCreation.importGpPage, 10);

		profileCreation.importGpPage.click();

		sutils.pause(2000);

		if(profileCreation.gpPageNamesToImport.size()>0)
		{
			for(int i=0; i<profileCreation.gpPageNamesToImport.size();i++)
			{

				if(profileCreation.gpPageNamesToImport.get(i).getText().equalsIgnoreCase(GPlusPageToImport))

				{
					pageadded = profileCreation.gpPageNamesToImport.get(i).getText();

					profileCreation.importResultedGpPage.get(i).click();
				}

			}
		}

		profileCreation.gpPageImportDone.click();

		return pageadded;

	}

	//Add multiple pages to profile
	public ArrayList<String> addAdminGpPageToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		SocialLogin login = new SocialLogin();

		expandGplaySlider();

		ArrayList<String> pageadded = new ArrayList<String>();

		sutils.waitForElementToBeClickable(profileCreation.addAsAdminGpPage, 10);

		String ProfileCreationWindowHandle = driver.getWindowHandle();

		profileCreation.addAsAdminGpPage.click();

		sutils.switchToNewWindow();

		login.gPlusLogin();

		sutils.waitForElementToBeClickable(profileCreation.finishAddAdminGpPage, 20);

		while (profileCreation.adminGpPageToAdd.size() > 0)

		{
			pageadded.add(profileCreation.adminGpPageToAdd.get(0).getText());

			profileCreation.addButtonAdminGpPage.get(0).click();

			sutils.pause(5000);

			break;
		}

		driver.close();

		sutils.switchToWindow(ProfileCreationWindowHandle);

		return pageadded;

	}

	//Add only one google plus page
	public String addOneAdminGpPageToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		SocialLogin login = new SocialLogin();

		sutils.waitForElementToBeClickable(profileCreation.addAsAdminGpPage, 10);

		String ProfileCreationWindowHandle = driver.getWindowHandle();
		
		sutils.pause(1000);

		profileCreation.addAsAdminGpPage.click();

		sutils.switchToNewWindow();
		
		sutils.pause(1000);

		login.gPlusLogin();

		String channelAdded = profileCreation.adminGpPageToAdd.get(0).getText();

		profileCreation.addButtonAdminGpPage.get(0).click();
		
		profileCreation.finishAddAdminGpPage.click();

		sutils.pause(3000);

//		driver.close();

		sutils.switchToWindow(ProfileCreationWindowHandle);

		return channelAdded;

	}

	public String addAdminGpPageToProfile(String AdminGPPageToAdd){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		SocialLogin login = new SocialLogin();

		String pageadded = null;

		expandGplaySlider();

		sutils.waitForElementToBeClickable(profileCreation.addAsAdminGpPage, 10);

		String ProfileCreationWindowHandle = driver.getWindowHandle();

		profileCreation.addAsAdminGpPage.click();

		sutils.switchToNewWindow();

		login.gPlusLogin();

		sutils.waitForElementToBeClickable(profileCreation.finishAddAdminGpPage, 10);

		for(int i=0; i < profileCreation.adminGpPageToAdd.size();i++)
		{
			if(profileCreation.adminGpPageToAdd.get(i).getText().equals(AdminGPPageToAdd))
			{
				pageadded = profileCreation.adminGpPageToAdd.get(i).getText();

				profileCreation.addButtonAdminGpPage.get(i).click();

				sutils.pause(5000);

				break;
			}
		}

		driver.close();

		sutils.switchToWindow(ProfileCreationWindowHandle);

		return pageadded;
	}

	//list of pages added admin Google Plus Pages
		public  List<String> getAddedAdminGpPages() {

		UIListenProfileCreation uiprofileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		List<String> addedAdminGpPages = new ArrayList<String>();

		int totalAdminPages = uiprofileCreation.addedAdminGpPages.size();

		for(int i = 0;i<totalAdminPages; i++) {

			addedAdminGpPages.add(uiprofileCreation.addedAdminGpPages.get(i).getText());
		}

		return addedAdminGpPages;

	}
	 
	//===========================================4-9=Social Channels=WeChat==========================================//

	public void expandWeChatPageSlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		profileCreation.profileSocialChannels.click();

		if(profileCreation.weChatSlider.getAttribute("aria-expanded").equalsIgnoreCase("false"))
		{

			profileCreation.weChatSlider.click();

		}

	}

	public void closeWeChatSlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);

		if(profileCreation.weChatSlider.getAttribute("aria-expanded").equalsIgnoreCase("true"))
		{

			profileCreation.weChatSlider.click();

		}

	}

	public String importWeChatToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String pageadded = null;

		this.expandWeChatPageSlider();

		sutils.waitForElementToBeClickable(profileCreation.importWeChat, 10);

		profileCreation.importWeChat.click();

		sutils.waitTillElementFound(profileCreation.weChatNamesToImport.get(0), 10);

		pageadded = profileCreation.weChatNamesToImport.get(0).getText();

		profileCreation.importResultedWeChat.get(0).click();

		profileCreation.weChatImportDone.click();

		return pageadded;

	}

	public String importWeChatToProfile(String WeChatToImport){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String pageadded = null;

		this.expandWeChatPageSlider();

		sutils.waitForElementToBeClickable(profileCreation.importWeChat, 10);

		profileCreation.importWeChat.click();

		sutils.pause(2000);

		if(profileCreation.weChatNamesToImport.size()>0)
		{
			for(int i=0; i<profileCreation.weChatNamesToImport.size();i++)
			{

				if(profileCreation.weChatNamesToImport.get(i).getText().equalsIgnoreCase(WeChatToImport))

				{
					pageadded = profileCreation.weChatNamesToImport.get(i).getText();

					profileCreation.importResultedWeChat.get(i).click();
				}

			}
		}

		profileCreation.weChatImportDone.click();

		return pageadded;

	}

	public void addAdminWeChatToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		SocialLogin login = new SocialLogin();

		this.expandWeChatPageSlider();

		sutils.waitForElementToBeClickable(profileCreation.addAsAdminWeChat, 10);

		profileCreation.addAsAdminWeChat.click();

		login.weChatLogin();

	}

	//list of pages added admin twitter accounts
	/*	public  List<String> getAddedAdminTwts() {

		UIListenProfileCreation uiprofileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		List<String> addedAdminTwtActs = new ArrayList<String>();

		int totalAdminPages = uiprofileCreation.addedAdminTwtActs.size();

		for(int i = 0;i<totalAdminPages; i++) {

			addedAdminTwtActs.add(uiprofileCreation.addedAdminTwtActs.get(i).getText());
		}

		return addedAdminTwtActs;

	}*/

	//===========================================4-10=Social Channels=Google Play==========================================//

	public void expandGplaySlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		profileCreation.profileSocialChannels.click();

		if(profileCreation.gPlaySlider.getAttribute("aria-expanded").equalsIgnoreCase("false"))
		{

			profileCreation.gPlaySlider.click();

		}

	}

	public void closeGplaySlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);

		if(profileCreation.gPlaySlider.getAttribute("aria-expanded").equalsIgnoreCase("true"))
		{

			profileCreation.gPlaySlider.click();

		}

	}

	public String importGplayToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String ChannelAdded = null;

		this.expandGplaySlider();

		sutils.waitForElementToBeClickable(profileCreation.importGPlay, 10); //Wait for import channel button to appear

		profileCreation.importGPlay.click(); // Click on Import channel button

		sutils.waitTillElementFound(profileCreation.gPlayActNamesToImport.get(0), 10); // Wait till channels appear to import

		ChannelAdded = profileCreation.gPlayActNamesToImport.get(0).getText(); // getting the first channel name available to import 

		profileCreation.importResultedGPlayApp.get(0).click(); // Click on add button of first youtube channel available to import

		profileCreation.gPlayImportDone.click();

		return ChannelAdded;

	}

	public String importGplayToProfile(String gplayChannelToImport){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		this.expandGplaySlider();

		String ChannelAdded = null;

		sutils.waitForElementToBeClickable(profileCreation.importGPlay, 10); //Wait for import channel button to appear

		profileCreation.importGPlay.click(); // Click on Import channel button

		sutils.pause(2000);

		if(profileCreation.gPlayActNamesToImport.size()>0) //Check if there arechannels are present to import
		{
			for(int i=0; i<profileCreation.gPlayActNamesToImport.size();i++)
			{

				if(profileCreation.gPlayActNamesToImport.get(i).getText().equalsIgnoreCase(gplayChannelToImport))

				{
					ChannelAdded = profileCreation.gPlayActNamesToImport.get(i).getText();

					profileCreation.importResultedGPlayApp.get(i).click();
				}

			}
		}

		profileCreation.gPlayImportDone.click();

		return ChannelAdded;

	}

	public void addAdminGplayToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		SocialLogin login = new SocialLogin();

		this.expandGplaySlider();

		sutils.waitForElementToBeClickable(profileCreation.addAsAdminGPlay, 10);

		String ProfileCreationWindowHandle = driver.getWindowHandle();

		profileCreation.addAsAdminGPlay.click();

		sutils.switchToNewWindow();

		login.gPlayLogin();

		sutils.switchToWindow(ProfileCreationWindowHandle);

	}

	//list of pages added admin twitter accounts
	/*	public  List<String> getAddedAdminTwts() {

		UIListenProfileCreation uiprofileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		List<String> addedAdminTwtActs = new ArrayList<String>();

		int totalAdminPages = uiprofileCreation.addedAdminTwtActs.size();

		for(int i = 0;i<totalAdminPages; i++) {

			addedAdminTwtActs.add(uiprofileCreation.addedAdminTwtActs.get(i).getText());
		}

		return addedAdminTwtActs;

	}*/

	//===========================================4-10=Social Channels=ITunes==========================================//

	public void expandITunesSlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		profileCreation.profileSocialChannels.click();

		if(profileCreation.itunesSlider.getAttribute("aria-expanded").equalsIgnoreCase("false"))
		{

			profileCreation.itunesSlider.click();

		}

	}

	public void closeITunesSlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);

		if(profileCreation.itunesSlider.getAttribute("aria-expanded").equalsIgnoreCase("true"))
		{

			profileCreation.itunesSlider.click();

		}

	}

	public String importITunesChnlToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String ChannelAdded = null;

		this.expandITunesSlider();

		sutils.waitForElementToBeClickable(profileCreation.importITunes, 10); //Wait for import channel button to appear

		profileCreation.importITunes.click(); // Click on Import channel button

		sutils.waitTillElementFound(profileCreation.itunesNamesToImport.get(0), 10); // Wait till channels appear to import

		ChannelAdded = profileCreation.itunesNamesToImport.get(0).getText(); // getting the first channel name available to import 

		profileCreation.importResultedITunes.get(0).click(); // Click on add button of first youtube channel available to import

		profileCreation.itunesImportDone.click();

		return ChannelAdded;

	}

	public String importITunesChnlToProfile(String ITunesChannelToImport){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		this.expandITunesSlider();

		String ChannelAdded = null;

		sutils.waitForElementToBeClickable(profileCreation.importITunes, 10); //Wait for import channel button to appear

		profileCreation.importITunes.click(); // Click on Import channel button

		sutils.pause(2000);

		if(profileCreation.itunesNamesToImport.size()>0) //Check if there arechannels are present to import
		{
			for(int i=0; i<profileCreation.itunesNamesToImport.size();i++)
			{

				if(profileCreation.itunesNamesToImport.get(i).getText().equalsIgnoreCase(ITunesChannelToImport))

				{
					ChannelAdded = profileCreation.itunesNamesToImport.get(i).getText();

					profileCreation.importResultedITunes.get(i).click();
				}
			}
		}

		profileCreation.itunesImportDone.click();

		return ChannelAdded;

	}

	//list of pages added admin twitter accounts
	/*	public  List<String> getAddedAdminTwts() {

		UIListenProfileCreation uiprofileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		List<String> addedAdminTwtActs = new ArrayList<String>();

		int totalAdminPages = uiprofileCreation.addedAdminTwtActs.size();

		for(int i = 0;i<totalAdminPages; i++) {

			addedAdminTwtActs.add(uiprofileCreation.addedAdminTwtActs.get(i).getText());
		}

		return addedAdminTwtActs;

	}
	 */

	//============================================Social Channels=Instagram Business Channels==========================================//

	public void expandInstaBusSlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		profileCreation.profileSocialChannels.click();

		if(profileCreation.igBusSlider.getAttribute("aria-expanded").equalsIgnoreCase("false"))
		{

			profileCreation.igBusSlider.click();

		}

	}

	public void closeInstaBusSlider(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		if(profileCreation.igBusSlider.getAttribute("aria-expanded").equalsIgnoreCase("true"))
		{

			profileCreation.igBusSlider.click();

		}

	}

	public String importInstaBusActToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String ChannelAdded = null;

		sutils.waitForElementToBeClickable(profileCreation.importIgBus, 10); //Wait for import channel button to appear

		profileCreation.importIgBus.click(); // Click on Import channel button

		sutils.waitTillElementFound(profileCreation.igBusNamesToImport.get(0), 10); // Wait till channels appear to import

		ChannelAdded = profileCreation.igBusNamesToImport.get(0).getText(); // getting the first channel name available to import 

		profileCreation.importResultedIgBus.get(0).click(); // Click on add button of first youtube channel available to import

		profileCreation.igBusImportDone.click();

		return ChannelAdded;

	}

	public String importInstaBusActToProfile(String InstaBusChnlToImport){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		String ChannelAdded = null;

		sutils.waitForElementToBeClickable(profileCreation.importIg, 10); //Wait for import channel button to appear

		profileCreation.importIgBus.click(); // Click on Import channel button

		sutils.pause(2000);

		if(profileCreation.igBusNamesToImport.size()>0) //Check if there are channels are present to import
		{
			for(int i=0; i<profileCreation.igBusNamesToImport.size();i++)
			{

				if(profileCreation.igBusNamesToImport.get(i).getText().equalsIgnoreCase(InstaBusChnlToImport))

				{
					ChannelAdded = profileCreation.igBusNamesToImport.get(i).getText();

					profileCreation.importResultedIgBus.get(i).click();
				}

			}
		}

		profileCreation.igBusImportDone.click();

		return ChannelAdded;

	}

	public String addAdminInstaBusActToProfile(){

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		SocialLogin login = new SocialLogin();

		sutils.waitForElementToBeClickable(profileCreation.addAsAdminIgBus, 10);

		String ProfileCreationWindowHandle = driver.getWindowHandle();

		profileCreation.addAsAdminIgBus.click();

		sutils.switchToNewWindow();

		login.igBusinessLogin();

		String addedInstaPersonalAct =  profileCreation.adminFbPagesToAdd.get(0).getText();

		profileCreation.addButtonAdminFbPages.get(0).click();

		sutils.pause(3000);

		driver.close();

		sutils.switchToWindow(ProfileCreationWindowHandle);

		return addedInstaPersonalAct;

	}

	//list of pages added admin instagram business accounts
	public  List<String> getAddedAdminIgBusChnls() {

		UIListenProfileCreation uiprofileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		List<String> addedAdminIgPerActs = new ArrayList<String>();

		int totalAdminPages = uiprofileCreation.addedAdminIGBus.size();

		for(int i = 0;i<totalAdminPages; i++) {

			addedAdminIgPerActs.add(uiprofileCreation.addedAdminIGBus.get(i).getText());
		}

		return addedAdminIgPerActs;

	}

	//===========================================5-1=Add Spam Words==========================================//

	public void addSpamWords() {

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);

		profileCreation.spamWords.sendKeys("#bringitoncustom,\"added spam words\"");

		profileCreation.updateSpamWords.click();
	}

	public String addTwtSpamAct() {

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		profileCreation.addTwtSpam.click();

		sutils.waitTillElementFound(profileCreation.spamTwtActSearchBox, 5);

		profileCreation.spamTwtActSearchBox.sendKeys("penguin");

		profileCreation.spamTwtActSearchButton.click();

		sutils.waitTillElementFound(profileCreation.spamTwtActFromSearch.get(0),5);

		String SpamAct = profileCreation.spamTwtActFromSearch.get(0).getText();

		profileCreation.addSpamTwtActFromSearch.get(0).click();

		profileCreation.completeTwtActSpamAddition.click();

		return SpamAct;

	}

	//===========================================6=Share with Users==========================================//

	public void shareProfile(String UserName) {

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);

		profileCreation.userSearch.clear();

		profileCreation.userSearch.sendKeys(UserName);

		if (profileCreation.userEmailList.get(0).getText().equalsIgnoreCase(UserName))
		{
			profileCreation.userChkBoxList.get(0).click();	
		}

	}

	public boolean isProfileSharable(String UserName) {

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		profileCreation.userSearch.sendKeys(UserName);

		sutils.pause(100);

		boolean roleChangable = true;

		String isDisabled = profileCreation.userChkBoxList.get(0).getAttribute("disabled");

		if (isDisabled.equalsIgnoreCase("disabled")){

			roleChangable = false;

		}else if(!isDisabled.equalsIgnoreCase("disabled")) {

			roleChangable = true;
		}

		return roleChangable;

	}

	public boolean isRoleChangable(String UserName) {

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		profileCreation.userSearch.sendKeys(UserName);

		sutils.pause(100);

		boolean roleChangable = true;

		int count = Integer.parseInt(profileCreation.userRoleDropDown.get(0).getAttribute("tabindex"));

		if (count == -1){

			roleChangable = false;

		}else if(count == 0) {

			roleChangable = true;
		}

		return roleChangable;

	}

	public void selectRole(String RoleName) {

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitForElementToBeClickable(profileCreation.completeProfileCreation, 5);

		sutils.selectElementByValue(profileCreation.selectRole, RoleName);

	}

	public void selectRoleAsProfileAdmin() {

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitForElementToBeClickable(profileCreation.completeProfileCreation, 5);

		sutils.selectElementByValue(profileCreation.selectRole, "6");

	}

	public void selectRoleAsProfileMember() {

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitForElementToBeClickable(profileCreation.completeProfileCreation, 5);

		sutils.selectElementByValue(profileCreation.selectRole, "7");

	}

	public void selectRoleAsProfileViewer() {

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitForElementToBeClickable(profileCreation.completeProfileCreation, 5);

		sutils.selectElementByValue(profileCreation.selectRole, "8");

	}

	public void saveProfileUserSettings() {

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);

		profileCreation.saveProfileUserSettings.click();

	}

	public void completeProfileCreation() {

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);

		profileCreation.completeProfileCreation.click();

	}




}
