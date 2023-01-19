package librarypack;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class UserList{
	ArrayList<User> UL=new ArrayList<User>();
	String str,str2;
	int index=0;
	Scanner input=new Scanner(System.in);

	UserList(){
		UL.add(new User("q"));
		UL.add(new User("w"));
		UL.add(new User("e"));
		UL.add(new User("r"));
	}
	public void Useradd() {//사용자 추가
		System.out.println("추가할 사용자 이름을 입력하세요.");
		str=input.nextLine();
		UL.add(new User(str));
		System.out.println(UL.size()+"번째 사용자 이름 : "+str+"이 추가되었습니다.");
	}
	public void Userdel() {//사용자 삭제
		Userprint();//삭제하기 전 사용자 목록 출력
		System.out.println("삭제할 사용자 이름을 입력하세요.");
		str=input.nextLine();
		for(User temp:UL) {//사용자 이름과 같은 클래스 검색
			boolean eq=temp.getName().equals(str);
			if(temp.getrentalbook()!=null && eq) {//대여중인 사용자의 경우 삭제 불가
				System.out.println("대여중인 사용자는 삭제할 수 없습니다. 반납 먼저 해주세요.");
				return;
			}
			else if(eq) {//대여중이 아닌 사용자를 찾은 경우
				break;
			}
			index++;
		}
		 
		if(index!=UL.size()) {//index 안에 사용자를 찾은 경우
			UL.remove(index);
			System.out.println(index+1+"번째 사용자 이름 : "+str+"이 삭제되었습니다.");
		}
		else System.out.println("사용자 이름을 잘못입력하셨습니다.");//index 안에 사용자를 못찾은 경우
		index=0;
	}
	public void Usermodify() {//사용자 이름 수정
		Userprint();
		System.out.println("수정하실 사용자 이름을 입력하세요.");
		str=input.nextLine();
		for(User temp:UL) {//사용자 이름과 같은 클래스 검색
			boolean eq=temp.getName().equals(str);
			if(temp.getrentalbook()!=null && eq) {//대여중인 사용자의 경우 수정 불가
				System.out.println("대여중인 사용자는 수정하실 수 없습니다. 반납 먼저 해주세요.");
				return;
			}
			else if(eq) {//대여중이 아닌 사용자를 찾은 경우
				break;
			}
			index++;
		}
		 
		if(index!=UL.size()) {//index 안에 사용자를 찾은 경우
			System.out.println("무슨 이름으로 수정하시겠습니까?");
			str2=input.nextLine();
			User temp=new User(str2);
			UL.set(index, temp);
		}
		else System.out.println("수정하실 사용자 이름을 잘못입력하셨습니다.");//index 안에 사용자를 못찾은 경우
		index=0;
	}
	public void Userprint() {//사용자 목록 출력
		System.out.println("====전체 사용자 목록====");
		for(User temp:UL) {
			String strtemp;
			String RentalBook=temp.getrentalbook();
			if(RentalBook!=null) {
				strtemp="	"+RentalBook+" 대여중";
			}
			else strtemp="	대여 가능";
			System.out.println(temp.getName()+strtemp);
		}
		System.out.println("================");
	}
	public int rentalsystem(String book, String user) {//책 대여
		for(User temp:UL) {//사용자 이름과 같은 클래스 검색
			boolean eq=temp.getName().equals(user);
			if(temp.getrentalbook()!=null&&eq) {//대여중인 사용자의 경우 대여 불가
				System.out.println("이미 대여중인 책이 있습니다. 반납을 먼저 한 후에 대여해주세요.");
				return 1;
			}
			else if(eq) {//대여중이 아닐 경우
				temp.rent(book);
				UL.set(index, temp);
				break;
			}
			index++;
		}
		 
		if(index==UL.size()) {//index 안에 사용자를 못찾은 경우
			System.out.println("사용자가 목록에 존재하지 않습니다.");
			return 1;
		}
		index=0;
		return 0;
	}
	
	public void returnsystem(String user) {//책 반납
		if (user==null) return;
		for(User temp:UL) {//사용자 이름과 같은 클래스 검색
			if(temp.getName().equals(user)) {
				temp.ret();
				UL.set(index, temp);
				break;
			}
			index++;
		}
		 
		if(index==UL.size()) {//index 안에 사용자를 못찾은 경우
			System.out.println("사용자 이름을 잘못입력하셨습니다.");
		}
		index=0;
	}
}