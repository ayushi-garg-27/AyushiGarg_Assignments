package com.ayushi.Question1.part2.CI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ayushi.Question1.part2.CI.Customer;


public class Test 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try(ClassPathXmlApplicationContext applicationcontext = 
        		new ClassPathXmlApplicationContext
        		("com/ayushi/Question1/part2/CI/Ciconfig.xml")){
			Customer c1 = (Customer)applicationcontext
					.getBean("e");
			//c1.displayInfo();
			//System.out.println(c1.getAddress());
			//System.out.println(c1);
			c1.show();
			
		}
        }
        
        
 }
