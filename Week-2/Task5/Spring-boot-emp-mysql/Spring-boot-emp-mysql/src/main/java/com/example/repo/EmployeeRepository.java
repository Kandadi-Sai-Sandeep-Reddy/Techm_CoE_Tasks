package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.model.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	
	interface myView {
		//copy from getter methods
		String getEmpName();
		String getEmpDept();
		Double getSalary();
	}
	//select code,cost from prodtabwhere ven_code=?
	List<myView>findByEmpDept(String vc);


}
