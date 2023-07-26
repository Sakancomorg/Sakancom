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
@tag
Feature: Login 
  @tag1
  Scenario Outline: User Login 
  Discription: User logged in successfully
  Actor: User
    Given <name> status log is <status_log>
    And the password is <pass>
    And the email is <email>
    And status_log is equal 1
    When press the login button 
    Then login <status>

    Examples: 
  | name    |  pass   |     email         |  status  |  status_log |
  | "samaa" |  "4545" | "samaa@gmail.com" | success  |      0      |
  | "tala" |  "7676"  | "tala@gmail.com"  | success  |      0      |
  | "nancy" |  "4444" | "N@gmail.com"     | success  |      0      |
  | "malak" |  "4444" | "m@gmail.com"     | success  |      0      |
  