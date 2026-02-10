@activity3
Feature: Testing with Tags

@SimpleAlert
Scenario: Testing with Simple Alert
Given user is on the alerts page
When user clicks the Simple Alert button
Then alert opens
And read the alert text and print it
And close the alert
And read the result text

@ConfirmAlert
Scenario: Testing with Confirm Alert
Given user is on the alerts page
When user clicks the Confirm Alert button
Then alert opens
And read the alert text and print it
And close the alert with cancel
And read the result text

@PromptAlert
Scenario Outline: Testing ewith Prompt Alert
Given user is on the alerts page
When user clicks the Prompt Alert button
Then alert opens
And read the alert text and print it
And write "<message>" in the alert
And close the alert
And read the result text
Examples:
| message |
| Hello Devika |
