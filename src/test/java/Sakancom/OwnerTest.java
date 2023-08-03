package Sakancom;
import static org.junit.Assert.assertTrue;
import java.util.Scanner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OwnerTest {
    Scanner scanner = new Scanner(System.in);
	private boolean ownerislog=false;
	private boolean readinfoflag=false;
	private boolean choiceadd=false;
	private boolean canaccess=false;
	private boolean selflagr=false;
	private boolean selflagf=false;
	private boolean selflaga=false;


	OwnerClass o=new OwnerClass(scanner);
	@Given("the housing owner is logged in")
	public void the_housing_owner_is_logged_in() {
		ownerislog=true; 
	}

	@When("they choose to add a new private residence")
	public void they_choose_to_add_a_new_private_residence() {
		o.ownermenu();
		if(o.choice==1||o.choice==6) {
			choiceadd=true;
		}
	}

	@When("fill in all the required information")
	public void fill_in_all_the_required_information() {
		   readinfoflag =true;
	}

	@Then("the residence should be successfully added to the platform")
	public void the_residence_should_be_successfully_added_to_the_platform() {
			o.addresidence();
			assertTrue(ownerislog&&o.addflag&&readinfoflag&&choiceadd);
		
	}

	@When("they access their control panel")
	public void they_access_their_control_panel() {
		canaccess=true;
	}

	@Then("all their listed residences should be displayed")
	public void all_their_listed_residences_should_be_displayed() {
	   o.viewresidences();
	   assertTrue(o.viewflag);
	}

	@When("they select a specific residence from the control panel")
	public void they_select_a_specific_residence_from_the_control_panel() {
		selflagr=true;   
	}

	@Then("the number of tenants in that residence should be displayed")
	public void the_number_of_tenants_in_that_residence_should_be_displayed() {
		o.init();
	   o.numoftenant();
	   assertTrue(o.numfloorandTen);
	}

	@Then("the number of floors for that residence should be displayed")
	public void the_number_of_floors_for_that_residence_should_be_displayed() {
		o.init();
		o.numoffloors();
		   assertTrue(o.numfloorandTen);

	}

	@When("they choose a specific floor for a residence")
	public void they_choose_a_specific_floor_for_a_residence() {
		selflagf=true;
	}

	@Then("the apartments on that floor should be displayed")
	public void the_apartments_on_that_floor_should_be_displayed() {
	    o.viewapatmen();
	    assertTrue(o.viewapartflag);
	}

	@When("they choose a specific apartment")
	public void they_choose_a_specific_apartment() {
		selflaga=true;
	}

	@Then("the names of the tenants and their contact information should be displayed")
	public void the_names_of_the_tenants_and_their_contact_information_should_be_displayed() {
		o.init();
		o.viewapatmen();
		assertTrue(o.viewapartflag);
	}

	@Then("the number of bathrooms and bedrooms, and balcony availability should be shown")
	public void the_number_of_bathrooms_and_bedrooms_and_balcony_availability_should_be_shown() {
		o.init();
		o.viewapatmen();
		assertTrue(o.viewapartflag);
	}


}
