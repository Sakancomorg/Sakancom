
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
  