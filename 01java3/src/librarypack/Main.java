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
				System.out.println("1. å ����\n2. ����� ����\n3. å �뿩\n4. å �ݳ�\n5. �뿩���� ������� ���\n6. ����\n�Է� : ");
				sel=input.nextInt();
				switch(sel) {
				case 1://å ����
					System.out.println("1. å �߰�\n2. å ����\n3. å ����\n4. ��ü å ���");
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
				case 2://����� ����
					System.out.println("1. ���� �߰�\n2. ���� ����\n3. ���� ����\n4. ��ü ���� ���");
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
				case 3://å �뿩
					String bookname,username;
					BL.bookprint();
					bookname=input.nextLine();
					System.out.println("� å�� �뿩�Ͻðڽ��ϱ�?");
					bookname=input.nextLine();
					UL.Userprint();
					System.out.println("���� �̸��� �����Դϱ�?");
					username=input.nextLine();
					if(BL.rentalsystem(bookname, username)==0) {
						if(UL.rentalsystem(bookname, username)==1) {
							BL.returnsystem(bookname);
						}
					}
					break;
				case 4://å �ݳ�
					BL.bookprint();
					bookname=input.nextLine();
					System.out.println("� å�� �ݳ��Ͻðڽ��ϱ�?");
					bookname=input.nextLine();
					UL.returnsystem(BL.returnsystem(bookname));
					break;
				case 5://�뿩���� ���� ��� ���
					BL.rentaling();
					break;
				case 6://���α׷� ����
					shouldbreak=true;
					System.out.println("���α׷��� ����˴ϴ�.");
					break;
				default: 
					break;
				}
				if(shouldbreak) break;
			}
	//	}catch (Exception e){
    //        System.out.println("�߸��Է��ϼ̽��ϴ�.22");
  //      }

		//System.out.println("����Ǿ����ϴ�.");
	}
}