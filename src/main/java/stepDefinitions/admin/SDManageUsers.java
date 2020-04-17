package stepDefinitions.admin;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import actions.LogInAction;
import actions.OpenModule;
import actions.settings.ManageUserAction;
import helpers.Hooks;
import helpers.SimplifyUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.settings.UIManageUsers;

public class SDManageUsers {

	WebDriver driver;
	String userEmail;

	public SDManageUsers() {
		driver = Hooks.driver;
	}

	@Given("^User Navigates to Manage User Page$")
	public void user_Navigates_to_Manage_User_Page() throws Throwable {

		LogInAction login = new LogInAction();
		OpenModule open = new OpenModule();

		login.loginAsOwner();

		open.openManageUsers();
	}

	@When("^Clicks on Add new User$")
	public void clicks_on_Add_new_User() throws Throwable {

		ManageUserAction mngUser = new ManageUserAction();
		mngUser.openUserCreationScreen();

	}

	@When("^User enters \"([^\"]*)\" and  \"([^\"]*)\" and \"([^\"]*)\" and  \"([^\"]*)\" and \"([^\"]*)\" and  \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and_and_and_and_and_and(String emailId, String shortName, String firstName, String lastName,
			String password, String reEnterPassword, String Role) throws Throwable {

		ManageUserAction mngUser = new ManageUserAction();

		mngUser.createNewUser(emailId, shortName, firstName, lastName, password, reEnterPassword, Role);

	}

	@Then("^User \"([^\"]*)\" Should be added successfully$")
	public void user_Should_be_added_successfully(String emailId) throws Throwable {

		UIManageUsers mgUser = new UIManageUsers(driver);
		SimplifyUtils utils = new SimplifyUtils();
//		todo

	}

	@When("^User enters the required details to create new user$")
	public void user_enters_the_required_details_to_create_new_user() throws Throwable {

		ManageUserAction mngUser = new ManageUserAction();
		SimplifyUtils sutils = new SimplifyUtils();

		userEmail = sutils.profileNameGen() + "@autouser.com"; // generating the email of the new user

		mngUser.createNewUser(userEmail, "autoshortName", "autofirstName", "autolastName", "Automation1@%",
				"Automation1@%", "ADMIN"); // Creating the user
	}

	@Then("^User Should be added successfully$")
	public void user_Should_be_added_successfully() throws Throwable {

		ManageUserAction mngUser = new ManageUserAction();

		Assert.assertTrue(mngUser.searchUser(userEmail));

		mngUser.deleteUser(userEmail);

	}
}
