package com.Libraryms.LibraryRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Libraryms.LibraryEntity.Book;



@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
