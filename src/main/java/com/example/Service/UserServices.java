package com.example.Service;

import java.util.List;

import com.example.Entity.User;

public interface UserServices {
	public User getById(Integer userId);
	public List<User>  findBy();
	public User save(User user);
	public User save1(User user);
	public List<User> findByAgeLessThanOrderByAgeDesc(Integer age);
	
	public List<User> findByAgeAfter(Integer age);
	
	public void deleteByuserId(Integer userId);
}
