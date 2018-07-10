package Execution;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelReader.ExcelLink;
import ExcelReader.ExcelReader;
import PageObjects.PomLogin;
import PageObjects.pomForgotPassword;
import Utils.ManageAll;
import Utils.UrlProvider;

public class ForgotPassword {

	
	ExcelReader reader;
	PomLogin login;
	ExcelLink link;
	UrlProvider url;
	private String Sheetname;
	pomForgotPassword pomForgot;
	String mainWindow = "";
	String otpWindow = "";

	@BeforeTest
	public void beforeTest() {
		pomForgot = new pomForgotPassword();
		pomForgot.clearCookies();
		pomForgot.WindowMaximize();
	}

	@Test
	public void verify_Forgot_Passowrd_Work_Properly() throws InterruptedException {
		String title, OtpValue, newtitle = "";
		int count;
		url = new UrlProvider();
		pomForgot.getUrl(url.getForgotPassword());
		pomForgot.ForgotPasswordTextBox_explicitWait();
		pomForgot.ForgotPasswordTextBox_click();
		pomForgot.ForgotPasswordTextBox_clear();
		pomForgot.ForgotPasswordTextBox_Sendkeys(Login.StudentUsername);
		pomForgot.ForgotPasswordPageNextButton_click();
		pomForgot.otpFillTextBox_explicitWait();
		mainWindow = pomForgot.getWindowHandle();
		title = pomForgot.getTitle();
		pomForgot.newtab();
		pomForgot.getOtpUrl(ManageAll.otpUrl);
		newtitle = pomForgot.getTitle();
		pomForgot.OtpLogin_explicitWait();
		pomForgot.OtpLogin_click();
		pomForgot.otpLogin(ManageAll.username, ManageAll.password);
		count = pomForgot.getMobileNumber(Login.StudentUsername);
		OtpValue = pomForgot.getOtpForMobileNumber(count);
		otpWindow = pomForgot.getWindowHandle();
		if (!title.equals(newtitle))
			pomForgot.SwitchWindows(mainWindow);
		pomForgot.EnterOtpTextBox_explicitWait();
		pomForgot.EnterOtpTextBox_click();
		pomForgot.EnterOtpTextBox_clear();
		pomForgot.EnterOtpTextBox_sendkeys(OtpValue);
		pomForgot.EnterOtpButton_explicitWait();
		pomForgot.EnterOtpButton_click();
		pomForgot.TypePasswordTextBox_explicitWait();
		pomForgot.TypePasswordTextBox_click();
		pomForgot.TypePasswordTextBox_clear();
		pomForgot.TypePasswordTextBox_Sendkeys(ManageAll.setPassword);
		pomForgot.reTypePasswordTextBox_explicitWait();
		pomForgot.reTypePasswordTextBox_click();
		pomForgot.reTypePasswordTextBox_clear();
		pomForgot.reTypePasswordTextBox_Sendkeys(ManageAll.setPassword);
		pomForgot.passwordSubmitButton_explicitWait();
		pomForgot.passwordSubmitButton_click();
		pomForgot.passwordSuccessfullySubmitted_explicitWait();
		Assert.assertEquals(pomForgot.passwordSuccessfullySubmitted_getText(),
				"You have successfully changed your password", "Change password is not working!");
	}

