package pomAmazonpackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class PomYourAccount extends BaseAmazonClass {

	// Object repository for SigninAmazonpage and Your Account page 

	@FindBy(id = "nav-link-accountList")
	WebElement Hello, signin;

	@FindBy(css = "#nav-al-your-account > a:nth-child(2) > span")
	WebElement YourAccount;

	@FindBy(css = "#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")
	WebElement YourOrders;

	@FindBy(css = "#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > div > span")
	WebElement YourAddresses;

	@FindBy(css = "#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(2) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")
	WebElement YourPayments;

	@FindBy(id = "ap_email")
	WebElement emailaddressormobilephonenumber;

	@FindBy(id = "ap_password")
	WebElement Password;

	@FindBy(id = "continue")
	WebElement continuebtn;

	@FindBy(id = "signInSubmit")
	WebElement Signin;

	// initiate page elements located by @FindBy, for this we need to create
	// constructor

	public PomYourAccount() {

		PageFactory.initElements(Driver, this);

	}

	public void typeemailaddressormobilephonenumber(String email) {
		emailaddressormobilephonenumber.sendKeys(email);
	}

	public void typepassword(String pword) {
		Password.sendKeys(pword);
		;
	}

	public void continuebtn() {
		continuebtn.click();
	}

	public void Signin() {
		Signin.click();
	}

	public void clickbttn() {
		YourAccount.click();
	}

	public void clickbttn1() {
		YourOrders.click();
	}

	public String provideTitle() {
		return Driver.getTitle();

	}
}
