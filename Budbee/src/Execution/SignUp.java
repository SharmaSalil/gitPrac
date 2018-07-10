package Execution;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.pomSignUp;
import Utils.ManageAll;
import Utils.UrlProvider;

public class SignUp {
	

	pomSignUp signup;
	UrlProvider url;

	@BeforeTest
	public void beforeTest(){
		signup = new pomSignUp();
		signup.clearCookies();
		signup.WindowMaximize();
	}
	
	
	@Test
	public void Verify_SignUp_Student(){
		int count;
		String name, OtpValue;
		url = new UrlProvider();
		signup.getUrl(url.getSignUp());
		name = signup.getWindowHandle();
		signup.SwitchWindows(name);
		signup.IAmStudentButton_explicitWait();
		signup.IAmStudentButton_click();
		signup.RegisterEnterButton_explicitWait();
		signup.RegisterEnterButton_click();
		signup.SubscriptionPlanNextButton_explicitWait();
		signup.SubscriptionPlanNextButton_click();
		signup.loginWithPhoneNumber();
		name = signup.getWindowHandle();
		signup.newtab();
		signup.getOtpUrl(ManageAll.otpUrl);
		signup.OtpLogin_explicitWait();
		signup.OtpLogin_click();
		signup.otpLogin(ManageAll.username, ManageAll.password);
		count = signup.getMobileNumber();
		System.out.println("count : "+count);
		OtpValue = signup.getOtpForMobileNumber(count);
		System.out.println(OtpValue);
	}


	@AfterTest
	public void afterTest(){
//		signup.driverQuit();
	}
}
