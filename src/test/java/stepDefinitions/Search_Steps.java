package stepDefinitions;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.SearchPage;

public class Search_Steps {
	
	public SearchPage sp;
	
	@Given("user search for {string} in search bar")
	public void user_search_for_in_search_bar(String prod) throws InterruptedException {
	    sp = new SearchPage(BaseClass.getDriver());
	    sp.searchProduct(prod);  
	}

	@Then("{string} will be displayed in search results")
	public void i_mac_will_be_displayed_in_search_results(String prod) {
		boolean res = sp.isProductExist(prod);
	    if(res==true) {
	    	Assert.assertTrue(true);
	    }
	    else {
	    	Assert.assertTrue(false);
	    }
	}
	
	@Then("{string} message will be displayed")
	public void message_will_be_displayed(String message){
	    String msg = sp.productNotFound();
	    if(msg.equals(message)) {
	    	Assert.assertTrue(true);
	    }
	    else {
	    	Assert.assertTrue(false);
	    }
	    
	}
	
	@Given("user click on search button on home page")
	public void user_click_on_search_button_on_home_page() {
		sp = new SearchPage(BaseClass.getDriver());
		sp.clickSearch();
	}

	@Given("enters product name {string} in search criteria text field")
	public void enters_product_name_in_search_criteria_text_field(String prod) {
	   sp.enterKeyword(prod);
	}

	@Given("selects product category {string} from category dropdown")
	public void selects_product_category_from_category_dropdown(String cat) {
	    sp.selectCategory(cat);
	}

	@Given("clicks on search button")
	public void clicks_on_search_button() throws InterruptedException {
	    sp.clickSerch2(); 
	    Thread.sleep(5000);
	}
	
	@Then("user clicks on list view button")
	public void user_clicks_on_list_view_button() throws InterruptedException {
		sp.clickListViewBtn();
	}
	
	@Then("clicks on Add To Cart button and validates the success message is displayed")
	public void clicks_on_add_to_cart_button_and_validates_the_success_message_is_displayed() throws InterruptedException {
		boolean result = sp.clickAddToCartBtn();
		if(result == true) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	@Then("clicks on Add To Wish List and validates the success message is displayed")
	public void clicks_on_add_to_wish_list_and_validates_the_success_message_is_displayed() throws InterruptedException {
		boolean result = sp.addToWishListBtn();
		if(result == true) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	@Then("clicks on Compare This Product and validates the success message is displayed")
	public void clicks_on_compare_this_product_and_validates_the_success_message_is_displayed() throws InterruptedException {
		boolean result = sp.compareProductBtn();
		if(result == true) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}	
	
	@Then("user cicks on product image")
	public void user_cicks_on_product_image() {
	    sp.clickIMacImg();
	}
	
	@Given("user clicks on product comparison link from the success message")
	public void user_clicks_on_product_comparison_link_from_the_success_message() {
	    sp.clickProdCompLink();
	}
	
}
