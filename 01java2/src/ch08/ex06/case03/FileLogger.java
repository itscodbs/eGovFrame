package ch08.ex06.case03;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class FileLogger {
	private final Logger logger = Logger.getLogger(FileLogger.class.getName());
	
	public void log() throws Exception{
		Handler handler = new FileHandler("c:/DEV/ch08.ex06.case03.xml");
		logger.addHandler(handler);
		
		logger.info("로깅 시작.");
		logger.severe("심각 레벨");
		logger.info("로깅 종료.");
		
		handler.flush();
		handler.close();
	}
	
	public static void main(String[] args) throws Exception{
		new FileLogger().log();		
	}
}
