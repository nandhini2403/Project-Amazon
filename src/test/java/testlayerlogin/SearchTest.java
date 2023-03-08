package testlayerlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pomAmazonpackage.pomSearchAmazon;

public class SearchTest extends BaseAmazonClass {

	pomSearchAmazon Search;
	Actions action;

	public SearchTest() {

		super();

	}

	@BeforeMethod
	public void initsetup() {
		initiate();
		screenshots("Search Module");
		action = new Actions(Driver);
		Search = new pomSearchAmazon();

	}

	@Test(priority = 1)
	public void validAllbutton() {

		action.moveToElement(Driver.findElement(By.id("searchDropdownBox"))).build().perform();
		Driver.findElement(By.id("searchDropdownBox")).click();
		screenshots("Search Module1");

	}

	@Test(priority = 2) // BASED ON KEYWORD
	public void validSearchKEYWORD() throws InterruptedException {

		action.moveToElement(Driver.findElement(By.id("twotabsearchtextbox"))).build().perform();
		Driver.findElement(By.id("twotabsearchtextbox")).click();
		Search.Searchbar("Yogamats");
		Driver.findElement(By.id("nav-search-submit-button")).click();

		String ExpectedTitle = "Amazon.ca : Yogamats";
		String actualTitle = Search.provideTitle();
		Assert.assertEquals(actualTitle, ExpectedTitle);
		System.out.print(actualTitle);

		Thread.sleep(5000); 
		screenshots("Search Module2");
	}
    
	@Test(priority = 3) // BASED ON DESCRIPTION TEXT
	public void validSearchDESCRIPTIONTEXT() throws InterruptedException {

		action.moveToElement(Driver.findElement(By.id("twotabsearchtextbox"))).build().perform();
		Driver.findElement(By.id("twotabsearchtextbox")).click();
		Search.Searchbar("bluetooth headphones");
		Driver.findElement(By.id("nav-search-submit-button")).click();

		String ExpectedTitle = "Amazon.ca : bluetooth headphones";
		String actualTitle = Search.provideTitle();
		Assert.assertEquals(actualTitle, ExpectedTitle);
		System.out.print(actualTitle);
		Thread.sleep(5000);
		screenshots("Search Module3");
	}

	@Test(priority = 4) // BASED ON MODELNO
	public void validSearchMODELNO() throws InterruptedException {

		action.moveToElement(Driver.findElement(By.id("twotabsearchtextbox"))).build().perform();
		Driver.findElement(By.id("twotabsearchtextbox")).click();
		Search.Searchbar("LOGITECH H111");
		Driver.findElement(By.id("nav-search-submit-button")).click();

		String ExpectedTitle = "Amazon.ca : LOGITECH H111";
		String actualTitle = Search.provideTitle();
		Assert.assertEquals(actualTitle, ExpectedTitle);
		System.out.print(actualTitle);
		Thread.sleep(5000);
		screenshots("Search Module4");
	}

	@Test(priority = 5) // BASED ON PARTIAL MODELNO
	public void validSearchPARTIALMODELNO() throws InterruptedException {

		action.moveToElement(Driver.findElement(By.id("twotabsearchtextbox"))).build().perform();
		Driver.findElement(By.id("twotabsearchtextbox")).click();
		Search.Searchbar("LOGITECH H1");
		Driver.findElement(By.id("nav-search-submit-button")).click();

		String ExpectedTitle = "Amazon.ca : LOGITECH H1";
		String actualTitle = Search.provideTitle();
		Assert.assertEquals(actualTitle, ExpectedTitle);
		System.out.print(actualTitle);
		Thread.sleep(5000); 
		screenshots("Search Module5");
	}

	@Test(priority = 6) // BASED ON PRODUCT RELEVANCY
	public void validSearchPRODUCTRELEVANCY() throws InterruptedException {

		action.moveToElement(Driver.findElement(By.id("twotabsearchtextbox"))).build().perform();
		Driver.findElement(By.id("twotabsearchtextbox")).click();
		Search.Searchbar("wireless earpods");
		Driver.findElement(By.id("nav-search-submit-button")).click();

		String ExpectedTitle = "Amazon.ca : wireless earpods";
		String actualTitle = Search.provideTitle();
		Assert.assertEquals(actualTitle, ExpectedTitle);
		System.out.print(actualTitle);
		Thread.sleep(5000);
		screenshots("Search Module6");
	}

	@Test(priority = 7) // BASED ON SORTBY
	public void validSearchSORTBY() {

		action.moveToElement(Driver.findElement(By.id("twotabsearchtextbox"))).build().perform();
		Driver.findElement(By.id("twotabsearchtextbox")).click();
		Search.Searchbar("wireless earpods");
		Driver.findElement(By.id("nav-search-submit-button")).click();

		String ExpectedTitle = "Amazon.ca : wireless earpods";
		String actualTitle = Search.provideTitle();
		Assert.assertEquals(actualTitle, ExpectedTitle);
		System.out.print(actualTitle);

		action.moveToElement(Driver.findElement(By.id("s-result-sort-select"))).build().perform();
		Select obj = new Select(Driver.findElement(By.id("s-result-sort-select")));
		obj.selectByIndex(4);
		screenshots("Search Module7");

	}

	@AfterMethod
	public void Close() {
		Driver.close();
	}

}
