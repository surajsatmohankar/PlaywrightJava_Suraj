package pages;

import com.microsoft.playwright.Page;

public class HomePage {
	
	private Page page;
	//private final String timeLink = "getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(\"Time\"))";
	//private final String timeLink = "oxd-text oxd-text--span oxd-main-menu-item--name";
	private final String timeLink = "span:has-text('Time')";
	public HomePage(Page page) {
		this.page = page;
	}
	
	public void clickTimeLink() {
		//page.click(timeLink);
		//page.locator(".oxd-text oxd-text--span.oxd-main-menu-item--name").click();
		//page.locator(".oxd-text.oxd-text--span.oxd-main-menu-item--name").click();
		 page.waitForSelector(timeLink);
	        page.click(timeLink);
	        

	}
}
