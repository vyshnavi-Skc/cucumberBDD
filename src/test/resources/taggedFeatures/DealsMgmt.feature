@Phase3
Feature: Deals Management

Background: Login to App
Given User is logged in

@SmokeTest
Scenario: Create a deals
When User create a deals

@RegressionTest
Scenario: Update a deals
When User update a deals

Scenario: Delete a deals
When User delete a deals