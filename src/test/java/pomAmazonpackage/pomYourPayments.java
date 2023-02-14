package pomAmazonpackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class pomYourPayments extends BaseAmazonClass{
	
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(2) > a > div > div > div > div.a-column.a-span3 > img")
	WebElement YourPayments;
	
	@FindBy(css="#pp-nnPpdU-9 > div > div > div.a-fixed-left-grid-col.a-col-left > img")
	WebElement AddaPaymentMethod;
	
	@FindBy(css="#pp-Pf5ibv-26-announce")
	WebElement Addacreditordebitcard;
	
	@FindBy(css="#pp-AdFA7N-16")
	WebElement Cardnumber;
	
	@FindBy(css="#pp-AdFA7N-14 > div.a-row.a-spacing-base.apx-add-card-compact-grid-row > div.a-column.a-span7 > div > div:nth-child(2) > div.a-column.a-span4.a-text-right.a-spacing-top-mini.pmts-customer-card-name-label > label")
	WebElement Nameoncard;
	
	@FindBy (css="#pp-AdFA7N-25-announce")
	WebElement Addyourcard;
	
	@FindBy(id="add-credit-card-expiry-date-input-id")
	WebElement Expirationdate;
	
	//initiate page elements located by @FindBy, for this we need to create constructor
	
	public pomYourPayments() {
		PageFactory.initElements(Driver,this);
		}
	
	
	public void YourPayments(){
		YourPayments.click();
	}
	public void AddaPaymentMethod() {
		AddaPaymentMethod.click();
	}
	public void Addacreditordebitcard() {
		Addacreditordebitcard.click();
	}
	public void Cardnumber(String Cnumber) {
		Cardnumber.sendKeys(Cnumber);
	}
    public void Nameoncard(String Name) {
    	Nameoncard.sendKeys(Name);
    }
    	
    public void Addyourcard() {
    		Addyourcard.click();
    }
    public void Expirationdate(String Expirydate) {
    	Expirationdate.sendKeys(Expirydate);
    	
    }
}
