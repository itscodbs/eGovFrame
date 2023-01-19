package ch06.ex04.case04;

public class Phone {
	private String modelName;

	public Phone(String modelName){
		this.modelName = modelName;
	}

	public boolean equals(Object obj){
		if(obj instanceof Phone)
			return modelName.equals(((Phone)obj).modelName);
		else
			return false;
	}	// Object타입의 modelName은 안보임. Phone 타입으로 캐스팅. (해당 클래스로)
}
