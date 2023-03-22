@critical
Feature: Web login
  @regression @smoke @functional
  Scenario: User should be able to login with valid credentials
    Given the user is on login page
    When the user enters valid credentials
    And hits submit
    Then the user should be logged in successfully

  @functional @regression
  Scenario: User should not be able to login with invalid credentials
    Given the user is on login page
    When the user enters invalid credentials
    And hits submit
    When an invalid credentials error message should be displayed to the user
    And the user should be logged in unsuccessfully

  @ui @regression
  Scenario: Check for login page
    Given the user is on login page
    Then the company logo should be present in the login form