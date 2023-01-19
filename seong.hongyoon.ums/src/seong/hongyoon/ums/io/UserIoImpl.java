package seong.hongyoon.ums.io;

import java.util.List;

import seong.hongyoon.ums.domain.User;
import seong.hongyoon.ums.service.UserService;

public class UserIoImpl implements UserIo{
	private UserService userService;

	public UserIoImpl(UserService userService){
		this.userService = userService;
	}

	public void listUsers(){
		List<User> users = userService.listUsers();
		if(users.size()==0) Console.info("사용자가 없습니다."); 
		else for(User user : users) Console.info(user); 
	}

	public void join(){  // Add
		Console.in("등록할 사용자 이름을 입력하세요.");
		String userName = Console.inStr();
		if(userName.equals("0"))
		{ Console.info("사용자 등록 취소."); return; }
		if(userService.join(userName)) Console.info("사용자 등록 성공.");
		else Console.err("사용자 등록 실패."); 
	}

	public void correctUser(){  // Update
		User user = null;
		
		if(userService.listUsers().size()==0)
		{ Console.info("사용자가 없습니다."); return;	}
		
		do{
			Console.in("수정할 사용자 번호를 입력하세요.");
			int userNum = Console.inNum();
			if(userNum==0)
			{ Console.info("사용자 정보 수정 취소"); return; }
			user = userService.findUser(userNum);	
			if(user==null) Console.err("입력한 번호의 사용자가 없습니다.");
		}while(user==null);

		Console.in("사용자 이름을 입력하세요."); 
		user.setUserName(Console.inStr());
		if(userService.correctUser(user)) 
			Console.info("사용자 정보 수정 성공.");
		else Console.err("사용자 정보 수정 실패.");
	}	

	public void secede(){  // Delete
		User user = null;

		if(userService.listUsers().size()==0)
		{ Console.info("사용자가 없습니다.");	return; }  

		int userNum = 0; 
		do{
			Console.in("탈퇴할 사용자 번호를 입력하세요.");
			userNum = Console.inNum();            
			if(userNum==0){ Console.info("사용자 탈퇴 취소."); return; } 
			user = userService.findUser(userNum);
			if(user==null) Console.err("입력한 번호의 사용자가 없습니다.");
		}while(user==null);

		if(userService.secede(userNum)) Console.info("사용자 탈퇴 성공.");
		else Console.err("사용자 탈퇴 실패");
	}
}