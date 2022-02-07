package com.multi.book;

import java.util.ArrayList;
import java.util.HashMap;

public interface IBookService {
	// 구현 클래스에서 오버라이딩할 추상 메소드 선언 
	// 규격 지정 : 반드시 구현해야 할 메소드 지정해 놓는 것
	ArrayList<BookVO> listAllBook();   		// 전체 상품 조회
	void insertBook(BookVO bookVo);			// 상품 정보 등록
	void updateBook(BookVO bookVo);			// 상품 정보 수정
	void deleteBook(String bookNo);					// 상품 정보 삭제
	BookVO detailViewBook(String bookNo);// 상세 상품 조회
	String bookNoCheck(String bookNo); // 도서 중복 검색
	ArrayList<BookVO> bookSearch(HashMap<String, Object> map);
}
