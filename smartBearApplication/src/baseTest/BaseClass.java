package baseTest;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Optional;
	import org.testng.annotations.Parameters;
	import org.testng.asserts.SoftAssert;

import pomDesigN.LoginBasePage;
import toHandleGenericCode.ToHandleGenericCode;

	/***
	 *
	 * @author Chandana
	 *
	 */
	public class BaseClass{
	public WebDriver driver;
	String expectedTittle = "Shop";

	@Parameters("browserName")
	@BeforeClass
	public void browserSetUp(@Optional("edge") String bname) {
	driver = new ChromeDriver();
	SoftAssert soft = new SoftAssert();
	Reporter.log("The empty browser is Lanuched", true);
	driver.manage().window().maximize();
	Reporter.log("Browser window is Maximized", true);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get(ToHandleGenericCode.fromPropertyFile("Url"));
	String actualTittle = driver.getTitle();
	soft.assertEquals(actualTittle, expectedTittle, "Home Page is Displayed");
	Reporter.log("User Navigted to HomePage Suceesfully", true);
	Reporter.log(actualTittle, true);

	}

	@BeforeMethod
	public void LoginUser() {
	LoginBasePage sp = new LoginBasePage(driver);
	sp.getLoginButton().click();
	sp.getUserNameTextField().sendKeys(ToHandleGenericCode.fromPropertyFile("UserName"));
	sp.getPassWordTextField().sendKeys(ToHandleGenericCode.fromPropertyFile("Password"));
	sp.getLogInButton().click();
	Reporter.log("User Login Sucessfully", true);
	}

	@AfterMethod
	public void LogOut() {
	LoginBasePage sp = new LoginBasePage(driver);
	sp.getUserDropDown().click();
	sp.getLogOutButton().click();
	Reporter.log("User Logout Sucessfully", true);
	}

	@AfterClass
	public void quitBrowser() {
	driver.quit();
	Reporter.log("Server Closed Sucessfully", true);
	}
}

