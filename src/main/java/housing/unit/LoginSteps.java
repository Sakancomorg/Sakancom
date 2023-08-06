package housing.unit;
import java.util.Scanner;

public class LoginSteps {
	MyData L=new MyData();
	public boolean adminflag=false;
	public boolean tenantflag=false;
	public boolean ownerflag=false;
	private Scanner scanner;
<<<<<<< HEAD:src/main/java/housing/unit/LoginSteps.java
=======
	private String username;
	private String password;
	private String role;
	private String E;




>>>>>>> 7f7b7a8a035927cb4c78f067f5c90cb26b2a4afe:src/main/java/Sakancom/LoginSteps.java
	public LoginSteps (Scanner scanner){
        this.scanner = scanner;
	}
	
	    public void init() {
	    	L.initarrayvalues();
	        System.out.println("=== Login System ===");
	        boolean isLoggedIn = false;
	        while (!isLoggedIn) {
	            System.out.print("Enter username: ");
<<<<<<< HEAD:src/main/java/housing/unit/LoginSteps.java
	            String username = scanner.nextLine();
	            System.out.print("Enter password: ");
	            String password = scanner.nextLine();
=======
	             username = scanner.nextLine();

	            System.out.print("Enter password: ");
	             password = scanner.nextLine();

>>>>>>> 7f7b7a8a035927cb4c78f067f5c90cb26b2a4afe:src/main/java/Sakancom/LoginSteps.java
	            isLoggedIn = checkCredentials(username, password);
	            if (isLoggedIn) {
	                System.out.println("Login successful!");
	            } else {
	                System.out.println("Invalid username or password. Please try again.");
	            }
	        }

	    }

	    public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

	
		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}
		
		public boolean checkCredentials(String username, String password) {
	    	boolean nameflag=false;
	    	boolean pasflag=false;
	    	for(int i=0 ;i<L.userinfo.size();i++) {
	    		if(L.userinfo.get(i).name.equals(username)) {
	    			nameflag=true;
		    		if(L.userinfo.get(i).pa.equals(password)) {
		    			pasflag=true;
		    			if(L.userinfo.get(i).role.equals("admin")) {
		    				adminflag=true;
		    				role="admin";
		    				E=L.userinfo.get(i).emaill;
		    			}
		    			else if (L.userinfo.get(i).role.equals("owner")) {
		    				ownerflag=true;
		    				role="owner";
		    				E=L.userinfo.get(i).emaill;

		    			}
		    			else if (L.userinfo.get(i).role.equals("tenant")) {
		    				tenantflag=true;
		    				role="tenant";
		    				E=L.userinfo.get(i).emaill;

		    			}
		    			
		    			break;
		    		}

	    		}
	    	}
	    	
	    	return nameflag&&pasflag;
	    }

		public String getE() {
			return E;
		}

		public void setE(String e) {
			E = e;
		}

	
	


}
