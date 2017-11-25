$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Macys.feature");
formatter.feature({
  "line": 1,
  "name": "To verify the macys landing page title",
  "description": "",
  "id": "to-verify-the-macys-landing-page-title",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2484138317,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "To check the macys landing page title",
  "description": "",
  "id": "to-verify-the-macys-landing-page-title;to-check-the-macys-landing-page-title",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@LandingPageTile"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Enter the url of macys application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Click on popup window close mark",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Check for the landing page title",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "To verify all the main link names under mainNavigationFobs",
  "keyword": "Then "
});
formatter.match({
  "location": "MacysLandingPageTest.enter_the_url_of_macys_application()"
});
formatter.write("maximising the window");
formatter.write("fetching the url: https://www.macys.com/");
formatter.result({
  "duration": 13300593164,
  "status": "passed"
});
formatter.match({
  "location": "MacysLandingPageTest.click_on_popup_window_close_mark()"
});
formatter.result({
  "duration": 132346093,
  "status": "passed"
});
formatter.match({
  "location": "MacysLandingPageTest.check_for_the_landing_page_title()"
});
formatter.result({
  "duration": 6604070,
  "status": "passed"
});
formatter.match({
  "location": "MacysLandingPageTest.To_verify_all_the_main_link_names_under_mainNavigationFobs()"
});
formatter.result({
  "duration": 121140011,
  "status": "passed"
});
formatter.write("Finished scenario");
formatter.after({
  "duration": 81431840,
  "status": "passed"
});
});