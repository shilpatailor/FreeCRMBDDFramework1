#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

#Feature: Free CRM contact feature

#with Example keyword - Create New Contact Test
#Scenario Outline: Free CRM Create New Contact Test Scenario

#Given user is already on login page
#When title of the Login page is Free CRM
#Then user enters "<username>" and "<password>"
#Then user clicks on login button
#Then user is on home page
#Then user move to the contact tab and opens create new contact screen
#Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
#Then user click on the Save button
#Then close the browser

#Examples: 
| username        | password   | firstname | lastname | position |
| groupautomation | Test@12345 | Julian    | Dousza   | Manager  |
| groupautomation | Test@12345 | Jaxon     | Jhon     | Director |
