package housing.unit;

import java.util.ArrayList;
import java.util.List;

public class MyData {
	


	private boolean islog;
	private boolean passflag;
	private boolean eflag;
	

	
	public boolean isIslog() {
		return islog;
	}
	public void setIslog(boolean islog) {
		this.islog = islog;
	}
	public boolean isPassflag() {
		return passflag;
	}
	public void setPassflag(boolean passflag) {
		this.passflag = passflag;
	}
	public boolean isEflag() {
		return eflag;
	}
	public void setEflag(boolean eflag) {
		this.eflag = eflag;
	}
	public List<User> userinfo = new ArrayList<User>();
  static ArrayList <HousingUnit> housingunitlist=new ArrayList<HousingUnit>() ;
   static ArrayList <HousingUnit> advertisementlist=new ArrayList<HousingUnit>() ;
   static ArrayList <HousingUnit> reservationslist=new ArrayList<HousingUnit>() ;
  
   public static void setHousingUnitList(ArrayList<HousingUnit> housingUnitList) {
	   housingunitlist = housingUnitList;
}
public static void setAdvertisementList(ArrayList<HousingUnit> advertisementList) {
	advertisementlist = advertisementList;
}
public static void setReservationsList(ArrayList<HousingUnit> reservationsList) {
	reservationslist = reservationsList;
}


public static void addReservationsList(HousingUnit unit) {
	reservationslist.add(unit);
}


public static void addHousingUnitList(HousingUnit unit) {
	housingunitlist.add(unit);
}

public static void addAdvertisementList(HousingUnit unit) {
	advertisementlist.add(unit);
}


   public static ArrayList<HousingUnit> getHousingUnitList() {
	return housingunitlist;
	    
	
   }
   public static ArrayList<HousingUnit> AdvertisementList() {
	 
	   return advertisementlist;
	    
	
   }
	public void initarrayvalues() {
		 userinfo.add(new User("admin","samaa","samaa@gmail.com","4545",1));
	        userinfo.add(new User("tenant","malak","m@gmail.com","1234",1));
	        userinfo.add(new User("owner","nancy","N@gmail.com","4444",1));
	        userinfo.add(new User("admin","tala","tala@gmail.com","7676",1));
	} 
   
   public static ArrayList<HousingUnit> ReservationsList() {
	return reservationslist;
	    
	
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
