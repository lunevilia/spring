<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script src="<c:url value='/js/bookNocheck.js'/>"></script>
</head>
	<body>
		<h3>서적 등록</h3>
		
		<form method="post" action="<c:url value='/booktest/insertBook'/>">
			<table>
				<tr><td>책 번호</td><td><input type="text" id="bookNo" name="bookNo"></td><td><button type="button" id="bookNoCheck">중복확인</button></td></tr>
				<tr><td>서적명</td><td><input type="text" name="bookName"></td></tr>
				<tr><td>가격</td><td> <input type="text" name="bookPrice"></td></tr>
				<tr><td>출판사</td><td><input type="text" name="bookPub"></td></tr>
				<tr><td>재고 </td> <td><input type="text" name="bookStock"></td></tr>
				<tr><td colspan="2"><input type="submit" value="등록"><input type="reset" value="취소"></td></tr>
			</table>
		</form>
	</body>
</html>