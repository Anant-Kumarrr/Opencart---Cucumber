package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountInformation extends BasePage {

	public AccountInformation(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//h1[normalize-space()='My Account Information']")
	WebElement heading;
	
	@FindBy(xpath = "//input[@name='firstname']")
	WebElement fname;
	
	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lname;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@name='telephone']")
	WebElement phoneno;
	
	public boolean confirmHeading() {
			return heading.isDisplayed();
	}
	public String getFirstName() {
		return fname.getAttribute("value");
	}
	
	public String getLastName() {
		return lname.getAttribute("value");
	}
	
	public String getEmail() {
		return email.getAttribute("value");
	}
	
	public String getPhoneNo() {
		return (phoneno.getAttribute("value"));
	}
	
}

