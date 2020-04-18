Feature: Manage Users


  Scenario Outline: Open Broadcast after clicking on broad cast
    Given User Navigates to Manage User Page
    When Clicks on Add new User
    And User enters "<emailId>" and  "<shortName>" and "<firstName>" and  "<lastName>" and "<password>" and  "<reEnterPassword>" and "<Role>"
    Then User "<emailId>" Should be added successfully

    Examples: Users
      | emailId              | shortName | firstName | lastName     | password      | reEnterPassword | Role  |
      | randomuser@gmail.com | Puser1    | User 1    | Performance1 | Simplify360@% | Simplify360@%   | ADMIN |
      

 @user 
  Scenario: Create New user
    Given User Navigates to Manage User Page
    When Clicks on Add new User
    And User enters the required details to create new user
    Then User Should be added successfully