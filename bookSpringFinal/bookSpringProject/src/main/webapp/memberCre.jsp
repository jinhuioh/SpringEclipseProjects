<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="resources/css/project.css">
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$('#addMember').click(function(){
		console.log('addMember click!');
		if($('#id').val() == ''){				
			$('#idc').text('아이디를 입력해주세요');
		} else if($('#pw').val() == ''){		
			$('#pwc1').text('비밀번호를 입력해주세요');
		} else if($('#pw2').val() == ''){	
			$('#pwc2').text('비밀번호 중복확인을 해주세요');
		} else if($('#pw').val() != $('#pw2').val()){					
			$('#pwc2').text('password가 일치하지 않습니다.');
		} else if($('#name').val() == ''){	
			$('#nac').text('이름을 입력하세요.');
		}  else if($('#tel').val() == ''){			
			$('#tec').text('번호를 입력하세요.');
		} else if($('#email').val() == ''){		
			$('#emc').text('이메일을 입력하세요.');
		} else{
			$('#form').submit();
		}
	})	
	
	$('#id').click(function() {
		$('#idc').text('')
	})
	$('#pw2').click(function() {
		$('#pwc2').text('')
	})
	$('#pw').click(function() {
		$('#pwc1').text('')
	})
	$('#name').click(function() {
		$('#nac').text('')
	})
	$('#tel').click(function() {
		$('#tec').text('')
	})
	$('#email').click(function() {
		$('#emc').text('')
	})
	
	$('#idCheck').click(function() {
		if ($('#id').val().length == 0) {
			$('#idc').text('아이디를 입력해주세요')
		} else {
		$.ajax({
			url:"memberIdCheck",
			data:{'id':$('#id').val()},
			success: function(data) { //views아래에 있는 memberIdCheck.jsp의 실행결과가 data에 담김.
				if(data == 1) {
					alert("사용할 수 없는 아이디 입니다.")
				} else {
					alert("사용가능한 아이디 입니다.")
				}
			}
		})
		}
	})
});
</script>
</head>
<body>
<h3 class="active">회원가입</h3>
			<form action="memberCreate" id="form">
				<table>
					<tr>
						<td class="left">아이디</td>
						<td class="right"><input  class="form-control input-lg" style="width: 300px"  type="text" name="id" id="id">
						<div id="idc" ></div>
						</td>
					</tr>
					<tr>
						<td class="left">패스워드</td>
						<td class="right"><input  class="form-control input-lg"  type="text" name="pw" id="pw">
						<div id="pwc1" ></div>
						</td>
					</tr>
					<tr>
						<td class="left">패스워드확인</td>
						<td class="right"><input  class="form-control input-lg"  type="text" name="pw2" id="pw2">
						<div id="pwc2" ></div>
						</td>
					</tr>
					<tr>
						<td class="left">이름</td>
						<td class="right"><input  class="form-control input-lg"  type="text" name="name" id="name">
						<div id="nac" ></div>
						</td>
					</tr>
					<tr>
						<td class="left">전화번호</td>
						<td class="right"><input  class="form-control input-lg"  type="text" name="tel" id="tel">
						<div id="tec" ></div>
						</td>
					</tr>
					<tr>
						<td class="left">이메일</td>
						<td class="right"><input  class="form-control input-lg"  type="text" name="email" id="email">
						<div id="emc" ></div>
						</td>
					</tr>
					<tr>
						<td>
						<button style="width:200px; height:50px;" class="btn btn-success" type="button" id="addMember">회원가입하기</button>
						</td>
					</tr>
				</table>
			</form>
				<button style="width:200px; height:50px;" class="btn btn-success" type="button" id="idCheck">아이디중복확인</button>
			<hr>
			<div id="result"></div>
			
			
</body>
</html>