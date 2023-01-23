package baseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass1 {
	public WebDriver driver;
	
	@BeforeClass
	public void LaunchBrowser() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("window is maximised",true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://services.smartbear.com/samples/TestComplete14/smartstore");
		Reporter.log("application is opened",true);
	}
	
	@AfterClass
	public void quitBrowser() {
		driver.quit();
		Reporter.log("Application is closed",true);
	}
}
