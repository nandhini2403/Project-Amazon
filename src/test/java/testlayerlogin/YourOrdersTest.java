package testlayerlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pomAmazonpackage.pomSigninAmazon;

public class YourOrdersTest extends BaseAmazonClass {

	pomSigninAmazon Signin;
	Actions action;

	public YourOrdersTest() {

		super();

	}

	@BeforeMethod
	public void initsetup() {
		initiate();
		screenshots("YourOrders");
		
		Signin = new pomSigninAmazon();

		action = new Actions(Driver);
		action.moveToElement(Driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		Driver.findElement(By.cssSelector("#nav-link-accountList")).click();
		Signin.typeemailaddressormobilephonenumber("lilyrosy1978@gmail.com");
		Signin.continuebtn();
		Signin.typepassword("22yardley");
		Signin.Signin();

	}

	@Test(priority = 1)
	public void verifySubList() throws InterruptedException {

		String expectedTitle = "Your Orders";

		Actions action = new Actions(Driver);
		action.moveToElement(Driver.findElement(By.cssSelector("#nav-link-accountList > span"))).build().perform();
		Driver.findElement(By.cssSelector("#nav-al-your-account > a:nth-child(2) > span")).click();
		action.moveToElement(Driver.findElement(By.cssSelector(
				"#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")))
				.build().perform();
		Driver.findElement(By.cssSelector(
				"#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2"))
				.click();

		String actualTitle = Signin.provideTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
		Thread.sleep(5000);

	}

	@Test(priority = 2)
	public void validateBuyAgain() throws InterruptedException {

		String expectedTitle = "Buy Again";

		Actions action = new Actions(Driver);
		action.moveToElement(Driver.findElement(By.cssSelector("#nav-link-accountList > span"))).build().perform();
		Driver.findElement(By.cssSelector("#nav-al-your-account > a:nth-child(2) > span")).click();
		action.moveToElement(Driver.findElement(By.cssSelector(
				"#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")))
				.build().perform();
		Driver.findElement(By.cssSelector(
				"#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2"))
				.click();
		Driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(3)")).click();

		String actualTitle = Signin.provideTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
		Thread.sleep(5000);

	}

	@Test(priority = 3)
	public void validateNotYetShipped() throws InterruptedException {
		String expectedTitle = "Your Orders";

		Actions action = new Actions(Driver);
		action.moveToElement(Driver.findElement(By.cssSelector("#nav-link-accountList > span"))).build().perform();
		Driver.findElement(By.cssSelector("#nav-al-your-account > a:nth-child(2) > span")).click();
		action.moveToElement(Driver.findElement(By.cssSelector(
				"#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")))
				.build().perform();
		Driver.findElement(By.cssSelector(
				"#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2"))
				.click();
		Driver.findElement(By.cssSelector(
				"#a-page > section > div > div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(3) > a"))
				.click();

		String actualTitle = Signin.provideTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
		Thread.sleep(5000);

	}

	@Test(priority = 4)
	public void validateCancelledOrders() throws InterruptedException {
		String expectedTitle = "Your Orders";
		Actions action = new Actions(Driver);
		action.moveToElement(Driver.findElement(By.cssSelector("#nav-link-accountList > span"))).build().perform();
		Driver.findElement(By.cssSelector("#nav-al-your-account > a:nth-child(2) > span")).click();
		action.moveToElement(Driver.findElement(By.cssSelector(
				"#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")))
				.build().perform();
		Driver.findElement(By.cssSelector(
				"#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2"))
				.click();
		Driver.findElement(By.cssSelector(
				"#a-page > section > div > div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(4) > a"))
				.click();

		String actualTitle = Signin.provideTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
		Thread.sleep(5000);

	}

	@AfterMethod
	public void close() {
		Driver.close();

} }
