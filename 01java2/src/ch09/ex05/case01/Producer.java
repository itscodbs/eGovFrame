package ch09.ex05.case01;

public class Producer implements Runnable{
	private String name;
	private Buffer buffer;
	
	public Producer(String name, Buffer buffer){
		this.name = name;
		this.buffer = buffer;
	}
	
	public void run(){
		for(int i=0; i<5; i++){
			buffer.put(i);
			System.out.println(name + " : " + i + "생성.");
			try{
				Thread.sleep((int)(Math.random()*100));
			}catch(InterruptedException e){}
		}
	}
}