package pageobjects.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UILogin {

	public UILogin (WebDriver driver) {

		PageFactory.initElements(driver, this);

	}


	//===========+Registration Page Details===========//

	//Create an Account Button
	@FindBy(className="//button[@id='login_signup_link']")
	public WebElement createAnAccount;

	//Login email field
	@FindBy(xpath = "//input[@id='check_email']")
	public WebElement loginRegistrationEmail;

	//Next button after entering the email
	@FindBy(xpath = "//input[@id='check_email']")
	public WebElement loginRegistrationNext;

	//Login Password field
	@FindBy(xpath = "//input[@id='login_password']")
	public WebElement loginRegistrationPassword;

	//LoginButton
	@FindBy(xpath="//button[@id='login_submit']")
	public WebElement loginRegisterButton;


	//===========Login Page ===========//

	//Login email field
	@FindBy(xpath = "//input[@id='check_email']")
	public WebElement loginEmail;

	//Next button after entering the email during login
	@FindBy(xpath = "//button[@id='login_email_submit']")
	public WebElement loginNext;

	//Login Password field
	@FindBy(xpath = "//input[@id='login_password']")
	public WebElement loginPassword;

	//LoginButton
	@FindBy(xpath="//button[@id='login_submit']//span")
	public WebElement login;

	//Google LoginButton
	@FindBy(xpath="//button[@data-href='/oauth/en-IN/oauth-login/connect-google']")
	public WebElement googleLogin;



}
