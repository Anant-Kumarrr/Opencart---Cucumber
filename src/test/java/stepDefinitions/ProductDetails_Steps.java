package stepDefinitions;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import pageObjects.ProductDetailsPage;

public class ProductDetails_Steps {
	
	public ProductDetailsPage pdp;
	
	@Given("validated the product heading {string} on product information page")
	public void validated_the_product_heading_on_product_information_page(String product) {
	    boolean result;
		pdp = new ProductDetailsPage(BaseClass.getDriver());
	    result = pdp.verifyProdHeading(product);
	    if(result == true) {
	    	Assert.assertTrue(true);
	    }
	    else {
	    	Assert.assertTrue(false);
	    }
	}


}
