package com.libraryManagementSystem.LibraryManagementSystem.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.libraryManagementSystem.LibraryManagementSystem.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

	Optional<Book> findBybookname(String name);

}
