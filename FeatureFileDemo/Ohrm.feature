Feature: HRM Data Driven Test

Scenario Outline: Test for login hrm
	
	Given Open orangehrm application
	When User enter username "<un>" and enter password "<psw>"
	When User Click on hrm login buttton
	Then As per valid data user should be able to login
	
	Examples: 
	|  un     |  psw      |
	|  Admin  |  admin123 |
	|  Pooja  |  test123  |
	|  Admin  |  admin123 |