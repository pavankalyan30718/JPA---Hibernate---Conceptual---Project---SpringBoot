package com.pk.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pk.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

	//@Autowired
	//private CourseJdbcRepository repository;
	
	//@Autowired
	//private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		//save in SpringDataJpa is used to either update an entity or insert an entity
		//rest two repositories uses insert instead of save
		
		// TODO Auto-generated method stub
		repository.save(new Course(1,"Learn-AWS-Now!","PavanKalyan"));
		repository.save(new Course(2,"Learn-Devops-Now!","PavanKalyan"));
		repository.save(new Course(3,"Learn-JPA-Now!","PavanKalyan"));
		repository.save(new Course(4,"Learn-SpringBoot!","PavanKalyan"));
		repository.save(new Course(5,"Learn-SAP!","PavanKalyan"));
		repository.save(new Course(6,"Learn-ML!","PavanKalyan"));
		
		//deleteQuery
		repository.deleteById(1l);
		
		//selectQuery
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		//SpringDataJpa--new methods
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		//SpringDataJpa--Customized methods
		System.out.println(repository.findByAuthor("PavanKalyan"));
		System.out.println(repository.findByName("Learn-JPA-Now!"));


		
	}

}
