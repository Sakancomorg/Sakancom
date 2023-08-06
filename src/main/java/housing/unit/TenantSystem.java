package housing.unit;


public class TenantSystem {

	public static void viewAvailableHousing() {
		// TODO Auto-generated method stub
	HousingSystem.printData(MyData.getAvilableHousing());
	}


	public static void book() {
		// TODO Auto-generated method stub
		HousingUnit unit =HousingSystem.FindHouse(MyData.getAvilableHousing());
		int index=MyData.HousingUnitList.indexOf(unit);
		 MyData.HousingUnitList.get(index).setReservedFlag(true);
		MyData.addReservationsList(unit);
		System.out.println("The house is booked");
	}


	
	
	
	
}
