package pages;

import com.microsoft.playwright.Page;

public class LoginPage {
	
	private Page page;
	private  final String usernameTextbox = "input[name=username]";
	private final String passwordTextbox = "input[name=password]";
	private final String loginbutton ="button[type=submit]";
	
	public LoginPage(Page page) {
		
		this.page =page;
	}
	
	public void addUsername(String username) {
		page.fill(usernameTextbox, username);
	}
	public void addPasswordTextbox(String password) {
		page.fill(passwordTextbox, password);
	}
	public void clickLoginButton() {
		//page.click(loginbutton);
		page.waitForSelector("button[type=submit]");
	    page.click("button[type=submit]");
	    
	    
	}
	
	public void login(String username, String password) {
		page.fill(usernameTextbox, username);
		page.fill(passwordTextbox, password);
		page.click(loginbutton);
		
		
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
