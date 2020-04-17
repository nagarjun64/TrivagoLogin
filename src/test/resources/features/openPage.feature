Feature: Manage Users

  Scenario: Open Broadcast after clicking on broad cast
	Given User Navigates to Manage User Page
	When Clicks on Add new User
	And User enters "<emailId>" and "<shortName>" and "<firstName>" and "<lastName>" and "<password>" and "<reEnterPassword>" and "<Role>"
	And Click on Save New User
	Then User Should be added successfully


    | emailId                 | shortName      | firstName   | lastName         | password       | reEnterPassword   | Role             |
    | user1@performance.com   | Puser1         | User 1      | Performance1     | Simplify360%   | Simplify360%      | Admin            |
    

    