package com.library.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.library.rest.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    // Custom method for searching by keyword in title or description
    List<Book> findByTitleContainingOrDescriptionContaining(String keyword1, String keyword2);
}
