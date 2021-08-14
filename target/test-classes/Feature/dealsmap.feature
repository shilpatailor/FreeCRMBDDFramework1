Feature: Free CRM Deals Map feature

#Data Table Keyword with map
Scenario: Free CRM Deals map Test Scenario

Given user is already on login page
When title of the Login page is Free CRM
Then user enters username and password
| username | password |
| groupautomation | Test@12345 |

Then user clicks on login button
Then user is on home page
Then user mouse hover to Deals and open New Deals page
Then user create New Deal and submit
| title | amount | probability | commission |
| Test1 | 2000 | 50 | 10 |
| Test2 | 3000 | 60 | 20 |
| Test3 | 4000 | 70 | 30 |
| Test4 | 5000 | 80 | 40 |

Then close the browser