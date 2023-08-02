package AcceptanceTest;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookAccommodationTest {
	 private String selectedAccommodation;
	    private String bookingConfirmation;
	
	
	@Given("I have selected a specific accommodation")
	public void i_have_selected_a_specific_accommodation() {
	    // Write code here that turns the phrase above into concrete actions
		selectedAccommodation = "Sample Accommodation";
	}

	@When("I choose to book the accommodation")
	public void i_choose_to_book_the_accommodation() {
	    // Write code here that turns the phrase above into concrete actions
		 bookingConfirmation = "Booking confirmed for: " + selectedAccommodation;
		 
	}

	@Then("I should receive a confirmation message")
	public void i_should_receive_a_confirmation_message() {
	    // Write code here that turns the phrase above into concrete actions
		 String expectedConfirmationMessage = "Booking confirmed for: " + selectedAccommodation;
	        assertEquals(expectedConfirmationMessage, bookingConfirmation);
	}

}
