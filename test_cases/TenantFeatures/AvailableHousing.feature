Feature: View Available Housing
  As a user
  I want to view the available housing options
  So that I can explore potential places to live.

Scenario Outline: View available housing listings
  Given there are <availability> housing listings
  And there are <student_housing_availability> student housing listings
  When I choose View Available Housing
  Then I should see <result> 

Examples:
| availability | student_housing_availability | result                                     |
| 1            | 0                           | "see a list of housing"                 |
| 0            | 0                           | "see a message indicating no housing listings"     |
| 1            | 1                           | "see a list of housing for students" |
| 0            | 1                           | "see a message indicating no housing listings for students" |
