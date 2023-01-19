package librarypack;

import java.lang.String;

public class User{
	private String UserName;
	private static int UserNumber=0;
	private boolean reserved=false;
	private String rentalbook;
	
	User(String UN){
		UserName=UN;
		UserNumber++;
	}
	public void rent(String BookName) {
		rentalbook=BookName;
		reserved=true;
	}
	public String getrentalbook(){
		return rentalbook;
	}
	public void ret() {
		rentalbook=null;
		reserved=false;
	}
	public void setName(String UN) {
		UserName=UN;
	}
	public String getName() {
		return UserName;
	}
}