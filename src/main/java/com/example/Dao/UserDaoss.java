package com.example.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.User;


public interface UserDaoss  extends JpaRepository<User, Integer>{
	
	public User getByuserId(Integer userId);
	
	public List<User>  findBy();
	
	public List<User> findByAgeGreaterThanOrderByAgeDesc(Integer age);
	//年龄大于多少
	public List<User> findByageAfter(Integer age);
	
	@SuppressWarnings("unchecked")
	public User save(User user);
	
	public void deleteByuserId(Integer userId);
	
	
}
