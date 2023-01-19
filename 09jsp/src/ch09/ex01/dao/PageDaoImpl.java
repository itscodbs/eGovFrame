package ch09.ex01.dao;

import ch09.ex01.config.Configuration;
import ch09.ex01.dao.mapper.PageMapper;

public class PageDaoImpl implements PageDao{
	private PageMapper pageMapper;
	
	public PageDaoImpl(){
		this.pageMapper = Configuration.getMapper(PageMapper.class);
	}
	
	public int getTotRowCnt(){
		return pageMapper.getTotRowCnt();
	}
}
