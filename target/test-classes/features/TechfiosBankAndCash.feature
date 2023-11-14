Feature: Techfios Other billing login page functionality validation

 Background: 
    Given User is on the techfios login page
@Regression
Scenario Outline: User should be able to login with valid credentials 
	and open a new account	
	When User enters "<username>" and "<password>"
	When User clicks on signin button
	Then User should land on Dashboard page 
	And User clicks on BankAndCash
	And User clicks on NewAccount
	And User enters information on add new accounts page.
	 |Rohini's Account|
	 |My Savings account|
	 |$500000|
	 |2324454546767|
	 |Rathinakumar|
	 |346567772|
	 
	And User clicks on submit
	Then User should be able to validate Account Created Successfully
	Examples: 
	|username|password|
	|demo@techfios.com|abc123|
	