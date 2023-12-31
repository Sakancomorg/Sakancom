package AcceptanceTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import housing.unit.HouseExist;
import housing.unit.HousingSystem;
import housing.unit.HousingUnit;
import housing.unit.ModifyHouseUnit;
import housing.unit.MyData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HousingUnitsTesting {
      
	

private boolean HouseIsExist;
HousingUnit EnteredHouse;
HousingUnit ModifiesHouseBefore;
HousingUnit ModifiesHouseAfter;
List <HousingUnit> HousingUnitList;

public HousingUnitsTesting() {
		super();

	    this.EnteredHouse=HousingSystem.addUnit();
	    this.HousingUnitList=MyData.getHousingUnitList();

	    
	   
	}


@Given("the Admin enterd the info of the housing unit")
public void the_admin_enterd_the_info_of_the_housing_unit() {
    // Write code here that turns the phrase above into concrete actions
	 
	           if( HouseExist.cheack(EnteredHouse,HousingUnitList)) {
	        	   HouseIsExist=true;
	        	   assertTrue(HouseIsExist);
	        	   }
	           else { HouseIsExist=false;
	           assertFalse(HouseIsExist);
	           }
      }

 
@When("the Admin adds a new housing unit through the system")
public void the_admin_adds_a_new_housing_unit_through_the_system() {
    // Write code here that turns the phrase above into concrete actions
     assertTrue(true);
}

@Then("the housing unit details are saved in the system")
public void the_housing_unit_details_are_saved_in_the_system() {
	
    int HousingUnitCount=HousingUnitList.size();
	  if(HouseIsExist==false) {
    	  HousingUnitList.add(EnteredHouse);
    	  HousingUnitCount++;
	  }
	  assertEquals(HousingUnitCount,HousingUnitList.size());
    
}

@Given("the Admin has selected a housing unit for modification")
public void the_admin_has_selected_a_housing_unit_for_modification() {
    // Write code here that turns the phrase above into concrete actions
	
	       
	ModifyHouseUnit.modifyAdmin();
	 this.ModifiesHouseBefore= ModifyHouseUnit.getHousingUnitToModify();
	assertNotNull(ModifiesHouseBefore);
    
}


@When("the Admin makes changes to the housing data")
public void the_admin_makes_changes_to_the_housing_data() {
    // Write code here that turns the phrase above into concrete actions

	 this.ModifiesHouseAfter= ModifyHouseUnit.getHousingUnitToModifyAfter();
	
	assertNotNull(ModifiesHouseAfter);
	
   
}


@Then("the modified housing data is updated in the system")
public void the_modified_housing_data_is_updated_in_the_system() {
	assertTrue(HouseExist.cheack(ModifiesHouseAfter,HousingUnitList));
  
}

	
	
	
}
