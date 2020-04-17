#Author:nagarjun.reddy@simplify360.com
#Keywords Summary : Add, Edit and Delete a FAQ


Feature: Adding a FAQ

  #Tested
  Scenario: Creating New FAQ
    Given User navigates to FAQ page
    When Click on Add FAQ
    And Fill details to create FAQ
    Then FAQ should be added successfully

  #Tested
  Scenario: Edit a FAQ
    Given User navigates to FAQ page
    And Create FAQ
    When Changes to existing FAQ are edited and saved
    Then FAQ should be updated


  Scenario: Delete a FAQ
    Given User navigates to FAQ page
    And Create FAQ
    When Created FAQ is deleted
    Then FAQ should be deleted
