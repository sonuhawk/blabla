$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Selenium/Copy of Copy of PlantView-1/src/test/resources/FeatureFiles/Loga_in1.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8241324471,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Sign In into Website",
  "description": "",
  "id": "login-feature;sign-in-into-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open  website",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I Enter Username",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I ennter password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I Click submit",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I am on Homepage of website",
  "keyword": "Then "
});
formatter.match({
  "location": "VerifyLogin.OpenWebsite()"
});
formatter.result({
  "duration": 7459327572,
  "status": "passed"
});
formatter.match({
  "location": "VerifyLogin.Enterusername()"
});
formatter.result({
  "duration": 1409762799,
  "status": "passed"
});
formatter.match({
  "location": "VerifyLogin.Enterpassword()"
});
formatter.result({
  "duration": 154988448,
  "status": "passed"
});
formatter.match({
  "location": "VerifyLogin.ClickSubmit()"
});
formatter.result({
  "duration": 1908532199,
  "status": "passed"
});
formatter.match({
  "location": "VerifyLogin.verifyhomepage()"
});
formatter.result({
  "duration": 321970890,
  "status": "passed"
});
formatter.after({
  "duration": 1105365686,
  "status": "passed"
});
});