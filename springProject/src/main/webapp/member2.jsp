<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="resources/css/project.css">
</head>
<body>
<div id="total">
	<div id="top">
		<jsp:include page="top.jsp"></jsp:include>
	</div>
	<div id="top2">
		<jsp:include page="top2.jsp"></jsp:include>
	</div>
	<div id="center">
		<h3>로그인</h3>
		<form action="check">
		<table>
			<tr>
				<td class="left">아이디</td>
				<td class="right"><input type="text"  class="form-control" name="id"><br></td>
			</tr>
			<tr>
				<td class="left">패스워드</td>
				<td class="right"><input type="text"  class="form-control" name="pw"><br></td>
			</tr>
			<tr>
				<td colspan="2"><button class="btn btn-success" type="submit">서버로 전송</button></td>
			</tr>
		</table>
		</form>
	</div>
</div>
</body>
</html>