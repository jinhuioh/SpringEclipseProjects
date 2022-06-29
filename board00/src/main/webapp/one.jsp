<%@page import="pack01.BoardDAO"%>
<%@page import="pack01.BoardVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    int idx = Integer.parseInt(request.getParameter("idx"));
    
    BoardVo vo = new BoardVo();
    vo.setIdx(idx);
    
    BoardDAO dao =new BoardDAO();
    BoardVo vo2 = dao.readOne(vo);
    
   
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% if(vo2.getIdx() == 0) {%> <!-- 검색결과가 있을때만 아래 내용 나오게 하기. -->
검색한 시퀀스는<%=vo2.getIdx()%><br> 
검색한 이름<%=vo2.getName()%><br> 
검색한 제목은<%=vo2.getTitle()%><br> 
검색한 내용<%=vo2.getContent()%><br> 
<%} else{ %>
<h1 style=color:pink>검색결과 없음</h1>
<%} %>
</body>
</html>