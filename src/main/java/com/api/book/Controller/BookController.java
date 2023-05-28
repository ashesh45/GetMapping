package com.api.book.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.entities.Book;

@RestController
public class BookController {

	@GetMapping("/books")
	public Book getBooks()
	{    
		Book book= new Book();
	     book.setId(2390);
	     book.setTitle("Java is love");
	     book.setAuthor("Ashesh Maharjan");
		return book;
	}
	
}
