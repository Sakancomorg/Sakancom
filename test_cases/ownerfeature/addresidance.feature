Feature: Housing Owners

Scenario: Add private residence with all details
Given the housing owner is logged in
When they choose to add a new private residence
And fill in all the required information
Then the residence should be successfully added to the platform

Scenario: View housing details in the control panel
Given the housing owner is logged in
When they access their control panel
Then all their listed residences should be displayed

Scenario: View tenant details for a specific residence
Given the housing owner is logged in
When they select a specific residence from the control panel
Then the number of tenants in that residence should be displayed

Scenario: View the number of floors for a specific residence
Given the housing owner is logged in
When they select a specific residence from the control panel
Then the number of floors for that residence should be displayed

Scenario: View apartments for a specific floor
Given the housing owner is logged in
When they choose a specific floor for a residence
Then the apartments on that floor should be displayed

Scenario: View tenant details for a specific apartment
Given the housing owner is logged in
When they choose a specific apartment
Then the names of the tenants and their contact information should be displayed
And the number of bathrooms and bedrooms, and balcony availability should be shown

