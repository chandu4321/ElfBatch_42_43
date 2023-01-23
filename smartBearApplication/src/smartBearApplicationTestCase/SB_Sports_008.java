package smartBearApplicationTestCase;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import baseTest.BaseClass;
import pomDesigN.BasePage;

public class SB_Sports_008 extends BaseClass {
	@Test
	public void removeButton() {
		
		BasePage basePage = new BasePage(driver);
		basePage.getSportsDropDown().click();
		basePage.getBasketballButton().click();
		basePage.getBasketBallProduct().click();
		basePage.getAddCartButton().click();
		basePage.getRemoveButton().click();
		Reporter.log("Product is Removed From Cart",true);
	}
}
