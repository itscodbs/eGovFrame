package ch05.ex09.case02;

public class Phone {
	private static int count = 0;
	private int serialNo;
	
	{
		serialNo = ++count*100;
	}
	
	public Phone(){}
	
	public Phone(int serialNo){
		this.serialNo = serialNo;
	}
	
	public int getSerialNo(){
		return serialNo;
	}
}
