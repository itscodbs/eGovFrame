package ch06;

import static java.lang.System.out;

import java.util.Arrays;

import config.Configuration;

public class Main {
	public static void main(String[] args) throws Exception{
		Mapper mapper = Configuration.getMapper(Mapper.class);
		Search search = new Search();
		
		out.println("[getUsers-1]");
		search.setUserIds(new int[]{1,2});
		out.println(mapper.getUsers(search));
		
		out.println("[getUsers-2]");
		search.setUserIds(null);
		search.setUserNames(Arrays.asList("john", "abel"));
		out.println(mapper.getUsers(search));
		
		out.println("[getUsers2]");
		out.println(mapper.getUsers2(new int[]{1,2}));
		
		out.println("[getUsers3]");
		out.println(mapper.getUsers3(Arrays.asList("john", "abel")));
	}
}

