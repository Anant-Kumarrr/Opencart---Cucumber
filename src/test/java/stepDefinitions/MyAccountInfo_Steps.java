package stepDefinitions;

import java.util.HashMap;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.AccountInformation;
import utilities.DataReader;

public class MyAccountInfo_Steps {

	WebDriver driver;
	AccountInformation info;
	List<HashMap<String, String>> datamap;

	@Given("user is navigated to My Account Information page")
	public void user_is_navigated_to_my_account_information_page() {
		info = new AccountInformation(BaseClass.getDriver());
		boolean pageHeading = info.confirmHeading();
		if(pageHeading != true) {
			Assert.assertTrue(false);
		}
	}
	
	@Then("user details should get validated for user detail for row no {string}")
	public void user_details_should_get_validated_for_user_detail_for_row_no(String row_no) throws InterruptedException {
		
		datamap=DataReader.data(System.getProperty("user.dir")+"\\testData\\Opencart_LoginData.xlsx", "Sheet2");
        int index=Integer.parseInt(row_no)-1; 
        String fname = datamap.get(index).get("First Name").trim();
        String lname = datamap.get(index).get("Last Name").trim();
        String email = datamap.get(index).get("Email").trim();
        String phoneNo = datamap.get(index).get("Phone No");
        
        try {
        	if(info.getFirstName().equals(fname)) {}
            else {
            	Assert.assertTrue(false);
            }
        	if(info.getLastName().equals(lname)) {}
            else {
            	Assert.assertTrue(false);
            }
        	if(info.getEmail().equals(email)) {}
            else {
            	Assert.assertTrue(false);
            }
        	if(info.getPhoneNo().equals(phoneNo)) {}
            else {
            	Assert.assertTrue(false);
            }
        }
        catch(Exception e) {
        	Assert.assertTrue(false);
        }
        
        Thread.sleep(5000);
        
	}

}
