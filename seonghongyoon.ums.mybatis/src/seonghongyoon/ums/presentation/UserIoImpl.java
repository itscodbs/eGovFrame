package seonghongyoon.ums.presentation;

import java.util.List;

import seonghongyoon.ums.domain.User;
import seonghongyoon.ums.domain.UserJob;
import seonghongyoon.ums.service.UserService;

public class UserIoImpl implements UserIo{
	private UserService userService;
	private String[] menuItem;
	private String menu = "";

	public UserIoImpl(UserService userService, String[] menuItem){
		this.userService = userService;
		this.menuItem = menuItem;
		for(int i = 0; i < menuItem.length; i++)
			this.menu += (i+1) + "." + menuItem[i] + ", ";
		this.menu += "0.종료";
	}

	@Override
	public void play(){
		int choice = 0;
			while((choice=choose()) != 0){
		
			switch(choice){
			case UserJob.LIST 	: this.listUsers(); break;
			case UserJob.INSERT	: this.join(); break;
			case UserJob.UPDATE	: this.correct(); break;
			case UserJob.DELETE : this.secede(); 	
			}
		}
	}
	
	private int choose(){
		boolean isMenuNum = false;
		int choice = 0;
		do{
			Console.in(menu);
			choice = Console.inNum();
			if(choice < 0 || choice > menuItem.length)
				Console.err("존재하는 메뉴 번호를 입력하세요.");
			else isMenuNum = true;
		}while(!isMenuNum);
		return choice;
	}
	
	public void listUsers(){
		List<User> users = userService.listUsers();
		if(users.size()==0) Console.info("사용자가 없습니다."); 
		else for(User user : users) Console.info(user); 
	}

	@Override
	public void join(){  // Add
		Console.in("등록할 사용자 이름을 입력하세요.");
		String userName = Console.inStr();
		if(userName.equals("0")){
			Console.info("사용자 등록 취소.");
			return;
		}

		if(userService.joinUser(userName))
			Console.info("사용자 등록 성공");
		else Console.err("사용자 등록 실패.");
	}

	public void correct(){  // Update
		if(userService.listUsers().size()==0){
			Console.info("사용자가 없습니다.");
			return;
		}

		User user = null;
		do{
			Console.in("수정할 사용자 번호를 입력하세요.");
			int userNo = Console.inNum();
			if(userNo == 0){
				Console.info("사용자 정보 수정 취소");
				return;
			}
			user = userService.findUser(userNo);
			if(user==null) Console.err("입력한 번호의 사용자가 없습니다.");
		}while(user==null);

		Console.in("사용자 이름을 입력하세요");
		user.setUserName(Console.inStr());
		if(userService.changeUser(user)) Console.info("사용자 정보 수정 성공");
		else Console.err("사용자 정보 수정 실패");
	} 

	@Override
	public void secede(){  // Delete
		if(userService.listUsers().size()==0){
			Console.info("사용자가 없습니다.");
			return;
		}
		
		User user = null;
		int userNo = 0;
		do{
			Console.in("탈퇴할 사용자 번호를 입력하세요.");
			userNo = Console.inNum();
			if(userNo == 0){
				Console.info("사용자 탈퇴 취소.");
				return;
			}
			user = userService.findUser(userNo);
			if(user == null) Console.err("입력한 번호의 사용자가 없습니다.");
		}while(user == null);
		
		if(userService.leaveUser(userNo)) Console.info("사용자 탈퇴 성공.");
		else Console.err("사용자 탈퇴 실패.");
	}
}
