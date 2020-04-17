package actions.settings;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import helpers.Hooks;
import helpers.Log;
import helpers.SimplifyUtils;
import pageobjects.UIMenu;
import pageobjects.settings.UIFAQ;

/**
 * @author maushumisen
 * Date: January 5, 2018
 */

public class FAQActions {

	private static Logger Log = Logger.getLogger(Log.class.getName());

	WebDriver driver;

	public FAQActions()
	{
		driver = Hooks.driver;
	}  

	//=============================================Open AddFAQ Screen===========================================//

	public void openAddFAQScreen() {

		UIFAQ faq = new UIFAQ(driver);
		SimplifyUtils utils = new SimplifyUtils();

		utils.waitForElementToBeClickable(faq.AddFAQ, 10);

		faq.AddFAQ.click();

	}

	//=============================================Create FAQ===================================================//

	public void addFAQ(String FAQTitle, String FAQAnswer, String tags) {

		UIFAQ faq = new UIFAQ(driver);
		SimplifyUtils utils = new SimplifyUtils();

		utils.waitTillElementFound(faq.Question, 5);

		faq.Question.clear();
		faq.Question.sendKeys(FAQTitle);

		faq.Answer.clear();
		faq.Answer.sendKeys(FAQAnswer);

//		utils.scrollInToView(faq.Tags);
		utils.scrollToElement(faq.Tags);

		faq.Tags.sendKeys(tags);
	
		faq.Create.click();
		
		utils.waitForElementToBeClickable(faq.AddFAQ, 5);

	}

	public boolean isFAQPresent(String FAQ) {

		UIFAQ faq = new UIFAQ(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		boolean created = false;
		
		sutils.pageRefresh();
		
		sutils.waitForElementToBeClickable(faq.AddFAQ, 5);

		int FAQSize = faq.createdFAQs.size();

		for(int i = 0; i < FAQSize ;i++) {
			
			sutils.scrollToElement(faq.createdFAQs.get(i));
			
			sutils.pause(400);

			if(faq.createdFAQs.get(i).getText().equalsIgnoreCase(FAQ)) {

				System.err.println(	faq.createdFAQs.get(i).getText());

				created = true;
				
				break;

			}
		}

		return created;

	}

	public void editFAQ(String FAQTitle) {

		UIFAQ faq = new UIFAQ(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.pageRefresh();
		
		sutils.waitForElementToBeClickable(faq.AddFAQ, 5);
		
		int FAQSize = faq.createdFAQs.size();

		for(int i = 0; i<= FAQSize ;i++) {

			sutils.scrollToElement(faq.createdFAQs.get(i));

			sutils.pause(400);

			if(faq.createdFAQs.get(i).getText().equalsIgnoreCase(FAQTitle)) {

				faq.editFAQ.get(i).click();
				
				break;

			}

		}

	}
	
	public void deleteFAQ(String FAQTitle) {

		UIFAQ faq = new UIFAQ(driver);
		UIMenu menu = new UIMenu(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.pageRefresh();
		
		sutils.waitForElementToBeClickable(faq.AddFAQ, 5);
		
		int FAQSize = faq.createdFAQs.size();

		for(int i = 0; i<= FAQSize ;i++) {

			sutils.scrollToElement(faq.createdFAQs.get(i));

			sutils.pause(400);

			if(faq.createdFAQs.get(i).getText().equalsIgnoreCase(FAQTitle)) {

				faq.deleteFAQ.get(i).click();
				
				sutils.waitForElementToBeClickable(menu.deleteConfirm, 5);
				
				menu.deleteConfirm.click();
				
				break;

			}

		}

	}

}
