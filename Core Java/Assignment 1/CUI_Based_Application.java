package assignment.first.java;

import java.util.Scanner;

public class CUI_Based_Application {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String username="Ayushi";
		String password="Ashi";
		
		
		int count=3;
		for(int i=0;i<=count+1;i++)
		{
			String user=sc.nextLine();
			String pass=sc.nextLine();
		if(user.equals(username)&&pass.equals(password))
		{
			System.out.println("Welcome "+user);
		}
		else
		{
			
			System.out.println(--count+" Attempts left");
		}
		
		}
		if(count==0)
		{
			System.out.println("Contact Admin");
		}
		
		

	}
}
