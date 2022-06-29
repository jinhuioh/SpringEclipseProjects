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
<body>
<table border=2>
   <tr>
      <td class="left">아이디</td>
      <td class="left">이름</td>
      <td class="left">url</td>
   </tr>
<c:forEach items="${list}" var="one" >
   <tr>
      <td class="right">${one.id}</td> 
     <td class="right">${one.name}</td>
        <td class="right">$</td>
      <a href="one2?id=${one.img}">
      	<img src="resources/img/${one.img}">
      </a>
   </tr>
   </table>
</c:forEach>
</body>
</html>