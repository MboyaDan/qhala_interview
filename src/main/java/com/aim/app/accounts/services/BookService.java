package com.aim.app.accounts.services;

import com.aim.app.accounts.models.Book;
import com.aim.app.accounts.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private  final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

//    ADD a book
    public void addNewBook(Book book){
        bookRepository.save(book);
    }

//    GET all books
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

//    GET book by id
    public Optional<Book>getBook(int id){
        return bookRepository.findById(id);
    }

//    GET book by bookName
    public Optional<Book>getBookName(String video){
        return bookRepository.findBookByName(video);
    }

////    DELETE book
//    public void deleteBook(int id){
//        boolean exists = bookRepository.existsById(id);
//        if(!exists){
//            throw new IllegalStateException(
//                    "Video of " + id +" does not exist"
//
//            );
//        }
//        bookRepository.deleteById(id);
//
//    }


}
