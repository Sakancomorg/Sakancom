package AcceptanceTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import housing.unit.HousingUnit;
import housing.unit.MyData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AvailableHousingTesting {

	  private int availability;
	    private int studentHousingAvailability;
	    private String actualResult;

@Given("there are {int} housing listings")
public void there_are_housing_listings(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
	this.availability = int1;
	
}

@Given("there are {int} student housing listings")
public void there_are_student_housing_listings(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
	 this.studentHousingAvailability = int1;
	  actualResult = (availability > 0) ? "see a list of housing" : "see a message indicating no housing listings";
	    if (studentHousingAvailability > 0) {
	        actualResult += " for students";
	    }
}
  

@Then("I should see {string}")
public void i_should_see(String string) {
    // Write code here that turns the phrase above into concrete actions
	  assertEquals(string, actualResult);
}


}
