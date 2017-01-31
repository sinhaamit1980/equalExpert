Feature: HotelForm

	@hotel_test
	Scenario: Submit a valid form
		Given I am on a hotel booking form page
		And I fill the form with valid detail
		When I save the form
		Then I can see the row with the details populated
	
	@hotel_test	
	Scenario: Delete an entry 
		Given I am on a hotel booking form page
		And I fill the form with valid detail
		When I save the form
		Then I can see the row with the details populated
		When I delete the row for this booking detail
		Then I cannot see the row with this booking detail
				