Feature: Housing Advertisement Management

    Scenario: Admin can accept a housing advertisement request
    Given there is a housing advertisement request
    When the Admin views the housing advertisement request details
    Then the Admin accept the request
    And the housing unit is added to the system
    
    
    
    
    Scenario: Admin can reject a housing advertisement request
    Given there is a housing advertisement request
    When the Admin views the housing advertisement request details
    Then the Admin reject the request
   
   
   