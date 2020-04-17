package pageobjects.ListenSettings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UIProfileOrder {
	
	public UIProfileOrder (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}


}
