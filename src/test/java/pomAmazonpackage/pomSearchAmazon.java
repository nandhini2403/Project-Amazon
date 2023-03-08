package pomAmazonpackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class pomSearchAmazon extends BaseAmazonClass {

	// Object repository for Your Orders page

	@FindBy(id = "twotabsearchtextbox")
	WebElement SearchAmazon;
	
	@FindBy(id="nav-search-submit-button")
	WebElement Searchsubmit;
	
	@FindBy (id="searchDropdownBox")
	WebElement All;
	
	@FindBy (className="s-result-sort-select")
	WebElement Sortby;
	
	@FindBy (id="s-result-sort-select_4")
	WebElement NewestArrivals;

	public pomSearchAmazon() {

		PageFactory.initElements(Driver, this);

	}

	public void Searchbar(String Search) {
		SearchAmazon.sendKeys(Search);
	}

	public void Searchsubmit() {
		Searchsubmit.click();
	}
	public void All() {
		All.click();
	}
	public void Next() {
		Sortby.click();
	}
	public void NewestArrivals() {
		NewestArrivals.click();
	}
	public String provideTitle() {
		
		return Driver.getTitle();
	}
}
