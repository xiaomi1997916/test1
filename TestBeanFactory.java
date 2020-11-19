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
         //自己修改老版本的代码
         //github中修改代码或者 别人提交的代码
         //小米的代码
		 // 小明的代码
         //加代码1111

		 // 主分支  在我写代码的过程中 别人加代码到主分支上了     这是别人加的代码

		 //我自己写的代码 ，需要提交到主分支上 ，先提交到自己的分支
		 //test1
	  }
}
