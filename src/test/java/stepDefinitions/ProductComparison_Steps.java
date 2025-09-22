package stepDefinitions;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.ProductComparisonPage;

public class ProductComparison_Steps {
	
	ProductComparisonPage pcp;
	
	@Given("user gets navigated to product comparison page")
	public void user_gets_navigated_to_product_comparison_page() {
	   pcp = new ProductComparisonPage(BaseClass.getDriver());
	   Boolean result = pcp.verifyPageHeading();
	   if(result) {
		   Assert.assertTrue(true);
	   }
	   else {
		  Assert.assertTrue(false); 
	   }
	}

	@Then("verify the product details on product comparison page")
	public void verify_the_product_details_on_product_comparison_page() {
		Boolean result = pcp.verifyProductName();
		   if(result) {
			   Assert.assertTrue(true);
		   }
		   else {
			  Assert.assertTrue(false); 
		   }
	}

}
