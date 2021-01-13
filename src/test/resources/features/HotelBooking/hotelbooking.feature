#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@requirement2
Feature: look for resorts and booking

  @SearchForResort
  Scenario: Check if the resort is listed
    Given Enter the search details
    And Execute the Search
    Then Validate the resort is listed or not

  @viewDealsForResort
  Scenario: View the deal for a resort
    Given Enter the search details
    And Execute the Search
    When required resort is found
    Then View the deals for the requried resort
