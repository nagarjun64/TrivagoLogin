
#Author: nagarjun.reddy@simplify360.com
#Keywords Summary : Features to test listen settings


Feature: Listen settings

@developement
  Scenario: Create an workbasket and share it with users with respective roles 
    Given User navigates to Workbasket section in settings of the profile
    When Provides workbasket details 
    And Saves after selecting user with respective roles
    Then Workbasket should be saved successfully
   

