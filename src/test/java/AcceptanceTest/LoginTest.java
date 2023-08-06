package AcceptanceTest;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


import housing.unit.MyData;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
<<<<<<< HEAD:src/test/java/AcceptanceTest/LoginTest.java
	public MyData L=new MyData();	
=======
	public boolean adminflag;
	public boolean ownerflag;
	public boolean tenantflag;
	public Log L=new Log();	
>>>>>>> 7f7b7a8a035927cb4c78f067f5c90cb26b2a4afe:src/test/java/Sakancom/LoginTest.java
@Given("{string} status log is {int}")
public void status_log_is(String string, Integer S) {
	L.initarrayvalues();
	    for (int i = 0; i < L.userinfo.size(); i++) {
		if(S==0) {
			L.islog=false;
		}
		else {
			L.islog=true;

	        if(L.userinfo.get(i).role.equals("admin")) {
	             adminflag=true;
	        }
	        else if(L.userinfo.get(i).role.equals("owner")) {
	        	ownerflag=true;
	        }
	        else if(L.userinfo.get(i).role.equals("tenant")) {
	        	tenantflag=true;
	        }
		}
	        
	}
}

@Given("the password is {string}")
public void the_password_is(String pass) {
	L.initarrayvalues();

    for (int i = 0; i < L.userinfo.size(); i++) {
		if(L.userinfo.get(i).pa.equals(pass)) {
			   L.passflag=true;
		}
		else {
			   L.passflag=false;

		}
		if(L.passflag==true) {
			break;
		}
		}
}

@Given("the email is {string}")
public void the_email_is(String E) {
	L.initarrayvalues();

	for (int i = 0; i < L.userinfo.size(); i++) {
		if(L.userinfo.get(i).emaill.equals(E)) {
			   L.eflag=true;
		}
		else {
			   L.eflag=false;

		}
		if(L.eflag==true) {
			break;
		}
		}
}

@Given("status_log is equal {int}")
public void status_log_is_equal(Integer state) {
	L.initarrayvalues();

	 if(L.eflag==true && L.passflag==true) {
	    	state=1; 
	    	L.islog=true;
	    }
	    else {
	    	state=0;
	    	L.islog=false;

	    }
}

@When("press the login button")
public void press_the_login_button() {
	L.initarrayvalues();

	 if(L.eflag==true && L.passflag==true) {
	    	L.islog=true;
	    }
	    else {
	    	L.islog=false;

	    }
}

@Then("login success")
public void login_success() {
	L.initarrayvalues();

	assertTrue(L.eflag==true && L.passflag==true);
    if(!(L.eflag==true && L.passflag==true)) {
	   fail("login failed");

    }
}

}
