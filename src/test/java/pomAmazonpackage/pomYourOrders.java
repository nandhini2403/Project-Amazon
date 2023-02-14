package pomAmazonpackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class pomYourOrders extends BaseAmazonClass {

	// Object repository for Your Orders page

	@FindBy(css = "#nav-al-your-account > a:nth-child(2) > span")
	WebElement YourAccount;

	@FindBy(css = "#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")
	WebElement YourOrders;

	@FindBy(css = "#orderTypeMenuContainer > ul > li.selected > span > span")
	WebElement Orders;

	@FindBy(css = "#orderTypeMenuContainer > ul > li:nth-child(3) > span > a")
	WebElement BuyAgain;

	@FindBy(css = "#orderTypeMenuContainer > ul > li:nth-child(4) > span > a")
	WebElement NotYetShipped;

	@FindBy(css = "#orderTypeMenuContainer > ul > li:nth-child(5) > span > a")
	WebElement CancelledOrders;

	// initiate page elements located by @FindBy, for this we need to create
	// constructor

	public pomYourOrders() {

		PageFactory.initElements(Driver, this);
	}

	public void clickbttn() {
		YourAccount.click();
	}

	public void clickbttn1() {
		YourOrders.click();
	}

	public void Orders() {
		Orders.click();
	}

	public void BuyAgain() {
		BuyAgain.click();
	}

	public void NotYetShipped() {
		NotYetShipped.click();
	}

	public void CancelledOrders() {
		CancelledOrders.click();
	}

	public String provideTitle() {
		return Driver.getTitle();

	}
}
