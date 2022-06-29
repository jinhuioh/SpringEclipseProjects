<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp1</title>
<script type="text/javascript">
function idCheck() {
	//id에 입력한 값을 가지고 와서 
	//글자수가 5미만이면 다시 작성하세요. 메세지 프린트
	//Document document = new Document(); //아래 body 불러오는거.너무 자주쓰니까 아래처럼 document만 쓴다. 
	//자바스크립트는 아래처럼 객체를 미리 만들어놨다.=>내장된 객체
	//window: 브라우저 전체
	//document: body태그 부분
	//console: 개발할 때 확인하는 창(f12)
	//location:	주소부분, location.href=""
	//history: 탐색리스트 (브라우저에 왼족 상단 브라우저 갔다온정보 < >화살표부분.)
	idValue = document.getElementById("id").value    //아이디:<input name="id" id="id" value="text">를 말한다.id값이 id인것.
	text = "" 
	img = ""
	if(idValue.length < 5){
		console.log("5미만입니다. 다시입력해주세요")
		text = "<span style='color:blue;'>5미만입니다. 다시입력해주세요</span>"
		document.getElementById("id").value=""
		img = "<img src='resources/img/ok.PNG'>"
	} else {
		console.log("5이상입니다. 확인완료")
		text = "<span style='color:pink;'>5이상입니다. 확인완료</span>"
		img = "<img src='resources/img/no.PNG' width=200 height=200>"
	}
		document.getElementById("result").innerHTML = text + img
}
function pwCheck() {
	pw1Value = document.getElementById("pw1").value
	pw2Value = document.getElementById("pw2").value
	text = ""
	img = ""
	if(pw1Value == pw2Value){
		console.log(" 일치합니다.")
		text = "<span style='color:blue;'>일치합니다.</span>"
		img = "<img src='resources/img/ok.PNG'>"
	} else {
		console.log("일치하지 않습니다.")
		document.getElementById("pw1").value=""
		document.getElementById("pw1").value=""
		text = "<span style='color:pink;'>일치하지않습니다.</span>"
		img = "<img src='resources/img/no.PNG' width=200 height=200>"	
	}
		document.getElementById("result").innerHTML = text + img
	}
		
</script>
</head>
<body>
<h3>자바 스트립트 테스트</h3>
<hr>
아이디:<input name="id" id="id" value="text"><br>
<button onclick="idCheck()">입력 글자수 확인</button><br>
패스워드1:<input name="pw1" id="pw1" value="1234"><br>
패스워드2:<input name="pw2" id="pw2" value="1234"><br>
<button onclick="pwCheck()">입력 패스워드 일치 확인</button><br>
<hr>
<div id="result"></div>
</body>
</html>