package stepDefinitions.LogIn;

import helpers.Hooks;
import helpers.ReadConfig;
import helpers.SimplifyUtils;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.openqa.selenium.WebDriver;

import pageobjects.UIHomePage;
import pageobjects.Login.UILogin;
import stepDefinitions.reports.SDSentimentReport;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SDLogin {

	final Logger log = Logger.getLogger(this.getClass().getName());

	WebDriver driver;

	public SDLogin()
	{
		driver = Hooks.driver;
	}


	@When("^User enter the valid credentials$")
	public void inputUserCredentials() throws Throwable {

		UILogin login = new UILogin(driver);

		login.userName.sendKeys(ReadConfig.loginOwnerEmail);

		login.userPassword.sendKeys(ReadConfig.loginOwnerPassword);
	}

	@When("^Click on Login$")
	public void clickLogin() throws Throwable {

		UILogin login = new UILogin(driver);

		login.loginButton.submit();

	}

	@Then("^Home Page should be displayed$")
	public void verifyUserHomePageIsDisplayed() throws Throwable {

		UIHomePage home = new UIHomePage(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();

		simplifyUtils.pause(4000);

		Assert.assertTrue(home.welcomeText.getText().equalsIgnoreCase("Welcome"));

	}

	@When("^User enter the inValid credentials$")
	public void userProviesInValidCredentials() throws Throwable {

		UILogin login = new UILogin(driver);

		login.userName.sendKeys("invalidLogin@invalidlogin.com");

		login.userPassword.sendKeys("invalidlogin");

	}

	@Then("^Error Message Should be displayed$")
	public void verifyInValidLoginErrorTextPresent() throws Throwable {

		UIHomePage home = new UIHomePage(driver);
		SimplifyUtils simplifyUtils = new SimplifyUtils();

		simplifyUtils.pause(2000);

		
		try 
		{
			Assert.assertEquals(home.inCorrectLoginText.getText(), ReadConfig.invalidLoginErrorText);
		} 
		catch (ComparisonFailure e) 
		{
			log.error("Error Would be: ",e);
			Assert.fail();
		}

	}


}
