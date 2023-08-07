package housing.unit;

import java.util.ArrayList;
import java.util.List;

public class HouseExist {
	private HouseExist() {
    }

	public static boolean cheack(HousingUnit enteredhouse,List<HousingUnit> HousingUnitList) {
		for (HousingUnit house : HousingUnitList) {
		     if(house.equals(enteredhouse))
		    	return true;
     }
		
		return false;
	}

}
