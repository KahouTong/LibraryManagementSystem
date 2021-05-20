package com.libraryManagementSystem.LibraryManagementSystem.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.libraryManagementSystem.LibraryManagementSystem.entities.Employees;

public interface EmployeeRepository extends CrudRepository<Employees, String>{
	
	List<Employees> findByEmpnameAndEmpemail(String name, String email);
}
