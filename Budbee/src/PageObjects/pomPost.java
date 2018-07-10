package PageObjects;

import org.openqa.selenium.By;

import GenericFunctions.genericFunctions;
import Utils.ManageAll;
import Utils.config;

public class pomPost {
	
	genericFunctions generic;
	
	public pomPost(){
		generic = new genericFunctions(config.Driver_Type);
	}

	
	public static final By UserNameForLogin = By.xpath("//input[@id='email']");
	public static final By Password = By.xpath("//input[@placeholder='Password' and @type='password']");
	public static final By TermsAndConditionCheckBox = By.xpath("(//div[@class='control__indicator'])[2]");
	public static final By SignInButtonOnLoginPage = 
			By.xpath("//button[@class='btn btn-block btn-primary loginSignBtn']");
	public static final By PostPlaceHolder = By.xpath("//input[contains(@class, 'form-control')]");	
	public static final By PostButton = By.xpath("//div[text()='Post']");
	public static final By WritePost = By.xpath("//div[@id='app']/textarea");
	public static final By PublishedPost = By.xpath("(//div[@class='info'])[1]");
	public static final By postMoreButton = 
			By.xpath("(//button[@id='dropdownMenu1']/i[@class='material-icons'])[1]");
	
	public static final By editPostButton = By.xpath("//a[text()='Edit Post']");
	public static final By savePostButtonAfterEdit = By.xpath("//div[@class='txt']");
	public static final By LikeIcon = By.xpath("(//span[@class='icons iconLike'])[1]");
	public static final By LikeCount = By.xpath("(//a[contains(@class, 'btn btn-link')])[2]");
	public static final By CommentClickToWrite = 
			By.xpath("(//span[contains (@class, 'icons iconComment')])[1]");
	
	public static final By CommentWite = By.xpath("//textarea[@class='form-control']");
	public static final By CommentButton = By.xpath("//div[text()='Comment']");
	public static final By CommentCount = 
			By.xpath("(//a[contains(@class, 'btn btn-link') and (contains(text(), 'Comment') or contains(text(), 'Comments'))])[1]");
	
	public static final By ShareButton = By.xpath("(//span[contains(@class, 'icons iconShare')])[1]");
	public static final By PostAddingWhenSharingPost = By.xpath("//textarea[contains(@placeholder, 'Start typing here')]");
	public static final By getSharedPostText = By.xpath("(//div[contains(@class, 'info')])[2]");
	public static final By deletePost = By.xpath("//a[text()='Delete Post']");
	public static final By deletePostConfirmButton = By.xpath("//button[contains(text(), 'Confirm')]");
	public static final By likeForSubComment = By.xpath("(//span[contains(@class, 'icons iconLike')])[2]");
	public static final By likeCountForSubComment = By.xpath("(//div[contains(@class, 'likesCol pull-right')]/span)[1]");
	public static final By addSubComment = By.xpath("//textarea[@placeholder='Type Here']");
	
	
	
	public void clearCookies(){
		generic.clearCookies();
	}
	
	
	public void WindowMaximize(){
		generic.WindowMaximize();
	}
	
	
	public void getUrl(String url){
		generic.getUrl(url);
	}
	
	
	public void loginTeacher(){
		UserNameForLogin_explicitWait();
		UserNameForLogin_click();
		UserNameForLogin_clear();
		UserNameForLogin_Sendkeys(ManageAll.TeacherUserNamePhoneNumber);
		Password_click();
		Password_clear();
		Password_Sendkeys(ManageAll.TeacherPassword);
		if (!TermsAndConditionCheckBox_isSelected() == true)
			   TermsAndConditionCheckBox_click();
		SignInButtonOnLoginPage_click();
		
	}
	
	
	 public void UserNameForLogin_explicitWait(){
			generic.explicitWait(UserNameForLogin);
	 }
	 
	 public void UserNameForLogin_click(){
	      	generic.click(UserNameForLogin);
	 }
	 
	 public void UserNameForLogin_clear(){
    	 generic.clear(UserNameForLogin);
     }
	 
	 public void UserNameForLogin_Sendkeys(String value){
	    	generic.Sendkeys(UserNameForLogin, value);
	 }
	 
	 public void Password_click(){
   	  generic.click(Password);
     }
	 
	 public void Password_clear(){
    	 generic.clear(Password);
     }
	 
	 public void Password_Sendkeys(String value){
	      	generic.Sendkeys(Password, value);
	 }
	
	 
	 public boolean TermsAndConditionCheckBox_isSelected(){
   	  
    	 return generic.isSelected(TermsAndConditionCheckBox);
      }
	 
	 public void TermsAndConditionCheckBox_click(){
   	  generic.click(TermsAndConditionCheckBox);
     }
	 
	 public void SignInButtonOnLoginPage_click(){
   	  generic.click(SignInButtonOnLoginPage);
     }
	 
	 public void PostPlaceHolder_explicitWait(){
		 generic.explicitWait(PostPlaceHolder);
	 }
	 
	 public void PostPlaceHolder_click(){
		 generic.click(PostPlaceHolder);
	 }
	 
	 public void WritePost_clear(){
		 generic.clear(WritePost);
	 }
	 
	 public void WritePost_sendkeys(String value){
		 generic.Sendkeys(WritePost, value);
	 }
	 
	 public void PostButton_click(){
		 generic.click(PostButton);
	 }
	 
