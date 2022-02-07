package com.multi.mybook01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.multi.book.BookController;
import com.multi.book.IBookDAO;


@SpringBootApplication
@ComponentScan(basePackageClasses = BookController.class)
@MapperScan(basePackageClasses = IBookDAO.class)
public class Mybook01Application {

	public static void main(String[] args) {
		SpringApplication.run(Mybook01Application.class, args);
	}

}
