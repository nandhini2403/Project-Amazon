package testlayerlogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pomAmazonpackage.pomSigninAmazon;
import pomAmazonpackage.pomYourPayments;

public class YourPaymentsTest extends BaseAmazonClass {
	pomYourPayments Payments;
	pomSigninAmazon Signin;
	Actions action;

	public YourPaymentsTest() {

		super();
	}

	@BeforeMethod
	public void initsetup() {
		initiate();
		screenshots("YourPayments");
		
		Signin = new pomSigninAmazon();

		action = new Actions(Driver);
		action.moveToElement(Driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		Driver.findElement(By.cssSelector("#nav-link-accountList")).click();
		Signin.typeemailaddressormobilephonenumber("lilyrosy1978@gmail.com");
		Signin.continuebtn();
		Signin.typepassword("22yardley");
		Signin.Signin();

		Payments = new pomYourPayments();
	}

	@Test       //Facing NO SUCH ELEMENT EXCEPTION
	public void VerifyYourPayments() {

		Actions action = new Actions(Driver);
		action.moveToElement(Driver.findElement(By.cssSelector("#nav-link-accountList > span"))).build().perform();
		Driver.findElement(By.cssSelector("#nav-al-your-account > a:nth-child(2) > span")).click();

		action.moveToElement(Driver.findElement(By.cssSelector(
				"#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")))
				.build().perform();
		Driver.findElement(By.cssSelector(
				"#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(2) > a > div > div > div > div.a-column.a-span3 > img"))
				.click();
		Driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
        action.moveToElement(Driver.findElement(By.xpath("//*[@id=\"pp-3yTVgn-10\"]"))).build().perform();
		Driver.findElement(By.xpath("//*[@id=\"pp-3yTVgn-10\"]"))
				.click();		

	}

  @AfterMethod
  public void Close()
  { Driver.close();
}}