$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TechfiosBankAndCash.feature");
formatter.feature({
  "name": "Techfios Other billing login page functionality validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User should be able to login with valid credentials",
  "description": "\tand open a new account\t",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on signin button",
  "keyword": "When "
});
formatter.step({
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on BankAndCash",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on NewAccount",
  "keyword": "And "
});
formatter.step({
  "name": "User enters information on add new accounts page.",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "Rohini\u0027s Account"
      ]
    },
    {
      "cells": [
        "My Savings account"
      ]
    },
    {
      "cells": [
        "$500000"
      ]
    },
    {
      "cells": [
        "2324454546767"
      ]
    },
    {
      "cells": [
        "Rathinakumar"
      ]
    },
    {
      "cells": [
        "346567772"
      ]
    }
  ]
});
formatter.step({
  "name": "User clicks on submit",
  "keyword": "And "
});
formatter.step({
  "name": "User should be able to validate Account Created Successfully",
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
        "demo@techfios.com",
        "abc123"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.BankAndCashSteps.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to login with valid credentials",
  "description": "\tand open a new account\t",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User enters \"demo@techfios.com\" and \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.BankAndCashSteps.user_enters_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on signin button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.BankAndCashSteps.user_clicks_on_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.BankAndCashSteps.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on BankAndCash",
  "keyword": "And "
});
formatter.match({
  "location": "steps.BankAndCashSteps.user_clicks_on_BankAndCash()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on NewAccount",
  "keyword": "And "
});
formatter.match({
  "location": "steps.BankAndCashSteps.user_clicks_on_NewDeposoit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters information on add new accounts page.",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "steps.BankAndCashSteps.user_enters_in_the_field_in_accounts_page(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on submit",
  "keyword": "And "
});
formatter.match({
  "location": "steps.BankAndCashSteps.user_clicks_on()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to validate Account Created Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.BankAndCashSteps.user_should_be_able_to_validate_account_created_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});