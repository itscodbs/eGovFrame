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
	public void bookadd() {//å �߰�
		System.out.println("�߰��� å ������ �Է��ϼ���.");
		str=input.nextLine();
		BL.add(new Book(str));
		System.out.println(BL.size()+"��° å ���� : "+str+"�� �߰��Ǿ����ϴ�.");
	}
	public void bookdel() {//å ����
		bookprint();
		System.out.println("������ å ������ �Է��ϼ���.");
		str=input.nextLine();
		for(Book temp:BL) {//å ����� ���� Ŭ���� �˻�
			boolean eq=temp.getName().equals(str);
			if(temp.getrentaluser()!=null && eq) {//å�� �뿩���� ��� ���� �Ұ�
				System.out.println("�뿩���� å�� ������ �� �����ϴ�. �ݳ� ���� ���ּ���.");
				return;
			}
			else if(eq) {//�뿩������ ���� å ������ ã���� ���
				break;
			}
			index++;
		}
		 
		if(index!=BL.size()) {//size �ȿ� å�� ã�� ���
			BL.remove(index);
			System.out.println(index+1+"��° å ���� : "+str+"�� �����Ǿ����ϴ�.");
		}
		else System.out.println("å ������ �߸��Է��ϼ̽��ϴ�.");//size �ȿ� å�� ã�� ���� ���
		index=0;
	}
	public void bookmodify() {//å ����
		bookprint();
		System.out.println("�����Ͻ� å ������ �Է��ϼ���.");
		str=input.nextLine();
		for(Book temp:BL) {//å ����� ���� Ŭ���� �˻�
			boolean eq=temp.getName().equals(str);
			if(temp.getrentaluser()!=null && eq) {//å�� �뿩���� ��� ���� �Ұ�
				System.out.println("�뿩���� å�� �����Ͻ� �� �����ϴ�. �ݳ� ���� ���ּ���.");
				return;
			}
			else if(eq) {//�뿩������ ���� å ������ ã���� ���
				break;
			}
			index++;
		}
		 
		if(index!=BL.size()) {//size �ȿ� å�� ã�� ���
			System.out.println("���� �������� �����Ͻðڽ��ϱ�?");
			str2=input.nextLine();
			Book temp=new Book(str2);
			BL.set(index, temp);
		}
		else System.out.println("�����Ͻ� å ������ �߸��Է��ϼ̽��ϴ�.");//size �ȿ� å�� ã�� ���� ���
		index=0;
	}
	public void bookprint() {//å ��� ���
		System.out.println("====��ü å ���====");
		for(Book temp:BL) {
			String strtemp;
			String RentalUser=temp.getrentaluser();
			if(RentalUser!=null) {
				strtemp="	"+RentalUser+" �뿩��";
			}
			else strtemp="	�뿩 ����";
			System.out.println(temp.getName()+strtemp);
		}
		System.out.println("================");
	}
	public int rentalsystem(String book, String user) {//å �뿩

		for(Book temp:BL) {//å ����� ���� Ŭ���� �˻�
			boolean eq=temp.getName().equals(book);
			if(temp.getrentaluser()!=null && eq) {//�뿩���� å�� ��� �뿩 �Ұ�
				System.out.println("�뿩���� å�� ������ �� �����ϴ�. �ݳ� ���� ���ּ���.");
				return 1;
			}
			else if(eq){
				temp.rent(user);
				BL.set(index, temp);
				break;
			}
			index++;
		}
		 
		if(index==BL.size()) {//size �ȿ� å�� ã�� ���� ���
			System.out.println("��û�Ͻ� å�� ��Ͽ� �������� �ʽ��ϴ�.");
		}
		index=0;
		return 0;
	}
	public void rentaling() {//å �뿩 ��� ���
		System.out.println("====�뿩���� å ���====");
		for(Book temp:BL) {
			if(temp.getrentaluser()!=null) {
				System.out.println(temp.getName());
			}
			index++;
		}
		index=0;
		System.out.println("===================");
	}

	public String returnsystem(String book) {//å �ݳ�
		String username = null;
		for(Book temp:BL) {//å ����� ���� Ŭ���� �˻�
			if(temp.getName().equals(book)) {
				username=temp.getrentaluser();
				temp.ret();
				BL.set(index, temp);
				break;
			}
			index++;
		}

		if(index==BL.size()) {//size �ȿ� å�� ��ã�� ���
			System.out.println("å ������ �߸��Է��ϼ̽��ϴ�.");
			index=0;
			return null;
		}
		else {
			index=0;
			return username;//�ش�å�� �ݳ��� ����� �̸� ����
		}
	}
}