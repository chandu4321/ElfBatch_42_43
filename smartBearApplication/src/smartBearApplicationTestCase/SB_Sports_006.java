package smartBearApplicationTestCase;

import org.testng.annotations.Test;
import baseTest.BaseClass;
import pomDesigN.BasePage;

public class SB_Sports_006 extends BaseClass {
	@Test
	public void soccerButton() {
		BasePage basePage= new BasePage(driver);
		basePage.getSportsDropDown().click();
		basePage.getSoccerButton().click();
		basePage.getSortDropDown().click();
		basePage.getSort_Name_A_Z().click();
		basePage.getSoccerProduct().click();
	}
}
