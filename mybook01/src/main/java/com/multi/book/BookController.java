package com.multi.book;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class BookController {	
	@Autowired
	BookService service;	
	
	// 실행 시 index 페이지 열기
	@RequestMapping("/")
	public String viewIndex() {
		return "index";
	}
	
	// 전체 상품 조회
	@RequestMapping("/booktest/listAllBook")
	public String listAllProduct(Model model) {
		ArrayList<BookVO> bookList = service.listAllBook();
		model.addAttribute("bookList", bookList);
		return "book/bookListView";
	}
	
	
	// 상품 등록폼으로 이동
	@RequestMapping("/booktest/newBookForm")
	public String newProductForm() {
		return "book/newBookForm";
	}
		
	// 상품 등록
	@RequestMapping("/booktest/insertBook")
	public String insertProduct(BookVO book) {
		//System.out.println(prd.getPrdNo());
		service.insertBook(book);
		return "redirect:./listAllBook";
		//return "redirect:/product/listAllProduct"; // 이렇게 해도 됨
		//return "product/productListView"; // 이렇게 하면 데이터 출력 안 됨
	}
	
	
	// 상품 상제 정보 페이지로 이동
		@RequestMapping("/booktest/detailViewBook/{bookNo}")
		public String detailViewProduct(@PathVariable String bookNo, Model model) {
			// 상품번호 전달하고, 해당 상품 정보 받아오기 
			BookVO book = service.detailViewBook(bookNo);
			model.addAttribute("book", book);
			
			//System.out.println(prd.getPrdNo()); // 서비로부터 반환된 값 확인
			
			return "book/bookDetailView";  // 상품 상세 정보 뷰 페이지
		}
		
		// 상품 정보 수정 화면으로 이동 (수정하기 위해 먼저 상품 상세 정보를 화면(입력 폼)에 출력)
		@RequestMapping("/booktest/updateBookForm/{bookNo}")
		public String updateProductForm(@PathVariable String bookNo, Model model) {
			// 상품번호 전달하고, 해당 상품 정보 받아오기 
			BookVO book = service.detailViewBook(bookNo); // 상세 상품 조회 메소드 그대로 사용
			model.addAttribute("book", book);
			return "book/updateBookForm";
		}
		
		// 상품 정보 수정 : 수정된 상품 정보 DB에 저장
		@RequestMapping("/booktest/updateBook")
		public String detailViewProduct(BookVO book) {
			service.updateBook(book);		
			return "redirect:./listAllBook";  // 전체 상품 조회 페이지로 포워딩
		}
		
		// 상품 정보 삭제
		@RequestMapping("/booktest/deleteBook/{bookNo}")
		public String deleteBook(@PathVariable String bookNo) {
			//System.out.println(prdNo); // 상품번호 전달되는지 확인
			service.deleteBook(bookNo);
			return "redirect:../listAllBook";  // 전체 상품 조회 페이지로 포워딩
			//return "redirect:/product/listAllProduct"; // 이렇게 해도 오류 없음
		}
		
		/**** AJAX 부분 Controller *****/
		@ResponseBody
		@RequestMapping("booktest/bookCheck")
		public String bookCheck(@RequestParam("bookNo") String bookNo) {
			String bookResult = service.bookNoCheck(bookNo);
			String result = "use";
			if(bookResult != null) {
				result = "no-use";
			}
			
			return result;
		}
		
		@RequestMapping("booktest/bookSearchForm")
		public String bookSearchForm() {
			return "book/bookSearchForm";
		}
		
		@RequestMapping("booktest/bookSearch")
		public String bookSearch(@RequestParam HashMap<String, Object> param,
													Model model) {
			ArrayList<BookVO> bookList = service.bookSearch(param);
			model.addAttribute("bookList", bookList);
			
			return "book/bookSearchResultView";
		}
}