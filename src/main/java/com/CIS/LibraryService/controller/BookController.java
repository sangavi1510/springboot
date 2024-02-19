package com.CIS.LibraryService.controller;

import com.CIS.LibraryService.model.Book;
import com.CIS.LibraryService.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping
    public ArrayList<Book> getMember(){
        return bookService.getBooks();
    }

    @PostMapping
    public Book createMember(@RequestBody Book book){
        return bookService.createBook(book);
    }

    @PutMapping
    public Book updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @DeleteMapping
    public Book deleteBook(Long bookId){
        return bookService.deleteBook(bookId);
    }
}
