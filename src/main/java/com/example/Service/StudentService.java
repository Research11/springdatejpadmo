package com.example.Service;

import com.example.Entity.Student;

public interface StudentService {
	public void deleteByid(Integer id);
	public Student save(Student student);
}
