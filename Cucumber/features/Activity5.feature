@activity5
Feature: Login Test
Scenario Outline: Testing Login with Example
Given user is on the login page
When the user enters "<Usernames>" and "<Passwords>"
And clicks the submit button
Then get the confirmation message and verify it
Examples:
| Usernames | Passwords |
| admin1    | pass123   |
| testuser  | wrongpass |
| hello     | 123456    |
