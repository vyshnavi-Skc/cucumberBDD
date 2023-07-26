@Phase3
Feature: Deals Management
@SmokeTest
Scenario: Create a deals
Given User is logged in
When User create a deals

@RegressionTest
Scenario: Update a deals
Given User is logged in
When User update a deals

Scenario: Delete a deals
Given User is logged in
When User delete a deals