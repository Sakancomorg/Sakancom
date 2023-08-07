package housing.unit;

import java.util.ArrayList;

public class HouseExist {

    private HouseExist() {
    }

    public static boolean check(HousingUnit enteredHouse, ArrayList<HousingUnit> housingUnitList) {
        for (HousingUnit house : housingUnitList) {
            if (house.equals(enteredHouse)) {
                return true;
            }
        }
        return false;
    }
}
