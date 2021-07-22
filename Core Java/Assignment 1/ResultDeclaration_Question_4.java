package assignment.first.java;

import java.util.Scanner;

public class ResultDeclaration_Question_4 {

	private int maths, english, science;
	private int Result;
	
	public static void main (String argu[ ])
	{
		int maths, english, science;
	    Scanner sc=new Scanner (System. in);
	    System.out.println("Enter the marks:");
	    maths=sc.nextInt();
	    english=sc.nextInt();
	    science=sc.nextInt();
	    
	    
	    if((maths>60) && (english>60) && (science>60)) {
	    	
	    	System.out.println("Passed");
	    }
	    else if(((maths>60) && (english>60)) || ((english>60) && (science>60)) || ((maths>60) && (science>60)) ) {
	    	
	    	System.out.println("Promotted");
	    }
	    else if(((maths<60) && (english<60) && (science<60))|| ((maths>60)||(english>60)||(science>60))){
	    	
	    	System.out.println("Failed");
	    }
	   
	    
	   
	}
	
}
