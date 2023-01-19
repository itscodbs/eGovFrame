package ch10.ex02;

public class User {
	private String userName;
	private Level level;
	
	public User(String userName, Level level){
		this.userName = userName;
		this.level = level;
	}
	
	public void upgradeLevel(){
		Level nextLevel = level.nextLevel();
		if(nextLevel == null){
			throw new IllegalStateException("이미 최고 등급" + this.level + "입니다.");
		}else{
			this.level = nextLevel;
		}
	}
	
	public String toString(){
		return String.format("%s : %s", userName, level);
	}
}
