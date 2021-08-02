package com.ayushi.Question2.Collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(ClassPathXmlApplicationContext applicationcontext = new 
        		ClassPathXmlApplicationContext("com/ayushi/Question2/Collections/collectionconfig.xml")){
			Question ques1 = (Question) applicationcontext.getBean("question1");
			System.out.println(ques1.getQuestionId());
			System.out.println(ques1.getAnswers());
			System.out.println(ques1.getAnswers1());
			System.out.println(ques1.getAnswers2());
					
		}

	}

}
