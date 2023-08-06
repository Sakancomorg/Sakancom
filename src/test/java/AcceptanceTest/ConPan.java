<<<<<<< HEAD:src/test/java/AcceptanceTest/ConPan.java
package AcceptanceTest;
=======
package Sakancom;
>>>>>>> 7f7b7a8a035927cb4c78f067f5c90cb26b2a4afe:src/test/java/Sakancom/ConPan.java

import static org.junit.Assert.assertTrue;

import java.util.Scanner;

<<<<<<< HEAD:src/test/java/AcceptanceTest/ConPan.java
import housing.unit.TenantClass;
=======
>>>>>>> 7f7b7a8a035927cb4c78f067f5c90cb26b2a4afe:src/test/java/Sakancom/ConPan.java
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConPan {
	Scanner scanner = new Scanner(System.in);
	TenantClass T=new TenantClass(scanner);
	boolean tenantbook =false;
	boolean choice =false;
	boolean sub =false;
	@Given("I am a tenant with an active booking")
	public void i_am_a_tenant_with_an_active_booking() {
		tenantbook=true;
	}

	@When("I access the tenant control panel")
	public void i_access_the_tenant_control_panel() {
		if(T.choice==7) {
			choice=true;
		}
	}

	@Then("I should be able to view my personal data, the name of the residence owner, and their contact information")
	public void i_should_be_able_to_view_my_personal_data_the_name_of_the_residence_owner_and_their_contact_information() {
	    T.viewpersonaldata();
	    T.viewownerinfo();
	    assertTrue(T.isViewpersonaldataf());
	}

	@Then("I should be able to see the time to pay for my rent")
	public void i_should_be_able_to_see_the_time_to_pay_for_my_rent() {
	   T.viewtimetopay();
	    assertTrue(T.isViewtimetopayf());

	}



}
