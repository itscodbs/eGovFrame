
/* FINER, FINE, CONFIG, INFO, WARNIGN, SEVERE */
package ch08.ex06.case02;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {
	private final Logger logger = Logger.getLogger("ch07.ex06.case02");
	
	public void log(){
		logger.info("로깅시작");
		try{
			throw new Exception("고의적인 Exception");
		}catch(Exception e){
			logger.log(Level.SEVERE, e.getMessage());
		}
		logger.log(Level.INFO, "로깅 완료.");
	}
	
	public static void main (String[] args){
		new MyLogger().log();
	}
}
