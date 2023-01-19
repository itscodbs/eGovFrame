package ch09.ex01.dao.mapper;

import java.util.List;

import ch09.ex01.domain.Page;
import ch09.ex01.domain.Post;

public interface PostMapper {
	List<Post> getPosts(Page page);
}
