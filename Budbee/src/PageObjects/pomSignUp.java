package PageObjects;

import org.openqa.selenium.By;

import GenericFunctions.genericFunctions;
import Utils.ManageAll;
import Utils.config;


public class pomSignUp {

	genericFunctions generic;

	static long MobileNumber = ManageAll.phoneNumber;
	
	
	public pomSignUp() {
		generic = new genericFunctions(config.Driver_Type);
	}
	
	
	public static final By IAmStudentButton = By.xpath("(//body//div[@class='btns']/button)[1]");
	public static final By RegisterEnterButton = By.xpath("(//body//div[@class='btns']/button)[4]");
	public static final By SubscriptionPlanNextButton = By.xpath("//button[@class='btn nextBtnNew']");
	public static final By PhoneNumberTextBox = By.xpath("//input[@placeholder='Enter Phone Number']");
	public static final By phoneAndEmailSubmittButton = 
			By.xpath("//button[@class='btn btn-primary btn-block']");
	public static final By phoneAndEmailEnterOtp = By.xpath("//input[@class='formControl']");
	public static final By phoneAndEmailVerifyOtp = 
			By.xpath("//button[@class='btn btn-primary btn-block']");
	public final static By OtpLogin = By.xpath("//input[@value='  Вход  ']");
	private final static By otpLoginText = By.xpath("(//input[@name='login'])[2]");
	private final static By otppasswordText = By.xpath("(//input[@type='password'])[2]");
	private final static By otpLoginButton = By.xpath("(//input[@type='submit'])[3]");
	public final static By otpForMobilenumber = By.xpath("(//a[contains(@href,'/send/?sms')]/font/font)");
	public final static String otpForMobilePart1 = "(//table[@class='clg']//tr)[";
	public final static String otpForMobilePart2 = "]//td[7]";
	
	public void loginWithPhoneNumber(){
		generic.explicitWait(PhoneNumberTextBox);
		while (true){
			generic.Sendkeys(PhoneNumberTextBox, MobileNumber);
			if (!phoneAndEmailSubmittButton_isEnabled() == true){
				MobileNumber = MobileNumber+1;
			}
			else{
				phoneAndEmailSubmittButton_click();
			break;
			}
		}
	}
	
	public void otpLogin(String username, String password) {
		generic.Sendkeys(otpLoginText, username);
		generic.Sendkeys(otppasswordText, password);
		generic.click(otpLoginButton);
	}
	
	public void newtab(){
		generic.newtab();
	}
	
	public int getMobileNumber() {
		return generic.getMobileNumber(otpForMobilenumber, String.valueOf(MobileNumber));
	}
	
	public String getOtpForMobileNumber(int number) {
		return generic.getOtpForMobileNumber(otpForMobilePart1, number);
	}
	
	public void getOtpUrl(String value) {
		generic.getUrl(value);
	}
	
	public void OtpLogin_explicitWait() {
		generic.explicitWait(OtpLogin);
	}

	
	public void OtpLogin_click() {
		generic.click(OtpLogin);
	}
	
	public boolean phoneAndEmailSubmittButton_isEnabled(){
		return generic.isEnabled(phoneAndEmailSubmittButton);
	}
	
	public void phoneAndEmailSubmittButton_click(){
		generic.click(phoneAndEmailSubmittButton);
	}
	
	public String getWindowHandle(){
		return generic.getWindowHandle();
	}
	
	public void SwitchWindows(String value){
		generic.SwitchWindows(value);
	}
	
	public void SubscriptionPlanNextButton_explicitWait(){
		generic.explicitWait(SubscriptionPlanNextButton);
	}
	
	public void SubscriptionPlanNextButton_click(){
		generic.click(SubscriptionPlanNextButton);
	}
	
	public void IAmStudentButton_explicitWait(){
		generic.explicitWait(IAmStudentButton);
	}
	
	public void RegisterEnterButton_explicitWait(){
		generic.explicitWait(RegisterEnterButton);
	}
	
	public void RegisterEnterButton_click(){
		generic.click(RegisterEnterButton);
	}
	
	public void IAmStudentButton_click(){
		generic.click(IAmStudentButton);
	}
	
	public void IAmStudentButton_click_js(){
		generic.click_JS(IAmStudentButton);
	}
	
	public void clearCookies(){
		generic.clearCookies();
	}
	
	public void WindowMaximize(){
		generic.WindowMaximize();
	}
	
	public void getUrl(String url){
		generic.getUrl(url);
	}
	
    
	public void driverQuit(){
		generic.driverQuit();
	}
	
	public void isEnabled(){
		generic.isEnabled(phoneAndEmailSubmittButton);
	}
	
	public void driverClose(){
		generic.driverClose();
	}
	
}
