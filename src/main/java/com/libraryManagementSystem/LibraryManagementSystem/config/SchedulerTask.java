package com.libraryManagementSystem.LibraryManagementSystem.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.libraryManagementSystem.LibraryManagementSystem.repositories.BookRepository;
import com.libraryManagementSystem.LibraryManagementSystem.repositories.EmployeeRepository;

@Component
public class SchedulerTask {
	@Autowired
	BookRepository repo;
	
	@Autowired
	EmployeeRepository empRepo;
	
	@Scheduled(fixedRate = 60000)
	public void showRecord()
    {	
        long countRecord=repo.count(); 
        long countRecord2=empRepo.count(); 
        System.out.println("Book Record: "+countRecord);
        System.out.println("Employees Record: "+countRecord2);
    }
}
