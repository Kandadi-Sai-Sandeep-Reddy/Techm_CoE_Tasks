package com.example.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.repo.*;
import com.example.repo.EmployeeRepository.myView;
import com.example.model.*;

@Component
public class Runner implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//insert operation
				/*1.***************SAVE****************/
				System.out.println("Insert Starting");
				repo.save(new Employee(7,"Sandeep",100000,"Software"));
				repo.save(new Employee(8,"Obama",90000,"NGO"));
				repo.save(new Employee(9,"Putin",80000,"Politics"));
				System.out.println("Inserted Succesfully");
				
				List<myView> p = repo.findByEmpDept("Software");
		      	for (myView p1:p) {
		      		System.out.println(p1.getEmpName() + "," + p1.getEmpDept() + "," + p1.getSalary());
		      	}
		      	
		      	repo.deleteById(6);
		      	System.out.println("Deleted Successfully");
	}
	
	

}
