package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends BasePage {
	WebDriver driver;
	Select dropDown;

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement searchBox;

	@FindBy(xpath = "//img[@title='iMac']")
	WebElement searchProduct;

	@FindBy(xpath = "//i[@class='fa fa-search']")
	WebElement searchButton;

	@FindBy(xpath = "//input[@id='input-quantity']")
	WebElement txtquantity;

	@FindBy(xpath = "//button[@id='button-cart']")
	WebElement btnaddToCart;

	@FindBy(xpath = "//div[contains(text(),'Success: You have added')]")
	WebElement cnfMsg;
	
	@FindBy(xpath = "//p[text()=\"There is no product that matches the search criteria.\"]")
	WebElement notFoundMsg;
	
	@FindBy(xpath = "//input[@id='input-search']")
	WebElement keywordSearchField;
	
	@FindBy(xpath = "//select[@name='category_id']")
	WebElement categoryDropdown;
	
	@FindBy(xpath = "//input[@id='button-search']")
	WebElement searchButton2;
	
	@FindBy(xpath = "//i[@class='fa fa-th-list']")
	WebElement listViewBtn;
	
	@FindBy(xpath = "//span[normalize-space()='Add to Cart']")
	WebElement addToCartBtn;
	
	@FindBy(xpath = "//button[@type='button']//i[@class='fa fa-heart']")
	WebElement addToWishListBtn;
	
	@FindBy(xpath = "//i[@class='fa fa-exchange']")
	WebElement compareBtn;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement successMessage;
	
	public void searchProduct(String prod) {
		searchBox.sendKeys(prod);
		searchButton.click();
	}
	
	public void clickSearch() {
		searchButton.click();
	}

	public boolean isProductExist(String productName) {
		boolean flag = false;
		if (searchProduct.getAttribute("title").equalsIgnoreCase(productName)) {
			flag = true;
		}
		return flag;

	}

//	public void selectProduct(String productName) {
//		for (WebElement product : searchProducts) {
//			if (product.getAttribute("title").equals(productName)) {
//				product.click();
//			}
//		}
//
//	}

	public void setQuantity(String qty) {
		txtquantity.clear();
		txtquantity.sendKeys(qty);
	}

	public void addToCart() {
		btnaddToCart.click();
	}

	public boolean checkConfMsg() {
		try {
			return cnfMsg.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	public String productNotFound() {
		String msg = notFoundMsg.getText();
		return msg;
	}
	
	public void enterKeyword(String prod) {
		keywordSearchField.sendKeys(prod);
	}
	
	public void selectCategory(String  cat) {
		dropDown = new Select(categoryDropdown);
		dropDown.selectByVisibleText(cat);
	}
	
	public void clickSerch2() {
		searchButton2.click();
	}
	
	public void clickListViewBtn() throws InterruptedException {
		listViewBtn.click();
		Thread.sleep(5000);;
	}

	public boolean clickAddToCartBtn() throws InterruptedException {
		boolean result;
		addToCartBtn.click();
		Thread.sleep(5000);
		try {
			if(successMessage.isDisplayed()) {
				result = true;
			}
			else {
				result =  false;
			}
		}
		catch(Exception e) {
			result = false;
		}
		return result;		
	}
	
	public boolean addToWishListBtn() throws InterruptedException {
		boolean result;
		addToWishListBtn.click();
		Thread.sleep(5000);
		try {
			if(successMessage.isDisplayed()) {
				result = true;
			}
			else {
				result =  false;
			}
		}
		catch(Exception e) {
			result = false;
		}
		return result;	
	}
	
	public boolean compareProductBtn() throws InterruptedException {
		boolean result;
		compareBtn.click();
		Thread.sleep(5000);
		try {
			if(successMessage.isDisplayed()) {
				result = true;
			}
			else {
				result =  false;
			}
		}
		catch(Exception e) {
			result = false;
		}
		return result;	
	}
}
