package actions.settings;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import helpers.Hooks;
import helpers.SimplifyUtils;
import pageobjects.UIMenu;
import pageobjects.settings.UIManageSignatures;

public class EmailSignatureSettingsAction {

	final Logger log = Logger.getLogger(this.getClass().getName());

	WebDriver driver;

	public EmailSignatureSettingsAction()
	{
		driver = Hooks.driver;
	}

	public void openNewSignatureCreateScreen() {

		SimplifyUtils sutils = new SimplifyUtils();
		UIManageSignatures manageSignatures = new UIManageSignatures(driver);

		sutils.waitForElementToBeClickable(manageSignatures.createNewSignature, 5);

		manageSignatures.createNewSignature.click();

	}

	public String createSignature(String TITLE_OF_SIGNATURE_TO_CREATE) {

		UIManageSignatures manageSignatures = new UIManageSignatures(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		manageSignatures.titleOfSignature.sendKeys(TITLE_OF_SIGNATURE_TO_CREATE);
		manageSignatures.descOfSignature.sendKeys(TITLE_OF_SIGNATURE_TO_CREATE + " "+ "Description of the Email @ # $ % ^ & * ( ) _ + ! { } [ ] : \" , . < > ? / ");

		driver.switchTo().frame(manageSignatures.emailSignatureContainer); // Switch to iFrame

		manageSignatures.emailSignatureContent.sendKeys("Content of Email Signature");

		driver.switchTo().defaultContent(); // Switching back to Main HTML

		sutils.scrollInToView(manageSignatures.saveSignature);

		manageSignatures.saveSignature.click();

		return TITLE_OF_SIGNATURE_TO_CREATE; 

	}

	public void openEditSignatureScreen(String TITLE_OF_SIGNATURE_TO_EDIT) {

		UIManageSignatures manageSignatures = new UIManageSignatures(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.selectElementByValue(manageSignatures.signsToShow, "100");

		sutils.pause(700);

		int countOfSignaturesCreated = manageSignatures.nameOfCreatedSignature.size();

		for(int i = 0; i <countOfSignaturesCreated ; i++) {

			sutils.pause(200);

			if(manageSignatures.nameOfCreatedSignature.get(i).getText().equalsIgnoreCase(TITLE_OF_SIGNATURE_TO_EDIT)) {

				sutils.scrollToElement(manageSignatures.editSignature.get(i));

				//				((JavascriptExecutor) driver).executeScript("scroll(0,400)");

				manageSignatures.editSignature.get(i).click();

				sutils.pause(2000);

				break;
			}

		} 

	}

	public boolean checkIfSignatureIsPresent(String TITLE_OF_SIGNATURE_TO_CHECK) {

		UIManageSignatures manageSignatures = new UIManageSignatures(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		boolean isSignaturePresent = false;

		sutils.selectElementByValue(manageSignatures.signsToShow, "100");

		sutils.pause(700);

		int countOfSignaturesCreated = manageSignatures.nameOfCreatedSignature.size();

		for(int i = 0; i <countOfSignaturesCreated ; i++) {

			sutils.pause(200);

			if(manageSignatures.nameOfCreatedSignature.get(i).getText().equalsIgnoreCase(TITLE_OF_SIGNATURE_TO_CHECK)) {

				isSignaturePresent = true;

				sutils.pause(1000);

				break;
			}

		} 

		return isSignaturePresent;
	}

	public void deleteSignature(String TITLE_OF_SIGNATURE_TO_DELETE) {

		UIManageSignatures manageSignatures = new UIManageSignatures(driver);
		UIMenu menu = new UIMenu(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.selectElementByValue(manageSignatures.signsToShow, "100");

		sutils.pause(700);

		int countOfSignaturesCreated = manageSignatures.nameOfCreatedSignature.size();

		for(int i = 0; i <countOfSignaturesCreated ; i++) {

			sutils.pause(200);

			if(manageSignatures.nameOfCreatedSignature.get(i).getText().equalsIgnoreCase(TITLE_OF_SIGNATURE_TO_DELETE)) {

				sutils.scrollToElement(manageSignatures.deleteSignature.get(i));

				manageSignatures.deleteSignature.get(i).click();

				sutils.waitForElementToBeClickable(menu.deleteConfirm, 2);
				
				menu.deleteConfirm.click();
				
				sutils.pause(1000);

				break;
			}

		} 

	}
	
}
