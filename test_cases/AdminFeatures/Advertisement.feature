Feature: Housing Advertisement Management

  Scenario Outline: Admin handles housing advertisement requests
    Given there is a housing advertisement request
    When the Admin views the housing advertisement request details
    Then the Admin <action> the request
    And the housing unit is <outcome>
  Examples:
      | action    | outcome                                 |
      | "Accept"  | "Housing unit is added to the system"   |
      | "Reject"  | "Request is rejected"                   |

  Scenario: Admin handles no housing advertisement request
    Given there is no housing advertisement request
    When the Admin views the housing advertisement request details
    Then the Admin cannot perform any action