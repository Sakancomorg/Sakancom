package housing.unit;

import java.util.Scanner;

public class HousingSystem {
	
	public void viewAdvertisementRequests() {
        // Implement logic for viewing advertisement requests
    }

    public void acceptAdvertisement() {
        // Implement logic for accepting advertisement
    }

    public void rejectAdvertisement() {
        // Implement logic for rejecting advertisement
    }

    public static void viewReservations() {
       for( HousingUnit house: MyApp.ReservationsList()) {
    	   System.out.println(house.toString());
       }
    }

    public void addAndAdvertiseHousingUnit() {
        // Implement logic for adding and advertising a housing unit
    }

    public static void modifyHousingData() {
    	ModifyHouseUnit.modifyAdmin();
    	           }

    public void exit() {
        System.out.println("Exiting the Housing System. Goodbye!");
    }
	
  

}
