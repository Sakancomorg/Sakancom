Feature: Reservation Management
  
    Scenario: Admin can view all reservations
    Given there are existing reservations in the system
    When the Admin accesses the reservations section
    Then Admin can view all reservations made through the system
