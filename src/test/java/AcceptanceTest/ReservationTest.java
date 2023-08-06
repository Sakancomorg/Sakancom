package AcceptanceTest;


import static org.junit.Assert.assertTrue;

import java.util.ArrayList;



import housing.unit.AdminClass;
import housing.unit.HousingUnit;
import housing.unit.MyData;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReservationTest {

   static Boolean ShowFlag;
   AdminClass adminClass;
   static ArrayList <HousingUnit> ReservationsList=MyData.ReservationsList();


public ReservationTest(AdminClass adminClass) {
	this.adminClass = adminClass;
}
@Given("there are existing reservations in the system")
public void thereAreExistingReservationsInTheSystem() {
    // Write code here that turns the phrase above into concrete actions
 assertTrue(ReservationsList.size()>0);

  
}
@When("the Admin accesses the reservations section")
public void theAdminAccessesTheReservationsSection() {
	
	adminClass.adminmenu();
	ShowFlag=AdminClass.re;
    // Write code here that turns the phrase above into concrete actions
  
}
@Then("Admin can view all reservations made through the system")
public void adminCanViewAllReservationsMadeThroughTheSystem() {
	assertTrue(ShowFlag);
    // Write code here that turns the phrase above into concrete actions
    
}



}
