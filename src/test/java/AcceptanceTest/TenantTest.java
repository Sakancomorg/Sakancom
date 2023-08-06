<<<<<<< HEAD:src/test/java/AcceptanceTest/TenantTest.java
package AcceptanceTest;
=======
package Sakancom;
>>>>>>> 7f7b7a8a035927cb4c78f067f5c90cb26b2a4afe:src/test/java/Sakancom/TenantTest.java

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Scanner;

<<<<<<< HEAD:src/test/java/AcceptanceTest/TenantTest.java
import housing.unit.TenantClass;
=======
>>>>>>> 7f7b7a8a035927cb4c78f067f5c90cb26b2a4afe:src/test/java/Sakancom/TenantTest.java
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TenantTest {
	Scanner scanner = new Scanner(System.in);
	TenantClass T=new TenantClass(scanner);
	boolean sel =false;
	boolean info =false;
	boolean sub =false;


 
	@Given("A tenant wants to sell used furniture")
	public void a_tenant_wants_to_sell_used_furniture() {
	   sel=true;
	}

	@When("they provide the information of Furniture")
	public void they_provide_the_information_of_furniture() {
	    info=true;
	}

	@When("they submit the advertisement")
	public void they_submit_the_advertisement() {
	    sub=true;

	    
	}

	@Then("the advertisement should be posted in the special window")
	public void the_advertisement_should_be_posted_in_the_special_window() {
	    T.viewadvertisementwindow();
<<<<<<< HEAD:src/test/java/AcceptanceTest/TenantTest.java
	    assertTrue(info&&sel&&sub&&T.isAdvflag());
=======
	    assertTrue(info&&sel&&sub&&T.advflag);
>>>>>>> 7f7b7a8a035927cb4c78f067f5c90cb26b2a4afe:src/test/java/Sakancom/TenantTest.java
	}


}
