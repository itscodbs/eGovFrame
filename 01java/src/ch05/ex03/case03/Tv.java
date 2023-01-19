package ch05.ex03.case03;

public class Tv {
	private String color;
	private boolean power;
	private int channel;
	
	public void power(){
		power = !power;
	}
	
	public void channelUp(){
		++channel;
	}
	
	public void channelDown(){
		--channel;
	}
	
	public int getChannel(){
		return channel;
	}

	public void setChannel(int channel){
		this.channel = channel;
	}
}