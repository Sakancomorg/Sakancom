package housing.unit;

public class User {
	private String name;
	private String emaill;
	private String pa;
	String role;
	private int s;

	User(String role,String name ,String emaill , String pa,int s){
		this.name=name;
		this.emaill=emaill;
		this.pa=pa;
		this.s=s;
		this.role=role;
	}

	public String getName() {
		return name;
	}

	public String getEmaill() {
		return emaill;
	}

	public String getPa() {
		return pa;
	}

	
	public String getRole() {
		return role;
	}

	public int getS() {
		return s;
	}

}
