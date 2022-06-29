<%@page import="pack03.MemberVo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pack03.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    MemberDAO dao = new MemberDAO();	
    
    ArrayList<MemberVo> list = dao.readAll();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	for(MemberVo vo : list) {	
%>
	검색한 아이디는<%=vo.getId()%><br> 
	검색한 이름은 
	<a href="one.jsp?id=<%=vo.getId()%>">
		<%=vo.getName()%>
	</a>
	<br>
	<hr>
<% 
	}
%>
</body>
</html>