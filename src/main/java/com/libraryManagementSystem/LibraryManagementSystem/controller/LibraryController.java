package com.libraryManagementSystem.LibraryManagementSystem.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.libraryManagementSystem.LibraryManagementSystem.entities.Book;
import com.libraryManagementSystem.LibraryManagementSystem.entities.Employees;
import com.libraryManagementSystem.LibraryManagementSystem.service.BookService;
import com.libraryManagementSystem.LibraryManagementSystem.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200" , maxAge = 3600)
@RequestMapping("mylibrary")
public class LibraryController {

	@Autowired
	BookService service;
	
	@Autowired
	EmployeeService empService;

	@GetMapping("/allbook")
	public List<Book> getAllBooks()
	{
		return service.getAllBooks();
	}

	@RequestMapping(value="/addbook",method=RequestMethod.POST)
	public String addNewBook(@RequestBody Book u1)
	{
		 service.saveBook(u1);;
		 return "data saved";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="findBookByName/{name}")
	public Book getBookByName(@PathVariable("name") String name){
	    Book value=service.getBook(name);
	    return value;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="deleteAllBook")
	public String deletAllBook(){
	    return service.deleteAllBook();
	}

	@RequestMapping(method=RequestMethod.GET,value="deleteBookById/{id}")
	public String deleteBookById(@PathVariable("id") int id){
	return service.deleteBookById(id);
	}
	
	@GetMapping("/allemployees")
	public List<Employees> getAllEmployee()
	{
		return empService.getAllEmp();
	}
	
	@RequestMapping(value="/addemployee",method=RequestMethod.POST)
	public void addNewEmployee(@RequestBody Employees emp)
	{
		 empService.saveEmp(emp);
		 //return "data saved";
	}
	
	@RequestMapping(value="/updateemployee",method=RequestMethod.POST)
	public String updateEmployee(@RequestBody Employees emp)
	{
		 empService.saveEmp(emp);;
		 return "data updated";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="deleteAllEmployee")
	public void deletAllEmp(){
	    empService.deleteAllEmp();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="findBookByName/{name}/{email}")
	public List<Employees> getEmpByNameAndEmail(@PathVariable("name") String name, @PathVariable("email") String email){
	    return empService.getEmp(name, email);
	}
	
	@GetMapping("/getAllDepartments")
	public ArrayList<String> getAllDepartments()
	{
	    List<Employees> list= empService.getAllEmp();
	    
	    ArrayList<String> ids = new ArrayList<String>();
	    
	    for(int i=0;i<list.size();i++)
	    {
	        Optional<String> opt=Optional.ofNullable(list.get(i).getDepartment());
	        
	        //if not null then add only
	        if(opt.isPresent()) {
	        ids.add(list.get(i).getDepartment());
	        }
	    }
	    return ids;
	}
}
