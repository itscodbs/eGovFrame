package ch09.ex01.service;

import java.util.List;

import ch09.ex01.dao.PostDao;
import ch09.ex01.dao.PostDaoImpl;
import ch09.ex01.domain.Page;
import ch09.ex01.domain.Post;

public class PostServiceImpl implements PostService{
	private PostDao postDao;
	
	public PostServiceImpl(){
		this.postDao = new PostDaoImpl();
	}
	
	public List<Post> listPosts(Page page){
		return postDao.getPosts(page);
	}

}
