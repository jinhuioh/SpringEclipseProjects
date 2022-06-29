<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
   td {
      width:150px;
      height:50px;
   }
   
   button {
      background: black;
      color:white;
      font-weight:bold;
      border:10px dotted yellow;
   }
   
   img {
      width:150px;
      height:100px;
   }
   
      
</style>
</head>
<body bgcolor="skyblue">
북마크 검색 결과입니다.
<table border=2>
   <tr>
      <td>아이디</td>
      <td>${one.id}</td> <!-- one.getId -->
   </tr>
   <tr>
      <td>이름</td>
      <td>${one.name}</td>
   </tr>
      <tr>
      <td>링크</td>
      <td>
      <img src="resources/img/${one.img}">
         <a href="${one.url}">
         <button>click!</button>
         </a>
      </td>
   </tr>
   <tr>
      <td>img</td>
      <td>${one.img}</td>
   </tr>
</table>
</body>
</html>