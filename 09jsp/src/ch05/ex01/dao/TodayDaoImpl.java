package ch05.ex01.dao;

import java.util.Date;

import ch05.ex01.config.Configuration;
import ch05.ex01.dao.mapper.TodayMapper;

public class TodayDaoImpl implements TodayDao {
	private TodayMapper todayMapper;
	
	public TodayDaoImpl(){
		this.todayMapper = Configuration.getMapper(TodayMapper.class);
	}
	
	public Date getCurrentDate(){
		return todayMapper.getCurrentDate();
	}
}
