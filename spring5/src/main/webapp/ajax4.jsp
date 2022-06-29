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
				url: 'resources/file/MOCK_DATA.json',
				success: function(result) {
					alert(result.length)
					$(result).each(function (i, one) {
						console.log(one.id)
						//div안에 1000명의 성과 이름/이메일을 프린트
						list = result.one.id
						
					})
				},
				error: function() {
					alert('연결 실패.')
				}//error
			})//ajax
		})//b1
		
	})
</script>
</head>
<body>
	<button id="b1">조선일보 정치기사 받아오기.</button>
	<hr color="pink">
	<div id="d1"></div>
	
</body>
</html>