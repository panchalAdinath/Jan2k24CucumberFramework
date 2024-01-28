Feature: Test google application
	
	Background:
	Given Open Google application
	  
	Scenario: Test Google application title
	When User capture title of google
	Then Title should be Google
	
	Scenario: Test search Feature With keyword
	When User enter valid keyword in search
	Then User should get valid result
	
	