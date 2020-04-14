package com.example.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.Dao.StudentDao;
import com.example.Dao.UserDaoss;
import com.example.Entity.User;

import com.example.Service.UserServices;

@Service
@Transactional//(propagation = Propagation.REQUIRES_NEW)
public class UserServiceImpl implements UserServices{
	
	@Autowired
	UserDaoss userDao;
	@Autowired
	StudentDao studentdao;
	@Override
	public User getById(Integer userId) {
		
		return userDao.getByuserId(userId);
	}
	@Override
	public List<User> findBy() {
		
		return userDao.findBy();
	}
	@Override
	
	public User save(User user) {
		User user1 = userDao.save(user);
		return user1;
	}
	
	public User save1(User user) {
		
		User user1 = userDao.save(user);
		
		return user1;
	}
	@Override
	
	public void deleteByuserId(Integer userId) {
		  userDao.deleteByuserId(userId);
	}
	@Override
	public List<User> findByAgeLessThanOrderByAgeDesc(Integer age) {
		
		return userDao.findByAgeGreaterThanOrderByAgeDesc(age);
	}
	@Override
	public List<User> findByAgeAfter(Integer age) {
		
		return userDao.findByageAfter(age);
	}

}
