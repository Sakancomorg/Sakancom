package housing.unit;

import java.util.Scanner;
import java.util.logging.Logger;

public class ModifyHouseUnit {
	private ModifyHouseUnit() {
		
	}
    private static final Logger logger = Logger.getLogger(ModifyHouseUnit.class.getName());

    private static HousingUnit housingUnitToModify;
    private static HousingUnit housingUnitToModifyAfter; 
    private static int index; 
    public static void modify() {
        logger.info("Enter the ID of the housing unit to modify: ");
        housingUnitToModify = HousingSystem.findHouse(MyData.getHousingUnitList());
        if (housingUnitToModify == null) {
		 logger.info("No housing unit found with the given ID.");
		return;
	}
	    
        index = MyData.housingunitlist.indexOf(housingUnitToModify);
        Scanner scanner = new Scanner(System.in);
       
        logger.info("Enter the new location: ");
        String newLocation = scanner.next();
        housingUnitToModify.getLocationInfo().setLocation(newLocation);

        logger.info("Enter the new photo: ");
        String newPhoto = scanner.next();
        housingUnitToModify.getLocationInfo().setPhoto(newPhoto);

        logger.info("Enter the new rent: ");
        double newRent = scanner.nextDouble();
        housingUnitToModify.getLocationInfo().setRent(newRent);

        logger.info("Enter the new number of floors: ");
        int newNumberOfFloors = scanner.nextInt();
        housingUnitToModify.setNumoffloors(newNumberOfFloors);

        logger.info("Enter the new available services: ");
        String newAvailableServices = scanner.next();
        
        logger.info("Is the residence for Students? (true/false):");
        boolean studentflag = scanner.nextBoolean();
        scanner.nextLine();
          housingUnitToModify.setStudentHouse(studentflag);
	
        housingUnitToModify.setAvailableServices(newAvailableServices);

        logger.info("Housing unit with ID " +housingUnitToModify.getLocationInfo().getId()  + " has been modified.");
    }

    public static void modifyAdmin() {
        HousingSystem.printData(MyData.getHousingUnitList());
        modify();
        if (housingUnitToModify == null) {
            logger.info("Not Found");
            return;
        }

        MyData.housingunitlist.set(index, housingUnitToModify);
        housingUnitToModifyAfter = MyData.housingunitlist.get(index);
    }
    public static HousingUnit getHousingUnitToModify() {
        return housingUnitToModify;
    }

    public static HousingUnit getHousingUnitToModifyAfter() {
        return housingUnitToModifyAfter;
    }

    public static int getIndex() {
        return index;
    }
}
