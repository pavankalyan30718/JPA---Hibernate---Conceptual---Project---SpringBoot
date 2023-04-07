package com.pk.springboot.learnjpaandhibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pk.springboot.learnjpaandhibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long>{

	List<Course> findByAuthor (String Author);
	
	List<Course> findByName (String Name);
}
