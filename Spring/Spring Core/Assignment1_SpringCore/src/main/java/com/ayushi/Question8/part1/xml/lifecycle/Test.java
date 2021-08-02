package com.ayushi.Question8.part1.xml.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ayushi.Question8.part1.xml.lifecycle.Shirt;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(AbstractApplicationContext applicationcontext = 
        		new ClassPathXmlApplicationContext
        		("com/ayushi/Question8/part1/xml/lifecycle/lifecycleconfig.xml")
        		){
			Shirt s = (Shirt)applicationcontext
					.getBean("shop");
			System.out.println(s);
			//Registering shutdown hook 
			applicationcontext.registerShutdownHook();
		}

	}

}
