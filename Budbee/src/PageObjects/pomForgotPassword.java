package PageObjects;

import org.openqa.selenium.By;
import GenericFunctions.genericFunctions;
import Utils.config;

public class pomForgotPassword {

	genericFunctions generic;

	public pomForgotPassword() {
		generic = new genericFunctions(config.Driver_Type);
	}

	public final static By SignInButton = By.xpath("//a[@href='/login']");
	public final static By englishLaguage = By.xpath("(//li[@value='en'])[2]");
	public final static By selectLanguageArrow = By.xpath("(//span[@class='icons select__arrow'])[2]");

	public final static By ForgetPasswordLink = By.xpath("//a[@class='forgetPass']");
	public final static By ForgotPasswordTextBox = 
			By.xpath("//input[@class='formControl ' and @type='text']");

	public final static By ForgotPasswordPageNextButton = 
			By.xpath("//button[@class='btn btn-primary pull-right']");

	public final static By otpFillTextBox = By.xpath("//input[@class='formControl formLetterSpace']");
	public final static By OtpLogin = By.xpath("//input[@value='  Вход  ']");
	private final static By otpLoginText = By.xpath("(//input[@name='login'])[2]");
	private final static By otppasswordText = By.xpath("(//input[@type='password'])[2]");
	private final static By otpLoginButton = By.xpath("(//input[@type='submit'])[3]");
	public final static By otpForMobilenumber = By.xpath("(//a[contains(@href,'/send/?sms')]/font/font)");
	public final static By otpForMobilenumberHandle = By.xpath("//a[contains(@href,'/send/?sms')]");
	public final static By EnterOtpTextBox = By.xpath("//input[@class='formControl formLetterSpace']");
	public final static By EnterOtpButton = By.xpath("//button[@class='btn btn-primary pull-right']/div");
	public final static By TypePasswordTextBox = By.xpath("(//input[@type='password'])[1]");
	public final static By reTypePasswordTextBox = By.xpath("(//input[@type='password'])[2]");
	public final static By passwordSubmitButton = 
			By.xpath("//button[@class='btn btn-primary pull-right']/div");

	public final static String otpForMobilePart1 = "(//table[@class='clg']//tr)[";
	public final static String otpForMobilePart2 = "]//td[7]";

	public final static By passwordSuccessfullySubmitted = By.xpath("//p[@class='regesterTxt']");
	public final static By otpResendLink = By.xpath("//a[@class='btn btn-link btn-resendPassBtn']");
	public final static By SignInLinkOnResetPassword = 
			By.xpath("//button[@class='btn btn-primary pull-right']");
	
	public final static By UnRegisteredEmailOrPassword = By.xpath("//div[@class=''toasted primary error']");

	public void otpLogin(String username, String password) {
		generic.Sendkeys(otpLoginText, username);
		generic.Sendkeys(otppasswordText, password);
		generic.click(otpLoginButton);
	}

	public void selectLanguageArrow_explicitWait() {
		generic.explicitWait(selectLanguageArrow);
	}

	public void passwordSuccessfullySubmitted_explicitWait() {
		generic.explicitWait(passwordSuccessfullySubmitted);
	}
	
	
	public void otpForMobilenumber_explicitWait(){
		generic.explicitWait(otpForMobilenumber);
	}
	
	public void UnRegisteredEmailOrPassword_explicitWait(){
		generic.explicitWait(UnRegisteredEmailOrPassword);
	}
	
	public void otpForMobilenumberHandle_explicitWait(){
		generic.explicitWait(otpForMobilenumberHandle);
	}

	public void passwordSubmitButton_explicitWait() {
		generic.explicitWait(passwordSubmitButton);
	}
	
	
	public void SignInLinkOnResetPassword_explicitWait(){
		generic.explicitWait(SignInLinkOnResetPassword);
	}

	public void reTypePasswordTextBox_explicitWait() {
		generic.explicitWait(reTypePasswordTextBox);
	}
	
	
	public String getCurrentUrl(){
		return generic.getCurrentUrl();
	}			
				
	public void EnterOtpButton_explicitWait() {
		generic.explicitWait(EnterOtpButton);
	}
	
	
	public void otpResendLink_explicitWait(){
		generic.explicitWait(otpResendLink);
	}

	public void EnterOtpTextBox_explicitWait() {
		generic.explicitWait(EnterOtpTextBox);
	}

	public void SignInLinkOnResetPassword_click(){
		generic.click(SignInLinkOnResetPassword);
	}
	
	public void TypePasswordTextBox_explicitWait() {
		generic.explicitWait(TypePasswordTextBox);
	}

