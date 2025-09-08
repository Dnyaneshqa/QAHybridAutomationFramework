Feature: Login functionality

  Scenario: Valid login
    Given user is on login page
    When user enters "standard_user" and "secret_sauce"
    And clicks login button
    Then user should see homepage
