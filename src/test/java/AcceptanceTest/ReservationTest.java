package AcceptanceTest;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.picocontainer.DefaultPicoContainer;

import Sakancom.AdminClass;
import housing.unit.HousingUnit;
import housing.unit.MyApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReservationTest {
   AdminClass AC;
   Boolean ShowFlag;
   ArrayList <HousingUnit> ReservationsList;
   MyApp obj;
   
   
public ReservationTest( AdminClass AC,MyApp obj) {
	
		super();
		 
		this.AC=AC ;
		this.obj=obj;
		AC.adminmenu();
		this.ShowFlag=AC.re;
		this.ReservationsList=MyApp.ReservationsList();
		// TODO Auto-generated constructor stub
	}
@Given("there are existing reservations in the system")
public void thereAreExistingReservationsInTheSystem() {
    // Write code here that turns the phrase above into concrete actions
 assertTrue(ReservationsList.size()>1);
  
}
@When("the Admin accesses the reservations section")
public void theAdminAccessesTheReservationsSection() {
    // Write code here that turns the phrase above into concrete actions
   assertTrue(AC.getChoice()==4);
}
@Then("Admin can view all reservations made through the system")
public void adminCanViewAllReservationsMadeThroughTheSystem() {
	assertTrue(ShowFlag);
    // Write code here that turns the phrase above into concrete actions
    
}



}
