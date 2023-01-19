package spring.core.ch02.ex01.stock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.core.ch02.ex01.stock.dao.StockDao;

@Service("stockService")
public class StockServiceImpl implements StockService{
	@Autowired private StockDao stockDao;
	
	public int getStockCnt(){
		return stockDao.getStockCnt();
	}
}
