package housing.unit;

import java.util.ArrayList;

public class HouseExist {
	private HouseExist() {
    }

	public static boolean cheack(HousingUnit enteredhouse, ArrayList<HousingUnit> HousingUnitList) {
		for (HousingUnit house : HousingUnitList) {
		     if(house.equals(enteredhouse))
		    	return true;
     }
		
		return false;
	}

}
