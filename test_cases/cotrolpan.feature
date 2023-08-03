 Feature: Tenant control panel
 
 Scenario: Tenant accesses control panel after booking
    Given I am a tenant with an active booking
    When I access the tenant control panel
    Then I should be able to view my personal data, the name of the residence owner, and their contact information
    And I should be able to see the time to pay for my rent