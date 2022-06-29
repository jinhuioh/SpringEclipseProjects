<%@page import="pack03.MemberDAO"%>
<%@page import="pack03.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String id = request.getParameter("id");
    
    MemberVo vo = new MemberVo();
    vo.setId(id);
    
    MemberDAO dao =new MemberDAO();
    MemberVo vo2 = dao.readOne(vo);
    
   
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% if(vo2.getId() !=null) {%> <!-- 검색결과가 있을때만 아래 내용 나오게 하기. -->
검색한 아이디는<%=vo2.getId()%><br> 
검색한 비밀번호는<%=vo2.getPw()%><br> 
검색한 이름은<%=vo2.getName()%><br> 
검색한 번호는<%=vo2.getTel()%><br> 
<%} else{ %>
<h1 style=color:pink>검색결과 없음</h1>
<%} %>
</body>
</html>