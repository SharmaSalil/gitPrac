package Execution;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import ExcelReader.ExcelLink;
import ExcelReader.ExcelReader;
import ExtentReport.TestCore;
import PageObjects.PomLogin;
import Utils.ManageAll;
import Utils.UrlProvider;

public class Login extends TestCore{
	
	ExcelReader reader;
	PomLogin login;
	ExcelLink link;
	UrlProvider url;
	private String Sheetname;
	WebDriver driver;
//    public static String StudentUsername;
    public static String StudentUsername = "2323232323";
    public String StudentPassword;
    public String TeacherUsername;
    public String TeacherPassword;
    
    
    @BeforeTest
	public void beforeTest(){
		login = new PomLogin();
		login.clearCookies();
		login.WindowMaximize();
	}
	
	 @DataProvider(name = "Login_For_Teacher")
	 public Object[][] test_Data_For_Teacher() throws IOException{
		  Sheetname = "teacher";
		  login.clearCookies();
		  link = new ExcelLink();
		  reader = new ExcelReader(link.teacherPath);
		 int rowCount = reader.getRowCount(Sheetname);
		 System.out.println("row count : "+rowCount);
		 Object result[][] = new Object[rowCount - 1][3];
		 for (int i = 2; i < rowCount + 1; i++) {
			 result[i - 2][0] = i;
			 result[i - 2][1] = reader.getCellData(Sheetname, "UserName", i);
			 result[i - 2][2] = reader.getCellData(Sheetname, "Password", i);
			 if( i < rowCount+1 && i == rowCount){
				 TeacherUsername = String.valueOf(result[i - 2][1]);
				 TeacherPassword = String.valueOf(result[i - 2][2]);
			 }
			 
		 }
		 return result;
	 }
	 
	 
	 
	 @Test(dataProvider = "Login_For_Teacher")
	 public void Validate_data_For_Teacher (int rowno, String username, String password) throws InterruptedException{
		 test = ExtentReporterExtent()
					.startTest("Validate_data_For_Teacher")
					.assignCategory("Login");
			
			String Method = new Object() {
				
			}.getClass().getEnclosingMethod().getName();
		 try {
//		 System.out.println("username : "+username+", password : "+password);
		 url = new UrlProvider();
		 test.log(LogStatus.INFO, "Checklist created");
		 login.getUrl(url.getHomeUrl());
		 login.selectLanguageArrow_explicitWait();
		 login.selectLanguage_ArrowStr_moveToTheElement();
		 login.englishLaguage_click();
		 login.SignInButton_click();
		 login.UserNameForLogin_explicitWait();
		 login.UserNameForLogin_click();
		 login.UserNameForLogin_clear();
		 login.UserNameForLogin_Sendkeys(username);
		 login.Password_click();
		 login.Password_clear();
		 login.Password_Sendkeys(password);
		 if (!login.TermsAndConditionCheckBox_isSelected() == true)
		   login.TermsAndConditionCheckBox_click();
	     
		 login.SignInButtonOnLoginPage_click();
		 login.SignInButtonOnLoginPage_click();
		 
		 if (!password.equalsIgnoreCase(TeacherPassword) && !username.equalsIgnoreCase(TeacherUsername)){
			 if (login.getPageSource().contains("Please enter valid email") ||
					 login.getPageSource().contains("Login Failed!! Email and password dosen't match")){
				 Assert.assertEquals("Shows Error", "Shows Erro", 
						 "Something is wrong as for wrong email or password no message is visible");
				 test.log(LogStatus.PASS, "Checklist created but Checklist not found in the search result.salil");
				 TestCore.getInstance().endTest(test);
			 }
			 else{
				 Assert.assertEquals("Shows Error", "Shows Erro", 
						 "Please check the error message for wrong email and password !");
				 TestCore.getInstance().endTest(test);
			 }
		 }
		 else{
			 login.HomeText_explicitWait();
			 Assert.assertEquals(login.HomeText_isDisplayed(), true, "user is not able to login");
			 test.log(LogStatus.PASS, "Checklist created but Checklist not found in the search result.sharma");
			 TestCore.getInstance().endTest(test);
			 Thread.sleep(2000L);
		 }
		 }catch(Exception e){
			 
		 }
		 
		 }
	 
	 
	 
	 @DataProvider (name = "Login_For_Student")
	 public Object[][] test_Data_For_Student() throws IOException{
		  Sheetname = "student";
		  login.clearCookies();
		  link = new ExcelLink();
		  reader = new ExcelReader(link.studentPath);
		 int rowCount = reader.getRowCount(Sheetname);
		 System.out.println("row count : "+rowCount);
		 Object result[][] = new Object[rowCount - 1][3];
		 for (int i = 2; i < rowCount + 1; i++) {
			 result[i - 2][0] = i;
			 result[i - 2][1] = reader.getCellData(Sheetname, "UserName", i);
			 result[i - 2][2] = reader.getCellData(Sheetname, "Password", i);
			 if( i < rowCount+1 && i == rowCount){
				 StudentUsername = String.valueOf(result[i - 2][1]);
				 StudentPassword = String.valueOf(result[i - 2][2]);
			 }
			 
		 }
		 return result;
	 }
	 
	 
	 
	 @Test (dataProvider = "Login_For_Student")
	 public void validate_data_For_Student (int rowno, String username, String password) throws InterruptedException{
		 System.out.println("username : "+username+", password : "+password);
		 url = new UrlProvider();
		 login.getUrl(url.getHomeUrl());
		 login.selectLanguageArrow_explicitWait();
		 login.selectLanguage_ArrowStr_moveToTheElement();
		 login.englishLaguage_click();
		 login.SignInButton_click();
		 login.UserNameForLogin_explicitWait();
		 login.UserNameForLogin_click();
		 login.UserNameForLogin_clear();
		 login.UserNameForLogin_Sendkeys(username);
		 login.Password_click();
		 login.Password_clear();
		 login.Password_Sendkeys(password);
		 if (!login.TermsAndConditionCheckBox_isSelected() == true)
		   login.TermsAndConditionCheckBox_click();
	     
		 login.SignInButtonOnLoginPage_click();
		 login.SignInButtonOnLoginPage_click();
		 
		 if (!password.equalsIgnoreCase(StudentPassword) && !username.equalsIgnoreCase(StudentUsername)){
			 if (login.getPageSource().contains("Please enter valid email") ||
					 login.getPageSource().contains("Login Failed!! Email and password dosen't match")){
				 Assert.assertEquals("Shows Error", "Shows Error", 
						 "Something is wrong as for wrong email or password no message is visible");
			 }
			 else{
				 Assert.assertEquals("Shows Error", "Shows Erro", 
						 "Please check the error message for wrong email and password !");
			 }
		 }
		 else{
			 Thread.sleep(2000L);
			 Assert.assertEquals(login.HomeText_isDisplayed(), true, "user is not able to login");
			 
		 }
		 
		 }
	 
	 
	
	 
	 @AfterTest
	 public void aftertest(){
		login.driverQuit();
//	    TestCore.getInstance().endTest(test);
//	    TestCore.getInstance().flush();
//	    TestCore.getInstance().close();
	    
//		extent.flush();
//		 extent.close();
	 }
	 
	 @AfterClass
	 public void afterClass(){
		   
		    TestCore.getInstance().flush();
		    TestCore.getInstance().close();
	 }
}
