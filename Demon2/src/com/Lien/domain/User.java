package com.Lien.domain;

public class User {
	private Integer UserId;
	private String UserName;
	private String Sex;
	private Integer age;
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer userId, String userName, String sex, Integer age) {
		super();
		UserId = userId;
		UserName = userName;
		Sex = sex;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", UserName=" + UserName + ", Sex=" + Sex + ", age=" + age + "]";
	}
	
}
