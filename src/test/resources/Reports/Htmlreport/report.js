$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/demo.feature");
formatter.feature({
  "name": "To validate LTIMindtree page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@all"
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
  "name": "To user navigate to \"ltimindtree.com\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "ReachUsSteps.to_user_navigate_to_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the Reach Us form possible to sumbit",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@all"
    },
    {
      "name": "@sc1"
    }
  ]
});
formatter.step({
  "name": "To select the option \"Industries\" in menu item and click on Life Science",
  "keyword": "When "
});
formatter.match({
  "location": "ReachUsSteps.to_select_the_option_in_menu_item_and_click_on_Life_Science(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click on Submit button without entering any form details",
  "keyword": "And "
});
formatter.match({
  "location": "ReachUsSteps.to_click_on_Submit_button_without_entering_any_form_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To check the all mandatory fields should show error messages",
  "keyword": "Then "
});
formatter.match({
  "location": "ReachUsSteps.to_check_the_all_mandatory_fields_should_show_error_messages()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To check the all the messages in the text box in non Mandatory fields",
  "keyword": "And "
});
formatter.match({
  "location": "ReachUsSteps.to_check_the_all_the_messages_in_the_text_box_in_non_Mandatory_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enter the correct information in the Reach form text fields",
  "keyword": "When "
});
formatter.match({
  "location": "ReachUsSteps.the_user_enter_the_correct_information_in_the_Reach_form_text_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To check the list of countries in the list box and check there 203 countries in the list",
  "keyword": "And "
});
formatter.match({
  "location": "ReachUsSteps.to_check_the_list_of_countries_in_the_list_box_and_check_there_countries_in_the_list(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should select the \"Denmark\" country in the list of countries",
  "keyword": "And "
});
formatter.match({
  "location": "ReachUsSteps.the_user_should_select_the_country_in_the_list_of_countries(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should accept the terms and Conditions",
  "keyword": "And "
});
formatter.match({
  "location": "ReachUsSteps.the_user_should_accept_the_terms_and_Conditions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user Submit the form",
  "keyword": "And "
});
formatter.match({
  "location": "ReachUsSteps.the_user_Submit_the_form()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "To user navigate to \"ltimindtree.com\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "ReachUsSteps.to_user_navigate_to_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate search the desired text on the site ltimindtree",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@all"
    },
    {
      "name": "@sc2"
    }
  ]
});
formatter.step({
  "name": "The user enter the desired text \"Nordea\"  in the serach box",
  "keyword": "When "
});
formatter.match({
  "location": "SerachSteps.the_user_enter_the_desired_text_in_the_serach_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The serach results should show atlest 2 in the results",
  "keyword": "Then "
});
formatter.match({
  "location": "SerachSteps.the_serach_results_should_show_atlest_in_the_results(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click the \"LTI posts robust 3.8% QoQ revenue growth in constant currency; Net Profit jumps 6.6% QoQ\"",
  "keyword": "When "
});
formatter.match({
  "location": "SerachSteps.the_user_click_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To verify the \"Mikael Spliid\" is the contact at Nordea works and He works as \"Head of WMO IT Solutions\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SerachSteps.to_verify_the_is_the_contact_at_Nordea_works_and_He_works_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});