Feature: Web login

  @datadriven
  Scenario Outline: User should be able to login with valid credentials
    Given the user is on login page
    When the user enters email "<email>"
    And the user enters password "<password>"
    And hits submit
    Then the user should be logged in successfully "<name>"

    Examples:
      | name         | email                      | password |
      | tester jago  | tester@jagoqa.com          | testerjago |
      | Komang James | komangjames123@gmail.com   | 12345678   |