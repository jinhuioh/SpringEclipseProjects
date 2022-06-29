<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${one.b_title}</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#delete').click(function() {
			if (confirm("정말로 삭제하시겠습니까?")) {
				// controller의 boardDelete 요청 후 삭제가 성공하면,
				// board.jsp로 화면을 넘기면 됨
				$.ajax({
					url : "boardDelete",
					data : {
						b_id : '${one.b_id}'
					},
					success : function(result) {
						// js: 타입이 달라도 기본형과 String까지 비교 가능
						if (result == 1) {
							location.href = "board.jsp"
						}
					}
				})
			}
		})
	})
</script>
<style>
.left {
	background: ivory;
	text-align: center;
	width: 50px;
}

.right {
	background: white;
	width: 150px;
}
</style>
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="../../top.jsp"></jsp:include>
		</div>
		<div id="center">
			<span style="font-size: 25px;">공지사항</span>	
			<!-- 비회원 로그인인 경우 -->
			<% if(session.getAttribute("userId") == null) { %>
				<span style="color: blue; float: right;">비회원 로그인 상태입니다.</span><br>
			<!-- 관리자인 경우 -->
			<% } else if(session.getAttribute("userId").equals("admin")){ %>
				<span style="color: blue; float: right;">${userId}님 로그인되었습니다. 좋은 하루 되세요.</span><br>
				<a href="boardUpdate?b_id=${one.b_id}">
					<button style="width: 200px; height: 50px;" class="btn btn-success">수정하기</button>
				</a>
				<button id="delete" style="width: 200px; height: 50px;"
					class="btn btn-success">삭제하기</button>
			<!-- 일반 회원인 경우 -->
			<% } else if(session.getAttribute("userId") != null) { %>
				<span style="color: blue; float: right;">${userId}님 로그인되었습니다. 좋은 하루 되세요.</span><br>
			<% } %>
			<hr color=red>
			<table style="width: 500px; margin: auto; position: absolute;" border=1>
				<tr>
					<td class="left">번호</td>
					<td class="right">${one.b_id}</td>
				</tr>
				<tr>
					<td class="left">제목</td>
					<td class="right">${one.b_title}</td>
				</tr>
				<tr>
					<td class="left">내용</td>
					<td class="right" style="height: 100px;">${one.b_content}</td>
				</tr>
				<tr>
					<td class="left">작성자</td>
					<td class="right">${one.b_writer}</td>
				</tr>
				<tr>
					<td class="left">등록일</td>
					<td class="right">${one.b_date}</td>
				</tr>
			</table>
		</div>
	</div>
	<a href="board.jsp">
		<button style="width: 100px; height: 50px; font-size: 10px; position:absolute; margin-top: 200px; margin-left: 400px;" class="btn btn-info">전체 목록으로</button><br>
	</a>
</body>
</html>