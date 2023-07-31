package Sakancom;

import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TenantTest {
	LoginTest LT=new LoginTest();
    Scanner scanner = new Scanner(System.in);
	TenantClass T= new TenantClass(scanner);
	boolean tenanflag =false;
	boolean viewflag=false;
	boolean selcthouse=false;
	boolean selcethousetobook=false;

	boolean iwanttobook=false;


	@Given("I am a tenant using the accommodation booking app")
	public void i_am_a_tenant_using_the_accommodation_booking_app() {
			tenanflag=true;
		
	    
	}
	@When("I access the app housing section")
	public void i_access_the_app_housing_section() {
		if(T.choice==1) {
			viewflag=true;
		}
	    
	}
	@Then("I should be able to view a list of available housing options")
	public void i_should_be_able_to_view_a_list_of_available_housing_options() {
		T.viewavailablehouse();
	    assertTrue(tenanflag&&T.viewavailablehousef);
	}

	@When("I select a specific housing from the list")
	public void i_select_a_specific_housing_from_the_list() {
		selcthouse=true;
	}

	@Then("I should be able to view pictures, prices, location, and services available for that housing")
	public void i_should_be_able_to_view_pictures_prices_location_and_services_available_for_that_housing() {
	    T.viewselcethouse();
		assertTrue(selcthouse&&T.viewselcethousef);
	}

	@When("I find a suitable housing option")
	public void i_find_a_suitable_housing_option() {
		selcethousetobook=true;
	}

	@When("I want to book the accommodation")
	public void i_want_to_book_the_accommodation() {
		iwanttobook=true;
	}

	@Then("I should be able to make a booking via the app")
	public void i_should_be_able_to_make_a_booking_via_the_app() {
	    T.book();
	    assertTrue(selcethousetobook&&iwanttobook&&T.book);
	}

	@When("I select a student housing option")
	public void i_select_a_student_housing_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should be able to view general information about the co-tenants, such as their ages and university majors")
	public void i_should_be_able_to_view_general_information_about_the_co_tenants_such_as_their_ages_and_university_majors() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I want to sell my used furniture")
	public void i_want_to_sell_my_used_furniture() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should be able to access the special furniture section to advertise my items for sale")
	public void i_should_be_able_to_access_the_special_furniture_section_to_advertise_my_items_for_sale() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I am a tenant with an active booking")
	public void i_am_a_tenant_with_an_active_booking() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I access the tenant control panel")
	public void i_access_the_tenant_control_panel() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should be able to view my personal data, the name of the residence owner, and their contact information")
	public void i_should_be_able_to_view_my_personal_data_the_name_of_the_residence_owner_and_their_contact_information() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should be able to see the time to pay for my rent")
	public void i_should_be_able_to_see_the_time_to_pay_for_my_rent() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
