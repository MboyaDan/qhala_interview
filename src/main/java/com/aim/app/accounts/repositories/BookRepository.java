package com.aim.app.accounts.repositories;

import com.aim.app.accounts.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    @Query("SELECT s FROM Book s WHERE s.bookName = ?1")
    Optional<Book>findBookByName(String bookName);
}
