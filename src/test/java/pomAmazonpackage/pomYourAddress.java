package pomAmazonpackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

//Object repository for "YourAddress" page

public class pomYourAddress extends BaseAmazonClass {

	@FindBy(css="#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > div > span")
	WebElement YourAddresses;
	
	@FindBy(css="#ya-myab-address-add-link > div > div > h2")
	WebElement AddAddress;
	
	@FindBy(css="#address-ui-widgets-countryCode > span > span")
	WebElement CountryRegion;
	
	@FindBy(css="#address-ui-widgets-enterAddressFullName")
	WebElement Name;
	
	@FindBy(css="#address-ui-widgets-enterAddressPhoneNumber")
	WebElement Phonenumber;
	
	@FindBy(css="#address-ui-widgets-enterAddressLine1")
	WebElement Address1;
	
	@FindBy(css="#address-ui-widgets-enterAddressLine2")
	WebElement Address2;
	
	@FindBy(css="#address-ui-widgets-enterAddressCity")
	WebElement City;
	
	@FindBy(css="#address-ui-widgets-enterAddressStateOrRegion > span > span")
	WebElement ProvinceTerritory;
	
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	WebElement Postalcode;
	
	@FindBy(css="#address-ui-widgets-form-submit-button-announce")
	WebElement Addaddress;
	
	//initiate page elements located by @FindBy, for this we need to create constructor
	
	
	public pomYourAddress () {
		PageFactory.initElements(Driver,this);
		
	}
	public void clickbtn() {
	YourAddresses.click();	
	}
	public void clickbtn1() {
	AddAddress.click();
	}
	public void Name(String name) {
	Name.sendKeys(name);
	}
	public void Phonenumber(String Phone) {
	Phonenumber.sendKeys(Phone);	
	}
	
	public void Address1(String Address) {
	Address1.sendKeys(Address);
	}
	public void Address2 (String Address) {
	Address2.sendKeys(Address);	
	}
	public void City(String Cityname) {
	City.sendKeys(Cityname);
	}
	public void ProvinceTerritory(String province) {
	ProvinceTerritory.sendKeys(province);	
	}
	public void Postalcode (String pcode) {
	Postalcode.sendKeys(pcode);}
	
	public void clickbtn2() {
		Addaddress.click();
		}
		
	}
