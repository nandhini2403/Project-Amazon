package pomAmazonpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class pomLogin extends BaseAmazonClass {

//object repository for login page
	
  @FindBy(css="#nav-flyout-ya-newCust > a")
  WebElement Starthere;
  
  @FindBy (id="ap_customer_name")
  WebElement Yourname;
  
  @FindBy(id="ap_email")
  WebElement Mobilenumberoremail;
  
  @FindBy(id="ap_password")
  WebElement Password;
  
  @FindBy(id ="ap_password_check")
  WebElement Passwordagain;
  
  @FindBy(id="continue")
  WebElement Continue;
  
//initiate page elements located by @FindBy, for this we need to create constructor
  
  
  public pomLogin() {

	  
	  Actions action=new Actions(Driver);
      
	  action.moveToElement(Driver.findElement(By.cssSelector("#nav-link-accountList > span"))).build().perform();
      
      Driver.findElement(By.cssSelector("#nav-flyout-ya-newCust > a")).click();
      
	  PageFactory.initElements(Driver,this);
	  }
	  
	  public void clickbtn() { 
		  Starthere.click();}
	  
	  public void typeYourname (String Yname) { 
		  Yourname.sendKeys(Yname);}
	  
	  public void typeMobilenumberoremail (String email) {
	  Mobilenumberoremail.sendKeys(email);}
	  
	  public void typePassword(String Pword) { 
		  Password.sendKeys(Pword);}
	  
	  public void typePasswordagain(String Pagain) {
	  Passwordagain.sendKeys(Pagain);}
	  
	  public void continuebtn() { 
		  Continue.click();}
	 

  public String provideTitle() {
  	return Driver.getTitle();   //to get page title	  
  
  
  } }
  
	  
  




