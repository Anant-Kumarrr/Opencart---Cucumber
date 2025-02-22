Feature: Account Registration

  @regression
  Scenario: Successful Account Registration
    Given user navigates to Register Account page
    When user enters the details into below fields
      | firstName | John       |
      | lastName  | Kenedy     |
      | telephone | 1234567890 |
      | password  | test@123   |
    And user selects Privacy Policy
    And user clicks on continue button
    Then user account should get created successfully

  @regression
  Scenario: Validating Error Messages On Account Registration Page
    Given user navigates to Register Account page
    And user clicks on continue button
    Then error messages for each field got displayed

  @regression
  Scenario Outline: DDT Test Case For Account Info Page
    Given user navigates to Register Account page
    And account registration details should be fetched from excel with row no "<Row_No>"
    And user selects Privacy Policy
    And user clicks on continue button
    And user account should get created successfully
    And user clicks on edit account
    And user is navigated to My Account Information page
    Then user details should get validated for user detail for row no "<Row_No>"
    
    Examples: 
    |Row_No|
    |  1   |
