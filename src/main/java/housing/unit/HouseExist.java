package housing.unit;

import java.util.ArrayList;

public class HouseExist {

	public static boolean cheack(HousingUnit enteredhouse, ArrayList<HousingUnit> HousingUnitList) {
		// TODO Auto-generated method stub
		for (HousingUnit house : HousingUnitList) {
		     if(house.equals(enteredhouse))
		    	return true;
     }
		
		return false;
	}

}
