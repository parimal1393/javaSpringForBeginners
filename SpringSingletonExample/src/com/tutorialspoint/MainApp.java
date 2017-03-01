package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args)
	{
		 ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		 
		 HelloWorld helloWorldOne= (HelloWorld) context.getBean("helloWorld");
		 
		 helloWorldOne.setMessage("My message by java");
		 helloWorldOne.getMessage();
		 
		 HelloWorld helloWorldTwo =(HelloWorld) context.getBean("helloWorld");
		 helloWorldTwo.getMessage();
	}

}
