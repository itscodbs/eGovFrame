package ch08.ex04.case01;

class LengthException extends Exception{
	public LengthException(String msg){
		super(msg);
	}
}

class MemberException extends RuntimeException{
	public MemberException(String msg){
		super(msg);
	}
}

public class MyRunTimeExeption {
	public static void main(String[] args) {
		String id = "hello";
		try{
			if(id.length()>3)
				throw new LengthException("길이 초과");
		}catch(LengthException e){
			e.printStackTrace();
		}
		
		throw new MemberException("회원 없음");
	}
}
