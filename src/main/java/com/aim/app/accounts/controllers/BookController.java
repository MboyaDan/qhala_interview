package com.aim.app.accounts.controllers;

import com.aim.app.accounts.models.Book;
import com.aim.app.accounts.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

//    ADD books
    @PostMapping("/addBook")
    public void addNewBook(@RequestBody Book book){
        bookService.addNewBook(book);
    }

//    GET all books
    @GetMapping("/books")
    public List<Book>getBooks(){
        return bookService.getBooks();
    }

//    GET a book by id
    @GetMapping("/book/{id}")
    public Optional<Book> getBook(@PathVariable int id){
        return bookService.getBook(id);
    }
//    GET a book by name
    @GetMapping("/bookName/{book}")
    public Optional<Book> getBookByName(@PathVariable String book){
        return bookService.getBookName(book);
    }

//    DELETE a book
//    @DeleteMapping("/delete/{id}")
//    public void deleteBook(@PathVariable int id){
//        bookService.deleteBook(id);
//
//    }

}
