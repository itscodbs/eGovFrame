package ch09.ex01.dao;

import java.util.List;

import ch09.ex01.domain.Page;
import ch09.ex01.domain.Post;

public interface PostDao {
	List<Post> getPosts(Page page);
}
