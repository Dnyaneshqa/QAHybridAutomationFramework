Feature: Mobile App Login

  Scenario: Login with valid credentials
    Given I launch the mobile app
    When I login with username "testuser" and password "password123"
    Then I should see the home screen
