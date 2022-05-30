package com.bibekdhungana.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;
import com.bibekdhungana.entities.Student;



public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	
	//save student
	@Transactional
	public int insert(Student student) {
		Integer i = (Integer)hibernateTemplate.save(student);
		return i;
	}
	
	//get the single data 
	public Student getStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;	
	}
	
	//get all student data
	public List<Student> getAllStudent(){
		return (this.hibernateTemplate.loadAll(Student.class));
	}
	
	//deleting the data
	@Transactional
	public void deleteStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class,studentId);
		this.hibernateTemplate.delete(student);
	}
	
	@Transactional
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
