package ch07;

import static java.lang.System.out;
import java.sql.Date;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Mapper mapper = Configuration.getMapper(Mapper.class);
		
		out.println("[getUsers]");
		for(User user : mapper.getUsers()) out.println(user);
		
		out.println("[getUser]");
		out.println(mapper.getUser(1));
		
		out.println("[addUser] 처리건수 : " 
					+ mapper.addUser(new User(11,null,Date.valueOf("2015-12-02"))));
		out.println(mapper.getUser(11));
		
		out.println("[updateUser] 처리건수 : "
				+ mapper.updateUser(new User(11,"King",Date.valueOf("2015-01-02"))));
		out.println(mapper.getUser(11));
		
		out.println("[delUser] 처리건수 : " + mapper.delUser(11));
		out.println(mapper.getUser(11));		
	}
}


