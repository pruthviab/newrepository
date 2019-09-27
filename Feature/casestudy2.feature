Feature: TestMApp loginn

Scenario Outline: sign of TestMApp
Given enters usernamee and passwordd
When enters "<unamee>" as username
When enters "<passs>" as password
Then Successful login into app

Examples:
|unamee   |passs     |
|dogblack |dog@1234  |