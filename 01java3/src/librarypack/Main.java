package librarypack;

import java.util.Scanner;
import java.lang.String;


public class Main{
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		int sel;
		BookList BL=new BookList();
		final UserList UL=new UserList();
	//	try {
			while(true) {
				boolean shouldbreak=false;
				System.out.println("1. 책 관리\n2. 사용자 관리\n3. 책 대여\n4. 책 반납\n5. 대여중인 도서목록 출력\n6. 종료\n입력 : ");
				sel=input.nextInt();
				switch(sel) {
				case 1://책 관리
					System.out.println("1. 책 추가\n2. 책 삭제\n3. 책 수정\n4. 전체 책 목록");
					switch(input.nextInt()) {
					case 1:
						BL.bookadd();
						break;
					case 2:
						BL.bookdel();
						break;
					case 3:
						BL.bookmodify();
						break;
					case 4:
						BL.bookprint();
						break;
					}
					break;
				case 2://사용자 관리
					System.out.println("1. 유저 추가\n2. 유저 삭제\n3. 유저 수정\n4. 전체 유저 목록");
					switch(input.nextInt()) {
					case 1:
						UL.Useradd();
						break;
					case 2:
						UL.Userdel();
						break;
					case 3:
						UL.Usermodify();
						break;
					case 4:
						UL.Userprint();
						break;
					}
					break;
				case 3://책 대여
					String bookname,username;
					BL.bookprint();
					bookname=input.nextLine();
					System.out.println("어떤 책을 대여하시겠습니까?");
					bookname=input.nextLine();
					UL.Userprint();
					System.out.println("유저 이름은 무엇입니까?");
					username=input.nextLine();
					if(BL.rentalsystem(bookname, username)==0) {
						if(UL.rentalsystem(bookname, username)==1) {
							BL.returnsystem(bookname);
						}
					}
					break;
				case 4://책 반납
					BL.bookprint();
					bookname=input.nextLine();
					System.out.println("어떤 책을 반납하시겠습니까?");
					bookname=input.nextLine();
					UL.returnsystem(BL.returnsystem(bookname));
					break;
				case 5://대여중인 도서 목록 출력
					BL.rentaling();
					break;
				case 6://프로그램 종료
					shouldbreak=true;
					System.out.println("프로그램이 종료됩니다.");
					break;
				default: 
					break;
				}
				if(shouldbreak) break;
			}
	//	}catch (Exception e){
    //        System.out.println("잘못입력하셨습니다.22");
  //      }

		//System.out.println("종료되었습니다.");
	}
}