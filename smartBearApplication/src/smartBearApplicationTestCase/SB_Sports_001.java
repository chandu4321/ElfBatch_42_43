package smartBearApplicationTestCase;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseTest.BaseClass;

import pomDesigN.BasePage;



public class SB_Sports_001 extends BaseClass {
	@Test
	public void sportsCategory() {
		BasePage basePage = new BasePage(driver);
		basePage.getSportsDropDown().click();
		WebElement dropdown = basePage.getSportsDropDown();
		//explicity.until(ExpectedConditions.visibilityOfAllElements(dropdown));
		
	}
}
