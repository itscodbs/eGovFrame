package ch09.ex05.case02;

public class Buffer {
	private Integer data;
	
	public synchronized int get(){
		while(data==null){
			try{
				wait();
			}catch(InterruptedException e){}
		}
		
		int data = this.data;
		this.data = null;
		
		notifyAll();
		return data;
	}
	
	public synchronized void put(Integer data){
		while(this.data != null){
			try{
				wait();
			}catch(InterruptedException e){}
		}
		
		this.data = data;
		notifyAll();
	}
}
