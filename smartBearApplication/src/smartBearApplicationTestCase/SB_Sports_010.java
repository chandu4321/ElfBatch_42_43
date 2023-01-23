package smartBearApplicationTestCase;

import org.testng.Reporter;
import org.testng.annotations.Test;

import baseTest.BaseClass1;
import pomDesigN.BasePage;

public class SB_Sports_010 extends BaseClass1{
	@Test
	public void aboutUsButton() {
		BasePage basePage=new BasePage(driver);
		basePage.getHelp_ServicesButton().click();
		basePage.getAboutUsButton().click();
		Reporter.log("about Us Page",true);
	}
}
