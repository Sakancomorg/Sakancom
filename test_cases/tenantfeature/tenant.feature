Feature: Accommodation Booking and Furniture Selling App

  Scenario: Tenant views available housing
    Given I am a tenant using the accommodation booking app
    When I access the app housing section
    Then I should be able to view a list of available housing options

  Scenario: Tenant views housing details
    Given I am a tenant using the accommodation booking app
    When I select a specific housing from the list
    Then I should be able to view pictures, prices, location, and services available for that housing

  Scenario: Tenant books accommodation
    Given I am a tenant using the accommodation booking app
    When I find a suitable housing option
    And I want to book the accommodation
    Then I should be able to make a booking via the app

  Scenario: Tenant views information about co-tenants (for student housing)
    Given I am a tenant using the accommodation booking app
    When I select a student housing option
    Then I should be able to view general information about the co-tenants, such as their ages and university majors

  Scenario: Tenant advertises used furniture for sale
    Given I am a tenant using the accommodation booking app
    When I want to sell my used furniture
    Then I should be able to access the special furniture section to advertise my items for sale

  Scenario: Tenant accesses control panel after booking
    Given I am a tenant with an active booking
    When I access the tenant control panel
    Then I should be able to view my personal data, the name of the residence owner, and their contact information
    And I should be able to see the time to pay for my rent

