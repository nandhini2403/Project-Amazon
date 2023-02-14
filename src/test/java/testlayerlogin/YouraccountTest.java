package testlayerlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pomAmazonpackage.PomYourAccount;

public class YouraccountTest extends BaseAmazonClass {

	PomYourAccount Acc;

	public YouraccountTest() {

		super();

	}

	@BeforeTest
	public void initsetup() throws InterruptedException {
		initiate();
		Acc = new PomYourAccount();

	}

	@Test
	public void verifyYourAccountTitle() throws InterruptedException {
		String expectedTitle = "Your Account";
		Actions action1 = new Actions(Driver);
		action1.moveToElement(Driver.findElement(By.cssSelector("#nav-link-accountList > span"))).build().perform();
		Driver.findElement(By.cssSelector("#nav-al-your-account > a:nth-child(2) > span")).click();

		String actualTitle = Acc.provideTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
		Thread.sleep(2000);
	}

	@Test
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

		String actualTitle = Acc.provideTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
		Thread.sleep(2000);

	}

	@AfterTest
	public void close() {
		Driver.close();
	}

}
