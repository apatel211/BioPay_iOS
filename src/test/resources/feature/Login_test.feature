Feature: Login 
 @Login
Scenario: Successful Login with Valid Credentials
	Given BioPay application gets open 
	When Click on SKIP button
	When Click on LOGIN button
	When User enters Email ID "UserName"
	When User enters Password "password"
	Then Click on CONTINUE button

Scenario: Successful Logout
	Then Click on Profile tab 
        Then User scroll down 
	Then Click on LOGOUT button
   