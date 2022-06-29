<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- JSTL(JavaStandard Tag Library) -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	td{
		width:150px;
		height: 50px;
		text-align:center;
	}
	.left {
		background: skyblue;
	}
	.right{
		background: pink;
	}
	hr{
		width:50px;
		height: 30px;
		background:red;
		margin:10px;
	}
	.text{
		font-family:"궁서"
	}
</style>
</head>
<body bgcolor="pink">
<c:forEach items="${list}" var="one" >
	<table border=2>
		<tr>
			<td class="left">아이디</td>
			<td class="right">${one.id}</td> <!-- one.getId -->
		</tr>
		<tr>
			<td class="left">패스워드</td>
			<td class="right">${one.pw}</td>
		</tr>
		<tr>
			<td class="left text">이름</td>
			<td class="right">${one.name}</td>
		</tr>
		<tr>
			<td class="left">전화번호</td>
			<td class="right">${one.tel}</td>
		</tr>
	</table>
</c:forEach>
회원전체정보검색입니다.
${list}
</body>
</html>