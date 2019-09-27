Feature: TestMApp loginn and search

Scenario Outline: signin of TestMApp
Given enters username and password
When enters "<namee>" as name
And enters "<pass>" as pasword
And Successful login into TestMeapp
And user clicks search bar
And user types head
Then dropdown appears

Examples:
|namee   |pass     |
|dogblack |dog@1234  |