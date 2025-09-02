package tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import Base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest2 extends BaseTest {
	@Test
	public void loginTest1() {
		
		LoginPage loginPage = new LoginPage(page);
		HomePage homePage = new HomePage(page);
		//test.info("Navigating to the url");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		test.info("adding username");
		loginPage.addUsername("Admin");
		
		test.info("adding password");
		loginPage.addPasswordTextbox("admin123");
		
		test.info("Clicking Loging");
		loginPage.clickLoginButton();
		
		test.info("Checking to Home-Page");
		homePage.clickTimeLink();

	}
	
	@Test
	public void loginTest2(){
		
		test.skip("Skipping This Test");
		throw new SkipException("Skipping this test");
	}
	@Test
	public void loginTest3(){
		
		LoginPage loginPage = new LoginPage(page);
		//HomePage homePage = new HomePage(page);
		//test.info("Navigating to the url");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		test.info("adding username");
		loginPage.addUsername("Admin");
		
		test.info("adding password");
		loginPage.addPasswordTextbox("admin123");
		
		test.info("Clicking Loging");
		loginPage.clickLoginButton();
		
//		test.info("Checking to Home-Page");
//		homePage.clickTimeLink();
		
		test.info("All test are completed");

	}
}
