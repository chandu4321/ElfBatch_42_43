package pomDesigN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText = "Sports")
	private WebElement sportsDropDown;

	public WebElement getSportsDropDown() {
		return sportsDropDown;
	}
	
	@FindBy(partialLinkText = "Basketball")
	private WebElement basketballButton;
	
	@FindBy(partialLinkText = "Golf")
	private WebElement golfButton;
	
	public WebElement getBasketballButton() {
		return basketballButton;
	}

	public WebElement getGolfButton() {
		return golfButton;
	}

	public WebElement getSoccerButton() {
		return soccerButton;
	}

	public WebElement getSortDropDown() {
		return sortDropDown;
	}

	public WebElement getPerPage() {
		return perPage;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getPrice1() {
		return price1;
	}

	public WebElement getPrice2() {
		return price2;
	}

	public void setSportsDropDown(WebElement sportsDropDown) {
		this.sportsDropDown = sportsDropDown;
	}

	@FindBy(partialLinkText = "Soccer")
	private WebElement soccerButton;

	@FindBy(id = "artlist-action-sort")
	private WebElement sortDropDown;
	
	@FindBy(id = "artlist-action-pagesize")
	private WebElement perPage;
	
	@FindBy(xpath = "//a[contains(text(),'Price')]")
	private WebElement price;
	
	@FindBy(xpath = "//span[contains(text(),'$10.00')]")
	private WebElement price1;
	
	@FindBy(xpath = "//span[contains(text(),'$25.00')]")
	private WebElement price2;
	
	@FindBy(xpath = "//span[contains(text(),'$50.00')]")
	private WebElement price3;
	
	@FindBy(xpath = "//span[contains(text(),'$100.00')]")
	private WebElement price4;
	
	@FindBy(xpath = "//span[contains(text(),'$250.00')]")
	private WebElement price5;
	

	public WebElement getPrice4() {
		return price4;
	}

	public WebElement getPrice5() {
		return price5;
	}

	public WebElement getPrice6() {
		return price6;
	}

	public WebElement getPrice7() {
		return price7;
	}

	@FindBy(xpath = "//span[contains(text(),'$500.00')]/..//input[@name='optradio-price']")
	private WebElement price6;
	
	@FindBy(xpath = "//span[contains(text(),'$1,000.00')]/..//input[@name='optradio-price']")
	private WebElement price7;
	
	@FindBy(xpath = "//option[text()='12']")
	private WebElement perPage12;
	
	@FindBy(xpath = "//option[text()='24']")
	private WebElement perPage24;
	
	@FindBy(xpath = "//option[text()='36']")
	private WebElement perPage36;
	
	@FindBy(xpath = "//option[text()='48']")
	private WebElement perPage48;
	
	public WebElement getSort_Featured() {
		return sort_Featured;
	}

	public void setSort_Featured(WebElement sort_Featured) {
		this.sort_Featured = sort_Featured;
	}

	public WebElement getSort_Name_A_Z() {
		return sort_Name_A_Z;
	}

	public void setSort_Name_A_Z(WebElement sort_Name_A_Z) {
		this.sort_Name_A_Z = sort_Name_A_Z;
	}

	public WebElement getSort_Name_Z_A() {
		return sort_Name_Z_A;
	}

	public void setSort_Name_Z_A(WebElement sort_Name_Z_A) {
		this.sort_Name_Z_A = sort_Name_Z_A;
	}

	public WebElement getSort_NewestArrivals() {
		return sort_NewestArrivals;
	}

	public void setSort_NewestArrivals(WebElement sort_NewestArrivals) {
		this.sort_NewestArrivals = sort_NewestArrivals;
	}

	public WebElement getRating() {
		return rating;
	}

	public void setRating(WebElement rating) {
		this.rating = rating;
	}

	public WebElement getRating4() {
		return rating4;
	}

	public void setRating4(WebElement rating4) {
		this.rating4 = rating4;
	}

	public WebElement getRating3() {
		return rating3;
	}

	public void setRating3(WebElement rating3) {
		this.rating3 = rating3;
	}

	public WebElement getRating2() {
		return rating2;
	}

	public void setRating2(WebElement rating2) {
		this.rating2 = rating2;
	}

	public WebElement getRating1() {
		return rating1;
	}

	public void setRating1(WebElement rating1) {
		this.rating1 = rating1;
	}

	public WebElement getSort_Price1() {
		return sort_Price1;
	}

	public WebElement getDelivery() {
		return delivery;
	}

	public WebElement getAvailable_ready() {
		return available_ready;
	}

	public void setSoccerButton(WebElement soccerButton) {
		this.soccerButton = soccerButton;
	}

	@FindBy(xpath = "//option[text()='72']")
	private WebElement perPage72;
	
	@FindBy(xpath = "//option[text()='120']")
	private WebElement perPage120;

	public WebElement getPrice3() {
		return price3;
	}

	public WebElement getPerPage12() {
		return perPage12;
	}

	public WebElement getPerPage24() {
		return perPage24;
	}

	public WebElement getPerPage36() {
		return perPage36;
	}

	public WebElement getPerPage48() {
		return perPage48;
	}

	public WebElement getPerPage72() {
		return perPage72;
	}

	public WebElement getPerPage120() {
		return perPage120;
	}
	
	@FindBy(xpath = "//option[text()='Featured']")
	private WebElement sort_Featured;
	
	@FindBy(xpath = "//option[text()='Name: A to Z']")
	private WebElement sort_Name_A_Z;
	
	@FindBy(xpath = "//option[text()='Name: Z to A']")
	private WebElement sort_Name_Z_A;
	
	@FindBy(xpath = "//option[text()='Price: Low to High']")
	private WebElement sort_Price;
	
	@FindBy(xpath = "//option[text()='Price: High to Low']")
	private WebElement sort_Price1;
	
	@FindBy(xpath = "//option[text()='Newest Arrivals']")
	private WebElement sort_NewestArrivals;
	
	@FindBy(xpath = "//a[contains(text(),'Rating')]")
	private WebElement rating;
	
	@FindBy(xpath = "//span[@style='width: 80%']/../../..//input[@name='optradio-rating']")
	private WebElement rating4;
	
	@FindBy(xpath = "//span[@style='width: 60%']/../../..//input[@name='optradio-rating']")
	private WebElement rating3;
	
	@FindBy(xpath = "//span[@style='width: 40%']/../../..//input[@name='optradio-rating']")
	private WebElement rating2;
	
	@FindBy(xpath = "//span[@style='width: 20%']/../../..//input[@name='optradio-rating']")
	private WebElement rating1;
	
	@FindBy(id = "facet-body-deliveryid")
	private WebElement delivery;
	
	@FindBy(xpath = "//span[contains(text(),'available and ready')]/..//input[@type='checkbox']")
	private WebElement available_ready;
	
	@FindBy(xpath = "(//a[@title='Show'])[2]")
	private WebElement showButton;

	public WebElement getShowButton() {
		return showButton;
	}

	public void setShowButton(WebElement showButton) {
		this.showButton = showButton;
	}

	public WebElement getSort_Price() {
		return sort_Price;
	}
	
	@FindBy(xpath = "//span[text()='Supreme white ball']")
	private WebElement golfProduct;

	public WebElement getGolfProduct() {
		return golfProduct;
	}
	
	@FindBy(xpath = "//span[text()='Soccer Football']")
	private WebElement soccerProduct;

	public WebElement getSoccerProduct() {
		return soccerProduct;
	}

	@FindBy(xpath = "//i[@class='fa fa-plus']")
	private WebElement incrementButton;

	public WebElement getIncrementButton() {
		return incrementButton;
	}
	
	@FindBy(xpath = "//span[text()='Add to cart']")
	private WebElement addCartButton;

	public WebElement getAddCartButton() {
		return addCartButton;
	}
	
	@FindBy(xpath = "//span[text()='Add to List']")
	private WebElement addToListButton;

	public WebElement getAddToListButton() {
		return addToListButton;
	}
	
	@FindBy(xpath = "//a[@title='Remove']")
	private WebElement removeButton;

	public WebElement getRemoveButton() {
		return removeButton;
	}

	@FindBy(xpath = "//span[contains(text(),'Game Basketball')]")
	private WebElement basketBallProduct;

	public WebElement getBasketBallProduct() {
		return basketBallProduct;
	}
	
	@FindBy(xpath = "//span[text()='Trainer Ball']")
	private WebElement trainerBall;

	public WebElement getTrainerBall() {
		return trainerBall;
	}
	
	@FindBy(xpath = "//a[text()='shipping']")
	private WebElement shippingButton;

	public WebElement getShippingButton() {
		return shippingButton;
	}
	
	@FindBy(xpath = "//span[text()='Help & Services']")
	private WebElement help_ServicesButton;
	
	@FindBy(xpath = "(//span[text()='About Us'])[1]")
	private WebElement aboutUsButton;

	public WebElement getHelp_ServicesButton() {
		return help_ServicesButton;
	}

	public WebElement getAboutUsButton() {
		return aboutUsButton;
	}
	
}

