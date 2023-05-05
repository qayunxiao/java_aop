package com.alvin.spring.aop.service;

import java.util.Date;

import com.alvin.spring.aop.dao.EmployeeDao;

public class EmployeeService {
	
	private EmployeeDao employeeDao;
	
	public void entry() {
		System.out.println(new Date());
		System.out.println("执行员工入职业务逻辑");
		employeeDao.insert();
	}

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}
	
	public void setEmployeeDao (EmployeeDao employeeDao) {
		this.employeeDao = employeeDao ;
	}
	
}
