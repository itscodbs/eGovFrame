package ch05;

import static java.lang.System.out;
import config.Configuration;

public class Main {
   public static void main(String[] args) throws Exception {
      Mapper mapper = Configuration.getMapper(Mapper.class);
      
      Search search = new Search();
      search.setUserName("john");
      Post post = new Post();
      search.setPost(post);
      
      out.println("[getUsers]");
      post.setTitle("정의");
      post.setContent("");
      //isEmpty() : empty string("")이라도 있어야, NullPointException을 피한다.
      out.println(mapper.getUsers(search));
      
      out.println("[getUsers2]");
      post.setTitle(null);
      post.setContent("연결");
      out.println(mapper.getUsers2(search));
      
      out.println("[getUsers3]");
      post.setTitle(null);
      post.setContent("고리");
      out.println(mapper.getUsers3(search));
      
      out.println("[updateUser]");
      mapper.updateUser(new User(2, "abel", null));
      search.setUserName("abel");
      post.setTitle(null);
      post.setContent(null);
      out.println(mapper.getUsers3(search));
      
      out.println("[parameter]");
      out.println(mapper.getUser("john"));
   }
}