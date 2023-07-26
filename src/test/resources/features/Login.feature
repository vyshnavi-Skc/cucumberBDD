Feature: Login into App

#Scenario: Valid login
#Given User is on Login Page
#When User enters login credential
#Then Should display Home Page

	#Passing data atfrom feature file or scenario level instead of hard coding in the stepdef file
#Scenario: Valid login
#Given User is on Login Page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then Should display Home Page


	#Passing data at scenario level using exampels,where we can pass multiple set of data
#Scenario Outline: Valid login
#Given User is on Login Page
#When User enters "<username>" and "<password>"
#Then Should display Home Page

#Examples:
#|username|password|
#|tomsmith|SuperSecretPassword!|
#|usern|passw|
#|userk|pasdf|

	
	#Passing data at step level
#Scenario Outline: Valid login
#Given User is on Login Page
#When User enters login credential
#|username|password|
#|tomsmith|SuperSecretPassword!|


	#Passing data at step level using list of maps as datable to avoid getting details absed on index but using kwy
Scenario Outline: Valid login
Given User is on Login Page
When User enters login credential
|username|password|
|tomsmith|SuperSecretPassword!|
Then Should display Home Page