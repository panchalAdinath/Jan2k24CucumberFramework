Feature: Test any app
Scenario: Test app
    Given Open Swag Lab application is open
    When I enter username and password
    And I click on login button
    Then I should be able to see my username
