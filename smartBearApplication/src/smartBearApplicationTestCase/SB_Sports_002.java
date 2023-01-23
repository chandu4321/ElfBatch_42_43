package smartBearApplicationTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseTest.BaseClass;
import pomDesigN.BasePage;

public class SB_Sports_002 extends BaseClass {
	@Test
	public void sportsCategory() {
		
		BasePage basePage = new BasePage(driver);
		WebElement sportdrop = basePage.getSportsDropDown();
		sportdrop.click();
		basePage.getBasketballButton().click();		
		basePage.getPrice();
		Reporter.log(basePage.getPrice().getText(), true);
		basePage.getPrice1().click();
		
	}
}
