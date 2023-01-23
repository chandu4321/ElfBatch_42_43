package pomDesigN;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	/***
	 * This is the pom repository for the application We are storing the Locators of
	 * the page
	 *
	 * @author sudarshan
	 *
	 */
	public class BasePage1 {
	// Rule1: Creating the Constructor
	public BasePage1(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[.='Mobile phone']")
	private WebElement MobilePhoneNavBar;
	@FindBy(xpath = "//a[contains(text(),'Price')]")
	private WebElement PriceDropDown;
	@FindBy(xpath = "//span[contains(text(),'up to $25.00')]")
	private WebElement PriceRadioButton1;
	@FindBy(xpath = "//span[contains(text(),'up to $50.00')]")
	private WebElement PriceRadioButton2;
	@FindBy(xpath = "//span[contains(text(),'up to $100.00')]")
	private WebElement PriceRadioButton3;
	@FindBy(xpath = "//span[contains(text(),'up to $250.00')]")
	private WebElement PriceRadioButton4;
	@FindBy(xpath = "//span[contains(text(),'up to $1,000.00')]")
	private WebElement PriceRadioButton6;
	@FindBy(xpath = "//span[contains(text(),'up to $500.00')]")
	private WebElement PriceRadioButton5;
	@FindBy(id = "artlist-action-sort")
	private WebElement RelevencedropDown;
	@FindBy(xpath = "//option[text()='Name: A to Z']")
	private WebElement OptionDrop1;
	@FindBy(xpath = "//option[text()='Name: Z to A']")
	private WebElement OptionDrop2;
	@FindBy(xpath = "//option[text()='Price: Low to High']")
	private WebElement OptionDrop3;
	@FindBy(xpath = "//option[text()='Newest Arrivals']")
	private WebElement OptionDrop4;
	@FindBy(id = "artlist-action-pagesize")
	private WebElement PageSizeDropdown;
	@FindBy(xpath = "//option[text()='12']")
	private WebElement IconPerPage;
	@FindBy(xpath = "//img[contains(@title,'Phone Minus')]")
	private WebElement PhoneIcon;
	@FindBy(xpath = "//span[text()='Add to List']/..")
	private WebElement AddtoWishListButton;
	@FindBy(xpath = "//span[text()='View Wishlist']/../..")
	private WebElement ViewWishListButton;
	@FindBy(xpath = "//div[@class='alert alert-warning fade show']")
	private WebElement WarningText;
	@FindBy(xpath = "//strong[text()='Cart']/../..")
	private WebElement CartPageButton;
	@FindBy(xpath = "//h4[@class='no-item-title']")
	private WebElement EmptyPageVerfication;

	public WebElement getMobilePhoneNavBar() {
	return MobilePhoneNavBar;
	}

	public WebElement getPriceDropDown() {
	return PriceDropDown;
	}

	public WebElement getPriceRadioButton1() {
	return PriceRadioButton1;
	}

	public WebElement getPriceRadioButton2() {
	return PriceRadioButton2;
	}

	public WebElement getPriceRadioButton3() {
	return PriceRadioButton3;
	}

	public WebElement getPriceRadioButton4() {
	return PriceRadioButton4;
	}

	public WebElement getPriceRadioButton6() {
	return PriceRadioButton6;
	}

	public WebElement getPriceRadioButton5() {
	return PriceRadioButton5;
	}

	public WebElement getRelevencedropDown() {
	return RelevencedropDown;
	}

	public WebElement getOptionDrop1() {
	return OptionDrop1;
	}

	public WebElement getOptionDrop2() {
	return OptionDrop2;
	}

	public WebElement getOptionDrop3() {
	return OptionDrop3;
	}

	public WebElement getOptionDrop4() {
	return OptionDrop4;
	}

	public WebElement getPageSizeDropdown() {
	return PageSizeDropdown;
	}

	public WebElement getIconPerPage() {
	return IconPerPage;
	}

	public WebElement getPhoneIcon() {
	return PhoneIcon;
	}

	public WebElement getAddtoWishListButton() {
	return AddtoWishListButton;
	}

	public WebElement getViewWishListButton() {
	return ViewWishListButton;
	}

	public WebElement getWarningText() {
	return WarningText;
	}

	public WebElement getCartPageButton() {
	return CartPageButton;
	}

	public WebElement getEmptyPageVerfication() {
	return EmptyPageVerfication;
	}

}

