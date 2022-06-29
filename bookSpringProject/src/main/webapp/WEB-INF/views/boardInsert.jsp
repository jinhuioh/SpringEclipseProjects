<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="../../top.jsp"></jsp:include>
		</div>
		<div id="center">
		<p>${result}</p>
			<p>게시물 등록이 완료되었습니다.</p>
			<hr color="red">
			<a href="board.jsp">
				<button style="width: 200px; height: 50px;" class="btn btn-info">목록보기</button>
			</a>
			<a href="boardInsert.jsp">
				<button style="width: 200px; height: 50px;" class="btn btn-primary">글쓰기</button>
			</a>
		</div>
	</div>
</body>
</html>