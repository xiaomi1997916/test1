package com.java.factory;

import com.java.spring.DefaultBeanFactory;

public class TestBeanFactory {
	 public static void main(String[] args) {
		  DefaultBeanFactory factory=
		  new DefaultBeanFactory("spring-configs.xml");
		  Object obj1=factory.getObject("obj", Object.class);
		  Object obj2=factory.getObject("obj", Object.class);
		  System.out.println(obj1==obj2);
	  }
}
