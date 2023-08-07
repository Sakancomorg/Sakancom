package housing.unit;

import java.util.List;

public class HouseExist {
	private HouseExist() {
    }

	public static boolean cheack(HousingUnit enteredhouse,List<HousingUnit> housingunitlist) {
		for (HousingUnit house : housingunitlist) {
		     if(house.equals(enteredhouse))
		    	return true;
     }
		
		return false;
	}

}