	public void ForgetPasswordLink_explicitWait() {
		generic.explicitWait(ForgetPasswordLink);
	}

	public void ForgotPasswordTextBox_explicitWait() {
		generic.explicitWait(ForgotPasswordTextBox);
	}

	public void OtpLogin_explicitWait() {
		generic.explicitWait(OtpLogin);
	}

	public void getUrl(String url) {
		generic.getUrl(url);
	}
	
	
	public void pageRefresh(){
		generic.pageRefresh();
	}

	public void otpFillTextBox_explicitWait() {
		generic.explicitWait(otpFillTextBox);
	}
	
	public String getPageSource(){
		return generic.getPageSource();
	}
	
	
	public void ForgotPasswordPageNextButton_explicitWait(){
		generic.explicitWait(ForgotPasswordPageNextButton);
	}

	public int getMobileNumber(String StudentUsername) {
		return generic.getMobileNumber(otpForMobilenumber, StudentUsername);
	}
	
	
	
	public int getCount(String StudentUsername) {
		return generic.getCount(otpForMobilenumberHandle, StudentUsername);
	}

	public String getWindowHandle() {
		return generic.getWindowHandle();
	}

	public void SwitchWindows(String value) {
		generic.SwitchWindows(value);
	}

	public String getOtpForMobileNumber(int number) {
		return generic.getOtpForMobileNumber(otpForMobilePart1, number);
	}

	public String passwordSuccessfullySubmitted_getText() {
		return generic.getText(passwordSuccessfullySubmitted);
	}

	
	public String UnRegisteredEmailOrPassword_getText(){
		return generic.getText(UnRegisteredEmailOrPassword);
	}
	
	public void selectLanguageArrow_moveToTheElement() {
		generic.moveToTheElement(PomLogin.selectLanguage_ArrowStr);
	}

	public void englishLaguage_click() {
		generic.click(englishLaguage);
	}

	
	public void otpResendLink_click(){
		generic.click(otpResendLink);
	}
	
	public void passwordSubmitButton_click() {
		generic.click(passwordSubmitButton);
	}

	public void reTypePasswordTextBox_click() {
		generic.click(reTypePasswordTextBox);
	}

	public void TypePasswordTextBox_click() {
		generic.click(TypePasswordTextBox);
	}

	public void EnterOtpButton_click() {
		generic.click(EnterOtpButton);
	}

	public void TypePasswordTextBox_clear() {
		generic.clear(TypePasswordTextBox);
	}

	public void reTypePasswordTextBox_clear() {
		generic.clear(reTypePasswordTextBox);
	}

	public void OtpLogin_click() {
		generic.click(OtpLogin);
	}

	public void ForgotPasswordTextBox_click() {
		generic.click(ForgotPasswordTextBox);
	}

	public void ForgotPasswordPageNextButton_click() {
		generic.click(ForgotPasswordPageNextButton);
	}

	public void EnterOtpTextBox_click() {
		generic.click(EnterOtpTextBox);
	}

	public void driverClose() {
		generic.driverClose();
	}

	public void driverQuit() {
		generic.driverQuit();
	}

	public void ForgetPasswordLink_click() {
		generic.click(ForgetPasswordLink);
	}

	public void SignInButton_cick() {
		generic.click(SignInButton);
	}

	public void ForgotPasswordTextBox_Sendkeys(String value) {
		generic.Sendkeys(ForgotPasswordTextBox, value);
	}

	public void reTypePasswordTextBox_Sendkeys(String value) {
		generic.Sendkeys(reTypePasswordTextBox, value);
	}

	public void TypePasswordTextBox_Sendkeys(String value) {
		generic.Sendkeys(TypePasswordTextBox, value);
	}

	public void EnterOtpTextBox_sendkeys(String value) {
		generic.Sendkeys(EnterOtpTextBox, value);
	}

	public void implicitWait() {
		generic.implicitWait();
	}

	public void newtab() {
		generic.newtab();
	}

	public void getOtpUrl(String value) {
		generic.getUrl(value);
	}

	public String getTitle() {
		return generic.getTitle();
	}

	public void clearCookies() {
		generic.clearCookies();
	}

	public void ForgotPasswordTextBox_clear() {
		generic.clear(ForgotPasswordTextBox);
	}

	public void EnterOtpTextBox_clear() {
		generic.clear(EnterOtpTextBox);
	}

	public void WindowMaximize() {
		generic.WindowMaximize();
	}

	public boolean ForgotPasswordTextBox_isDisplayed (){
		return generic.isDisplayed(ForgotPasswordTextBox);
	}
}
