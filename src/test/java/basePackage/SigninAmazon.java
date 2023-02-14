package basePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import pomAmazonpackage.pomSigninAmazon;

public class SigninAmazon extends BaseAmazonClass {

	pomSigninAmazon Signin;
	Actions action;

	public SigninAmazon() {

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

	}
}
