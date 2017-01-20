Feature: Registration
 @Registration
Scenario: Successful Login with Valid Credentials
	Given BioPay application gets open 
	When Click on SKIP button
	When Click on CREATE ACCOUNT 
	When User enters Email ID to create account "UserName"
	When User enters Confirm Email ID to create account "UserName"
	When User enters Birthdate
	Then Click on DONE button
	When User enters Password to create account "password"
	Then Click on CONTINUE button

Scenario: Select COUNTRY
	And User navigates to COUNTRY OF RESIDENCE screen
	Then Select a COUNTRY 
	Then User click on CONFIRM COUNTRY button

Scenario: Select TERMS AND SERVICES
	And User navigates to Terms And Aervices screen
	Then User click on AGREE AND CONTINUE on terms and service

Scenario: Select PRIVACY POLICY
	And User navigates to Privacy Policy screen
	Then User click on AGREE AND CONTINUE on Privacy policy

Scenario: Set PIN CODE
	And User navigates to Set Pin Code
        Then Click on Pin and Set Pin
	Then Click on Continue on Set Pin
	And User navigates to Confirm Set Pin Code
        Then Click on Confirm Pin and Set Pin
	Then Click on Continue on Confirm Set Pin

Scenario: SKIP Complete Profile
	And User navigates to Complete Profile screen 
	Then Click on SKIPFORNOW button 
	Then Click on OK on alert 
	And User has Created Account successfully

Scenario: Successful Logout
	Then Click on Profile tab 
        Then User scroll down 
	Then Click on LOGOUT button
	


	
