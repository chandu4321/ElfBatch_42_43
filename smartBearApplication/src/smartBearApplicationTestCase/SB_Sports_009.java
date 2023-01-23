package smartBearApplicationTestCase;

import org.testng.Reporter;
import org.testng.annotations.Test;

import baseTest.BaseClass1;
import pomDesigN.BasePage;

public class SB_Sports_009 extends BaseClass1{
	@Test
	public void shippingButton() {
		BasePage basePage =new BasePage(driver);
		basePage.getSportsDropDown().click();
		basePage.getSoccerButton().click();
		basePage.getTrainerBall().click();
		basePage.getShippingButton().click();
		Reporter.log("Product Shipping",true);
	}
}
