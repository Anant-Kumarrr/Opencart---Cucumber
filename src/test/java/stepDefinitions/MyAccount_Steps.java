package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import pageObjects.MyAccountPage;

public class MyAccount_Steps {
	
	WebDriver driver;
	MyAccountPage accpage;
	
	@Given("user clicks on edit account")
	public void user_clicks_on_edit_account() {
	   accpage = new MyAccountPage(BaseClass.getDriver()); 
	   accpage.clickEditAccount();
	}
}
