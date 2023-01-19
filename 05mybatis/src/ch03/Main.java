package ch03;

import config.Configuration;
import static java.lang.System.out;

public class Main {
	public static void main(String[] args) throws Exception{
		Mapper mapper = Configuration.getMapper(Mapper.class);
		
		out.println("[getUsers]");
		out.println(mapper.getUsers());
		
		out.println("[getUsers2]");
		out.println(mapper.getUsers2());
	}
}
