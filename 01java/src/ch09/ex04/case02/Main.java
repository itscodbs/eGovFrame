package ch09.ex04.case02;

public class Main extends Thread{
	private Counter counter;
	
	public Main(Counter counter){
		this.counter = counter;
	}
	
	public void run(){
		for(int i=0; i<100; i++){
			counter.inc();
			counter.dec();
			if(i%1==0) counter.print();
			try{
				sleep((int)(Math.random()*2));
			}catch(InterruptedException e){}
		}
	}
	
	public static void main(String[] args) {
		Counter counter = new Counter();
		new Main(counter).start();
		new Main(counter).start();
		new Main(counter).start();
	}
}
