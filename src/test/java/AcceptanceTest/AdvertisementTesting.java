package AcceptanceTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import housing.unit.AdminClass;
import housing.unit.Apartments;
import housing.unit.HousingSystem;
import housing.unit.HousingUnit;
import housing.unit.LocationInfo;
import housing.unit.MyData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdvertisementTesting {

	 private HousingUnit housingUnit, housingUnitr;
	 private boolean hasAdvertisementRequest;
	 private LocationInfo locationInfos;
     Apartments a=new Apartments();
@Given("there is a housing advertisement request")
public void there_is_a_housing_advertisement_request() {
    // Write code here that turns the phrase above into concrete actions
	hasAdvertisementRequest=true;
       locationInfos = new LocationInfo("ff", "ff", 5, 1);
      housingUnit = new HousingUnit(locationInfos, a, true, true,5,"wifi");
	 MyData.addAdvertisementList(housingUnit);
	    			
	 locationInfos = new LocationInfo("ff", "kk", 5, 2);
     housingUnitr = new HousingUnit(locationInfos, a, true, true,5,"wifi");
     MyData.addAdvertisementList(housingUnitr);
		
}

@When("the Admin views the housing advertisement request details")
public void the_admin_views_the_housing_advertisement_request_details() {
	if(hasAdvertisementRequest);
		HousingSystem.viewAdvertisementRequest();
    }


@Then("the Admin {string} the request")
public void the_admin_the_request(String action) {
    // Write code here that turns the phrase above into concrete actions
	 if (hasAdvertisementRequest) {
         if (action.equals("Accept")) {
            housingUnit= HousingSystem.acceptAdvertisementRequest();
         } else if (action.equals("Reject")) {
        	 housingUnitr= HousingSystem.rejectAdvertisementRequest();
         }
	 }
    
}

@Then("the housing unit is {string}")
public void the_housing_unit_is(String outcome) {
    // Write code here that turns the phrase above into concrete actions
	  if (hasAdvertisementRequest) {
          if (outcome.equals("Housing unit is added to the system")) {
              assertTrue(MyData.getHousingUnitList().contains(housingUnit));
          } else if (outcome.equals("Request is rejected")) {
             assertFalse(MyData.getHousingUnitList().contains(housingUnitr));
          }
      } 
}

@Given("there is no housing advertisement request")
public void there_is_no_housing_advertisement_request() {
    // Write code here that turns the phrase above into concrete actions
	hasAdvertisementRequest=false;
}

@Then("the Admin cannot perform any action")
public void the_admin_cannot_perform_any_action() {
    // Write code here that turns the phrase above into concrete actions
    assertFalse(hasAdvertisementRequest);
}

}
