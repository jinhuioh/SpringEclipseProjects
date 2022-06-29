<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$(function() { //dom(document object model) tree구조로 읽는다. 
		//=body dom tree로 ram에 읽어들인 후, function을 실행해라.
		//익명함수
		$('#b1').click(function() {
			$.ajax({ //제이슨 표기법 ,,
				url: "movie",
				data: {
					title: $('#title').val(),
					price: $('#price').val()
				},
				success: function(result) {
					alert(result)
					$('#d2').html(result)
				},
				error: function() {
					alert('ajax 실패.')
				}//error
			})//ajax
		})//b1
		
		$('#b3').click(function() {
			$.ajax({ //제이슨 표기법 ,,
				url: "user",
				data: {
					user: $('#user').val()
				},
				success: function(result) {
					alert(result)
					$('#d2').html(result)
				},
				error: function() {
					alert('ajax 실패.')
				}//error
				
			})//ajax
		})//b3
		
		$('#b2').click(function() {
			$.ajax({ //제이슨 표기법 ,,
				url: "reply",
				data: {
					reply: $('#reply').val()
				},
				success: function(result) {
					alert(result)
					$('#d2').append(result + "<br>")
				},
				error: function() {
					alert('ajax 실패.')
				}//error
			})//ajax
		})//b2
	})
</script>
</head>
<body>
	영화제목: <input type="text" name="title" id="title">
	영화관람료: <input type="text" name="price" id="price">
	<button id="b1">영화 정보 제출</button>
<hr>
	댓글: <input type="text" name="reply" id="reply">
	<button id="b2">댓글 달기</button>
	<hr color="pink">
<hr>
	<hr color="pink">
	아이디입력: <input type="text" name="user" id="user">
	<button id="b3">아이디 중복 체크</button>
	<hr color="pink">
	<div id="d2"></div>
</body>
</html>