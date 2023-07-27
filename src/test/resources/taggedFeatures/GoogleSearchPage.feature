@runSearch
Feature: Google page search

Background: Launch App
Given User launch google page

@runnjavaSearch
Scenario: Search java Tutorial
When search Java Tutorial
Then Should display Java result page


Scenario: Search Selenium Tutorial
When search Selenium Tutorial
Then Should display Selenium result page
