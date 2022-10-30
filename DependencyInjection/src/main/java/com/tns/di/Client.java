package com.tns.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext c=new ClassPathXmlApplicationContext("com/tns/di/beans.xml");
		Person p1=c.getBean("p1",Person.class);
		System.out.println(p1);
	}

}
