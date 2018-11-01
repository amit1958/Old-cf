$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("StepDefination/login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Feature for the Lockthedeal.com",
  "description": "",
  "id": "login-feature-for-the-lockthedeal.com",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "cucumber setup",
  "description": "",
  "id": "login-feature-for-the-lockthedeal.com;cucumber-setup",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Go to the web page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter the user name and password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Submit the Login page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User should navigate to the login page and comes with Logout link",
  "keyword": "Then "
});
formatter.match({
  "location": "cucmberLogin.startup()"
});
formatter.result({
  "duration": 18256081810,
  "status": "passed"
});
formatter.match({
  "location": "cucmberLogin.loginpage()"
});
formatter.result({
  "duration": 117781710,
  "status": "passed"
});
formatter.match({
  "location": "cucmberLogin.submit()"
});
formatter.result({
  "duration": 1805772456,
  "status": "passed"
});
formatter.match({
  "location": "cucmberLogin.validation()"
});
formatter.result({
  "duration": 4567984397,
  "status": "passed"
});
});