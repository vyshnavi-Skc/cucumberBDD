@Phase1
Feature: Task Management

Background: Login to App
Given User is logged in

@SmokeTest
Scenario: Create a task
When User create a task

@RegressionTest
Scenario: Update a task
When User update a task

Scenario: Delete a task
When User delete a task