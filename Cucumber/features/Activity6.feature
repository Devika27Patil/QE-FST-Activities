@activity6
Feature: Add tasks to To-Do list
Scenario: Add multiple tasks using DataTable
Given user is on the To-Do list page
When user adds the following tasks
| Buy groceries |
| Pay bills     |
| Finish report |
| Call friend   |
Then they can see the task added to the list
