package com.aspire.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("annotation.xml");
		Customer customer=context.getBean(Customer.class);
		System.out.println(customer+"      "+customer.address);

	}

}