	@Test
	public void verify_Forgot_Link_Is_Working() {
		url = new UrlProvider();
		pomForgot.getUrl(url.getLogin());
		pomForgot.ForgetPasswordLink_explicitWait();
		pomForgot.ForgetPasswordLink_click();
		pomForgot.ForgotPasswordTextBox_explicitWait();
		Assert.assertEquals(pomForgot.ForgotPasswordTextBox_isDisplayed(), true, 
				"user is not able to redirect to Forgot password page");
	}
	
	
	@Test (dependsOnMethods = { "verify_Forgot_Passowrd_Work_Properly" })
	public void verify_Reset_Password_Is_Working(){
		String title, OtpValue, newtitle = "";
		int count;
		url = new UrlProvider();
		pomForgot.getUrl(url.getForgotPassword());
		pomForgot.ForgotPasswordTextBox_explicitWait();
		pomForgot.ForgotPasswordTextBox_click();
		pomForgot.ForgotPasswordTextBox_clear();
		pomForgot.ForgotPasswordTextBox_Sendkeys(Login.StudentUsername);
		pomForgot.ForgotPasswordPageNextButton_click();
		pomForgot.otpFillTextBox_explicitWait();
		mainWindow = pomForgot.getWindowHandle();
		title = pomForgot.getTitle();
		if (!mainWindow.equals(otpWindow))
     		pomForgot.SwitchWindows(otpWindow);
		pomForgot.pageRefresh();
		newtitle = pomForgot.getTitle();
		pomForgot.otpForMobilenumberHandle_explicitWait();
		count = pomForgot.getCount(Login.StudentUsername);
		OtpValue = pomForgot.getOtpForMobileNumber(count);
		if (!title.equals(newtitle))
		   pomForgot.SwitchWindows(mainWindow);
		pomForgot.EnterOtpTextBox_explicitWait();
		pomForgot.EnterOtpTextBox_click();
		pomForgot.EnterOtpTextBox_clear();
		pomForgot.EnterOtpTextBox_sendkeys(OtpValue);
		pomForgot.EnterOtpButton_explicitWait();
		pomForgot.EnterOtpButton_click();
		pomForgot.TypePasswordTextBox_explicitWait();
		pomForgot.TypePasswordTextBox_click();
		pomForgot.TypePasswordTextBox_clear();
		pomForgot.TypePasswordTextBox_Sendkeys(ManageAll.setPassword);
		pomForgot.reTypePasswordTextBox_explicitWait();
		pomForgot.reTypePasswordTextBox_click();
		pomForgot.reTypePasswordTextBox_clear();
		pomForgot.reTypePasswordTextBox_Sendkeys(ManageAll.setPassword);
		pomForgot.passwordSubmitButton_explicitWait();
		pomForgot.passwordSubmitButton_click();
		pomForgot.passwordSuccessfullySubmitted_explicitWait();
		Assert.assertEquals(pomForgot.passwordSuccessfullySubmitted_getText(),
				"You have successfully changed your password", "Reset password is not working!");
	}

	
	@Test (dependsOnMethods = { "verify_Reset_Password_Is_Working" })
	public void verify_SignIn_Link_Working_After_Reset_Password(){
		String title, OtpValue, newtitle = "";
		int count;
		url = new UrlProvider();
		pomForgot.getUrl(url.getForgotPassword());
		pomForgot.ForgotPasswordTextBox_explicitWait();
		pomForgot.ForgotPasswordTextBox_click();
		pomForgot.ForgotPasswordTextBox_clear();
		pomForgot.ForgotPasswordTextBox_Sendkeys(Login.StudentUsername);
		pomForgot.ForgotPasswordPageNextButton_click();
		pomForgot.otpFillTextBox_explicitWait();
		mainWindow = pomForgot.getWindowHandle();
		title = pomForgot.getTitle();
		if (!mainWindow.equals(otpWindow))
     		pomForgot.SwitchWindows(otpWindow);
		pomForgot.pageRefresh();
		newtitle = pomForgot.getTitle();
		pomForgot.otpForMobilenumberHandle_explicitWait();
		count = pomForgot.getCount(Login.StudentUsername);
		OtpValue = pomForgot.getOtpForMobileNumber(count);
		if (!title.equals(newtitle))
		   pomForgot.SwitchWindows(mainWindow);
		pomForgot.EnterOtpTextBox_explicitWait();
		pomForgot.EnterOtpTextBox_click();
		pomForgot.EnterOtpTextBox_clear();
		pomForgot.EnterOtpTextBox_sendkeys(OtpValue);
		pomForgot.EnterOtpButton_explicitWait();
		pomForgot.EnterOtpButton_click();
		pomForgot.TypePasswordTextBox_explicitWait();
		pomForgot.TypePasswordTextBox_click();
		pomForgot.TypePasswordTextBox_clear();
		pomForgot.TypePasswordTextBox_Sendkeys(ManageAll.setPassword);
		pomForgot.reTypePasswordTextBox_explicitWait();
		pomForgot.reTypePasswordTextBox_click();
		pomForgot.reTypePasswordTextBox_clear();
		pomForgot.reTypePasswordTextBox_Sendkeys(ManageAll.setPassword);
		pomForgot.passwordSubmitButton_explicitWait();
		pomForgot.passwordSubmitButton_click();
		pomForgot.passwordSuccessfullySubmitted_explicitWait();
		pomForgot.SignInLinkOnResetPassword_explicitWait();
		pomForgot.SignInLinkOnResetPassword_click();
		Assert.assertEquals(pomForgot.getCurrentUrl(),
				url.getLogin(), "After click on sign in button on Reset password , user is not able to "
						+ "redirected to the home page.");
	}
	
	
	@Test
	public void verify_with_UnRegisteredEmail() throws InterruptedException{
		url = new UrlProvider();
		pomForgot.getUrl(url.getForgotPassword());
		pomForgot.ForgotPasswordTextBox_explicitWait();
		pomForgot.ForgotPasswordTextBox_click();
		pomForgot.ForgotPasswordTextBox_clear();
		pomForgot.ForgotPasswordTextBox_Sendkeys(ManageAll.UnRegisterdEmail);
		pomForgot.ForgotPasswordPageNextButton_explicitWait();
		pomForgot.ForgotPasswordPageNextButton_click();
		Thread.sleep(1000L);
		if (pomForgot.getPageSource().contains("Email Id or Phone number doesn't exists"))
			Assert.assertEquals("verified", "verified");
		else
			Assert.assertEquals("verified", "verifie", "No error message is visible for unregistered "
					+ "email id");	
	}
	
	
	@Test
	public void verify_with_UnRegistered_MobileNumber() throws InterruptedException{
		url = new UrlProvider();
		pomForgot.getUrl(url.getForgotPassword());
		pomForgot.ForgotPasswordTextBox_explicitWait();
		pomForgot.ForgotPasswordTextBox_click();
		pomForgot.ForgotPasswordTextBox_clear();
		pomForgot.ForgotPasswordTextBox_Sendkeys(ManageAll.UnRegisterMobile);
		pomForgot.ForgotPasswordPageNextButton_explicitWait();
		pomForgot.ForgotPasswordPageNextButton_click();
		Thread.sleep(1000L);
		if (pomForgot.getPageSource().contains("Email Id or Phone number doesn't exists"))
			Assert.assertEquals("verified", "verified");
		else
			Assert.assertEquals("verified", "verifie", "No error message is visible for unregistered "
					+ "mobile number");	
	}
	
	
	@Test
	public void verify_With_Adding_Space() throws InterruptedException{
		url = new UrlProvider();
		pomForgot.getUrl(url.getForgotPassword());
		pomForgot.ForgotPasswordTextBox_explicitWait();
		pomForgot.ForgotPasswordTextBox_click();
		pomForgot.ForgotPasswordTextBox_clear();
		pomForgot.ForgotPasswordTextBox_Sendkeys(ManageAll.space);
		pomForgot.ForgotPasswordPageNextButton_explicitWait();
		pomForgot.ForgotPasswordPageNextButton_click();
		Thread.sleep(1000L);
		if (pomForgot.getPageSource().contains("Please enter valid phone"))
			Assert.assertEquals("verified", "verified");
		else
			Assert.assertEquals("verified", "verifie", "No error message is visible when user try with adding"
					+ " space");	
	}
	
	
	
