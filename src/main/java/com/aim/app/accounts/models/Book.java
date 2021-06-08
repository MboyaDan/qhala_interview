package com.aim.app.accounts.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
public class Book {
    @Id
    @GeneratedValue
    private int id;
    private String bookName;
    private Date issueDate;
    private String author;
    private String reviews;
    private String isbn;

    public Book() {
        super();
    }

    public Book(int id, String bookName, Date issueDate, String author,String reviews, String isbn) {
        this.id = id;
        this.bookName = bookName;
        this.issueDate = issueDate;
        this.author = author;
        this.reviews = reviews;
        this.isbn = isbn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", issueDate=" + issueDate +
                ", author='" + author + '\'' +
                ", reviews='" + reviews + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
