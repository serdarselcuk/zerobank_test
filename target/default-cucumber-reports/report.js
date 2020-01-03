$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "User can only login with valid credentials",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStepDef.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter credentials",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStepDef.enteredCredentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"HomePage\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDef.shouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User shouldn\u0027t be able to login with credentials  user :\"\u003cusername\u003e\", password: \"\u003cpassword\u003e\"",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the login page",
  "keyword": "Given "
});
formatter.step({
  "name": "Entered \"\u003cusername\u003e\" \"\u003cpassword\u003e\" credentials",
  "keyword": "When "
});
formatter.step({
  "name": "\"Message\" should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "WrongUser",
        "password"
      ]
    },
    {
      "cells": [
        "userName",
        "WrongPassword"
      ]
    },
    {
      "cells": [
        "",
        "password"
      ]
    },
    {
      "cells": [
        "username",
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "User shouldn\u0027t be able to login with credentials  user :\"WrongUser\", password: \"password\"",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStepDef.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Entered \"WrongUser\" \"password\" credentials",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStepDef.enteredCredentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Message\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDef.shouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User shouldn\u0027t be able to login with credentials  user :\"userName\", password: \"WrongPassword\"",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStepDef.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Entered \"userName\" \"WrongPassword\" credentials",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStepDef.enteredCredentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Message\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDef.shouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User shouldn\u0027t be able to login with credentials  user :\"\", password: \"password\"",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStepDef.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Entered \"\" \"password\" credentials",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStepDef.enteredCredentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Message\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDef.shouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User shouldn\u0027t be able to login with credentials  user :\"username\", password: \"\"",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStepDef.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Entered \"username\" \"\" credentials",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStepDef.enteredCredentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Message\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDef.shouldBeDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});