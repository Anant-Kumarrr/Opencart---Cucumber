package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

	// Elements
		@FindBy(name = "firstname")
		WebElement txtFirstname;

		@FindBy(name = "lastname")
		WebElement txtLasttname;

		@FindBy(name = "email")
		WebElement txtEmail;

		@FindBy(name = "telephone")
		WebElement txtTelephone;

		@FindBy(name = "password")
		WebElement txtPassword;

		@FindBy(name = "confirm")
		WebElement txtConfirmPassword;

		@FindBy(name = "agree")
		WebElement chkdPolicy;

		@FindBy(xpath = "//input[@value='Continue']")
		WebElement btnContinue;

		@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
		WebElement msgConfirmation;
		
		@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
		WebElement warningMessage;
		
		@FindBy(xpath = "//div[contains(text(),'First Name must be between 1 and 32 characters!')]")
		WebElement fnameMessage;
		
		@FindBy(xpath = "//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")
		WebElement lnameMessage;
		
		@FindBy(xpath = "//div[contains(text(),'E-Mail Address does not appear to be valid!')]")
		WebElement emailMessage;
		
		@FindBy(xpath = "//div[contains(text(),'Telephone must be between 3 and 32 characters!')]")
		WebElement phoneMessage;
		
		@FindBy(xpath = "//div[contains(text(),'Password must be between 4 and 20 characters!')]")
		WebElement passwordMessage;
			

		public void setFirstName(String fname) {
			txtFirstname.sendKeys(fname);

		}

		public void setLastName(String lname) {
			txtLasttname.sendKeys(lname);

		}

		public void setEmail(String email) {
			txtEmail.sendKeys(email);

		}

		public void setTelephone(String tel) {
			txtTelephone.sendKeys(tel);

		}

		public void setPassword(String pwd) {
			txtPassword.sendKeys(pwd);

		}

		public void setConfirmPassword(String pwd) {
			txtConfirmPassword.sendKeys(pwd);

		}

		public void setPrivacyPolicy() {
			chkdPolicy.click();

		}

		public void clickContinue() {
			btnContinue.click();

		}

		public String getConfirmationMsg() {
			try {
				return (msgConfirmation.getText());
			} catch (Exception e) {
				return (e.getMessage());

			}

		}
		
		public boolean verifyErrorMessage() {
			boolean message;
			try {
				message = warningMessage.isDisplayed() && fnameMessage.isDisplayed() && lnameMessage.isDisplayed() && emailMessage.isDisplayed() && phoneMessage.isDisplayed() && passwordMessage.isDisplayed();
				return message;
			}
			catch(Exception e) {
				return(false);
			}
		}

		
}