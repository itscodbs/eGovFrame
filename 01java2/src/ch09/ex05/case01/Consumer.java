package ch09.ex05.case01;

public class Consumer implements Runnable {
	private String name;
	private Buffer buffer;
	
	public Consumer(String name, Buffer buffer){
		this.name = name;
		this.buffer = buffer;
	}
	
	public void run(){
		for(int i=0; i<5; i++){
			int data = buffer.get();
			System.out.println(name + " : " + data + "취득.");
			try{
				Thread.sleep((int)(Math.random()*100));
			}catch(InterruptedException e){}
		}
	}
} 
