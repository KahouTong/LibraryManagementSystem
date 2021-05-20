package com.libraryManagementSystem.LibraryManagementSystem.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libraryManagementSystem.LibraryManagementSystem.entities.Employees;
import com.libraryManagementSystem.LibraryManagementSystem.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;
	
	//fetch all users records from database
	public List<Employees>  getAllEmp()
	{
		//casting
		return (List<Employees>) empRepo.findAll();
	}
	
	public void saveEmp(Employees emp)
	{
		empRepo.save(emp);
	}
	
	public List<Employees> getEmp(String name, String email) {
        return(List<Employees>) empRepo.findByEmpnameAndEmpemail(name,email); 
    }
	
	public void deleteAllEmp()
    {
        empRepo.deleteAll();
        //return "ALL Record Deleted";
    }
}
