package Utils;

public class UrlProvider extends config {


	public String getHomeUrl(){
		
		if (Environment.equalsIgnoreCase("live")){
			return "https://www.budbee.net";
		}else{
		  return "http://35.154.14.106:4000";	
		}
		
	}
	
	
	public String getSignUp(){
		if (Environment.equalsIgnoreCase("live"))
			return "https://www.budbee.net/register";
		else
			return "http://35.154.14.106:4000/register";
	}
	
	
	public String getForgotPassword(){
		if (Environment.equalsIgnoreCase("live"))
			return "https://www.budbee.net/forgot";
		else
			return "http://35.154.14.106:4000/forgot";
	}
	
	
	public String getLogin(){
		if (Environment.equalsIgnoreCase("live"))
			return "https://www.budbee.net/login";
		else
			return "http://35.154.14.106:4000/login";
	}
}
