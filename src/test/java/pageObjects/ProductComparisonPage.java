package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductComparisonPage extends BasePage{
	
	public ProductComparisonPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//h1[normalize-space()='Product Comparison']")
	WebElement ProdCompPageHeading;
	
	@FindBy(xpath = "//strong[normalize-space()='iMac']")
	WebElement prodName;
	
	public boolean verifyPageHeading() {
		return ProdCompPageHeading.isDisplayed();
	}
	
	public boolean verifyProductName() {
		return prodName.isDisplayed();
	}

}
