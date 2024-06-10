package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int empId;
	private String empName;
	private int salary;
	private String empDept;
	
	public Employee()
	{
		
	}
	
	// Constructor with all parameters
    public Employee(int empId, String empName, int salary, String empDept) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.empDept = empDept;
    }

    // Constructor without empId parameter
    public Employee(String empName, int salary, String empDept) {
        this.empName = empName;
        this.salary = salary;
        this.empDept = empDept;
    }

    // Getter and Setter methods

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

}

