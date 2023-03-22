Feature: Web login success
  Scenario: User should be able to login with valid credentials
    Given the user is on login page
    When the user enters valid credentials
    And hits submit
    Then the user should be logged in successfully


Feature: Web login failed
  Scenario: User should not be able to login with valid wrong password
    Given the user is on login page
    When the user enters invalid credentials
    And hits submit
    Then the user should not be logged in
