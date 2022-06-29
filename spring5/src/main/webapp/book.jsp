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
<h3>회원정보 검색</h3>
<form action="one2">
아이디 : <input type="text" name="id"><br>
<button type="submit">서버로 전송</button>
</form>
<hr>

<h3>회원전체 검색</h3>
<a href="all2">
	<button>전체검색 요청</button>
</a>


<h3>북마크추가</h3>
<form action="create2">
아이디 : <input type="text" name="id"><br>
name : <input type="text" name="name"><br>
url : <input type="text" name="url"><br>
img : <input type="text" name="img"><br>
<button type="submit">서버로 전송</button>
</form>
<hr color=pink>

<h3>회원수정</h3>
<form action="up2">
아이디 : <input type="text" name="id"><br>
url : <input type="text" name="url"><br>
<button type="submit">서버로 전송</button>
</form>
<hr color=pink>

</html>