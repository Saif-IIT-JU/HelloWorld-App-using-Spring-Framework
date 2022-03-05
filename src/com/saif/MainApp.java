package com.saif;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorldApp obj = (HelloWorldApp)context.getBean("helloworld");
		obj.method();
	}

}
