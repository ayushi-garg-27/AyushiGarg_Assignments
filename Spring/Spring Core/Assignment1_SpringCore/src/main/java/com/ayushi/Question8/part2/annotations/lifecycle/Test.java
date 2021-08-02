package com.ayushi.Question8.part2.annotations.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ayushi.Question8.part1.xml.lifecycle.Shirt;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(AbstractApplicationContext applicationcontext = 
        		new ClassPathXmlApplicationContext
        		("com/ayushi/Question8/part1/annotations/lifecycle/annotationlifecycleconfig.xml")
        		){
			
			System.out.println("**************");
			Laptop l = (Laptop)applicationcontext
					.getBean("laptop");
			
			System.out.println(l);
			applicationcontext.registerShutdownHook();
		}

	}

}
