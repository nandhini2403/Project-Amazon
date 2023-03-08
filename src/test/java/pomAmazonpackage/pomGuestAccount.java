package pomAmazonpackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class pomGuestAccount extends BaseAmazonClass{

	@FindBy(css = "#nav-xshop > a:nth-child(4)")
	WebElement DealsStore;

	@FindBy(css = "#nav-xshop > a:nth-child(2)")
	WebElement BestSellers;

	@FindBy(css= "#twotabsearchtextbox")
	WebElement Searchbar;
	
	@FindBy(id="nav-search-submit-button")
	WebElement Searchsubmit;
	
	@FindBy(css="#abbWrapper > div.aok-hidden.mbb__mh")
	WebElement Addtoyourorder;
	
	@FindBy(id="attachSiNoCoverage-announce")
	WebElement NoThanks;

	@FindBy(id = "add-to-cart-button")
	WebElement Addtocart;
	
	@FindBy(xpath = "//*[@id=\"sc-item-ddcd790e-3176-4b37-896c-eb6cef016f53\"]/div[3]/div[2]/text()")
	WebElement Shoppingcart;

	//initiate page elements located by @FindBy, for this we need to create constructor
public pomGuestAccount() {
	PageFactory.initElements(Driver, this);  //"init Element" is a static method in Pagefactory ,'this' converts local into global variable	
}

public void DealsStore() {
	DealsStore.click();
}
public void BestSellers() {
	BestSellers.click();
}
public void Searchbar(String Search) {
	Searchbar.sendKeys(Search);
}
public void Searchsubmit() {
	Searchsubmit.click();
}
public void NoThanks() {
	NoThanks.click();
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

public String provideTitle() {
	
	return Driver.getTitle();
}
}