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
		<h3>상품 정보 수정</h3>
			<form method="post" action="<c:url value='/booktest/updateBook'/>">
			<table>
				<tr><td>상품 번호</td><td><input type="text" name="bookNo" value="${book.bookNo}" readonly></td></tr>
				<tr><td>상품명</td><td><input type="text" name="bookName" value="${book.bookName}"></td></tr>
				<tr><td>가격 </td><td> <input type="text" name="bookPrice" value="${book.bookPrice}"></td></tr>
				<tr><td>제조회사</td><td><input type="text" name="bookPub" value="${book.bookPub}"></td></tr>
				<tr><td>재고 </td> <td><input type="text" name="bookStock" value="${book.bookStock}"></td></tr>
				<tr><td colspan="2"><input type="submit" value="수정"><input type="reset" value="취소"></td></tr>
			</table>
			</form>
	</body>
</html>