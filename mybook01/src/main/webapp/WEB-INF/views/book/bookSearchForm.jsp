<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>서적 검색</title>
		<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
		<script src="<c:url value='/js/bookSearch.js'/>"></script>
	</head>
	<body>
		<h3>상품 검색</h3>
		<form id="bookSearchFrm">
			<select id="type" name="type">
				<option value="">검색 조건 선택</option>
				<option value="bookName">상품명</option>
				<option value="bookPub">출판사</option>
			</select>
			<input type="text" name="keyword">
			<input type="submit" value="검색">
		</form>
		
		<div id="searchResultbox"></div>
	</body>
</html>