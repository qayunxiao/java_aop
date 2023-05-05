package com.alvin.spring.aop;

import com.alvin.spring.aop.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
 
//       初始化AOP
		ApplicationContext  context  =  new  ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService userService = context.getBean("userService",UserService.class);
        userService.createUser();
        userService.generateRandomPassword("MD5", 16);
        		
    }
}
