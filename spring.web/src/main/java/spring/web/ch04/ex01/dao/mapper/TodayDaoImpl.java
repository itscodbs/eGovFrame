package spring.web.ch04.ex01.dao.mapper;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TodayDaoImpl implements TodayDao {
	@Autowired private TodayMapper todayMapper;
	
	public Date getCurrentDate(){
		return todayMapper.getCurrentDate();
	}
}
