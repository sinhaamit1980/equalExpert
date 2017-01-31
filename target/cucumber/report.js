$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/submitHotelForm.feature");
formatter.feature({
  "line": 1,
  "name": "HotelForm",
  "description": "",
  "id": "hotelform",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Submit a valid form",
  "description": "",
  "id": "hotelform;submit-a-valid-form",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@hotel_test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on a hotel booking form page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I fill the form with valid detail",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I save the form",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I can see the row with the details populated",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingFormStepDefs.i_am_on_a_hotel_booking_form_page()"
});
formatter.result({
  "duration": 7673971225,
  "status": "passed"
});
formatter.match({
  "location": "BookingFormStepDefs.i_fill_the_form_with_valid_detail()"
});
formatter.result({
  "duration": 961897148,
  "status": "passed"
});
formatter.match({
  "location": "BookingFormStepDefs.i_save_the_form()"
});
formatter.result({
  "duration": 89695520,
  "status": "passed"
});
formatter.match({
  "location": "BookingFormStepDefs.i_can_see_the_row_with_the_details_populated()"
});
formatter.result({
  "duration": 9197857239,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Delete an entry",
  "description": "",
  "id": "hotelform;delete-an-entry",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@hotel_test"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I am on a hotel booking form page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I fill the form with valid detail",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I save the form",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I can see the row with the details populated",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I delete the row for this booking detail",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I cannot see the row with this booking detail",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingFormStepDefs.i_am_on_a_hotel_booking_form_page()"
});
formatter.result({
  "duration": 5542368660,
  "status": "passed"
});
formatter.match({
  "location": "BookingFormStepDefs.i_fill_the_form_with_valid_detail()"
});
formatter.result({
  "duration": 704205619,
  "status": "passed"
});
formatter.match({
  "location": "BookingFormStepDefs.i_save_the_form()"
});
formatter.result({
  "duration": 79613834,
  "status": "passed"
});
formatter.match({
  "location": "BookingFormStepDefs.i_can_see_the_row_with_the_details_populated()"
});
formatter.result({
  "duration": 9247191633,
  "status": "passed"
});
formatter.match({
  "location": "BookingFormStepDefs.i_delete_the_row_for_this_booking_detail()"
});
formatter.result({
  "duration": 9350802885,
  "status": "passed"
});
formatter.match({
  "location": "BookingFormStepDefs.i_cannot_see_the_row_with_this_booking_detail()"
});
formatter.result({
  "duration": 9109925008,
  "status": "passed"
});
});