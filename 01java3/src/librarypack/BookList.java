package librarypack;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class BookList{
	ArrayList<Book> BL=new ArrayList<Book>();
	String str,str2;
	int index=0;
	Scanner input=new Scanner(System.in);
	BookList(){
		BL.add(new Book("a"));
		BL.add(new Book("s"));
		BL.add(new Book("d"));
		BL.add(new Book("f"));
	}
	public void bookadd() {//책 추가
		System.out.println("추가할 책 제목을 입력하세요.");
		str=input.nextLine();
		BL.add(new Book(str));
		System.out.println(BL.size()+"번째 책 제목 : "+str+"이 추가되었습니다.");
	}
	public void bookdel() {//책 삭제
		bookprint();
		System.out.println("삭제할 책 제목을 입력하세요.");
		str=input.nextLine();
		for(Book temp:BL) {//책 제목과 같은 클래스 검색
			boolean eq=temp.getName().equals(str);
			if(temp.getrentaluser()!=null && eq) {//책이 대여중인 경우 삭제 불가
				System.out.println("대여중인 책은 삭제할 수 없습니다. 반납 먼저 해주세요.");
				return;
			}
			else if(eq) {//대여중이지 않은 책 제목을 찾았을 경우
				break;
			}
			index++;
		}
		 
		if(index!=BL.size()) {//size 안에 책을 찾은 경우
			BL.remove(index);
			System.out.println(index+1+"번째 책 제목 : "+str+"이 삭제되었습니다.");
		}
		else System.out.println("책 제목을 잘못입력하셨습니다.");//size 안에 책을 찾지 못한 경우
		index=0;
	}
	public void bookmodify() {//책 수정
		bookprint();
		System.out.println("수정하실 책 제목을 입력하세요.");
		str=input.nextLine();
		for(Book temp:BL) {//책 제목과 같은 클래스 검색
			boolean eq=temp.getName().equals(str);
			if(temp.getrentaluser()!=null && eq) {//책이 대여중인 경우 수정 불가
				System.out.println("대여중인 책은 수정하실 수 없습니다. 반납 먼저 해주세요.");
				return;
			}
			else if(eq) {//대여중이지 않은 책 제목을 찾았을 경우
				break;
			}
			index++;
		}
		 
		if(index!=BL.size()) {//size 안에 책을 찾은 경우
			System.out.println("무슨 제목으로 수정하시겠습니까?");
			str2=input.nextLine();
			Book temp=new Book(str2);
			BL.set(index, temp);
		}
		else System.out.println("수정하실 책 제목을 잘못입력하셨습니다.");//size 안에 책을 찾지 못한 경우
		index=0;
	}
	public void bookprint() {//책 목록 출력
		System.out.println("====전체 책 목록====");
		for(Book temp:BL) {
			String strtemp;
			String RentalUser=temp.getrentaluser();
			if(RentalUser!=null) {
				strtemp="	"+RentalUser+" 대여중";
			}
			else strtemp="	대여 가능";
			System.out.println(temp.getName()+strtemp);
		}
		System.out.println("================");
	}
	public int rentalsystem(String book, String user) {//책 대여

		for(Book temp:BL) {//책 제목과 같은 클래스 검색
			boolean eq=temp.getName().equals(book);
			if(temp.getrentaluser()!=null && eq) {//대여중인 책의 경우 대여 불가
				System.out.println("대여중인 책은 수정할 수 없습니다. 반납 먼저 해주세요.");
				return 1;
			}
			else if(eq){
				temp.rent(user);
				BL.set(index, temp);
				break;
			}
			index++;
		}
		 
		if(index==BL.size()) {//size 안에 책을 찾지 못한 경우
			System.out.println("요청하신 책이 목록에 존재하지 않습니다.");
		}
		index=0;
		return 0;
	}
	public void rentaling() {//책 대여 목록 출력
		System.out.println("====대여중인 책 목록====");
		for(Book temp:BL) {
			if(temp.getrentaluser()!=null) {
				System.out.println(temp.getName());
			}
			index++;
		}
		index=0;
		System.out.println("===================");
	}

	public String returnsystem(String book) {//책 반납
		String username = null;
		for(Book temp:BL) {//책 제목과 같은 클래스 검색
			if(temp.getName().equals(book)) {
				username=temp.getrentaluser();
				temp.ret();
				BL.set(index, temp);
				break;
			}
			index++;
		}

		if(index==BL.size()) {//size 안에 책을 못찾은 경우
			System.out.println("책 제목을 잘못입력하셨습니다.");
			index=0;
			return null;
		}
		else {
			index=0;
			return username;//해당책을 반납한 사용자 이름 리턴
		}
	}
}