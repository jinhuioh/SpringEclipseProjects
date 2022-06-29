<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>상품정보 검색</h3>
<form action="one">
아이디 : <input type="text" name="id"><br>
<button type="submit">서버로 전송</button>
</form>
<hr>
<h3>상품삭제</h3>
<form action="delete">
아이디 : <input type="text" name="id"><br>
<button>삭제하기</button>
</form>
<hr color=pink>
<h3>상품수정</h3>
<form action="update">
이름 : <input type="text" name="name"><br>
가격 : <input type="text" name="price"><br>
<button type="submit">상품수정하기</button>
</form>
<hr color=pink>
</body>
</html>