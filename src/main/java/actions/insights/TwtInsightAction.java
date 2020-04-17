package actions.insights;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import helpers.Hooks;
import helpers.SimplifyUtils;
import pageobjects.insights.UITwitterInsights;

public class TwtInsightAction {

	final Logger log = Logger.getLogger(this.getClass().getName());

	WebDriver driver;

	public TwtInsightAction()
	{
		driver = Hooks.driver;
	}

	public boolean addCompTwt() {

		UITwitterInsights uiTwtInsights = new UITwitterInsights(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		boolean isActAdded = false;
		String TwtChnlName= "simplify360";

		uiTwtInsights.addCompTwt.click();

		sutils.waitForElementToBeClickable(uiTwtInsights.searchForTwtHandles, 20);

		//enter the twitter channel looking for
		uiTwtInsights.enterTwtHandle.clear();
		uiTwtInsights.enterTwtHandle.sendKeys(TwtChnlName);

		sutils.pause(300);

		uiTwtInsights.searchForTwtHandles.click();

		sutils.waitForElementToBeClickable(uiTwtInsights.addTwtHandleFromSearch.get(1), 10);

		//iterating through the channels resulted from the page
		for (int i=0; i<uiTwtInsights.addTwtHandleFromSearch.size();i++) 
		{
			//if the channel searched for matches the channel looking for
			if(uiTwtInsights.twtHandleSearchResults.get(i).getText().equalsIgnoreCase(TwtChnlName)) 
			{
				//add the matched twitter channel
				uiTwtInsights.addTwtHandleFromSearch.get(i).click();
				sutils.pause(300);
				break;
			}
		}

		//close the popup once the channel is added
		uiTwtInsights.closeTwtCompSearch.click();

		if(uiTwtInsights.notificationMsg.getText().equalsIgnoreCase("Twitter account added successfully.")) 
		{
			isActAdded= true;
		}
		else if(uiTwtInsights.notificationMsg.getText().equalsIgnoreCase("Twitter account already added."))
		{
			isActAdded= false;
		}

		return isActAdded;
	}

	public boolean addCompTwt(String TwtChnlName) {

		UITwitterInsights uiTwtInsights = new UITwitterInsights(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		boolean isActAdded = false;

		sutils.scrolltoElementByLocator(uiTwtInsights.addCompTwt);

		uiTwtInsights.addCompTwt.click();

		sutils.waitForElementToBeClickable(uiTwtInsights.searchForTwtHandles, 20);

		//enter the twitter channel looking for
		uiTwtInsights.enterTwtHandle.clear();
		uiTwtInsights.enterTwtHandle.sendKeys(TwtChnlName);

		sutils.pause(300);

		uiTwtInsights.searchForTwtHandles.click();

		sutils.waitForElementToBeClickable(uiTwtInsights.addTwtHandleFromSearch.get(1), 10);

		//iterating through the channels resulted from the page
		for (int i=0; i<uiTwtInsights.addTwtHandleFromSearch.size();i++) 
		{
			//if the channel searched for matches the channel looking for
			if(uiTwtInsights.twtHandleSearchResults.get(i).getText().equalsIgnoreCase(TwtChnlName)) 
			{
				//add the matched twitter channel
				uiTwtInsights.addTwtHandleFromSearch.get(i).click();
				sutils.pause(300);
				break;
			}
		}
		sutils.pause(300);

		//close the popup once the channel is added
		uiTwtInsights.closeTwtCompSearch.click();

		if(uiTwtInsights.notificationMsg.getText().equalsIgnoreCase("Twitter account added successfully.")) 
		{
			isActAdded= true;
		}
		else if(uiTwtInsights.notificationMsg.getText().equalsIgnoreCase("Twitter account already added."))
		{
			isActAdded= false;
		}

		return isActAdded;
	}

	public boolean isAdminTwtAdded(String AdminTwtChnlName) {

		UITwitterInsights uiTwtInsights = new UITwitterInsights(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		boolean isActAdded = false;

		int TOTAL_PAGES = Integer.parseInt(uiTwtInsights.adminTotalPgs.getText());

		search:
			for(int i=1;i<= TOTAL_PAGES;i++) {

				int channelsInCurrentPage = uiTwtInsights.adminTwtHandles.size();

				for(int j=0; j<=channelsInCurrentPage;j++) {

					if (uiTwtInsights.adminTwtHandles.get(j).getText().equalsIgnoreCase("@"+AdminTwtChnlName)) {

						isActAdded= true;
						break search;
					}
				}
				
				if(i < TOTAL_PAGES) {
					uiTwtInsights.gotoNextPgComp.click();	
				}

				sutils.pause(3000);

			}
		return isActAdded;
	}

	public boolean isNonAdminTwtAdded(String NonAdminTwtChnlName) {

		UITwitterInsights uiTwtInsights = new UITwitterInsights(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		boolean isActAdded = false;

		sutils.pageRefresh();
		sutils.waitForElementToBeClickable(uiTwtInsights.addCompTwt, 10);
		sutils.scrolltoElementByLocator(uiTwtInsights.compTotalPgs);

		int TOTAL_PAGES = Integer.parseInt(uiTwtInsights.compTotalPgs.getText());

		search:
			for(int i=1;i<=TOTAL_PAGES;i++) {

				int channelsInCurrentPage = uiTwtInsights.compTwtHandles.size();

				for(int j=0; j<channelsInCurrentPage;j++) {

					log.info("matching handle: "+uiTwtInsights.compTwtHandles.get(j).getText());

					if (uiTwtInsights.compTwtHandles.get(j).getText().equalsIgnoreCase("@"+NonAdminTwtChnlName)) {

						isActAdded = true;
						log.info("Competitor Account is already added: "+NonAdminTwtChnlName);
						break search;
					}
				}

				if(i < TOTAL_PAGES) {
					uiTwtInsights.gotoNextPgComp.click();	
				}

				sutils.pause(3000);

			}

		return isActAdded;

	}

	public boolean deleteCompChannel(String chnlToDelete) {

		UITwitterInsights uiTwtInsights = new UITwitterInsights(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		boolean isActDeleted = false;

		sutils.scrolltoElementByLocator(uiTwtInsights.compTotalPgs);

		int TOTAL_PAGES = Integer.parseInt(uiTwtInsights.compTotalPgs.getText());

		search:
			if(TOTAL_PAGES>0) {

				//iterating through all competitor channels
				for(int i=1;i<=TOTAL_PAGES;i++) {

					int channelsInCurrentPage = uiTwtInsights.compTwtHandles.size();

					//checking the channels present in present page
					for(int j=0; j<channelsInCurrentPage;j++) {

						//if the channel matches delete the channel
						if (uiTwtInsights.compTwtHandles.get(j).getText().equalsIgnoreCase("@"+chnlToDelete)) {

							uiTwtInsights.delteCompTwt.get(j).click();

							sutils.waitForElementToBeClickable(uiTwtInsights.confrmDelete, 10);

							uiTwtInsights.confrmDelete.click();

							//checking if the notification message is present
							if(uiTwtInsights.notificationMsg.getText().equalsIgnoreCase("Account Removed")) {

								isActDeleted= true;
								log.info("Account is Deleted: " + chnlToDelete );
								break search;
							}
						}
					}

					if(i < TOTAL_PAGES) {
						uiTwtInsights.gotoNextPgComp.click();	
					}

					sutils.pause(3000);
				}
			}
		return isActDeleted;
	}

}
