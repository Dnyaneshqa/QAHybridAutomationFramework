Feature: API Testing with RestAssured

  Scenario: Get users
    When I send GET request to "users"
    Then the response status code should be 200

  Scenario: Create user
    When I send POST request to "users" with body
      """
      {
        "name": "John Doe",
        "job": "QA Engineer"
      }
      """
    Then the response status code should be 401
