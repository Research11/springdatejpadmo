package com.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Student;
import com.example.Entity.User;


public interface StudentDao extends JpaRepository<Student, Integer>{
	public void deleteByid(Integer Id);
	public Student save(Student student);
	
	
}