	@Test
	public void verify_With_Empty_Field() throws InterruptedException{
		url = new UrlProvider();
		pomForgot.getUrl(url.getForgotPassword());
		pomForgot.ForgotPasswordTextBox_explicitWait();
		pomForgot.ForgotPasswordTextBox_click();
		pomForgot.ForgotPasswordTextBox_clear();
		pomForgot.ForgotPasswordTextBox_Sendkeys(ManageAll.empty);
		pomForgot.ForgotPasswordPageNextButton_explicitWait();
		pomForgot.ForgotPasswordPageNextButton_click();
		Thread.sleep(1000L);
		if (pomForgot.getPageSource().contains("Please enter email Id or Phone number"))
			Assert.assertEquals("verified", "verified");
		else
			Assert.assertEquals("verified", "verifie", "No error message is visible when user try with empty "
					+ "field");	
	}
	
	
	
	@Test
	public void verify_With_Nine_Digit_Mobile_Number() throws InterruptedException{
		url = new UrlProvider();
		pomForgot.getUrl(url.getForgotPassword());
		pomForgot.ForgotPasswordTextBox_explicitWait();
		pomForgot.ForgotPasswordTextBox_click();
		pomForgot.ForgotPasswordTextBox_clear();
		pomForgot.ForgotPasswordTextBox_Sendkeys(ManageAll.NineDigitMobile);
		pomForgot.ForgotPasswordPageNextButton_explicitWait();
		pomForgot.ForgotPasswordPageNextButton_click();
		Thread.sleep(1000L);
		if (pomForgot.getPageSource().contains("Please enter valid phone"))
			Assert.assertEquals("verified", "verified");
		else
			Assert.assertEquals("verified", "verifie", "No error message is visible when user try to use "
					+ "nine digit phone number");
	}
	
	
	@Test
	public void verify_With_eleven_Digit_Mobile_Number() throws InterruptedException{
		url = new UrlProvider();
		pomForgot.getUrl(url.getForgotPassword());
		pomForgot.ForgotPasswordTextBox_explicitWait();
		pomForgot.ForgotPasswordTextBox_click();
		pomForgot.ForgotPasswordTextBox_clear();
		pomForgot.ForgotPasswordTextBox_Sendkeys(ManageAll.elevenDigitMobile);
		pomForgot.ForgotPasswordPageNextButton_explicitWait();
		pomForgot.ForgotPasswordPageNextButton_click();
		Thread.sleep(1000L);
		if (pomForgot.getPageSource().contains("Please enter valid phone"))
			Assert.assertEquals("verified", "verified");
		else
			Assert.assertEquals("verified", "verifie", "No error message is visible when user try to use "
					+ "eleven digit phone number");
	}
	
	
	@Test
	public void verify_With_Spl_Chacter_In_MobileNumber() throws InterruptedException{
		url = new UrlProvider();
		pomForgot.getUrl(url.getForgotPassword());
		pomForgot.ForgotPasswordTextBox_explicitWait();
		pomForgot.ForgotPasswordTextBox_click();
		pomForgot.ForgotPasswordTextBox_clear();
		pomForgot.ForgotPasswordTextBox_Sendkeys(ManageAll.phoneNumberWithSplCharacter);
		pomForgot.ForgotPasswordPageNextButton_explicitWait();
		pomForgot.ForgotPasswordPageNextButton_click();
		Thread.sleep(1000L);
		if (pomForgot.getPageSource().contains("Please enter valid email"))
			Assert.assertEquals("verified", "verified");
		else
			Assert.assertEquals("verified", "verifie", "No error message is visible when user try to use "
					+ "special character with phone number");
	}
	
	
	@Test
	public void verify_With_Character_In_MobileNumber() throws InterruptedException{
		url = new UrlProvider();
		pomForgot.getUrl(url.getForgotPassword());
		pomForgot.ForgotPasswordTextBox_explicitWait();
		pomForgot.ForgotPasswordTextBox_click();
		pomForgot.ForgotPasswordTextBox_clear();
		pomForgot.ForgotPasswordTextBox_Sendkeys(ManageAll.phoneNumberWithCharacter);
		pomForgot.ForgotPasswordPageNextButton_explicitWait();
		pomForgot.ForgotPasswordPageNextButton_click();
		Thread.sleep(1000L);
		if (pomForgot.getPageSource().contains("Please enter valid email"))
			Assert.assertEquals("verified", "verified");
		else
			Assert.assertEquals("verified", "verifie", "No error message is visible when user try to use "
					+ "single character with phone number");
	}
	
	
	@Test
	public void verify_for_Wrong_OTP() throws InterruptedException{
		url = new UrlProvider();
		pomForgot.getUrl(url.getForgotPassword());
		pomForgot.ForgotPasswordTextBox_explicitWait();
		pomForgot.ForgotPasswordTextBox_click();
		pomForgot.ForgotPasswordTextBox_clear();
		pomForgot.ForgotPasswordTextBox_Sendkeys(Login.StudentUsername);
		pomForgot.ForgotPasswordPageNextButton_click();
		pomForgot.EnterOtpTextBox_explicitWait();
		pomForgot.EnterOtpTextBox_click();
		pomForgot.EnterOtpTextBox_clear();
		pomForgot.EnterOtpTextBox_sendkeys(ManageAll.WrongOTP);
		pomForgot.EnterOtpButton_explicitWait();
		pomForgot.EnterOtpButton_click();
		Thread.sleep(1000L);
		if (pomForgot.getPageSource().contains("The OTP entered is incorrect"))
			Assert.assertEquals("verified", "verified");
		else
			Assert.assertEquals("verified", "verifie", "No error message is visible when user try to use "
					+ "wrong OTP");
	}
	
	
	@DataProvider (name = "Validate_Forgot_Passowrd_For_Email")
	 public Object[][] Data_to_Validate_Forgot_Passowrd() throws IOException{
		  Sheetname = "student";
		  link = new ExcelLink();
		  reader = new ExcelReader(link.forgotPassword);
		 int rowCount = reader.getRowCount(Sheetname);
		 System.out.println("row count : "+rowCount);
		 Object result[][] = new Object[rowCount - 1][2];
		 for (int i = 2; i < rowCount + 1; i++) {
			 result[i - 2][0] = i;
			 result[i - 2][1] = reader.getCellData(Sheetname, "UserName", i);
		 }
		 return result;
	 }
	
	
	@Test(dataProvider = "Validate_Forgot_Passowrd_For_Email")
	 public void Validate_Forgot_Password (int rowno, String username) throws InterruptedException{
		 System.out.println("username : "+username);
		 url = new UrlProvider();
			pomForgot.getUrl(url.getForgotPassword());
			pomForgot.ForgotPasswordTextBox_explicitWait();
			pomForgot.ForgotPasswordTextBox_click();
			pomForgot.ForgotPasswordTextBox_clear();
			pomForgot.ForgotPasswordTextBox_Sendkeys(username);
			pomForgot.ForgotPasswordPageNextButton_explicitWait();
			pomForgot.ForgotPasswordPageNextButton_click();
			Thread.sleep(1000L);
			if (pomForgot.getPageSource().contains("Please enter valid email"))
				Assert.assertEquals("verified", "verified");
			else
				Assert.assertEquals("verified", "verifie", "No error message is visible when user try to use "
						+ "in correct format of email");
		}
	
	
	@AfterTest
	public void aftertest() {
		pomForgot.driverQuit();
	}

}
