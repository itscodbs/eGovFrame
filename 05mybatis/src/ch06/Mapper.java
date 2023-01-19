package ch06;

import java.util.List;

public interface Mapper {
	List<User> getUsers(Search search);
	List<User> getUsers2(int[] ids);
	List<User> getUsers3(List<String> names);
}
