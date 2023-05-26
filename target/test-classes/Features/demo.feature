@all
Feature: To validate LTIMindtree page

  Background: 
    Given To user navigate to "ltimindtree.com" page

  @sc1
  Scenario: To validate the Reach Us form possible to sumbit
    When To select the option "Industries" in menu item and click on Life Science
    And To click on Submit button without entering any form details
    Then To check the all mandatory fields should show error messages
    And To check the all the messages in the text box in non Mandatory fields
    When The user enter the correct information in the Reach form text fields
    And To check the list of countries in the list box and check there 203 countries in the list
    And The user should select the "Denmark" country in the list of countries
    And The user should accept the terms and Conditions
    And The user Submit the form

  @sc2
  Scenario: To validate search the desired text on the site ltimindtree
    When The user enter the desired text "Nordea"  in the serach box
    Then The serach results should show atlest 2 in the results
    When The user click the "LTI posts robust 3.8% QoQ revenue growth in constant currency; Net Profit jumps 6.6% QoQ"
    Then To verify the "Mikael Spliid" is the contact at Nordea works and He works as "Head of WMO IT Solutions"
