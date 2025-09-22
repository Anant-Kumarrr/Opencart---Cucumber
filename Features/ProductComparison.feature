Feature: Product Comparison

  Scenario: Verify Product Detail On Product Comparison Page
    Given the user navigates to login page
    And the user logged into application using "anant@gmail.com" and "12345"
    And user search for "iMac" in search bar
    And "iMac" will be displayed in search results
    And clicks on Compare This Product and validates the success message is displayed
    And user clicks on product comparison link from the success message 
    And user gets navigated to product comparison page
    Then verify the product details on product comparison page
