package com.example.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.book.entity.Book;
import com.example.book.service.BookService;

import java.util.List;

@RestController()
@RequestMapping("/api/v1")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("books")
    List<Book> getAllBook(){
        return bookService.getAllBook();
    }

    @GetMapping("/books/{id}")
    Book getBookById(@PathVariable long id){
        return bookService.getBookById(id);
    }
    
    @PostMapping("/books")
    Book saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @DeleteMapping("/books/{id}")
    void deleteBookById(@PathVariable long id) {
    	bookService.deleteBookById(id);
    }
}
