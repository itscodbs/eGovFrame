package ch09.ex01.case02;

public class CounterRamda {
	public static void main(String[] args) {
		Thread thread1 = new Thread(()-> {
			for(int i=0; i<10; i++) System.out.print(i + " ");
		});
		
		Thread thread2 = new Thread(()-> {
			for(char c = 'a'; c<='z'; c++) System.out.print(c + " ");
		});
		
		thread1.start();
		thread2.start();
	}
}
