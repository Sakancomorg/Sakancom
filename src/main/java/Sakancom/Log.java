package Sakancom;

import java.util.ArrayList;

public class Log {
	ArrayList<User> userinfo = new ArrayList<User>();


	public boolean islog;
	public boolean passflag;
	public boolean eflag;
	
	void initarrayvalues() {
        userinfo.add(new User("admin","samaa","samaa@gmail.com","4545",1));
        userinfo.add(new User("tenant","malak","m@gmail.com","1234",1));
        userinfo.add(new User("owner","nancy","N@gmail.com","4444",1));
        userinfo.add(new User("admin","tala","tala@gmail.com","7676",1));


	} 


}
