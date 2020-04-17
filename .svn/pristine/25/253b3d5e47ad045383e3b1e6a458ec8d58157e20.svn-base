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


Feature: Email Signatures

  #Tested
  Scenario: Create New Signature Successfully
    Given User is in Manage Signature Page
    And Enter New Signature Create Screen
    When Signature is saved by filling all manadatory fields
    Then Signature is Created Successfully

  #Tested
  Scenario: Edit the Signature Successfully
    Given User is in Manage Signature Page
    And Enter New Signature Create Screen
    When Signature is saved by filling all manadatory fields
    And Changes to signature are edited and updated
    Then Signature Should be Updated Successfully

  #Tested
  Scenario: Delete the Signature
    Given User is in Manage Signature Page
    And Enter New Signature Create Screen
    When Signature is saved by filling all manadatory fields
    And Signature is Deleted
    Then Signature should be deleted Successfully
