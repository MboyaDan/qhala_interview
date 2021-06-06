package com.aim.app.accounts.models;

import java.util.Date;

public class Book {
    private int id;
    private String bookName;
    private Date issueDate;
    private String userName;
    private String isbn;

    public Book() {
        super();
    }

    public Book(int id, String bookName, Date issueDate, String userName, String isbn) {
        this.id = id;
        this.bookName = bookName;
        this.issueDate = issueDate;
        this.userName = userName;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
                ", userName='" + userName + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
