package housing.unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Sakancom.AdminClass;
import Sakancom.Apartments;
import Sakancom.LoginSteps;
import Sakancom.OwnerClass;
import Sakancom.TenantClass;

public class MyApp {
	static Apartments apartments=new Apartments();
   static ArrayList <HousingUnit> HousingUnitList=new ArrayList<HousingUnit>() ;
                   
   static ArrayList <HousingUnit> AdvertisementList=new ArrayList<HousingUnit>() ;
   public HousingUnit EnteredHouse =new HousingUnit( 1,"City Center","apartment_photo.jpg",1500.0, 4,2,"WiFi, Gym",true,apartments, null, false);               
  
   public static void setHousingUnitList(ArrayList<HousingUnit> housingUnitList) {
	HousingUnitList = housingUnitList;
}
public static void setAdvertisementList(ArrayList<HousingUnit> advertisementList) {
	AdvertisementList = advertisementList;
}
public static void setReservationsList(ArrayList<HousingUnit> reservationsList) {
	ReservationsList = reservationsList;
}



static ArrayList <HousingUnit> ReservationsList=new ArrayList<HousingUnit>() ;
   
   public static ArrayList<HousingUnit> getHousingUnitList() {
	   HousingUnitList.add(new HousingUnit( 1,"City Center","apartment_photo.jpg",1500.0, 4,2,"WiFi, Gym",true,apartments, null, false));               
	return HousingUnitList;
	    
	
   }
   public static ArrayList<HousingUnit> AdvertisementList() {
	   AdvertisementList.add(new HousingUnit( 1,"City Center","apartment_photo.jpg",1500.0, 4,2,"WiFi, Gym",true,apartments, null, false));               
	   AdvertisementList.add(new HousingUnit( 2,"Cy Center","apartment_photo.jpg",1500.0, 4,2,"WiFi, Gym",true,apartments, null, false));               

	   return AdvertisementList;
	    
	
   }
   
   
   public static ArrayList<HousingUnit> ReservationsList() {
	   ReservationsList.add(new HousingUnit( 1,"City Center","apartment_photo.jpg",1500.0, 4,2,"WiFi, Gym",true,apartments, null, false));               
	return ReservationsList;
	    
	
   }
public static List<HousingUnit> getAvilableHousing() {
	 List<HousingUnit> availableListings=new ArrayList<HousingUnit>();
	 for (HousingUnit house :  getHousingUnitList()) {
	        if (!house.isReserved()) {
	             availableListings.add(house);
	        }
	       
	    }
	   return availableListings;
	   

}
  
    
   
public static List<HousingUnit> filterByPrice(List<HousingUnit> availableListings, int minPrice, int maxPrice) {
	// TODO Auto-generated method stub
	 List<HousingUnit> filteredListings = new ArrayList<HousingUnit>();
        for (HousingUnit listing :getHousingUnitList() ) {
            if (listing.getRent() >= minPrice && listing.getRent() <= maxPrice) {
                filteredListings.add(listing);
            }
        }
        return filteredListings;
}
   
	
	
	
}
