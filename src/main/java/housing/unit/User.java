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

	public void setName(String name) {
		this.name = name;
	}

	public String getEmaill() {
		return emaill;
	}

	public void setEmaill(String emaill) {
		this.emaill = emaill;
	}

	public String getPa() {
		return pa;
	}

	public void setPa(String pa) {
		this.pa = pa;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

}
