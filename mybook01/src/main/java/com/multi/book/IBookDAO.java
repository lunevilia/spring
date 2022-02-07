package com.multi.book;

import java.util.ArrayList;
import java.util.HashMap;


public interface IBookDAO {
	ArrayList<BookVO> listAllBook();   		// 전체 상품 조회
	void insertBook(BookVO bookVo);			// 상품 정보 등록
	void updateBook(BookVO bookVo);			// 상품 정보 수정
	void deleteBook(String bookNo);					// 상품 정보 삭제
	BookVO detailViewBook(String bookNo);// 상세 상품 조회
	String bookNoCheck(String bookNo); // 도서 중복 검색
	ArrayList<BookVO> bookSearch(HashMap<String, Object> map);
}
