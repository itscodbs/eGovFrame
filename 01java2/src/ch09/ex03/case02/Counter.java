package ch09.ex03.case02;

public class Counter implements Runnable {
	public void run(){
		System.out.println(Thread.currentThread().getName() + " : start." );
		
		for(int i=0; i<5; i++){
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try{
				System.out.println(Thread.currentThread().getName() + " : sleep.");
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println(Thread.currentThread().getName() + " : interrupted.");
			}
		}
		
		System.out.println(Thread.currentThread().getName() + " : end.");
	}
}
