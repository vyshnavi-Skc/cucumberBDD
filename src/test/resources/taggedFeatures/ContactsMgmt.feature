@Phase2
Feature: Contacts Management
@SmokeTest
Scenario: Create a contacts
Given User is logged in
When User create a contacts
@RegressionTest @SmokeTest
Scenario: Update a contacts
Given User is logged in
When User update a contacts

Scenario: Delete a contacts
Given User is logged in
When User delete a contacts