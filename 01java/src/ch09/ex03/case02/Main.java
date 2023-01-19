package ch09.ex03.case02;

public class Main { // 180504
	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread().getName() + " : start");
		
		Thread counter = new Thread(new Counter());
		counter.start();
		
		int tries = 0;
		while(counter.isAlive()){
			tries++;
			counter.join(1000);
			System.out.println(Thread.currentThread().getName() + " : wait." + tries);
			
			if(tries>2){
				System.out.println(Thread.currentThread().getName() + " : irritated.");
				counter.interrupt();
				counter.join();
			}
		}
		System.out.println(Thread.currentThread().getName() + " : end.");
	}
}
