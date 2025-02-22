Feature: Search Results

  #Scenario: Search An Existing Product
    #Given user search for "IMac" in search bar
    #Then "IMac" will be displayed in search results
#
  #Scenario: Search For A Non Existing Product
    #Given user search for "FitBit" in search bar
    #Then "There is no product that matches the search criteria." message will be displayed
#
  #Scenario: Searching Product By Category
    #Given user click on search button on home page
    #And enters product name "iMac" in search criteria text field
    #And selects product category "      Mac" from category dropdown
    #And clicks on search button
    #Then "IMac" will be displayed in search results

  Scenario: Verfying Product In List and Grid View and Validating The Functionality Of Add To Cart, Add To Wish List and Compare This Product button
    Given the user navigates to login page
    And the user logged into application using "anant@gmail.com" and "12345"
    And user search for "IMac" in search bar
    And "IMac" will be displayed in search results
    Then user clicks on list view button
    And clicks on Add To Cart button and validates the success message is displayed
    And clicks on Add To Wish List and validates the success message is displayed
    And clicks on Compare This Product and validates the success message is displayed
    #Then user cicks on product image 
    #And validated the product heading on product information page
    
    
    
    