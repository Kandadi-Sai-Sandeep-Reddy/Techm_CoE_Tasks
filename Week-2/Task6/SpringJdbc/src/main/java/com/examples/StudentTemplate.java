package com.examples;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
public class StudentTemplate {
	
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	
	//insert
	public int saveStudent(Student s)
	{
		String query="insert into student values('"+s.getId()+"','"+s.getName()+"','"+s.getBranch()+"','"+s.getYear()+"')";
		return jdbcTemplate.update(query);
	}
	
	//Update
	public int updateStudent(Student s)
	{
		String query="update student set name='"+s.getName()+"',Year='"+s.getYear()+"' where id='"+s.getId()+"' ";
		return jdbcTemplate.update(query);
	}
	
	//Delete
	public int deleteStudent(Student s)
	{
		String query="delete from student where id='"+s.getId()+"' ";
		return jdbcTemplate.update(query);
	}
	
	//Select
	public List<Student> selectAllStudents()
	{
		/*String query="Select * from student";
		//Student s= new Student();
		jdbcTemplate.execute(query);*/

	        String sql = "SELECT * FROM Student";

	        List<Student> students = jdbcTemplate.query( sql, new BeanPropertyRowMapper(Student.class));

	        return students;
	}

}
