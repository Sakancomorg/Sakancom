package AcceptanceTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.picocontainer.DefaultPicoContainer;

import Sakancom.AdminClass;
import housing.unit.HousingUnit;
import housing.unit.MyApp;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReservationTest {

   static Boolean ShowFlag;
   static ArrayList <HousingUnit> ReservationsList=MyApp.ReservationsList();


@Given("there are existing reservations in the system")
public void thereAreExistingReservationsInTheSystem() {
    // Write code here that turns the phrase above into concrete actions
 assertTrue(ReservationsList.size()>0);

  
}
@When("the Admin accesses the reservations section")
public void theAdminAccessesTheReservationsSection() {
	AdminClass.adminmenu();
	ShowFlag=AdminClass.re;
    // Write code here that turns the phrase above into concrete actions
  
}
@Then("Admin can view all reservations made through the system")
public void adminCanViewAllReservationsMadeThroughTheSystem() {
	assertTrue(ShowFlag);
    // Write code here that turns the phrase above into concrete actions
    
}



}
