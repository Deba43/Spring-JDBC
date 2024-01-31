package com.Deba.SpringJDBCDemo;

import com.Deba.SpringJDBCDemo.Model.Student;
import com.Deba.SpringJDBCDemo.repo.DebaRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);

		Student s = context.getBean(Student.class);
//		s.setId(10);
//		s.setAge(21);
//		s.setName("Deba");
//		s.setTech("Java");

		DebaRepo repo = context.getBean(DebaRepo.class);
		repo.save(s);

		System.out.println(repo.findAll());
	}

}
