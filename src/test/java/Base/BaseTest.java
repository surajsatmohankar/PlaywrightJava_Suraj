package Base;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import utils.ExtentManager;
import utils.ScreenShort;

public class BaseTest {

	protected Playwright playwright;
	protected Browser browser;
	protected Page page;
	protected ExtentReports extent;
	protected ExtentTest test;

	@BeforeMethod
	public void setUp(Method method) {
		// Method method

		extent = ExtentManager.getInstance();
		test = extent.createTest(method.getName());
		playwright = Playwright.create();
		Browser browser = playwright.chromium()
				.launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
		page = browser.newPage();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		//ITestResult result;

		if (result.getStatus() == ITestResult.FAILURE) {
			test.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.pass("Test Pass");
			
			String screenshotPath = ScreenShort.takeScreenShort(page, result.getName());
			
			System.out.println("*** screenshotPath :"+ screenshotPath);
			String projectPath = System.getProperty("user.dir");
			
			String absoluteScreenshotPath = projectPath+"/"+ screenshotPath;
			System.out.println("*** absoluteScreenshotPath: "+ absoluteScreenshotPath);
			test.addScreenCaptureFromPath(absoluteScreenshotPath, "screenshot");
			//test.addScreenCaptureFromBase64String(absoluteScreenshotPath);

		} else {
			test.skip("Test Skip");
		}

		extent.flush();

		if (browser != null)
			browser.close();
		if (playwright != null)
			playwright.close();
	}
}
