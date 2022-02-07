<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
	<body>
		<h3>전체 서적 조회</h3>
			<table border="1" width="600">
				<tr><th>서적번호</th><th>서적명</th><th>가격</th>
						<th>출판사</th><th>재고</th><th>사진</th></tr>
			<c:choose>
				<c:when test="${empty bookList}">
				   <tr align="center"><td colspan="6">검색 내용이 없습니다.</td></tr>
			   </c:when>
			   
			   <c:otherwise>	
			  	 <c:forEach items="${bookList }" var="book">
				   	<tr><td><a href="<c:url value='/booktest/detailViewBook/${book.bookNo}'/>">${book.bookNo }</a></td>
				   			<td>${book.bookName }</td>
				   			<td>${book.bookPrice }</td>
				   			<td>${book.bookPub}</td>
				   			<td>${book.bookStock }</td>
				   			  <td><img src="<c:url value='/images/${book.bookNo}.jpg'/>" width="80" height="50"> 
				   					<!-- 또는  -->
				   			       <img src="/images/${book.bookNo}.jpg" width="30" height="20"></td>
				   	</tr>
				   </c:forEach>
			   </c:otherwise>
			   </c:choose>
			</table><br>
			
			<a href="/booktest/">메인 화면으로 이동</a><br>
	</body>
</html>