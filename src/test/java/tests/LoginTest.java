package tests;

import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import Base.BaseTest;

public class LoginTest extends BaseTest{
	@Test
	void test() {
	    page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    //assertThat(page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username"))).isVisible();
	   // assertThat(page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Password$"))).nth(2)).isVisible();
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).click();
	   // assertThat(page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username"))).isVisible();
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).click();
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).click();
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).fill("Admin");
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).click();
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("admin123");
	    page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
	    page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Time")).click();
	    page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Performance")).click();
	    page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Leave")).click();
	    page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Dashboard")).click();
	   // assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("PIM"))).isVisible();
	  }
}
