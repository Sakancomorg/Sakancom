package housing.unit;

import java.util.ArrayList;
import java.util.Scanner;

import Sakancom.AdminClass;
import Sakancom.Apartments;
import Sakancom.LoginSteps;
import Sakancom.OwnerClass;
import Sakancom.TenantClass;

public class MyApp {
	static Apartments apartments;
   static ArrayList <HousingUnit> HousingUnitList=new ArrayList<HousingUnit>() ;
                   
   public HousingUnit EnteredHouse =new HousingUnit( 1,"City Center","apartment_photo.jpg",1500.0, 4,2,"WiFi, Gym",true,apartments);               
  
   static ArrayList <HousingUnit> ReservationsList=new ArrayList<HousingUnit>() ;
   
   public static ArrayList<HousingUnit> getHousingUnitList() {
	   HousingUnitList.add(new HousingUnit( 1,"City Center","apartment_photo.jpg",1500.0, 4,2,"WiFi, Gym",true,apartments));               
	return HousingUnitList;
	    
	
   }
   public static ArrayList<HousingUnit> ReservationsList() {
	   ReservationsList.add(new HousingUnit( 1,"City Center","apartment_photo.jpg",1500.0, 4,2,"WiFi, Gym",true,apartments));               
	return ReservationsList;
	    
	
   }
  
    
   
   
   
	
	
	
}
