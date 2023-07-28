package housing.unit;

import java.util.Scanner;

public class ModifyHouseUnit {
	 public static HousingUnit  housingUnitToModify;
	 public static HousingUnit  housingUnitToModifyAfter;
	 static int index;
	public static void modify()
	{
		 
		 housingUnitToModify = HousingUnit.findHousingUnitById();
		 index=MyApp.HousingUnitList.indexOf(housingUnitToModify);
		 Scanner scanner = new Scanner(System.in);
	        if (housingUnitToModify == null) {
	            System.out.println("No housing unit found with the given ID.");
	            return ;
	        }

	        System.out.println("Enter the new location: ");
	 
			String newLocation = scanner.next();
	        housingUnitToModify.setLocation(newLocation);

	        System.out.println("Enter the new photo: ");
	        String newPhoto = scanner.next();
	        housingUnitToModify.setPhoto(newPhoto);

	        System.out.println("Enter the new rent: ");
	        double newRent = scanner.nextDouble();
	        housingUnitToModify.setRent(newRent);

	        System.out.println("Enter the new number of tenants: ");
	        int newNumberOfTenants = scanner.nextInt();
	        housingUnitToModify.setNumberOfTenants(newNumberOfTenants);

	        System.out.println("Enter the new number of floors: ");
	        int newNumberOfFloors = scanner.nextInt();
	        housingUnitToModify.setNumberOfFloors(newNumberOfFloors);

	        System.out.println("Enter the new available services: ");
	        String newAvailableServices = scanner.next();
	        housingUnitToModify.setAvailableServices(newAvailableServices);

	        System.out.println("Housing unit with ID " + housingUnitToModify.getId() + " has been modified.");
	        

	        
	        
	}
	
	
	
	public static void  modifyAdmin() {
		 modify();
		 MyApp.HousingUnitList.set(index,housingUnitToModify);
		 housingUnitToModifyAfter=MyApp.HousingUnitList.get(index);
	}
	
	
	
	
}
