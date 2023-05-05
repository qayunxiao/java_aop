package com.alvin.spring.aop.aspect;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;

//切面类
public class MethodAspect {
	//切面方法 用于扩展额外功能
	// JoinPoint 链接点 通过链接点可以获取目标方法或类的信息
	public void printExecutionTime(JoinPoint joinPoint) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String now = sdf.format(new Date());
		String className = joinPoint.getTarget().getClass().getName();//获取类名称
		String methodName = joinPoint.getSignature().getName();//获取方法名称
		System.out.println("---->"+now+":" + className + "." +methodName);
		
		Object[] args = joinPoint.getArgs();
		System.out.println("--- 参数个数:"+args.length);
		for(Object arg:args) {
			System.out.println("----参数:"+arg);
		}
		
	}
	

}
