

Feature: Login Test
  Description: This	feature	will	test Login functionality

  @smoke
  Scenario: :	Successful	Login with	Valid	Credentials
    Given user is on login page
    When user enter user name and password
    And click the login button
    Then user able to seen the shopping page
    
    
    
    

