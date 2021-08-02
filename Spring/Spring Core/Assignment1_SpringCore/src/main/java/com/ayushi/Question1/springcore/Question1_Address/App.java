package com.ayushi.Question1.springcore.Question1_Address;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.ayushi.Question2.Collections.Question;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try(ClassPathXmlApplicationContext applicationcontext = new 
        		ClassPathXmlApplicationContext("config.xml")){
			Customer c1 = (Customer) applicationcontext.getBean("obj");
			c1.displayInfo();
			//System.out.println(c1.getAddress());
			System.out.println(c1);
			
		}
        }
        
        
 }

