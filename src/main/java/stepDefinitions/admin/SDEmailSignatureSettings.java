package stepDefinitions.admin;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import actions.LogInAction;
import actions.OpenModule;
import actions.settings.EmailSignatureSettingsAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import helpers.Hooks;
import helpers.SimplifyUtils;
import pageobjects.admin.UIManageSignatures;

public class SDEmailSignatureSettings {

	WebDriver driver;
	String SIGNATURE_NAME;
	final Logger log = Logger.getLogger(this.getClass().getName());

	public SDEmailSignatureSettings()
	{
		driver = Hooks.driver;
	}

	@Given("^User is in Manage Signature Page$")
	public void User_is_in_Manage_Signature_Page() {

		OpenModule open = new OpenModule();
		LogInAction login = new LogInAction();

		login.loginAsOwner();

		open.openEmailSettings();

	}

	@Given("^Enter New Signature Create Screen$")
	public void Enter_New_Signature_Create_Screen() {

		EmailSignatureSettingsAction settingsAction = new EmailSignatureSettingsAction();

		settingsAction.openNewSignatureCreateScreen();

	}

	@When("^Signature is saved by filling all manadatory fields$")
	public void Signature_is_saved_by_filling_all_manadatory_fields() {

		SimplifyUtils sutils = new SimplifyUtils();
		EmailSignatureSettingsAction settingsAction = new EmailSignatureSettingsAction();

		SIGNATURE_NAME = sutils.profileNameGen();

		settingsAction.createSignature(SIGNATURE_NAME);

	}

	@Then("^Signature is Created Successfully$")
	public void Signature_is_Created_Successfully() {

		EmailSignatureSettingsAction settingsAction = new EmailSignatureSettingsAction();

		try 
		{
			assertTrue(settingsAction.checkIfSignatureIsPresent(SIGNATURE_NAME));
		}
		catch (Exception e) 
		{
			log.error("Error Would be: ",e);
			Assert.fail();		
		}

	}

	@When("^Changes to signature are edited and updated$")
	public void Changes_to_signature_are_edited_and_updated() {

		SimplifyUtils sutils = new SimplifyUtils();
		EmailSignatureSettingsAction settingsAction = new EmailSignatureSettingsAction();
		UIManageSignatures manageSignatures = new UIManageSignatures(driver);

		settingsAction.openEditSignatureScreen(SIGNATURE_NAME);

		SIGNATURE_NAME = sutils.profileNameGen();

		manageSignatures.titleOfSignature.clear();
		
		manageSignatures.titleOfSignature.sendKeys(SIGNATURE_NAME);

		sutils.scrollInToView(manageSignatures.saveSignature);

		manageSignatures.saveSignature.click();

	}

	@Then("^Signature Should be Updated Successfully$")
	public void Signature_Should_be_Updated_Successfully() {

		EmailSignatureSettingsAction settingsAction = new EmailSignatureSettingsAction();

		try 
		{
			assertTrue(settingsAction.checkIfSignatureIsPresent(SIGNATURE_NAME));
		}
		catch (Exception e) 
		{
			log.error("Error Would be: ",e);
			Assert.fail();		
		}

	}
	
	@When("^Signature is Deleted$")
	public void Signature_is_Deleted() {
		
		EmailSignatureSettingsAction settingsAction = new EmailSignatureSettingsAction();
		
		settingsAction.deleteSignature(SIGNATURE_NAME);
		
	}
	
	@Then("^Signature should be deleted Successfully$")
	public void Signature_should_be_deleted_Successfully() {
		
		
		EmailSignatureSettingsAction settingsAction = new EmailSignatureSettingsAction();

		try 
		{
			assertFalse(settingsAction.checkIfSignatureIsPresent(SIGNATURE_NAME));
		}
		catch (Exception e) 
		{
			log.error("Error Would be: ",e);
			Assert.fail();		
		}
		
	}
	    


}
