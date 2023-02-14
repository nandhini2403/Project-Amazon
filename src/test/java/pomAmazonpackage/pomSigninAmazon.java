package pomAmazonpackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class pomSigninAmazon extends BaseAmazonClass{
	
	@FindBy(id = "nav-link-accountList")
	WebElement Hello, signin;
	
	@FindBy(id = "ap_email")
	WebElement emailaddressormobilephonenumber;

	@FindBy(id = "ap_password")
	WebElement Password;

	@FindBy(id = "continue")
	WebElement continuebtn;

	@FindBy(id = "signInSubmit")
	WebElement Signin;

	public pomSigninAmazon() {

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
		Signin.click();}
 
	public String provideTitle() {
		  	return Driver.getTitle();

} }
