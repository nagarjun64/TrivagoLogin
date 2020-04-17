package actions.Analyze;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import helpers.Hooks;
import helpers.Log;
import helpers.SimplifyUtils;
import pageobjects.Analyze.UIPostAnalysis;

public class PostAnalysisAction {

	final Logger log = Logger.getLogger(this.getClass().getName());

	WebDriver driver;

	public PostAnalysisAction()
	{
		driver = Hooks.driver;
	}

	public void applyRandomFilter() {

		UIPostAnalysis analysis = new UIPostAnalysis(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		//selecting Twitter in the drop down
		analysis.selectTwtSrc.click();

		sutils.waitForElementToBeClickable(analysis.listOfCheckBox.get(0), 20);
		sutils.pause(2000);

		//checking the account
		if(analysis.listOfCheckBox.size()>0) 
		{
			analysis.listOfCheckBox.get(0).click();
		}

		sutils.pause(2000);
		sutils.scrollInToEndOfPage();
		
		analysis.dateRange.click();
		sutils.pause(500);

		analysis.dateToday.click();
		sutils.pause(500);

		analysis.dateRange.click();
		sutils.pause(500);
		analysis.dateLast7.click();
		sutils.pause(500);

		analysis.dateRange.click();
		sutils.pause(500);
		analysis.dateLastMnth.click();
		sutils.pause(500);
		
		analysis.goBtn.click();

		sutils.waitTillElementFound(analysis.dsplyPosts, 10);
		sutils.pause(2000);
		
		Log.info(Log.class.getName() + "Applied Filter and waiting for Messages");

	}

}
