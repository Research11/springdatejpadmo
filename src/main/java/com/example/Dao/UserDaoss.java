package com.example.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.User;


public interface UserDaoss  extends JpaRepository<User, Integer>{
	
	public User getByuserId(Integer userId);
	
	public List<User>  findBy();

	//年龄大于 多少并按照年龄降序排序
	//spring data jpa 遇到的问题

	public List<User> findByAgeGreaterThanOrderByAgeDesc(Integer age);

	//After 大于 befor 小于
	//年龄大于多少

	public List<User> findByageAfter(Integer age);
	
	@SuppressWarnings("unchecked")
	public User save(User user);
	
	public void deleteByuserId(Integer userId);
	
	
}
