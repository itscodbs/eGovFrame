package seong.hongyoon.ums.io;

import seong.hongyoon.ums.domain.CODE;

public class MenuImpl implements Menu{
	private UserIo userIo;
	private String[] menuItem;
	private String menu = " ";
	private int choice;

	public MenuImpl(String[] menuItem, UserIo userIo){
		this.menuItem = menuItem;
		this.userIo = userIo;   

		for(int i=0; i<menuItem.length; i++)
			this.menu += (i+1) + "." + menuItem[i] + ", ";
		this.menu += "0.종료";
	}

	private int choose(){
		boolean isMenuNum = false;
		do{
			Console.in(menu);
			choice = Console.inNum();
			if(choice<0 || choice>menuItem.length)
				Console.err("존재하는 메뉴 번호를 입력하세요.");
			else isMenuNum = true;
		}while(!isMenuNum);
		return choice;
	}

	public void play(){
		while((choice=choose())!=0){
			switch(choice){
			case CODE.User_LIST : userIo.listUsers(); break;
			case CODE.User_ADD : userIo.join(); break;
			case CODE.User_UPDATE : userIo.correctUser(); break;
			case CODE.User_DELETE : userIo.secede(); 
			}
		}
	}		
} 