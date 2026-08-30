Feature: Login WebPage Functionality
	
	Scenario: Verify application logo
		Given user is on Login Page
		Then the application logo should be displayed
	
	Scenario Outline: Login with valid credentials
	Given user is on login page
	When user enters valid "<username>"
	And user enters valid "<password>"
	And User clicks on login Button
	Then User Should be navigated to Dashboard Page
	
	Examples:
	|username|password|
	|Admin   |admin123|
