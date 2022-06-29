<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function(){
		$('#b1').click(function() {
			$.ajax({
				url:"money.do",
				data:{
					money : $('#mon').val(),
					choice : $('#cho').val()
				},
				success: function(x) {
					$('#result').html('결제하실 금액은'+ x)
				},
				error: function() {
					alert('실패!')
				}//error
			})//ajax
		})//b1
	})//$
</script>
</head>
<body>
	결제금액: <input type="text" id="mon">
	결제수단(1.계좌이체, 2.신용카드,3.휴대폰결제): <input type="text" id="cho">
<button id="b1">결제하기</button>
<hr color="skyblue">
<div id="result"></div>
</body>
</html>