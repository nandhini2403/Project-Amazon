package testlayerlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import basePackage.BaseAmazonClass;
import pomAmazonpackage.pomGuestAccount;

public class GuestAccountTest extends BaseAmazonClass {

	pomGuestAccount Guest;
	Actions action;

	public GuestAccountTest() {

		super();

	}

	@BeforeTest
	public void initsetup() {
		initiate();

		Guest = new pomGuestAccount();
		action = new Actions(Driver);
	}

	@Test(priority = 1)
	public void validDealsStore() {

		String expectedTitle = "Amazon.ca - Today's Deals";

		action.moveToElement(Driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(4)"))).build().perform();
		Driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(4)")).click();

		String actualTitle = Guest.provideTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 2)
	public void validBestSellers() {

		String expectedTitle = "Amazon.ca Best Sellers: The most popular items on Amazon";

		action.moveToElement(Driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(2)"))).build().perform();
		Driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(2)")).click();

		String actualTitle = Guest.provideTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 3)
	public void validSearchbar() {

		action.moveToElement(Driver.findElement(By.cssSelector("#twotabsearchtextbox"))).build().perform();
		Driver.findElement(By.cssSelector("#twotabsearchtextbox")).click();

	}

	@Test(priority = 4)
	public void validSearchoption() {

		action.moveToElement(Driver.findElement(By.cssSelector("#twotabsearchtextbox"))).build().perform();
		Driver.findElement(By.cssSelector("#twotabsearchtextbox")).click();
		Guest.Searchbar("Humidifier");
		Driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@Test(priority = 5)
	public void validSelection() {

		action.moveToElement(Driver.findElement(By.cssSelector("#twotabsearchtextbox"))).build().perform();
		Driver.findElement(By.cssSelector("#twotabsearchtextbox")).click();
		Guest.Searchbar("AirPurifier");
		Driver.findElement(By.id("nav-search-submit-button")).click();

		action.moveToElement(Driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(6) > div > div > div > div > div > div > div.s-product-image-container.aok-relative.s-text-center.s-image-overlay-grey.s-padding-left-small.s-padding-right-small.puis-spacing-small.s-height-equalized > span > a > div > img")))
				.build().perform();
		Driver.findElement(By.cssSelector(
				"#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(6) > div > div > div > div > div > div > div.s-product-image-container.aok-relative.s-text-center.s-image-overlay-grey.s-padding-left-small.s-padding-right-small.puis-spacing-small.s-height-equalized > span > a > div > img"))
				.click();

		Driver.findElement(By.id("add-to-cart-button")).click();
	  
	}
	@Test(priority=6)
	public void validProceedtocheckout() {
		action.moveToElement(Driver.findElement(By.cssSelector("#twotabsearchtextbox"))).build().perform();
		Driver.findElement(By.cssSelector("#twotabsearchtextbox")).click();
		Guest.Searchbar("AirPurifier");
		Driver.findElement(By.id("nav-search-submit-button")).click();

		action.moveToElement(Driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(6) > div > div > div > div > div > div > div.s-product-image-container.aok-relative.s-text-center.s-image-overlay-grey.s-padding-left-small.s-padding-right-small.puis-spacing-small.s-height-equalized > span > a > div > img")))
				.build().perform();
		Driver.findElement(By.cssSelector(
				"#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(6) > div > div > div > div > div > div > div.s-product-image-container.aok-relative.s-text-center.s-image-overlay-grey.s-padding-left-small.s-padding-right-small.puis-spacing-small.s-height-equalized > span > a > div > img"))
				.click();

		Driver.findElement(By.id("add-to-cart-button")).click();
		action.moveToElement(Driver.findElement(By.cssSelector("#sc-buy-box-ptc-button > span > input"))).build().perform();
		Driver.findElement(By.cssSelector("#sc-buy-box-ptc-button > span > input")).click();
		
		
		String expectedTitle="Amazon Sign In";
		String actualTitle = Guest.provideTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	 @AfterTest
	  public void Close()
	  { Driver.close();}
	
	}
