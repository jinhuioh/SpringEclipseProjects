<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<img src="resources/img/naver.PNG">
<h3>상품등록</h3>
<form action="create">
아이디 : <input type="text" name="id"><br>
이름 : <input type="text" name="name"><br>
내용 : <input type="text" name="content"><br>
가격 : <input type="text" name="price"><br>
이미지 : <input type="text" name="img"><br>
<button type="submit">상품등록!</button>
</form>
<hr color=pink>

<a href="readone.jsp"><button>상품조회하러가기</button></a>
<a href="readall.jsp"><button>상품전체조회하러가기</button></a>

</html>

