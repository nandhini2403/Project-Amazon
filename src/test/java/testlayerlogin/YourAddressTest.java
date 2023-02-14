package testlayerlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pomAmazonpackage.pomSigninAmazon;
import pomAmazonpackage.pomYourAddress;

public class YourAddressTest extends BaseAmazonClass {
	pomYourAddress Address;
	pomSigninAmazon Signin;
	Actions action;

	public YourAddressTest() {

		super();
	}

	@BeforeTest
	public void initsetup() {
		initiate();
		Signin = new pomSigninAmazon();

		action = new Actions(Driver);
		action.moveToElement(Driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		Driver.findElement(By.cssSelector("#nav-link-accountList")).click();
		Signin.typeemailaddressormobilephonenumber("lilyrosy1978@gmail.com");
		Signin.continuebtn();
		Signin.typepassword("22yardley");
		Signin.Signin();

		Address = new pomYourAddress();
	}

	@Test(priority = 1)
	public void verifyYourAddresses() throws InterruptedException {

		String expectedTitle = "Your Addresses";

		Actions action = new Actions(Driver);
		action.moveToElement(Driver.findElement(By.cssSelector("#nav-link-accountList > span"))).build().perform();
		Driver.findElement(By.cssSelector("#nav-al-your-account > a:nth-child(2) > span")).click();

		action.moveToElement(Driver.findElement(By.cssSelector(
				"#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")))
				.build().perform();

		Driver.findElement(By.cssSelector(
				"#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a > div > div > div > div.a-column.a-span3 > img"))
				.click();

		String actualTitle = Signin.provideTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
		Thread.sleep(5000);

	}

	@Test(priority = 2)
	public void AddAddress() {

		Actions action = new Actions(Driver);
		action.moveToElement(Driver.findElement(By.cssSelector("#nav-link-accountList > span"))).build().perform();
		Driver.findElement(By.cssSelector("#nav-al-your-account > a:nth-child(2) > span")).click();

		action.moveToElement(Driver.findElement(By.cssSelector(
				"#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")))
				.build().perform();

		Driver.findElement(By.cssSelector(
				"#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a > div > div > div > div.a-column.a-span3 > img"))
				.click();
		Driver.findElement(By.cssSelector("#ya-myab-address-add-link > div > div > h2")).click();

	}

	@Test(priority = 3)
	public void AddAddress1() {

		Actions action = new Actions(Driver);
		action.moveToElement(Driver.findElement(By.cssSelector("#nav-link-accountList > span"))).build().perform();
		Driver.findElement(By.cssSelector("#nav-al-your-account > a:nth-child(2) > span")).click();

		action.moveToElement(Driver.findElement(By.cssSelector(
				"#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")))
				.build().perform();

		Driver.findElement(By.cssSelector(
				"#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a > div > div > div > div.a-column.a-span3 > img"))
				.click();
		Driver.findElement(By.cssSelector("#ya-myab-address-add-link > div > div > h2")).click();

	}

	@Test(priority = 4) // facing ELEMENT CLICK INTERCEPTED EXCEPTION
	public void VerifyValidAddress() throws InterruptedException {

		Actions action = new Actions(Driver);
		action.moveToElement(Driver.findElement(By.cssSelector("#nav-link-accountList > span"))).build().perform();
		Driver.findElement(By.cssSelector("#nav-al-your-account > a:nth-child(2) > span")).click();

		action.moveToElement(Driver.findElement(By.cssSelector(
				"#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")))
				.build().perform();

		Driver.findElement(By.cssSelector(
				"#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a > div > div > div > div.a-column.a-span3 > img"))
				.click();
		Driver.findElement(By.cssSelector("#ya-myab-address-add-link > div > div > h2")).click();

		Address.Name("Lilyrosy");
		Address.Phonenumber("4373443059");
		Address.Address1("yardleycrescent");
		Address.Address2("22");
		Address.City("Brampton");
		Select obj = new Select(
				Driver.findElement(By.id("address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId")));
		obj.selectByVisibleText("Ontario");
		Address.Postalcode("L6X5L6");

		action.moveToElement(Driver.findElement(By.cssSelector("#address-ui-widgets-form-submit-button-announce")))
				.build().perform();
		Driver.findElement(By.cssSelector("#address-ui-widgets-form-submit-button-announce")).click();

	}

	@AfterMethod
	public void close() {
		Driver.close();
	}

}
