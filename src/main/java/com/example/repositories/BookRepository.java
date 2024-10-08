package com.example.repositories;

import com.example.models.Book;
import com.example.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findAllByOrderByYearAsc();
    Optional<Book> findByTitleStartingWith(String title);
}
