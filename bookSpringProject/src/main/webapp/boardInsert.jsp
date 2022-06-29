<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 작성</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
td {
	background: white;
	height: 30px;
}
</style>
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<div id="center">
			<form action="boardInsert">
				<div class="form-group">
					<label for="title">writer:</label> <input type="text"
						class="form-control" name="b_writer" value="${one.b_writer}">
				</div>
				<div class="form-group">
					<label for="title">title:</label> <input type="text"
						class="form-control" name="b_title" value="${one.b_title}">
				</div>
				<div class="form-group">
					<label for="content">content:</label> 					
					<textarea rows="5" cols="5" class="form-control" name="b_content"
						style="background: yellow;color: green; font-weight: bold;"
					></textarea>
				</div>
				<button type="submit" class="btn btn-success">Submit</button>
			</form>
		</div>
	</div>
</body>
</html>