package step_defs;
import pages.BookingForm;
import cucumber.api.java.en.Given;

import java.util.Random;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.junit.Assert;
import cucumber.api.java.en.Then;

public class BookingFormStepDefs extends BookingForm{
	Random rand = new Random(); 
	int randonValue = rand.nextInt(50); 
	
	String firstName = "TestFirst_"+ randonValue;

	@Given("I am on a hotel booking form page")
	public void i_am_on_a_hotel_booking_form_page(){
		navigate_to_site("http://hotel-test.equalexperts.io/");
	}
	
	@And("I fill the form with valid detail")
	public void i_fill_the_form_with_valid_detail(){
		getInitialRowCount();
		fillTheBookingForm(firstName, "TestLast", "100", "true", "2017-02-01", "2017-02-15");
	}
	
	@When("I save the form")
	public void i_save_the_form(){
		submitTheBookingForm();
	}

	@Then("I can see the row with the details populated")
	public void i_can_see_the_row_with_the_details_populated() throws Exception{
		Assert.assertEquals(true, isRowWithGivenFirstNamePresent(firstName));
	}
	
	@When("I delete the row for this booking detail")
	public void i_delete_the_row_for_this_booking_detail() throws Exception{
		deleteARow(firstName);
	}
	
	
	@Then("I cannot see the row with this booking detail")
	public void i_cannot_see_the_row_with_this_booking_detail() throws Exception{
		Assert.assertEquals(false, isRowWithGivenFirstNamePresent(firstName));
	}
	
	
}


