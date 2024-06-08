package com.examples;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String args[])
	{
		ApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
		
		StudentTemplate stud=(StudentTemplate)ctx.getBean("stu");
		
		int istatus= stud.saveStudent(new Student(101,"Vishwanth","CSE",4));
		System.out.println("Inserted succesfully: "+istatus);
		istatus= stud.saveStudent(new Student(102,"Sriker","CSE",4));
		System.out.println("Inserted succesfully: "+istatus);
		istatus= stud.saveStudent(new Student(103,"Raju","CSE",4));
		System.out.println("Inserted succesfully: "+istatus);
		
		int ustatus=stud.updateStudent(new Student(103,"Rajesh","CSE",4));
		System.out.println("Updated Successfully: " +ustatus);
		
		
		//Employee e=new Employee();
		Student s= new Student();
		s.setId(102);
		int dstatus=stud.deleteStudent(s);
		System.out.println("Deleted Successfully: " +dstatus);
		
		List<Student> students=stud.selectAllStudents();
		for(Student x:students)
		{
			System.out.println(x.getId() + " " + x.getName() + " " + x.getBranch() + " " + x.getYear());
		}

	}

}
