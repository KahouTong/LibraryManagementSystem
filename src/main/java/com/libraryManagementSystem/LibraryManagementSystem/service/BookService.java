package com.libraryManagementSystem.LibraryManagementSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libraryManagementSystem.LibraryManagementSystem.entities.Book;
import com.libraryManagementSystem.LibraryManagementSystem.repositories.BookRepository;


@Service
public class BookService {
	
	@Autowired
	BookRepository repo;
	
	//fetch all users records from database
	public List<Book>  getAllBooks()
	{
		//casting
		return (List<Book>) repo.findAll();
	}
	
	public void saveBook(Book u2)
	{
		repo.save(u2);
	}
		
	public String deleteAllBook()
    {
        repo.deleteAll();
        return "ALL Record Deleted";
    }
   
    public String deleteBookById(int id ) {
        repo.deleteById(id);
        return "Book ID= "+id +" DELETED";
    }
    
    public Book getBook(String name ) {
        Optional<Book> Response =  repo.findBybookname(name);
        Book book = Response.get();
        return book;
    }
}
