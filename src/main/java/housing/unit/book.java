<<<<<<< HEAD:src/main/java/housing/unit/book.java
package housing.unit;
=======
package Sakancom;
>>>>>>> 7f7b7a8a035927cb4c78f067f5c90cb26b2a4afe:src/main/java/Sakancom/book.java

import java.sql.Time;

public class book {
	private double rent;
	private Time time;
	private String ownername;
	private int number;
	private String email;
	book(double rent,Time time,String ownername,int number,String email){
		this.rent=rent;
		this.time=time;
		this.ownername=ownername;
		this.number=number;
		this.email=email;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
