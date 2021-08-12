$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/shilp/eclipse-workspace/FreeCRMBDDFramework1/src/main/java/Feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM login feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Login Test Scenario",
  "description": "Given: user is already on login page\r\nWhen: title of the Login page is Free CRM\r\nThen: user enters username and password\r\nThen: user clicks on login button\r\nThen: user is on home page",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
});