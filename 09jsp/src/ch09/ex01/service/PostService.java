package ch09.ex01.service;

import java.util.List;

import ch09.ex01.domain.Page;
import ch09.ex01.domain.Post;

public interface PostService {
	List<Post> listPosts(Page page);
}
