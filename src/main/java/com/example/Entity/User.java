package com.example.Entity;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;

@Entity
@Table(name = "T_USER")
@Data
public class User {
	@Id
	@GeneratedValue
	//@Column(name="USER_ID")
	private Integer userId;
	//@Column(name="USER_NAME")
	private String userName;
	//@Column(name="USER_PASSWORD")
	private String userPassword;	
	//@Column(name="STATUS")
	private String status;
	private Integer age;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
	

}
