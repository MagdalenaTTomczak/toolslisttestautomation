Feature: Search Tool

Background:
  Given the tool list is displayed

@ high-impact
Scenario: a valid user want to access the tool listed on the page
When the user selects the tool
Then the tool detail page is displayed

@ to-do
Scenario Outline: : a valid user is able to search for a tool
When the user search for a term "<searchterm>"
Then list of tools related to that term is returned
Examples:
|searchterm|
|test      |
|testname  |

@ to-do
  Scenario: a valid user is able to delete a tool
When the user selects the delete option
Then the tool is deleted