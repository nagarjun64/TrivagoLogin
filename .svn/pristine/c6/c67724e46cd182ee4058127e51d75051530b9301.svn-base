
#Author: nagarjun.reddy@simplify360.com
#Keywords Summary : Feature to add default response in publish settings


Feature: Publish settings

//@developement
  Scenario: Create response in Publish settings 
    Given User navigates to create response page
    When Clicks on create response 
    And User enters "<name>" and "<Response>"
    Then Response should be added successfully
   

  Scenario Outline: Add repsonse 
    Given User navigates to publish settings page
    When Clicks on create response
    And User enters response "<name>" and "<Response>" to be added
    Then Response should be added successfully

    Examples: 
      | name  | Response|
      | name1 | Tag1    |
      | name2 | Tag2    |
