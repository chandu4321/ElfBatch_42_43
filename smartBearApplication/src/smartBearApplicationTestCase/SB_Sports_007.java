package smartBearApplicationTestCase;

import org.testng.Reporter;
import org.testng.annotations.Test;

import baseTest.BaseClass;
import pomDesigN.BasePage;



public class SB_Sports_007 extends BaseClass{
	@Test
	public void addToCart() {
		BasePage basePage= new BasePage(driver);
		basePage.getSportsDropDown().click();
		basePage.getSoccerButton().click();
		basePage.getSoccerProduct().click();
		basePage.getIncrementButton().click();
		basePage.getAddCartButton().click();
		Reporter.log("Product Successfully Added To Cart",true);
	}
}
