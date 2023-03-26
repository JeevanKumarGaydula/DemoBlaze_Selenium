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
@login @regression
Feature: Login Feature
  I want to use this feature file to test the login functionality

  @logIn
  Scenario: SignUp and Login to DemoBlaze
    Given I am on the signUp page
    When I enter username as "testusername123" and password as "testpassword123" on signup page
    Then I should successfully signUp
    And User accepts alert message
    When I enter username as "testusername123" and password as "testpassword123" on login page
    Then I should successfully logIn

    Examples: 
      | username  | password |
      | testusername777 |     testpassword777 |
