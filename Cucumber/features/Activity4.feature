@activity4
Feature: Login Test
Scenario: Testing Login without Examples
Given user is on the login page
When the user enters "admin" and "password"
And clicks the submit button
Then get the confirmation message and verify it