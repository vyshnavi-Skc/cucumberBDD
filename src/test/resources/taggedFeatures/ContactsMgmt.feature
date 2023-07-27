@Phase2
Feature: Contacts Management

Background: Login to App
Given User is logged in
@SmokeTest
Scenario: Create a contacts
When User create a contacts

@RegressionTest @SmokeTest
Scenario: Update a contacts
When User update a contacts

Scenario: Delete a contacts
When User delete a contacts