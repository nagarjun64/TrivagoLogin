Feature: Navigating through Modules of the application

  Scenario: Home Page is Displayed after login
    When User enter the valid credentials
    And Click on Login
    Then Home Page should be displayed

  Scenario: Login to application as valid user
    When User login to application
    And Click on Listen Home
    Then Listen Home Should be displayed
