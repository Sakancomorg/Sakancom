package AcceptanceTest;


import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import housing.unit.AdminClass;
import housing.unit.HousingUnit;
import housing.unit.MyData;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReservationTesting {

   static Boolean ShowFlag;
   AdminClass adminClass;
   static List <HousingUnit> ReservationsList=MyData.reservationslist();


public ReservationTest(AdminClass adminClass) {
	this.adminClass = adminClass;
}
@Given("there are existing reservations in the system")
public void thereAreExistingReservationsInTheSystem() {
 assertTrue(ReservationsList.size()>0);

  
}
@When("the Admin accesses the reservations section")
public void theAdminAccessesTheReservationsSection() {
	
	adminClass.adminmenu();
	ShowFlag=adminClass.getRe();
  
}
@Then("Admin can view all reservations made through the system")
public void adminCanViewAllReservationsMadeThroughTheSystem() {
	assertTrue(ShowFlag);
    
}



}

