<%@page import="pack01.BoardDAO"%>
<%@page import="pack01.BoardVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--
    1.클라이언트가 입력해서 서버로 보낸 데이터를 받아주어야함.
    2.vo만들어서 데이터들을 넣어준다.
    3.vo주면서 dao에게 create해달라고 요청한다.
    4.결과화면을 만들어서 클라이언트에게 보내준다.
      -->
      <%
      //1.클라이언트가 전송해준 데이터를 받아주자.
      String name = request.getParameter("name"); //ex)song
      String content = request.getParameter("content"); //11234
      String title = request.getParameter("title"); //songhiji
      
      BoardVo vo = new BoardVo();
      vo.setName(name);
      vo.setContent(content);
      vo.setTitle(title);
      
      
      BoardDAO dao = new BoardDAO();
      dao.create(vo);
      %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	</head>
	<body>
	글입력 요청이 완료되었습니다.
	</body>
</html>