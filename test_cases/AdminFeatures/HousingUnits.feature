Feature: Housing Management

Scenario: Admin can add new housing units
Given the Admin enterd the info of the housing unit
When the Admin adds a new housing unit through the system
Then the housing unit details are saved in the system


Scenario: Admin can modify housing data
Given the Admin has selected a housing unit for modification
When the Admin makes changes to the housing data
Then the modified housing data is updated in the system