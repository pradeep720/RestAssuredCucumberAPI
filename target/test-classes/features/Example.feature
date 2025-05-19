Feature: API Testing with Rest-Assured and Cucumber

Scenario: Get user details
    Given I set the base URL
    When I send a GET request to "/api/users/2"
    Then the response status code should be 200
    And the response should contain the user's details
  
