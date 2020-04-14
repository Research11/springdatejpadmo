package com.example.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.Dao.StudentDao;
import com.example.Entity.Student;
import com.example.Service.StudentService;
@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentDao studentdao;
	@Override
	public void deleteByid(Integer id) {
		
		studentdao.deleteByid(id);
		//int num = 5/0; 
	}
	@Override
	public Student save(Student student) {
		Student save = studentdao.save(student);
		//int num = 5/0; 
		return save;
	}

}
