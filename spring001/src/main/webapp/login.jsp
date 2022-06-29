<%@page import="pack03.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="vo" class="pack03.MemberVo"> <!-- import="pack03.MemberDAO"import="pack03.MemberVo"랑 같은코드이다. -->
	<jsp:setProperty name="vo" property ="*"/> 
	<!-- String id = request.getParameter("id"); String pw = request.getParameter("id");  vo.setId(id); vo.setPw(pw);랑 같은거임.-->
</jsp:useBean>
<%
	MemberDAO dao = new MemberDAO();
	boolean result = dao.login(vo);
	String text = "로그인 실패";
	if(result){	
		session.setAttribute("user", vo.getId());
		text = "로그인 성공";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
로그인 결과는 <%= text %><br><!-- 표현식 -->
세션 user값은 <%= session.getAttribute("user") %> <!-- ${user}와 같음.표현언어라고 부른다. -->
</body>
</html>