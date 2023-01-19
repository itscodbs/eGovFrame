package ch09.ex02.case01;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MyExecuter {
	public static void main(String[] args) {
		Runnable r1 = ()-> {
			for(int i = 0; i<10; i++) System.out.print(i + " ");
		};
		
		Runnable r2 = ()->{
			for(char c = 'a'; c<='z'; c++) System.out.print(c + " ");
		};
		
		Executor executor = Executors.newCachedThreadPool();
		executor.execute(r1);
		executor.execute(r2);
	}
}
