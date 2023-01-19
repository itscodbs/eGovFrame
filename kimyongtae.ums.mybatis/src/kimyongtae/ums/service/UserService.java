package kimyongtae.ums.service;

import java.util.List;

import kimyongtae.ums.domain.User;

public interface UserService {
	List<User> listUsers(); // 사용자 목록
	User findUser(int userNo);
	boolean join(String userName);   // 사용자 등록
	boolean correctUser(User user); // 사용자 수정
	boolean secede(int userNo); // 사용자 탈퇴
}