Feature: TestMApp

 Scenario Outline: Registration of TestMApp
  Given the signup page is opeeds
  When user enters "<username>" as username
  When user enter "<firstname>" as firstname
  When user entes "<lastname>" as lastname
  When user entrs "<password>" as password
  When user eners "<con_password>" as conpassword
  When Select malee 
  When user eters "<email>" as email
  When user nters "<mobile>" as mobile
  When user ente "<dob>" as dob
  When user "<address>" as add
  When Select scque
  When user enrs "<answer>" as answer
  When user Clcks Register
  Then Registrs Successfully
  
  Examples:
  	|username |firstname |lastname |password |con_password |email          |mobile    |dob        |address |answer      |
  	|dogblack |db        |dog      |dog@1234 |dog@1234     |dog@gmail.com  |9999999999|01/03/1998 |abcdefg |blue        |