package librarypack;

import java.lang.String;

public class Book{
	private String BookName;
	private static int BookNumber=0;
	private boolean reserved=false;
	private String rentaluser;
	
	Book(String BN){
		BookName=BN;
		BookNumber++;
	}
	public void rent(String UserName) {
		rentaluser=UserName;
		reserved=true;
	}
	public String getrentaluser() {
		return rentaluser;
	}
	public void ret() {
		rentaluser=null;
		reserved=false;
	}
	public void setName(String BN) {
		BookName=BN;
	}
	public String getName() {
		return BookName;
	}
}