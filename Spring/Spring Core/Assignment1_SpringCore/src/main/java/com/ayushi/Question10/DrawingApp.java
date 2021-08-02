package com.ayushi.Question10;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp 
{

 public static void main(String[] args) {
	 
	 try(AbstractApplicationContext applicationcontext = 
     		new ClassPathXmlApplicationContext
     		("com/ayushi/Question10/spring.xml")
     		){
		 
		 		Square square = (Square) 
						applicationcontext.getBean("square");
				square.draw();
			
			
		}

 
 }
}
