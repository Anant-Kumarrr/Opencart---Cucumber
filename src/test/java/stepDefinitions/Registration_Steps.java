package stepDefinitions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utilities.DataReader;


public class Registration_Steps {

	 WebDriver driver;
     HomePage hp;
     LoginPage lp;
     AccountRegistrationPage regpage;
     List<HashMap<String, String>> datamap;
     
	@Given("user navigates to Register Account page")
	public void user_navigates_to_register_account_page() {
	
		hp=new HomePage(BaseClass.getDriver());
    	hp.clickMyAccount();
        hp.clickRegister();
                   
	}

	@When("user enters the details into below fields")
	public void user_enters_the_details_into_below_fields(DataTable dataTable) {
		
		Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
	    
		regpage=new AccountRegistrationPage(BaseClass.getDriver());
		regpage.setFirstName(dataMap.get("firstName"));
		regpage.setLastName(dataMap.get("lastName"));
		regpage.setEmail(BaseClass.randomAlphaNumeric()+"@gmail.com");
		regpage.setTelephone(dataMap.get("telephone"));
		regpage.setPassword(dataMap.get("password"));
		regpage.setConfirmPassword(dataMap.get("password"));
		
	}

	@When("user selects Privacy Policy")
	public void user_selects_privacy_policy() {
		regpage.setPrivacyPolicy();
	}

	@When("user clicks on continue button")
	public void user_clicks_on_continue_button() {
		regpage=new AccountRegistrationPage(BaseClass.getDriver());
		regpage.clickContinue();
	}

	@Then("user account should get created successfully")
	public void user_account_should_get_created_successfully() {
		
		String confmsg=regpage.getConfirmationMsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		}
	
	@Then("error messages for each field got displayed")
	public void error_messages_for_each_field_got_displayed() {
		boolean message = regpage.verifyErrorMessage();
		Assert.assertEquals(message,true);
		
	}

	@Given("account registration details should be fetched from excel with row no {string}")
	public void account_registration_details_should_be_fetched_from_excel_with_row_no(String row_no) throws InterruptedException {
		
		datamap=DataReader.data(System.getProperty("user.dir")+"\\testData\\Opencart_LoginData.xlsx", "Sheet2");
        int index=Integer.parseInt(row_no)-1;        
        regpage=new AccountRegistrationPage(BaseClass.getDriver());
		regpage.setFirstName(datamap.get(index).get("First Name"));
		regpage.setLastName(datamap.get(index).get("Last Name"));
		regpage.setEmail(datamap.get(index).get("Email"));
		regpage.setTelephone(datamap.get(index).get("Phone No"));
		regpage.setPassword(datamap.get(index).get("Password"));
		regpage.setConfirmPassword(datamap.get(index).get("Confirm Password"));
		Thread.sleep(5000);
	}
	
 }
