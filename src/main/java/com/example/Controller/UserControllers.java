package com.example.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.example.Entity.Student;
import com.example.Entity.User;
import com.example.Service.StudentService;
import com.example.Service.UserServices;
//CORS解决spring boot 的WEB项目ajax跨域问题，前端正常发送请求就可以了
//@CrossOrigin(origins = "http://127.0.0.1:8089",allowCredentials = "true")

@Controller
public class UserControllers {
	
	@Autowired
	UserServices userService;
	@Autowired
	StudentService studentservice;
	/* *
	 * jsonp 解决ajax跨域问题测试用例
	 */
	@RequestMapping("/getuser1")
	@ResponseBody
	public String  getUser1(HttpServletRequest request,HttpServletResponse response,User use) throws IOException {
		System.out.println(use.getUserName()+"-----"+use.getUserPassword());
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		//解决前端发送jsonp请求
		String callback = request.getParameter("callback");
		
		Integer userId=1;
		User user = userService.getById(userId);
		//解决前端发送jsonp请求
		String callbacks = callback+"("+JSONArray.toJSON(user)+")";
		return callbacks;
	}

	/* *
	 * CORS 解决ajax跨域问题测试用例
	 */
	@RequestMapping("/getuser2")
	@ResponseBody
	public User  getUser2(HttpServletRequest request,HttpServletResponse response){
		String name = request.getParameter("userName");
		String password = request.getParameter("userPassword");
		System.out.println(name+"-----------"+password);
		Integer userId=1;
		User user = userService.getById(userId);
		return user;
	}
	
	@RequestMapping("/getuser")
	@ResponseBody
	public User  getUser(){
		
		Integer userId=1;
		User user = userService.getById(userId);
		return user;
	}
	
	
	@RequestMapping("/users")
	@ResponseBody
	public List<User>  getUserList() {
		
		return userService.findBy();
	}
	@RequestMapping("/saveuser")
	@ResponseBody
	@Transactional
	public User  saveUserList() {
		
		User user = new User();
		user.setUserName("Spring");
		user.setUserPassword("Spring123");
		User user2 = userService.save1(user);
		
		
		Student student = new Student();
		student.setName("java");
		student.setAge(23);
		studentservice.save(student);
		
		return user2;
	}
	
	
	@RequestMapping("/deleteuser")
	@ResponseBody
	public String  deleteUserList() {
		Integer userId=5;
	 userService.deleteByuserId(userId);
	 
	 return "delete";
	}
	
	@RequestMapping("/updateuser")
	@ResponseBody
	public User  updateUserList() {
		Integer userId=1;
		User user = userService.getById(userId);
		user.setUserName("zhangsan22");
		
		return userService.save(user);
	}
	@RequestMapping("/orderby")
	@ResponseBody
	public List<User> userOderBy(){
		
		return userService.findByAgeLessThanOrderByAgeDesc(1);
	}
	
	
}
