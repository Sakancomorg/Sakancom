package housing.unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyData {
	


	public boolean islog;
	public boolean passflag;
	public boolean eflag;
	

	
	public ArrayList<User> userinfo = new ArrayList<User>();
  static ArrayList <HousingUnit> HousingUnitList=new ArrayList<HousingUnit>() ;
   static ArrayList <HousingUnit> AdvertisementList=new ArrayList<HousingUnit>() ;
   static ArrayList <HousingUnit> ReservationsList=new ArrayList<HousingUnit>() ;
  
   public static void setHousingUnitList(ArrayList<HousingUnit> housingUnitList) {
	HousingUnitList = housingUnitList;
}
public static void setAdvertisementList(ArrayList<HousingUnit> advertisementList) {
	AdvertisementList = advertisementList;
}
public static void setReservationsList(ArrayList<HousingUnit> reservationsList) {
	ReservationsList = reservationsList;
}


public static void addReservationsList(HousingUnit unit) {
	ReservationsList.add(unit);
}


public static void addHousingUnitList(HousingUnit unit) {
	HousingUnitList.add(unit);
}

public static void addAdvertisementList(HousingUnit unit) {
	AdvertisementList.add(unit);
}


   public static ArrayList<HousingUnit> getHousingUnitList() {
	return HousingUnitList;
	    
	
   }
   public static ArrayList<HousingUnit> AdvertisementList() {
	 
	   return AdvertisementList;
	    
	
   }
	public void initarrayvalues() {
        userinfo.add(new User("admin","samaa","samaa@gmail.com","4545",1));
        userinfo.add(new User("tenant","malak","m@gmail.com","1234",1));
        userinfo.add(new User("owner","nancy","N@gmail.com","4444",1));
        userinfo.add(new User("admin","tala","tala@gmail.com","7676",1));
	} 
   
   public static ArrayList<HousingUnit> ReservationsList() {
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
  
    
  
	
}
