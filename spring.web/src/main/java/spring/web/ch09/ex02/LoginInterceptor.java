package spring.web.ch09.ex02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{
	private Logger logger;
	
	public LoginInterceptor(){
		logger = LogManager.getLogger(LoginInterceptor.class);
	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception{
		if(!request.getRequestURI().equals("/web/ch09/ex02/login")){
			String userId = (String)request.getSession().getAttribute("userId");
			if(userId==null) response.sendRedirect("/web/ch09/ex02/login");
		}
		return true;	
	}
}
