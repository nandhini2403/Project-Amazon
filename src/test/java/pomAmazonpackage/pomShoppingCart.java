package pomAmazonpackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class pomShoppingCart extends BaseAmazonClass {

	@FindBy(css = "#nav-cart")
	WebElement Shoppingcart;

	@FindBy(css = "#twotabsearchtextbox")
	WebElement Searchbar;

	@FindBy(id = "nav-search-submit-button")
	WebElement Searchsubmit;

	@FindBy(css = "#abbWrapper > div.aok-hidden.mbb__mh")
	WebElement Addtoyourorder;

	@FindBy(id = "add-to-cart-button")
	WebElement Addtocart;
	
	@FindBy (css="#sc-active-Cbe87afdd-7979-493f-a876-5429d17564f2 > div.sc-list-item-content > div > div:nth-child(3) > div.a-row.sc-action-links > span.sc-action-quantity > span > span:nth-child(1)")
	WebElement Quantity;

	public pomShoppingCart() {

		PageFactory.initElements(Driver, this);
	}

	public void Searchbar(String Search) {
		Searchbar.sendKeys(Search);
	}

	public void Searchsubmit() {
		Searchsubmit.click();
	}

	public void Addtocart() {
		Addtocart.click();
	}

	public void Addtoyourorder() {
		Addtoyourorder.click();
	}

	public void Shoppingcart() {
		Shoppingcart.click();
	}
	public void Quantity(String Qty) {
		Quantity.sendKeys(Qty);
	}
	
	
	public String provideTitle() {

		return Driver.getTitle();
	}

}