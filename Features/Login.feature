Feature: Login Page Scenarios

  @sanity @regression
  Scenario: Successful Login with Valid Credentials
    Given the user navigates to login page
    When user enters email as "anant@gmail.com" and password as "12345"
    And the user clicks on the Login button
    Then the user should be redirected to the MyAccount Page

  @regression
  Scenario Outline: Login Data Driven
    Given the user navigates to login page
    When user enters email as "<email>" and password as "<password>"
    And the user clicks on the Login button
    Then the user should be redirected to the MyAccount Page

    Examples: 
      | email           | password |
      | anant@gmail.com |    12345 |
      | kumar@gmail.com |  Test123 |

  @regression
  Scenario Outline: Login With Invalid Credentials
    Given the user navigates to login page
    When user enters email as "<email>" and password as "<password>"
    And the user clicks on the Login button
    Then error message "Warning: No match for E-Mail Address and/or Password." should be displayed

    Examples: 
      | email         | password |
      | xyz@gmail.com |    12345 |
      | jkl@gmail.com |    12345 |

