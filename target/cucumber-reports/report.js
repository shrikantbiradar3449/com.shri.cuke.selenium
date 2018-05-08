$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("End2End_Test.feature");
formatter.feature({
  "line": 1,
  "name": "Automated E2E Tests",
  "description": "Description: To test E2E integration",
  "id": "automated-e2e-tests",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Customer place an order by purchasing an item from search",
  "description": "",
  "id": "automated-e2e-tests;customer-place-an-order-by-purchasing-an-item-from-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "he search for \"dress\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "moves to checkout from mini cart",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "enter \"\u003ccustomer\u003e\" personal details on checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "select same delivery address",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "select payment method as \"check\" payment",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "place the order",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "verify the order details",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "automated-e2e-tests;customer-place-an-order-by-purchasing-an-item-from-search;",
  "rows": [
    {
      "cells": [
        "customer"
      ],
      "line": 20,
      "id": "automated-e2e-tests;customer-place-an-order-by-purchasing-an-item-from-search;;1"
    },
    {
      "cells": [
        "Lakshay"
      ],
      "line": 21,
      "id": "automated-e2e-tests;customer-place-an-order-by-purchasing-an-item-from-search;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2867927960,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Customer place an order by purchasing an item from search",
  "description": "",
  "id": "automated-e2e-tests;customer-place-an-order-by-purchasing-an-item-from-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "he search for \"dress\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "moves to checkout from mini cart",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "enter \"Lakshay\" personal details on checkout page",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "select same delivery address",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "select payment method as \"check\" payment",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "place the order",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "verify the order details",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 13965579569,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dress",
      "offset": 15
    }
  ],
  "location": "HomePageSteps.he_search_for(String)"
});
formatter.result({
  "duration": 7391129843,
  "status": "passed"
});
formatter.match({
  "location": "ProductPageSteps.choose_to_buy_the_first_item()"
});
formatter.result({
  "duration": 7804411063,
  "status": "passed"
});
formatter.match({
  "location": "CartPageSteps.moves_to_checkout_from_mini_cart()"
});
formatter.result({
  "duration": 29482470609,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lakshay",
      "offset": 7
    }
  ],
  "location": "CheckoutPageSteps.enter_personal_details_on_checkout_page(String)"
});
formatter.result({
  "duration": 2074662783,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cspan class\u003d\"select2-arrow\" role\u003d\"presentation\"\u003e...\u003c/span\u003e is not clickable at point (650, 52). Other element would receive the click: \u003ca href\u003d\"http://shop.demoqa.com/\"\u003e...\u003c/a\u003e\n  (Session info: chrome\u003d66.0.3359.139)\n  (Driver info: chromedriver\u003d2.37.544315 (730aa6a5fdba159ac9f4c1e8cbc59bf1b5ce12b7),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.7.0\u0027, revision: \u00272321c73\u0027, time: \u00272017-11-02T22:22:35.584Z\u0027\nSystem info: host: \u0027SHRIB-HP\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.37.544315 (730aa6a5fdba15..., userDataDir: C:\\Users\\ShriB\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 66.0.3359.139, webStorageEnabled: true}\nSession ID: a71a10fe16b527455b6fbc79e390a915\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat pageObjects.CheckoutPage.select_Country(CheckoutPage.java:107)\r\n\tat pageObjects.CheckoutPage.fill_PersonalDetails(CheckoutPage.java:164)\r\n\tat stepDefinitions.CheckoutPageSteps.enter_personal_details_on_checkout_page(CheckoutPageSteps.java:22)\r\n\tat ✽.And enter \"Lakshay\" personal details on checkout page(End2End_Test.feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CheckoutPageSteps.select_same_delivery_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "check",
      "offset": 26
    }
  ],
  "location": "CheckoutPageSteps.select_payment_method_as_payment(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CheckoutPageSteps.place_the_order()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ConfirmationPageSteps.verify_the_order_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 753410351,
  "status": "passed"
});
});