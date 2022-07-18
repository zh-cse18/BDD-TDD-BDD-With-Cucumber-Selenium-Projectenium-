Feature: feature to test login functionality.

  Scenario: Check login is successful with valid crediential.
    Given user is on login page
    When user enter username and password
    And Click on Login Button
    Then user is navigated to the home page
