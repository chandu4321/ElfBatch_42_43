package smartBearApplicationTestCase;

import org.testng.Reporter;
import org.testng.annotations.Test;

import baseTest.BaseClass;
import pomDesigN.BasePage;

public class SB_Sports_004 extends BaseClass{
	@Test
	public void Showbutton() {
		BasePage basePage = new BasePage(driver);
		basePage.getSportsDropDown().click();
		Reporter.log("user clicked on Sport DropDown",true);
		basePage.getBasketballButton().click();
		Reporter.log("user clicked on BasketBall Button",true);
		basePage.getShowButton().click();
	}
}