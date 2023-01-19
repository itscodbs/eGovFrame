package ch07.ex03.case09;

class A{
}

class B extends A{
}

class C{
}

class D extends C{
}

public class Cabinet <T extends A>{
	public T getLast(T[] list){
		return list[list.length-1];
	}
	
	public <S extends C> S getFinal(S[] list){
		return list[list.length-1];
	}
}