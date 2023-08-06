package housing.unit;

import java.util.Scanner;

public class ModifyHouseUnit {
	 public static HousingUnit  housingUnitToModify;
	 public static HousingUnit  housingUnitToModifyAfter;
	 static int index;
	public static void modify()
	{
		  System.out.println("Enter the ID of the housing unit to modify: ");
		 housingUnitToModify = HousingUnit.FindHouse(MyData.getHousingUnitList());
		 if(housingUnitToModify==null) return;
		 index=MyData.HousingUnitList.indexOf(housingUnitToModify);
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


	        System.out.println("Enter the new number of floors: ");
	        int newNumberOfFloors = scanner.nextInt();
	        housingUnitToModify.setNumberOfFloors(newNumberOfFloors);

	        System.out.println("Enter the new available services: ");
	        String newAvailableServices = scanner.next();
	        
	        System.out.println("Is the residence for Students? (true/false):");
            boolean Studentflag = scanner.nextBoolean();
            scanner.nextLine();
         
	        housingUnitToModify.setAvailableServices(newAvailableServices);
	        

	        System.out.println("Housing unit with ID " + housingUnitToModify.getId() + " has been modified.");
	        

	        
	        
	}
	
	
	
	public static void  modifyAdmin() {
		 HousingSystem.printData(MyData.getHousingUnitList());
		 modify();
		 if(housingUnitToModify==null) {
			  System.out.println("Not Found");
			  return;

		 }
			 
		 MyData.HousingUnitList.set(index,housingUnitToModify);
		 housingUnitToModifyAfter=MyData.HousingUnitList.get(index);}
	
	
	
	
	
}
