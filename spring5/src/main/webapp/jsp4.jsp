<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Menu - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
  <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#menu" ).menu();
  } );
  </script>
  <style>
  .ui-menu { width: 150px; }
  </style>
  <style>
    li, div{
  	color:blue;
  	}
  </style>
</head>
<body>
 
<ul id="menu">
  <li class="ui-state-disabled"><div>Toys (n/a)</div></li>
  <li><div>Menu1</div></li>
  <li><div>Menu2</div></li>
  <li><div>점심메뉴</div>
    <ul>
      <li class="ui-state-disabled"><div>점심메뉴를 선택해보세요.</div></li>
      <li><div>샌드위치</div></li>
      <li><div>햄버거</div></li>
    </ul>
  </li>
  <li><div>영화</div></li>
  <li><div>동물</div>
    <ul>
      <li><div>포유류</div>
        <ul>
          <li><div>햄스터</div></li>
          <li><div>강아지</div></li>
        </ul>
      </li>
      <li><div>양서류</div>
        <ul>
          <li><div>개구리</div></li>
          <li><div>두꺼비</div></li>
        </ul>
      </li>
      <li><div></div></li>
    </ul>
  </li>
  <li class="ui-state-disabled"><div>Specials (n/a)</div></li>
</ul>
 
 
</body>
</html>