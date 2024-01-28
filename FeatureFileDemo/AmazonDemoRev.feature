@All
Feature: Test Amazon Title Scenarios

Background: 
Given Open Amazon application

@Smoke
Scenario: Test for homepage title
When I capture title for home page
Then Home page title should be match

@Regression
Scenario: Test for BestSellers page title
When I open BestSellers page
When I capture title for BestSellers page
Then Best sellers page title should be match

@Sanity
Scenario: Test for  mobiles page title
When I open mobiles page
When I capture title for mobiles page
Then  mobiles page title should be match

@Retest
Scenario: Test for Fashion page title
When I open Fashion page
When I capture title for Fashion page
Then Fashion page title should be match