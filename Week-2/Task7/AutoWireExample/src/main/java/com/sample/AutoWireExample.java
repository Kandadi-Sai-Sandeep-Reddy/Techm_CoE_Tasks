package com.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireExample {
	
	public static void main(String args[])
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		
		City city=(City) ctx.getBean("city");
		city.displayInfo();
	}

}
