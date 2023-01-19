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
	public void Useradd() {//����� �߰�
		System.out.println("�߰��� ����� �̸��� �Է��ϼ���.");
		str=input.nextLine();
		UL.add(new User(str));
		System.out.println(UL.size()+"��° ����� �̸� : "+str+"�� �߰��Ǿ����ϴ�.");
	}
	public void Userdel() {//����� ����
		Userprint();//�����ϱ� �� ����� ��� ���
		System.out.println("������ ����� �̸��� �Է��ϼ���.");
		str=input.nextLine();
		for(User temp:UL) {//����� �̸��� ���� Ŭ���� �˻�
			boolean eq=temp.getName().equals(str);
			if(temp.getrentalbook()!=null && eq) {//�뿩���� ������� ��� ���� �Ұ�
				System.out.println("�뿩���� ����ڴ� ������ �� �����ϴ�. �ݳ� ���� ���ּ���.");
				return;
			}
			else if(eq) {//�뿩���� �ƴ� ����ڸ� ã�� ���
				break;
			}
			index++;
		}
		 
		if(index!=UL.size()) {//index �ȿ� ����ڸ� ã�� ���
			UL.remove(index);
			System.out.println(index+1+"��° ����� �̸� : "+str+"�� �����Ǿ����ϴ�.");
		}
		else System.out.println("����� �̸��� �߸��Է��ϼ̽��ϴ�.");//index �ȿ� ����ڸ� ��ã�� ���
		index=0;
	}
	public void Usermodify() {//����� �̸� ����
		Userprint();
		System.out.println("�����Ͻ� ����� �̸��� �Է��ϼ���.");
		str=input.nextLine();
		for(User temp:UL) {//����� �̸��� ���� Ŭ���� �˻�
			boolean eq=temp.getName().equals(str);
			if(temp.getrentalbook()!=null && eq) {//�뿩���� ������� ��� ���� �Ұ�
				System.out.println("�뿩���� ����ڴ� �����Ͻ� �� �����ϴ�. �ݳ� ���� ���ּ���.");
				return;
			}
			else if(eq) {//�뿩���� �ƴ� ����ڸ� ã�� ���
				break;
			}
			index++;
		}
		 
		if(index!=UL.size()) {//index �ȿ� ����ڸ� ã�� ���
			System.out.println("���� �̸����� �����Ͻðڽ��ϱ�?");
			str2=input.nextLine();
			User temp=new User(str2);
			UL.set(index, temp);
		}
		else System.out.println("�����Ͻ� ����� �̸��� �߸��Է��ϼ̽��ϴ�.");//index �ȿ� ����ڸ� ��ã�� ���
		index=0;
	}
	public void Userprint() {//����� ��� ���
		System.out.println("====��ü ����� ���====");
		for(User temp:UL) {
			String strtemp;
			String RentalBook=temp.getrentalbook();
			if(RentalBook!=null) {
				strtemp="	"+RentalBook+" �뿩��";
			}
			else strtemp="	�뿩 ����";
			System.out.println(temp.getName()+strtemp);
		}
		System.out.println("================");
	}
	public int rentalsystem(String book, String user) {//å �뿩
		for(User temp:UL) {//����� �̸��� ���� Ŭ���� �˻�
			boolean eq=temp.getName().equals(user);
			if(temp.getrentalbook()!=null&&eq) {//�뿩���� ������� ��� �뿩 �Ұ�
				System.out.println("�̹� �뿩���� å�� �ֽ��ϴ�. �ݳ��� ���� �� �Ŀ� �뿩���ּ���.");
				return 1;
			}
			else if(eq) {//�뿩���� �ƴ� ���
				temp.rent(book);
				UL.set(index, temp);
				break;
			}
			index++;
		}
		 
		if(index==UL.size()) {//index �ȿ� ����ڸ� ��ã�� ���
			System.out.println("����ڰ� ��Ͽ� �������� �ʽ��ϴ�.");
			return 1;
		}
		index=0;
		return 0;
	}
	
	public void returnsystem(String user) {//å �ݳ�
		if (user==null) return;
		for(User temp:UL) {//����� �̸��� ���� Ŭ���� �˻�
			if(temp.getName().equals(user)) {
				temp.ret();
				UL.set(index, temp);
				break;
			}
			index++;
		}
		 
		if(index==UL.size()) {//index �ȿ� ����ڸ� ��ã�� ���
			System.out.println("����� �̸��� �߸��Է��ϼ̽��ϴ�.");
		}
		index=0;
	}
}