package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericFunctions.genericFunctions;
import Utils.config;

public class PomLogin{
	
	genericFunctions generic;

	public PomLogin() {
		generic = new genericFunctions(config.Driver_Type);
	}
	
	@FindBy (xpath = "//span[@class='icons select__arrow'])[2]")
	public WebElement selectLanguageArrow1;
	
	
	public static final By selectLanguageArrow = By.xpath("(//span[@class='icons select__arrow'])[2]");
	public static final String selectLanguage_ArrowStr = "(//span[@class='icons select__arrow'])[2]";
	public static final By englishLaguage = By.xpath("(//li[@value='en'])[2]");
	public static final By SignInButton = By.xpath("//a[@href='/login']");
	public static final By UserNameForLogin = By.xpath("//input[@id='email']");
	public static final By Password = By.xpath("//input[@placeholder='Password' and @type='password']");
	public static final By SignInButtonOnLoginPage = 
			By.xpath("//button[@class='btn btn-block btn-primary loginSignBtn']");
	public static final By TermsAndConditionCheckBox = By.xpath("(//div[@class='control__indicator'])[2]");
	public static final By HomeText = By.xpath("//a[@class='nuxt-link-exact-active nuxt-link-active']");
	
	
	
	  public void selectLanguageArrow_explicitWait(){
		generic.explicitWait(selectLanguageArrow);
	  }
	  
	  
	  public void englishLaguage_explicitWait(){
			generic.explicitWait(englishLaguage);
	  }
	  
	  
	  public void SignInButton_explicitWait(){
			generic.explicitWait(SignInButton);
	  }
	  
	  
	  public void UserNameForLogin_explicitWait(){
			generic.explicitWait(UserNameForLogin);
	  }
	  	  
	  
	  public void Password_explicitWait(){
			generic.explicitWait(Password);
	  }
	  
	  
	  public void TermsAndConditionCheckBox_explicitWait(){
			generic.explicitWait(TermsAndConditionCheckBox);
	  }
	  
	  
	  public void SignInButtonOnLoginPage_explicitWait(){
			generic.explicitWait(SignInButtonOnLoginPage);
	  }
	  
	  
	  public void HomeText_explicitWait(){
			generic.explicitWait(HomeText);
	  }
	  
	  
	  public String HomeText_getText(){
			return generic.getText(HomeText);
		}
	
	  
	  public void getUrl(String url){
		   generic.getUrl(url);
	  }
	
	
      public void selectLanguage_ArrowStr_moveToTheElement(){
    	  generic.moveToTheElement(selectLanguage_ArrowStr);    
  		}
    
    
    
      public void englishLaguage_click(){
    	generic.click(englishLaguage);
    	}
    
      
      public void UserNameForLogin_click(){
      	generic.click(UserNameForLogin);
      	}
      
      
      public void SignInButton_click(){
        	generic.click(SignInButton);
        	}
      
      
      public void Password_click(){
    	  generic.click(Password);
      }
      
      
      public void TermsAndConditionCheckBox_click(){
    	  generic.click(TermsAndConditionCheckBox);
      }
      
      
      public void SignInButtonOnLoginPage_click(){
    	  generic.click(SignInButtonOnLoginPage);
      }
    
    
      public void UserNameForLogin_Sendkeys(String value){
    	generic.Sendkeys(UserNameForLogin, value);
    	}
      
      
      public void Password_Sendkeys(String value){
      	generic.Sendkeys(Password, value);
      	}
      
      
      public void implicitWait(){
    	  generic.implicitWait();
      }
      
      
      public void clearCookies(){
    	  generic.clearCookies();
      }
      
      
     public void UserNameForLogin_clear(){
    	 generic.clear(UserNameForLogin);
     }
     
     
     public void Password_clear(){
    	 generic.clear(Password);
     }
     
     
     public String getPageSource(){
    	 return generic.getPageSource();
     }
      
     
     public void driverClose(){
    	 generic.driverClose();
     }
     
     
     public void driverQuit(){
    	 generic.driverQuit();
     }
         
      public void WindowMaximize(){
    	  generic.WindowMaximize();
      }
    
      
      public boolean TermsAndConditionCheckBox_isSelected(){
    	  
    	 return generic.isSelected(TermsAndConditionCheckBox);
      }
      
      
      public boolean HomeText_isDisplayed(){
    	  return generic.isDisplayed(HomeText);
      }
	
}
