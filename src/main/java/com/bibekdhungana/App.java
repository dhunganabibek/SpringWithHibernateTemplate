package com.bibekdhungana;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bibekdhungana.dao.StudentDao;
import com.bibekdhungana.entities.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		
		Student student = new Student(1, "Bibek Dhungana", "Lubbock");
		
		//CRUD
		//Create
//		System.out.println(studentDao.insert(student));
		
		//Read
		System.out.println(studentDao.getStudent(1));
		
		
		//delete
//	    studentDao.deleteStudent(1);
		
		
		
	}
}
