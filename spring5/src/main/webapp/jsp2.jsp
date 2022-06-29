<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp2</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
//아이디가 b1인 것을 클릭했을 때 가로안에 넣은 이름없는 함수를 실행해주렴.
$(function() {//body를 먼저 읽고와서 준비가 되면 
	//메모리에 dom tree로 읽어드리면
	//함수의 내용대로 처리해주렴.
	$('#b1').click(function() {
		alert('b1이 클릭되었음.')
		idValue = $('#id').val()
		if(idValue.length <5){
			$('#result').html('유효하지 않음.'); 
			//html자리에 append가 들어가면 댓글처럼 계속 끝에 붙여짐.
			// htm:태그가 있는html코드 일부분으로 대체. (글이 버튼누를때마다 대체된다고 생각하면 된다.)
			//text:태그가 없는 택스트만
			$('#id').val('') //유효하지 않으면 공백처리. 
		} else {
			$('#result').html('유효함!!');		
		}
	})
	$('#b2').click(function() {
		alert('b2가 클릭되었음')
		pw1Value = $('#pw1').val()
		pw2Value = $('#pw2').val()
		if(pw1Value == pw2Value){
			$('#result').html('일치!')
		} else {
			$('#result').html('일치하지 않음!');
		}
	})
})	
</script>
</head>
<body>
	<h3>자바 스트립트 테스트</h3>
	<hr>
	아이디:<input name="id" id="id" value="text"><br>
	<button id="b1">입력 글자수 확인</button><br>
	패스워드1:<input name="pw1" id="pw1" value="1234"><br>
	패스워드2:<input name="pw2" id="pw2" value="1234"><br>
	<button id="b2">입력 패스워드 일치 확인</button><br>
	<hr>
	<div id="result"></div>
</body>
</html>