	 public void WritePost_explicitWait(){
		 generic.explicitWait(WritePost);
	 }
	 
	 public void implicitWait(){
		 generic.implicitWait();
	 }
	 
	public void PostPlaceHolder_clickJS(){
		generic.click_JS(PostPlaceHolder);
	}
	
	public String PublishedPost_gettext(){
		return generic.getText(PublishedPost);
	}
	
	public void PublishedPost_explicitWait(){
		generic.explicitWait(PublishedPost);
	}
	
	public String pageSource(){
		return generic.getPageSource();
	}
	
	public void driverQuit(){
		generic.driverQuit();
	}
	
	public void postMoreButton_explicitWait(){
		generic.explicitWait(postMoreButton);
	}
	
	public void postMoreButton_clickJS(){
		generic.click_JS(postMoreButton);
	}
	
	public void postMoreButton_click(){
		generic.click(postMoreButton);
	}
	
	public void editPostButton_click(){
		generic.click(editPostButton);
	}
	
	public void editPostButton_clickJS(){
		generic.click_JS(editPostButton);
	}
	
	public void editPostButton_explicitWait(){
		generic.explicitWait(editPostButton);
	}
	
	public void savePostButtonAfterEdit_click(){
		generic.click(savePostButtonAfterEdit);
	}
	
	public void savePostButtonAfterEdit_clickJS(){
		generic.click_JS(savePostButtonAfterEdit);
	}
	
	public void pageRefresh(){
		generic.pageRefresh();
	}
	
	public void LikeIcon_clickJS(){
		generic.click_JS(LikeIcon);
	}
	
	public void LikeIcon_explicitWait(){
		generic.explicitWait(LikeIcon);
	}
	
	
	public String LikeCount_gettext(){
		String text = generic.getText(LikeCount);
		text = text.replaceAll(" Like", "");
		text = text.replaceAll(" Likes", "");
		text = text.replaceAll("s", "");
		return text;
	}
	
	public void LikeCount_explicitWait(){
		generic.explicitWait(LikeCount);
	}
		
	public String todayDateWithHour(){
		return generic.todayDateWithHour();
	}
		
	public void CommentClickToWrite_Click(){
		generic.click(CommentClickToWrite);
	}
	
	public void CommentClickToWrite_ClickJS(){
		generic.click_JS(CommentClickToWrite);
	}
	
	public void CommentClickToWrite_explicitWait(){
		generic.explicitWait(CommentClickToWrite);
	}
		
	public void CommentWite_click(){
		generic.click(CommentWite);
	}
	
	
	public void CommentWite_clear(){
		generic.clear(CommentWite);
	}
	
	public void CommentWite_sendkeys(String value){
		generic.Sendkeys(CommentWite, value);
	}

	
	public void CommentWite_explicitWait(){
		generic.explicitWait(CommentWite);
	}
	
	
	public void CommentButton_click(){
		generic.click(CommentButton);
	}
	
	public void CommentButton_clickJS(){
		generic.click_JS(CommentButton);
	}
	
	public void CommentCount_explicitWait(){
		generic.explicitWait(CommentCount);
	}
	
	public String CommentCount_gettext(){
		String text = generic.getText(CommentCount);
		text = text.replaceAll(" Comment", "");
		text = text.replaceAll(" Comments", "");
		text = text.replaceAll("s", "");
		return text;
	}
	
	
	public void ShareButton_explicitWait(){
		generic.explicitWait(ShareButton);
	}

	
	public void ShareButton_click(){
		generic.click(ShareButton);
	}
	
	public void PostAddingWhenSharingPost_clear(){
		generic.clear(PostAddingWhenSharingPost);
	}
	
	public void PostAddingWhenSharingPost_explicitWait(){
		generic.explicitWait(PostAddingWhenSharingPost);
	}
	
	public void PostAddingWhenSharingPost_sendkeys(String value){
		generic.Sendkeys(PostAddingWhenSharingPost, value);
	}
	
	public String getSharedPostText_getText(){
		return generic.getText(getSharedPostText);
	}
	
	public void getSharedPostText_explicitWait(){
	
		generic.explicitWait(getSharedPostText);
	}
	
	
	public void deletePost_click(){
		generic.click(deletePost);
	}
	
	public void deletePost_explicitWait(){
		generic.explicitWait(deletePost);
	}
	
	
	public void deletePostConfirmButton_click(){
		generic.click(deletePostConfirmButton);
	}
	
	public void deletePostConfirmButton_explicitWait(){
		generic.explicitWait(deletePostConfirmButton);
	}
	
	
	public void likeForSubComment_click(){
		generic.click(likeForSubComment);
	}
	
	public void likeForSubComment_explicitWait(){
		generic.explicitWait(likeForSubComment);
	}
	
	public String likeCountForSubComment_gettext(){
		String text = generic.getText(likeCountForSubComment);
		text = text.replaceAll(" Like", "");
		text = text.replaceAll(" Likes", "");
		text = text.replaceAll("s", "");
		return text;
	}
	
	public void likeCountForSubComment_explicitWait(){
		generic.explicitWait(likeCountForSubComment);
	}
	
	
	public void addSubComment_clear(){
		generic.clear(addSubComment);
	}
	
	public void addSubComment_sendkeys(String value){
		generic.Sendkeys(addSubComment, value);
	}
	
	public void addSubComment_explicitWait(){
		generic.explicitWait(addSubComment);
	}
}

