#Author: nagarjun64@gmail.com
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
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @Login
  Scenario: Create an account on Trivago and login successfully
    Given Customer opens Trivago account
    When Logged in using the created account
    Then Customer should login successfully

  @TicketCreation
  Scenario: Create a Ticket for Error found on Trivago
    Given Account is created on Trivago
    And Logged in using the created account
    When Ticket is created from Help Section located in Account Settings
    Then Ticket should be created successfully
