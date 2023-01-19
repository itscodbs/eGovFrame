package ch07.ex03.case07;

public class Bowl<T> {
	private T val;
	
	public void setVal(T val){
		this.val = val;
	}
	
	public T getVal(){
		return val;
	}
}
