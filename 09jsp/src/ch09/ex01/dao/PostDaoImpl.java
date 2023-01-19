package ch09.ex01.dao;

import java.util.List;

import ch09.ex01.config.Configuration;
import ch09.ex01.dao.mapper.PostMapper;
import ch09.ex01.domain.Page;
import ch09.ex01.domain.Post;

public class PostDaoImpl implements PostDao {
	private PostMapper postMapper;
	
	public PostDaoImpl(){
		this.postMapper = Configuration.getMapper(PostMapper.class);
	}
	
	public List<Post> getPosts(Page page){
		return postMapper.getPosts(page);
	}
}
