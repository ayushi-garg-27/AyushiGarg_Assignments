package com.ayushi.Question9.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ayushi.Question8.part1.xml.lifecycle.Shirt;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(AbstractApplicationContext applicationcontext = 
        		new ClassPathXmlApplicationContext
        		("com/ayushi/Question9/lifecycle/beanlifecycleconfig.xml")
        		){
			
			System.out.println("**************");
			Iphone i = (Iphone)applicationcontext
					.getBean("phone");
			
			System.out.println(i);
			applicationcontext.registerShutdownHook();
		}

	}

}
