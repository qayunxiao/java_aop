package com.alvin.spring.aop.service;

import java.util.Date;

import com.alvin.spring.aop.dao.UserDao;


public class UserService {
	
	private UserDao userDao;
	
	public void createUser() {
		System.out.println(new Date());
		System.out.println("UserService执行创建用户业务逻辑");
		userDao.insert();
	}
	
	public String generateRandomPassword(String type,Integer length) {
		System.out.println("按" + type +"方式生成" + length + "位随机密码");
		return "Zxcqueil";
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	

}
