package Execution;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.pomPost;
import Utils.ManageAll;
import Utils.UrlProvider;

public class Post_Teacher {
	
	pomPost post;
	UrlProvider url;
	
	@BeforeTest
	public void beforeTest() {
		post = new pomPost();
		post.WindowMaximize();
	}

//	
//	@Test
//	public void Verify_User_Able_to_Add_post_for_Teacher() throws InterruptedException{
//		String timeStamp = post.todayDateWithHour();
//		url = new UrlProvider();
//		post.clearCookies();
//		post.getUrl(url.getLogin());
//		post.loginTeacher();
//		post.PostPlaceHolder_explicitWait();
//		Thread.sleep(3000L);
//		post.PostPlaceHolder_clickJS();
//		post.WritePost_explicitWait();
//		post.WritePost_clear();
//		post.WritePost_sendkeys(ManageAll.UnRegisterdEmail+" "+timeStamp);
//		post.PostButton_click();
//		post.pageRefresh();
//		post.PublishedPost_explicitWait();
//		Assert.assertEquals(post.PublishedPost_gettext(), ManageAll.UnRegisterdEmail+" "+timeStamp,
//		"post is not able to be published!");
//	}
//	
//	
//	@Test
//	public void verify_Confirmation_message_for_Add_post() throws InterruptedException{
//		url = new UrlProvider();
//		post.clearCookies();
//		post.getUrl(url.getLogin());
//		post.loginTeacher();
//		post.PostPlaceHolder_explicitWait();
//		Thread.sleep(3000L);
//		post.PostPlaceHolder_clickJS();
//		post.WritePost_explicitWait();
//		post.WritePost_clear();
//		post.WritePost_sendkeys(ManageAll.UnRegisterdEmail+" "+post.todayDateWithHour());
//		post.PostButton_click();
//		Thread.sleep(2000L);
//		if (post.pageSource().contains("Post added successfully")){
//			Assert.assertEquals(true, true);
//		}
//		else{
//			Assert.assertEquals(true, false, "no confirmation message is visible when added a post");
//		}
//	}
//	
//	
//	@Test
//	public void verify_user_able_to_edit_post() throws InterruptedException{
//		String timeStamp = post.todayDateWithHour();
//		url = new UrlProvider();
//		post.clearCookies();
//		post.getUrl(url.getLogin());
//		post.loginTeacher();
//		post.PostPlaceHolder_explicitWait();
//		Thread.sleep(3000L);
//		post.PostPlaceHolder_clickJS();
//		post.WritePost_explicitWait();
//		post.WritePost_clear();
//		post.WritePost_sendkeys(ManageAll.UnRegisterdEmail+" "+post.todayDateWithHour());
//		post.PostButton_click();	
//		post.postMoreButton_explicitWait();
//		Thread.sleep(2000L);
//		post.postMoreButton_clickJS();
//		post.editPostButton_explicitWait();
//		post.editPostButton_clickJS();
//		post.WritePost_explicitWait();
//		post.WritePost_clear();
//		post.WritePost_sendkeys(ManageAll.UnRegisterMobile+" "+timeStamp);
//		post.savePostButtonAfterEdit_click();
//		Thread.sleep(3000L);
//		Assert.assertEquals(post.PublishedPost_gettext(), ManageAll.UnRegisterMobile+" "+timeStamp,
//		"post is not able to be published!");
//	}
//	
//	
//	
//	@Test
//	public void verify_count_of_like() throws InterruptedException{
//		url = new UrlProvider();
//		post.clearCookies();
//		post.getUrl(url.getLogin());
//		post.loginTeacher();
//		post.PostPlaceHolder_explicitWait();
//		Thread.sleep(3000L);
//		post.PostPlaceHolder_clickJS();
//		post.WritePost_explicitWait();
//		post.WritePost_clear();
//		post.WritePost_sendkeys(ManageAll.UnRegisterdEmail+" "+post.todayDateWithHour());
//		post.PostButton_click();
//		Thread.sleep(2000l);
//	    post.LikeIcon_clickJS();
//	    post.pageRefresh();
//	    post.LikeCount_explicitWait();
//	    Assert.assertEquals(post.LikeCount_gettext(), "1", "Like Count is not Matched");
//	}
//	
//	
//	
//	@Test
//	public void verify_count_of_like_when_unlike() throws InterruptedException{
//		url = new UrlProvider();
//		post.clearCookies();
//		post.getUrl(url.getLogin());
//		post.loginTeacher();
//		post.PostPlaceHolder_explicitWait();
//		Thread.sleep(3000L);
//		post.PostPlaceHolder_clickJS();
//		post.WritePost_explicitWait();
//		post.WritePost_clear();
//		post.WritePost_sendkeys(ManageAll.UnRegisterdEmail+" "+post.todayDateWithHour());
//		post.PostButton_click();
//		Thread.sleep(2000l);
//	    post.LikeIcon_clickJS();
//	    post.pageRefresh();
//	    post.LikeCount_explicitWait();
//	    post.LikeIcon_clickJS();
//	    post.pageRefresh();
//	    post.LikeCount_explicitWait();
//	    Assert.assertEquals(post.LikeCount_gettext(), "0", "Like Count is not Matched when unlike");
//	}
//	
//	
//	@Test
//	public void verify_count_of_comment() throws InterruptedException {
//		url = new UrlProvider();
//		post.clearCookies();
//		post.getUrl(url.getLogin());
//		post.loginTeacher();
//		post.PostPlaceHolder_explicitWait();
//		Thread.sleep(2000L);
//		post.PostPlaceHolder_clickJS();
//		post.WritePost_explicitWait();
//		post.WritePost_clear();
//		post.WritePost_sendkeys(ManageAll.UnRegisterdEmail+" "+post.todayDateWithHour());
//		post.PostButton_click();
//		Thread.sleep(2000l);
//		post.CommentClickToWrite_explicitWait();
//		post.CommentClickToWrite_Click();
//		post.CommentWite_explicitWait();
//		post.CommentWite_clear();
//		post.CommentWite_sendkeys(ManageAll.UnRegisterdEmail+" "+post.todayDateWithHour());
//		post.CommentButton_click();
//		post.CommentCount_explicitWait();
//		Assert.assertEquals(post.CommentCount_gettext(), "1", "Comment is not able to add");
//	}
//	
//	
//	@Test
//	public void verify_user_able_to_share_own_post() throws InterruptedException {
//		String time = post.todayDateWithHour();
//		url = new UrlProvider();
//		post.clearCookies();
//		post.getUrl(url.getLogin());
//		post.loginTeacher();
//		post.PostPlaceHolder_explicitWait();
//		Thread.sleep(2000L);
//		post.PostPlaceHolder_clickJS();
//		post.WritePost_explicitWait();
//		post.WritePost_clear();
//		post.WritePost_sendkeys(ManageAll.UnRegisterdEmail+" "+post.todayDateWithHour());
//		post.PostButton_click();
//		Thread.sleep(2000l);
//		post.ShareButton_explicitWait();
//		post.ShareButton_click();
//		post.PostAddingWhenSharingPost_explicitWait();
//		post.PostAddingWhenSharingPost_clear();
//		post.PostAddingWhenSharingPost_sendkeys(ManageAll.UnRegisterMobile+" "+time);
//		post.PostButton_click();
//		post.pageRefresh();
//		post.getSharedPostText_explicitWait();
//		Assert.assertEquals(post.getSharedPostText_getText(), ManageAll.UnRegisterMobile+" "+time, "user is not able to share his own post!");
//		
//	}
//	
//	
//	@Test
//	public void verify_user_able_to_delete_post() throws InterruptedException{
//		String Text;
//		url = new UrlProvider();
//		post.clearCookies();
//		post.getUrl(url.getLogin());
//		post.loginTeacher();
//		post.getSharedPostText_explicitWait();
//		Text = post.getSharedPostText_getText();
//		post.PostPlaceHolder_explicitWait();
//		Thread.sleep(2000L);
//		post.PostPlaceHolder_clickJS();
//		post.WritePost_explicitWait();
//		post.WritePost_clear();
//		post.WritePost_sendkeys(ManageAll.UnRegisterdEmail+" "+post.todayDateWithHour());
//		post.PostButton_click();
//		Thread.sleep(2000L);
//		post.postMoreButton_clickJS();
//		post.deletePost_explicitWait();
//		post.deletePost_click();
//		post.deletePostConfirmButton_explicitWait();
//		post.deletePostConfirmButton_click();
//		post.pageRefresh();
//		Assert.assertEquals(post.getSharedPostText_getText(), Text, "user is not able to delete the post");
//	}
//	
//	
//	@Test
//	public void verify_count_of_like_for_SubComment() throws InterruptedException {
//		url = new UrlProvider();
//		post.clearCookies();
//		post.getUrl(url.getLogin());
//		post.loginTeacher();
//		post.PostPlaceHolder_explicitWait();
//		Thread.sleep(2000L);
//		post.PostPlaceHolder_clickJS();
//		post.WritePost_explicitWait();
//		post.WritePost_clear();
//		post.WritePost_sendkeys(ManageAll.UnRegisterdEmail+" "+post.todayDateWithHour());
//		post.PostButton_click();
//		Thread.sleep(2000l);
//		post.CommentClickToWrite_explicitWait();
//		post.CommentClickToWrite_Click();
//		post.CommentWite_explicitWait();
//		post.CommentWite_clear();
//		post.CommentWite_sendkeys(ManageAll.UnRegisterdEmail+" "+post.todayDateWithHour());
//		post.CommentButton_click();
//		post.likeForSubComment_explicitWait();
//		post.likeForSubComment_click();
//		post.likeCountForSubComment_explicitWait();
//		Thread.sleep(3000L);
//        Assert.assertEquals(post.likeCountForSubComment_gettext(), "1", "user is not able to like on sub comment");
//	}
//	
//	
//	@Test
//	public void verify_count_of_unlike_for_SubComment() throws InterruptedException {
//		url = new UrlProvider();
//		post.clearCookies();
//		post.getUrl(url.getLogin());
//		post.loginTeacher();
//		post.PostPlaceHolder_explicitWait();
//		Thread.sleep(2000L);
//		post.PostPlaceHolder_clickJS();
//		post.WritePost_explicitWait();
//		post.WritePost_clear();
//		post.WritePost_sendkeys(ManageAll.UnRegisterdEmail+" "+post.todayDateWithHour());
//		post.PostButton_click();
//		Thread.sleep(2000l);
//		post.CommentClickToWrite_explicitWait();
//		post.CommentClickToWrite_Click();
//		post.CommentWite_explicitWait();
//		post.CommentWite_clear();
//		post.CommentWite_sendkeys(ManageAll.UnRegisterdEmail+" "+post.todayDateWithHour());
//		post.CommentButton_click();
//		post.likeForSubComment_explicitWait();
//		post.likeForSubComment_click();
//		Thread.sleep(1000L);
//		post.likeForSubComment_click();
//		post.likeCountForSubComment_explicitWait();
//		Thread.sleep(3000L);
//        Assert.assertEquals(post.likeCountForSubComment_gettext(), "0", "user is not able to unlike on sub comment");
//	}
//	
	
	@Test
	public void verify_user_able_to_add_SubComment() throws InterruptedException {
		url = new UrlProvider();
		post.clearCookies();
		post.getUrl(url.getLogin());
		post.loginTeacher();
		post.PostPlaceHolder_explicitWait();
		Thread.sleep(2000L);
		post.PostPlaceHolder_clickJS();
		post.WritePost_explicitWait();
		post.WritePost_clear();
		post.WritePost_sendkeys(ManageAll.UnRegisterdEmail+" "+post.todayDateWithHour());
		post.PostButton_click();
		Thread.sleep(2000l);
		post.CommentClickToWrite_explicitWait();
		post.CommentClickToWrite_Click();
		post.CommentWite_explicitWait();
		post.CommentWite_clear();
		post.CommentWite_sendkeys(ManageAll.UnRegisterdEmail+" "+post.todayDateWithHour());
		post.CommentButton_click();
		
		
		post.addSubComment_explicitWait();
//		post.addSubComment_clear();
//		post.addSubComment_sendkeys(ManageAll.UnRegisterdEmail+" "+post.todayDateWithHour());
//	    post.CommentButton_click();
	    
	}
	
	
	
	@AfterTest
	public void aftertest() {
//		post.driverQuit();
	}
}
