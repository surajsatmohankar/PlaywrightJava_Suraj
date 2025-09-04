package tests;

import java.nio.file.Paths;

import org.testng.annotations.Test;

import com.microsoft.playwright.ElementHandle.SelectOptionOptions;
import com.microsoft.playwright.options.SelectOption;

import Base.BaseTest;

public class LocatorsDemo extends BaseTest{
	@Test
	public void testAllLocators() {
		page.navigate("https://trytestingthis.netlify.app/");
		page.locator("#fname").fill("Rohan");
		//page.locator("input[name='lname']").fill("mohankar");
		page.locator("[name='lname']").fill("mohankar");
		page.locator("input[value ='male']").check();
		page.locator("input[type=radio][value='female']").check();
		page.locator("select#option").selectOption("Option 2");
		page.locator("select#owc").selectOption("Option 2");
		//page.locator("select#moption").selectOption("Option 2");
		page.locator("[name='option2']").check();
		//page.locator("select#datalists").selectOption("Strawberry");
		page.locator("input[list='datalists']").fill("Chocolate");
		page.locator("input[type='color']").fill("#00ced1");
		page.locator("//input[@type='date']").fill("2025-12-25");
		page.locator("//input[@type='range']").fill("15");
		//page.locator("input[type='file']").setInputFiles
		page.locator("input[type='file']")
	    .setInputFiles(Paths.get("C:\\Users\\Suraj.Satmohankar\\OneDrive - Nitor Infotech Pvt. Ltd\\Desktop\\shah.jpg"));

		//page.locator("input[type='file']").setInputFiles("C:\\Users\\Suraj.Satmohankar\\OneDrive - Nitor Infotech Pvt. Ltd\\Desktop\\shah.jpg");
		page.locator("input[type='number']").fill("4");
		page.locator("//textarea[@name=\"message\"]").fill("my friend is Bhavesh");
		page.locator("input[type='submit']").click();
		
		
		//page.locator(null)
		page.pause();
		
	}

}
