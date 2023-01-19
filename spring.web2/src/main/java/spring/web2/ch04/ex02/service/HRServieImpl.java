package spring.web2.ch04.ex02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.web2.ch04.ex02.dao.HRDao;
import spring.web2.ch04.ex02.domain.Employee;

@Service
public class HRServieImpl implements HRService {
	@Autowired private HRDao hrDao;
	
	public Employee viewEmpCnt(){
		return hrDao.getEmpCnt();
	}
}
