package smartBearApplicationTestCase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseTest.BaseClass;
import pomDesigN.BasePage;

public class SB_Sports_003 extends BaseClass {
	@Test
	public void sortbyrelevancedropdown() throws InterruptedException {
		BasePage basePage = new BasePage(driver);
		basePage.getSportsDropDown().click();
		Reporter.log("user clicked on Sport DropDown",true);
		basePage.getBasketballButton().click();
		Reporter.log("user clicked on BasketBall Button",true);
		WebElement sort = basePage.getSortDropDown();
		sort.click();
		//explicity.until(ExpectedConditions.invisibilityOf(sort));
		Reporter.log("user clicked on Sort By DropDown",true);
		basePage.getSort_Name_A_Z().click();
		Reporter.log("user clicked on Sort By Name:A to Z",true);
	}
}
