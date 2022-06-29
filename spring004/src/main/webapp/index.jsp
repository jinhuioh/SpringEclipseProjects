<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <title>Insert title here</title>
      <link rel="stylesheet" type="text/css" href="resources/css/out.css">
      <script type="text/javascript" src="resources/js/out.js"></script>
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script> 
      <script type="text/javascript">
      	call()
      	
      	//Document Object Model(DOM) tree. html안에 body안에td안에....트리구조를 이루는것을 간단하게 쓴 것이$이다.
      	//document.ready()= $
      	$(function() { 
      		//JQUERY: 자주쓰는 자바스크립트 기능을 라이브러리로 만들어놓은 것.
      		//복잡한 문법을 단순화 시켜줌. 
      		//src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js" 이 링크
      		//또는 js파일아래에 jquery-3.6.0.min.js주소 둘중에 하나 써줘야지
      		//제이쿼리를 쓸 수 있다.https://developers.google.com/speed/libraries#jquery 여기들어가면 제이쿼리 다운로드 할 수 있음.
      		//
			//alert('html이 ram에 모두 로딩되었습니다.')
			alert("${user}가 id 인 ${name}님 환영합니다.")
		})
      </script>
   </head>
   <body>
   	환영합니다.....<br>
   <hr>      
    <img src="resources/img/naver.PNG">
   <form action="create">
	   아이디   : <input type="text" name="id"><br>
	  주소  : <input type="text" name="url"><br>
	   이름 : <input type="text" name="name"><br>
	   이미지 명: <input type="text" name="png"><br>
   <button>회원가입 요청</button>
   </form>
   <br>
   
   <hr>
   <form action="check.hi">
  	 아이디 : <input type="text" name="id" value="${user}" style=background:lime; ><br>
 	  패스워드   : <input type="text" name="pw"  style=background:lime;><br>
   <button style=background:yellow;color:red;width:100px;>로그인 요청</button>
   </form>
   <br>
   
   <hr>
   <form action="up">
   <input type="text" name="id" ><br>
   	전화번호 : <input type="text" name="tel"><br>
   <button>회원정보 수정 </button>
   </form>
   <br>
   
   <hr>
   <form action="one.jsp">
   	아이디 : <input type="hidden" name="id" value="${user}"><br>
   <button>회원정보 검색  </button>
   </form>
   <a href="one.jsp?id=apple">apple검색  </a>
   <br>
   
   <hr>
   <form action="del">
 	  아이디 : <input type="text" name="id" value="${user}"><br>
   <button>회원탈퇴</button>
   </form>
   <a href="del?id=${user}">
      <button>회원탈퇴</button>
   </a>
   <br>
   
   <hr>
   <a href="list.jsp">
      <button style=color:yellow;background:red;>전체 목록 보기</button>
   </a>
   </body>
</html>