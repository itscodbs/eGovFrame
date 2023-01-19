package ch01.ex04;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ch01/ex04/lifecycle")
public class LifeCycle {

	private int initCnt=0;
	private int doGetCnt=0;
	private int destroyCnt=0;

	public void init(ServletConfig conf) throws ServletException{
		System.out.printf("ininCnt : %d\n", ++initCnt);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.printf("doGetCnt : %d\n", ++doGetCnt);
	}
	public void destroy(){
		System.out.printf("destroyCnt : %d\n", ++destroyCnt);
	}
}
/*
정보: Server startup in 470 ms
initCnt : 1
doGetCnt : 1
doGetCnt : 2
doGetCnt : 3
6월 21, 2018 6:19:22 오후 org.apache.catalina.core.StandardContext reload
정보: Reloading Context with name [/jsp] is completed
destroyCnt : 1
6월 21, 2018 6:19:22 오후 org.apache.catalina.core.StandardContext reload
정보: Reloading Context with name [/jsp] is completed
initCnt : 1
doGetCnt : 1
*/