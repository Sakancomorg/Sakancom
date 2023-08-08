package housing.unit;

import java.util.logging.Logger;

public class TenantSystem {
	private TenantSystem() {
		
	}
	
    private static final Logger logger = Logger.getLogger(TenantSystem.class.getName());

	public static void viewAvailableHousing() {
	HousingSystem.printData(MyData.getAvilableHousing());
	}


	public static void book() {
		HousingUnit unit =HousingSystem.findHouse(MyData.getAvilableHousing());
		int index=MyData.housingunitlist.indexOf(unit);
		 MyData.housingunitlist.get(index).setReservedFlag(true);
		MyData.addReservationsList(unit);
		logger.info("The house is booked");
	}


	
	
	
	
}
