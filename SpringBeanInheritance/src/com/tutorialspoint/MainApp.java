package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloFrance helloFrance= (HelloFrance) context.getBean("helloFrance");
		
		helloFrance.getMessage1();
		helloFrance.getMessage2();
		helloFrance.getMessage3();
		
		HelloIndia helloIndia =(HelloIndia) context.getBean("helloIndia");
		
		helloIndia.getMessage1();
		helloIndia.getMessage2();
		helloIndia.getMessage3();
		
	}

}
