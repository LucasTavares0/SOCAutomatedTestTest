$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/FAP.feature");
formatter.feature({
  "name": "Test the FAP calculator functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User should be able to insert valid values and get a FAP calculation report",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the home page",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on FAP option",
  "keyword": "When "
});
formatter.step({
  "name": "user is on the FAP page",
  "keyword": "And "
});
formatter.step({
  "name": "user enters the company name \u003ccompanyname\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user enters a fap value \u003cFAPvalue\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user enters a rat percentage \u003cRATpercentage\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user enters a salary projection \u003csalaryprojection\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on Estimar FAP button",
  "keyword": "And "
});
formatter.step({
  "name": "user receive a FAP calculation report",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "companyname",
        "FAPvalue",
        "RATpercentage",
        "salaryprojection"
      ]
    },
    {
      "cells": [
        "Insight Tecnology",
        "2",
        "1",
        "25000000"
      ]
    },
    {
      "cells": [
        "Infinity",
        "0,5",
        "2",
        "1000000000"
      ]
    },
    {
      "cells": [
        "ShadowStalkers",
        "5",
        "3",
        "50000000000"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should be able to insert valid values and get a FAP calculation report",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "BDDFapTest.user_is_on_the_blog_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on FAP option",
  "keyword": "When "
});
formatter.match({
  "location": "BDDFapTest.user_clicks_on_FAP_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on the FAP page",
  "keyword": "And "
});
formatter.match({
  "location": "BDDFapTest.user_is_on_the_FAP_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the company name Insight Tecnology",
  "keyword": "And "
});
formatter.match({
  "location": "BDDFapTest.user_enters_the_company_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters a fap value 2",
  "keyword": "And "
});
formatter.match({
  "location": "BDDFapTest.user_enters_a_FAP_value(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters a rat percentage 1",
  "keyword": "And "
});
formatter.match({
  "location": "BDDFapTest.user_enters_a_RAT_percentage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters a salary projection 25000000",
  "keyword": "And "
});
formatter.match({
  "location": "BDDFapTest.user_enters_a_salary_projection(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Estimar FAP button",
  "keyword": "And "
});
formatter.match({
  "location": "BDDFapTest.user_clicks_on_Estimar_FAP_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user receive a FAP calculation report",
  "keyword": "Then "
});
formatter.match({
  "location": "BDDFapTest.user_receive_a_FAP_calculation_report()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to insert valid values and get a FAP calculation report",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "BDDFapTest.user_is_on_the_blog_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on FAP option",
  "keyword": "When "
});
formatter.match({
  "location": "BDDFapTest.user_clicks_on_FAP_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on the FAP page",
  "keyword": "And "
});
formatter.match({
  "location": "BDDFapTest.user_is_on_the_FAP_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the company name Infinity",
  "keyword": "And "
});
formatter.match({
  "location": "BDDFapTest.user_enters_the_company_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters a fap value 0,5",
  "keyword": "And "
});
formatter.match({
  "location": "BDDFapTest.user_enters_a_FAP_value(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters a rat percentage 2",
  "keyword": "And "
});
formatter.match({
  "location": "BDDFapTest.user_enters_a_RAT_percentage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters a salary projection 1000000000",
  "keyword": "And "
});
formatter.match({
  "location": "BDDFapTest.user_enters_a_salary_projection(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Estimar FAP button",
  "keyword": "And "
});
formatter.match({
  "location": "BDDFapTest.user_clicks_on_Estimar_FAP_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user receive a FAP calculation report",
  "keyword": "Then "
});
formatter.match({
  "location": "BDDFapTest.user_receive_a_FAP_calculation_report()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: FAP no relatorio nao condiz com FAP utilizado\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat StepsImplementation.BDDFapTest.user_receive_a_FAP_calculation_report(BDDFapTest.java:140)\r\n\tat ✽.user receive a FAP calculation report(file:features/FAP.feature:17)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to insert valid values and get a FAP calculation report",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "BDDFapTest.user_is_on_the_blog_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on FAP option",
  "keyword": "When "
});
formatter.match({
  "location": "BDDFapTest.user_clicks_on_FAP_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on the FAP page",
  "keyword": "And "
});
formatter.match({
  "location": "BDDFapTest.user_is_on_the_FAP_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the company name ShadowStalkers",
  "keyword": "And "
});
formatter.match({
  "location": "BDDFapTest.user_enters_the_company_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters a fap value 5",
  "keyword": "And "
});
formatter.match({
  "location": "BDDFapTest.user_enters_a_FAP_value(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters a rat percentage 3",
  "keyword": "And "
});
formatter.match({
  "location": "BDDFapTest.user_enters_a_RAT_percentage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters a salary projection 50000000000",
  "keyword": "And "
});
formatter.match({
  "location": "BDDFapTest.user_enters_a_salary_projection(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Estimar FAP button",
  "keyword": "And "
});
formatter.match({
  "location": "BDDFapTest.user_clicks_on_Estimar_FAP_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user receive a FAP calculation report",
  "keyword": "Then "
});
formatter.match({
  "location": "BDDFapTest.user_receive_a_FAP_calculation_report()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});