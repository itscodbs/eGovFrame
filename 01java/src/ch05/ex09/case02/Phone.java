package ch05.ex09.case02;

public class Phone {
	private static int count = 0;
	private int serialNo;
	
	{
		serialNo = ++count*100;
	}
	
	public Phone(){} // 모든 폰에 로직 적용
	
	public Phone(int serialNo){  // 해당 폰에 로직 적용
		this.serialNo = serialNo;
	}
	
	public int getSerialNo(){
		return serialNo;
	}
}
