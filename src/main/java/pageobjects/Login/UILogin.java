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

	//UserName
	@FindBy(id = "login_emailId")
	public WebElement userName;

	//Password
	@FindBy(id = "login_password")
	public WebElement userPassword;

	//LoginButton
	@FindBy(id="rp")
	public WebElement loginButton;

	//ForgotPasswordLink
	@FindBy(linkText="Forgot")
	public WebElement forgotPasswordLink;

	@FindBy(className="recaptcha-checkbox-checkmark")
	public WebElement captcha;

}
