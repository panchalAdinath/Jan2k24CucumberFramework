Feature: Test Open Cart Application
Scenario: Test login for opencart with valid data
Given Open cart application
When I enter valid email id "test123@gmail.com"
When I enter valid password "test123"
When I click on cart login button
Then I should get login and dashboard page should be open
