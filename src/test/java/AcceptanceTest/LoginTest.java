package AcceptanceTest;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


import housing.unit.MyData;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	public MyData L=new MyData();
	boolean islog=false;
	boolean passflag=false;
	boolean eflag=false;

	
@Given("{string} status log is {int}")
public void status_log_is(String string, Integer S) {
	L.initarrayvalues();
	    for (int i = 0; i < L.userinfo.size(); i++) {
		if(S==0) {
			islog=false;
		}
		else {
			islog=true;
		}
		
	}
}

@Given("the password is {string}")
public void the_password_is(String pass) {
	L.initarrayvalues();

    for (int i = 0; i < L.userinfo.size(); i++) {
		if(L.userinfo.get(i).getPa().equals(pass)) {
			   passflag=true;
		}
		else {
			   passflag=false;

		}
		if(passflag==true) {
			break;
		}
		}
}

@Given("the email is {string}")
public void the_email_is(String E) {
	L.initarrayvalues();

	for (int i = 0; i < L.userinfo.size(); i++) {
		if(L.userinfo.get(i).getEmaill().equals(E)) {
			   eflag=true;
		}
		else {
			   eflag=false;

		}
		if(eflag==true) {
			break;
		}
		}
}

@Given("status_log is equal {int}")
public void status_log_is_equal(Integer state) {
	L.initarrayvalues();

	 if(eflag==true && passflag==true) {
	    	state=1; 
	    	islog=true;
	    }
	    else {
	    	state=0;
	    	islog=false;

	    }
}

@When("press the login button")
public void press_the_login_button() {
	L.initarrayvalues();

	 if(eflag==true && passflag==true) {
	    	islog=true;
	    }
	    else {
	    	islog=false;

	    }
}

@Then("login success")
public void login_success() {
	L.initarrayvalues();

	assertTrue(eflag==true && passflag==true);
    if(!(eflag==true && passflag==true)) {
	   fail("login failed");

    }
}

}
