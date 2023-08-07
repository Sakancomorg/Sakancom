package housing.unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HousingSystem {
	
	static Scanner scanner = new Scanner(System.in);
	static ArrayList <HousingUnit> AdvertisementList=MyData.AdvertisementList();
	static ArrayList <HousingUnit> HousingUnitList=MyData.getHousingUnitList() ;
    public static void printData(List<HousingUnit> list) {
    	for( HousingUnit house: list) {
     	   System.out.println(house.toString());
        }
    	
    }
    public static void viewReservations() {
    	
    	printData(MyData.ReservationsList());
    	if(MyData.ReservationsList().isEmpty()) {
			System.out.println("No Reservations");
			return;}
    }

 
    public static void modifyHousingData() {
    	ModifyHouseUnit.modifyAdmin();
    	           }

    public void exit() {
        System.out.println("Exiting the Housing System. Goodbye!");
    }
	
    public static HousingUnit addUnit() {
    	Scanner scanner = new Scanner(System.in);
    	    System.out.println("Enter the id:");
            int iD = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter the location:");
            String location = scanner.nextLine();

            System.out.println("Enter the photo:");
            String photo = scanner.nextLine();

            System.out.println("Enter the rent:");
            double rent = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Enter the number of floors:");
            int numberOfFloors = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter available services:");
            String availableServices = scanner.nextLine();

            System.out.println("Is the residence for Students? (true/false):");
            boolean Studentflag = scanner.nextBoolean();
            scanner.nextLine();
         

            Apartments A=new Apartments();
       
            HousingUnit house = new HousingUnit.Builder(location, iD)
                    .setPhoto(photo)
                    .setRent(rent)
                    .setNumberOfTenants(0)
                    .setNumberOfFloors(numberOfFloors)
                    .setAvailableServices(availableServices)
                    .setReservedFlag(false)
                    .setApartments(A)
                    .setStudentHouse(Studentflag)
                    .build();
            
         MyData.addHousingUnitList(house);
            System.out.println("The unit is added");
            return house;
           
    	}

	public static void viewAdvertisementRequest() {
		
		HousingSystem.printData(AdvertisementList);
		if(AdvertisementList.isEmpty()) {
			System.out.println("No new Advertisement requsts");
			return;}
		System.out.println("1.Accept a housing advertisement");
        System.out.println("2.Reject a housing advertisement");
        int desicion=Integer.parseInt(scanner.next());
        System.out.println("Enter the ID");
        if(desicion==1)
        	acceptAdvertisementRequest();
        else if(desicion==2)
        	acceptAdvertisementRequest();
        else return;
	}

	static HousingUnit FindHouse(List<HousingUnit> list) {
		  int  id=Integer.parseInt(scanner.next()); // Consume the newline character
		  HousingUnit houseR = null;
		  for(HousingUnit house:list) {
				if(house.getId()==id) {
					
					houseR=house;
				}
			}
			return houseR;
			
	}
	public static HousingUnit acceptAdvertisementRequest() {
		  HousingUnit houseR = FindHouse( AdvertisementList);
		  AdvertisementList.remove(houseR);
			HousingUnitList.add(houseR);
		  MyData.setHousingUnitList(HousingUnitList);
		  System.out.println("Advertisement Accepted");
		return houseR;
	}

	public static HousingUnit rejectAdvertisementRequest() {
		 HousingUnit houseR = FindHouse( AdvertisementList);
		  AdvertisementList.remove(houseR);
		  System.out.println("Advertisement Rejected");
		return houseR;
	}

    
    
    
}
