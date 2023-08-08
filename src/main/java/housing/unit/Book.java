
package housing.unit;

import java.sql.Time;

public class Book {
	private double rent;
	private Time time;
	private String ownername;
	private int number;
	private String email;
	public Book(double rent,Time time,String ownername,int number,String email){
		this.rent=rent;
		this.time=time;
		this.ownername=ownername;
		this.number=number;
		this.email=email;
	}
	public double getRent() {
		return rent;
	}
	
	public Time getTime() {
		return time;
	}
	
	public String getOwnername() {
		return ownername;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getEmail() {
		return email;
	}
	

}
