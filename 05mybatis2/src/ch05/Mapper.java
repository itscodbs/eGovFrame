package ch05;

import java.util.List;

public interface Mapper {
   List<User> getUsers(Search search);
   List<User> getUsers2(Search search);
   List<User> getUsers3(Search search);
   int updateUser(User user);
   
   List<User> getUser(String userName);
}