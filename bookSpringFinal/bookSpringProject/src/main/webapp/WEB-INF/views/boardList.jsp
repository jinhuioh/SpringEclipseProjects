<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<style>
.left{
	background: ivory;
	text-align: center;
}
.right {
	background: #f0f0f0;
	text-align: center;
}
</style>
<center>
 <table border=1 style="width: 100vh">
   <tr>
      <td class="left">번호</td>
      <td class="left">제목</td>
      <td class="left">작성자</td>
      <td class="left">등록일</td>
   </tr>
   <!-- 검색되는 테이블 id 설정 -->
   <tbody id="searchresult">
   <c:forEach items="${list}" var="one">
   <tr>
      <td class="right">${one.b_id}</td>
      <td class="right"><a href="boardOne?b_id=${one.b_id}">${one.b_title}</a></td>
      <td class="right">${one.b_writer}</td>     
      <td class="right">${one.b_date}</td>    
   </tr>
   </c:forEach>
   </tbody>
</table>
</center>