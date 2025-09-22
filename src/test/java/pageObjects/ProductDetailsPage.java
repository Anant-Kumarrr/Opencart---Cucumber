package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends BasePage {

	WebDriver driver;

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h1[normalize-space()='iMac']")
	WebElement iMacProd;

	public boolean verifyProdHeading(String productHeading) {
		boolean present = false;
		switch (productHeading.toLowerCase()) {
		case "imac":
			if (iMacProd.isDisplayed()) {
				present = true;
			}
			break;
		default:
			System.out.println("Please Enter Correct Product Heading");
		}
		return present;
	}

}
