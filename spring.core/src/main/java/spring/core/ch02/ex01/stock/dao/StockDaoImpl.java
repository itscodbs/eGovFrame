package spring.core.ch02.ex01.stock.dao;

import org.springframework.stereotype.Repository;

@Repository
public class StockDaoImpl implements StockDao{
	public int getStockCnt(){
		return 3/0;
	}
}
