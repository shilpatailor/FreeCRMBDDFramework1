Feature: Free CRM Deals feature

#Data Table Keyword
Scenario: Free CRM Deals Test Scenario

Given user is already on login page
When title of the Login page is Free CRM
Then user enters username and password
| groupautomation | Test@12345 |

Then user clicks on login button
Then user is on home page
Then user move hover to Deals and open New Deals page
Then user create New Deal and submit
| IT Company | 2000 | 50 | 15 |

Then close the browser