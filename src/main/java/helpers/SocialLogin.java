package helpers;

import org.openqa.selenium.WebDriver;

import actions.PublishBroadcast.PublishNewMsg;
import pageobjects.Listen.UIListenProfileCreation;

public class SocialLogin {

	WebDriver driver;

	public SocialLogin(){
		driver = Hooks.driver;
	}

	public void facebookLogin() {
	
		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		ReadConfig readConfig = new ReadConfig();
		
		sutils.waitForElementToBeClickable(profileCreation.fbLoginEmail, 20);

		profileCreation.fbLoginEmail.sendKeys(readConfig.fbAccount);

		profileCreation.fbLoginPassword.sendKeys(readConfig.fbAccountPassword);

		profileCreation.fbLoginButton.click();
	}
	
	public void youtubeLogin() {

		UIListenProfileCreation pc = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		
		sutils.pause(1000);

		sutils.waitForElementToBeClickable(pc.ytSignIn, 20);

		sutils.scrollInToView(pc.ytLoginId);
		
		pc.ytLoginId.sendKeys(ReadConfig.ytUserName);

		pc.ytLoginNext.click();
		
		sutils.waitTillElementFound(pc.ytPwd, 20);

		pc.ytPwd.sendKeys(ReadConfig.ytUserPassword);

		pc.ytSignIn.click();

		sutils.pause(1000);

	}

	public void tumblrLogin() {

		UIListenProfileCreation pc = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitForElementToBeClickable(pc.tumblrBlgSignUpEmailId, 20);

		pc.tumblrBlgSignUpEmailId.sendKeys(ReadConfig.tumblrLogin);

		pc.tumblrBlgLogin.click();

		sutils.waitForElementToBeClickable(pc.tumblrBlgSignInEmailId, 20);

		pc.tumblrBlgSignInEmailId.sendKeys(ReadConfig.tumblrLogin);

		pc.tumblrBlgLoginPwd.sendKeys(ReadConfig.tumblrPassword);

		pc.tumblrBlgLogin.click();

		sutils.waitForElementToBeClickable(pc.tumblrBlgApprove, 20);

		pc.tumblrBlgApprove.click();

		sutils.pause(1000);

	}

	public void lkdCompLogin() {

		UIListenProfileCreation pc = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.pause(1000);
		
		sutils.waitForElementToBeClickable(pc.lkdnLoginBtn, 20);

		pc.lkdnEmailId.sendKeys(ReadConfig.lkdCompUserName);

		pc.lkdnPwd.sendKeys(ReadConfig.lkdCompUserPassword);
		
		sutils.scrollInToView(pc.lkdnLoginBtn);

		pc.lkdnLoginBtn.click();

		sutils.pause(1000);

	}

	public String iGPersonalActLogin() {

		UIListenProfileCreation pc = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.pause(1000);
		
		sutils.waitTillElementFound(pc.igLoginBtn, 20);

		pc.igEmailId.sendKeys(ReadConfig.lkdCompUserName);

		pc.igPwd.sendKeys(ReadConfig.lkdCompUserPassword);

		pc.igLoginBtn.click();

		sutils.pause(1000);
		
		String igPersonalUserName =ReadConfig.lkdCompUserName;

		return igPersonalUserName;
	}
	
	public void igBusinessLogin() {

		UIListenProfileCreation profileCreation = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		ReadConfig readConfig = new ReadConfig();

		profileCreation.fbLoginEmail.sendKeys(readConfig.instagramBusinessLogin);

		profileCreation.fbLoginPassword.sendKeys(readConfig.instagramBusinessPwd);

		profileCreation.fbLoginButton.click();
		
		sutils.waitForElementToBeClickable(profileCreation.finishAddAdminFbGrp, 2);

	}

	public void gPlusLogin() {

		UIListenProfileCreation pc = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();

		sutils.waitForElementToBeClickable(pc.ytLoginId, 20);

		pc.gpLoginId.sendKeys(ReadConfig.ytUserName);

		pc.gpLoginNext.click();
		
		sutils.waitForElementToBeClickable(pc.gpPassword, 2000);

		pc.gpPassword.sendKeys(ReadConfig.ytUserPassword);

		pc.gpPwdNext.click();

		sutils.pause(1000);
		
		if(pc.confirmRecoveryEmail.size()>0) {
			
			pc.confirmRecoveryEmail.get(0).click();
			
			sutils.waitForElementToBeClickable(pc.gpRecoveryEmail, 2000);
			
			pc.gpRecoveryEmail.sendKeys("nagarjun64@outlook.com");
		
			sutils.pause(1000);
			
			pc.gpRecoveryNext.click();
			
		}
		sutils.waitForElementToBeClickable(pc.gpApprove, 2000);
		sutils.scrollInToView(pc.gpApprove);
		
		pc.gpApprove.click();
		
		sutils.waitForElementToBeClickable(pc.finishAddAdminGpPage, 2000);

	}
	
	public void weChatLogin() {

		UIListenProfileCreation pc = new UIListenProfileCreation(driver);
		SimplifyUtils sutils = new SimplifyUtils();
		PublishNewMsg newMsg = new PublishNewMsg();

		sutils.waitForElementToBeClickable(pc.ytLoginId, 20);

		pc.weChatID.sendKeys(ReadConfig.ytUserName);

		pc.weChatAppId.sendKeys(ReadConfig.ytUserName);

		pc.weChatAppSecret.sendKeys(ReadConfig.ytUserName);

		pc.weChatName.sendKeys(ReadConfig.ytUserName);

		pc.weChatActPic.sendKeys("src/test/resources/testData/twt_Pic.jpg");

		newMsg.waitForImageUploadToComplete();

		pc.weChatAddComplete.click();

		sutils.pause(1000);

	}

	public void gPlayLogin() {

		gPlusLogin();

	}

}
