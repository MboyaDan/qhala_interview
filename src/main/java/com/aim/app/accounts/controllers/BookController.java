package com.aim.app.accounts.controllers;

import com.aim.app.accounts.models.Book;
import com.aim.app.accounts.services.BookService;
//import com.aim.app.configs.MyUserDetails;
import com.aim.app.configs.MyUserDetailsService;
import com.aim.app.configs.util.AuthenticateRequest;
import com.aim.app.configs.util.AuthenticationResponse;
import com.aim.app.configs.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {


    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    MyUserDetailsService myUserDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

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

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticateRequest myUserDetails) throws Exception{


        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(myUserDetails.getUserName(), myUserDetails.getPassword())
            );
        }catch (BadCredentialsException e){
            throw new Exception("Incorrect username or password ", e);
        }
        final UserDetails userDetails = myUserDetailsService.loadUserByUsername(myUserDetails.getUserName());

        final String jwt = jwtUtil.generateToken(userDetails);
        return ResponseEntity.ok(new AuthenticationResponse(jwt));

    }

}
