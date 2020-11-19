package com.java.factory;

import com.java.spring.DefaultBeanFactory;

public class TestBeanFactory {
	 public static void main(String[] args) {
		  DefaultBeanFactory factory=
		  new DefaultBeanFactory("spring-configs.xml");
		  Object obj1=factory.getObject("obj", Object.class);
		  Object obj2=factory.getObject("obj", Object.class);
		  System.out.println(obj1==obj2);
		  //修改代码，添加需求
         System.out.println("修改代码，添加需求");
                  //github中修改代码或者 别人提交的代码 
	  }
}
