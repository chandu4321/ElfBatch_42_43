package smartBearApplicationTestCase;

import org.testng.Reporter;
import org.testng.annotations.Test;
import baseTest.BaseClass;
import pomDesigN.BasePage;

public class SB_Sports_005 extends BaseClass {
	@Test
	public void golfButton() {
		BasePage basePage = new BasePage(driver);
		basePage.getSportsDropDown().click();
		basePage.getGolfButton().click();
		basePage.getPrice();
		basePage.getPrice1().click();
		Reporter.log("user click on Price Drop Down",true);
		basePage.getGolfProduct().click();
		basePage.getAddToListButton().click();
		Reporter.log("user click on Add To list",true);
	}
}