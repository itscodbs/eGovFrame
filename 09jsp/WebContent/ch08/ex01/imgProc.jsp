<%@ page import="org.apache.logging.log4j.Logger"%>
<%@ page import="org.apache.logging.log4j.LogManager"%>
<%@ page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	Logger logger = null;
	if(application.getAttribute("logger") != null)
		logger = (Logger) application.getAttribute("logger");
	else{
		logger = LogManager.getLogger();
		application.setAttribute("logger", logger);
	}
	
	String savePath = "ch08/upload"; // 저장경로
	int uploadFileMaxSize = 5*1024*1024 ; //5M
	String encType = "utf-8";
	
	ServletContext context = getServletContext();
	String uploadFilePath = context.getRealPath(savePath);
	logger.debug("서버상의 실제 저장 디렉토리");
	logger.debug(uploadFilePath);
	
	try{
		request.setCharacterEncoding("utf-8");
		MultipartRequest multiRequest = new MultipartRequest(request, 
				uploadFilePath, uploadFileMaxSize, encType,
				new DefaultFileRenamePolicy());
				
		request.setAttribute("title", multiRequest.getParameter("title"));
		request.setAttribute("fileName", multiRequest.getFilesystemName("uploadFile"));
%>
	<jsp:forward page = "imgOut.jsp"/>
<%
	}catch(Exception e){
		logger.error("파일 업로드 실패 : " + e);
	}
%>